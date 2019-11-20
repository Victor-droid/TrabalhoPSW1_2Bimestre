import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Aplicacao extends JFrame {

	private JPanel contentPane;
	
	int X1;
	int Y1;
	int X2;
	int Y2;
	int X[] = new int[3];
	int Y[] = new int[3];
	int i = 0;
	
	public Aplicacao() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(Color.BLACK);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel status = new JLabel("Mensagens de evento do mouse");
		add(status, BorderLayout.NORTH);
		
		JButton blinha = new JButton("Linha");
		blinha.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Linha l = new Linha();
				l.Linha(getGraphics(), X1, Y1, X2, Y2);
				String coordenadax1 = Integer.toString(X1);
				String coordenaday1 = Integer.toString(Y1);
				String coordenadax2 = Integer.toString(X2);
				String coordenaday2 = Integer.toString(Y2);
				status.setText("Ponto 1(" + coordenadax1 + ", " + coordenaday1 + ")" + " Ponto 2(" + coordenadax2 + ", " + coordenaday2 + ")");
			}
		});
		panel.add(blinha);
		
		JButton bquadrado = new JButton("Quadrado");
		bquadrado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Quadrado q = new Quadrado();
				q.Quadrado(getGraphics(), X1, Y1, X2, Y2);
				String coordenadax1 = Integer.toString(X1);
				String coordenaday1 = Integer.toString(Y1);
				String coordenadax2 = Integer.toString(X2);
				String coordenaday2 = Integer.toString(Y2);
				String area = Integer.toString(q.area(X1, Y1, X2, Y2));
				String perimetro = Integer.toString(q.perimetro(X1, Y1, X2, Y2));
				status.setText("Ponto 1(" + coordenadax1 + ", " + coordenaday1 + ")" + " Ponto 2(" + coordenadax2 + ", " 
				+ coordenaday2 + ")" + " Area: " + area + " Perimetro: " + perimetro);
			}
		});
		panel.add(bquadrado);
		
		JButton  bponto = new JButton("Ponto");
		bponto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Ponto p = new Ponto();
				p.Ponto(getGraphics(), X1, Y1);
				String coordenadax = Integer.toString(X1);
				String coordenaday = Integer.toString(Y1);
				status.setText("Coordenadas (" + coordenadax + ", " + coordenaday + ")");
			}
		});
		panel.add(bponto);
		
		JButton bretangulo = new JButton("Retangulo");
		bretangulo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Retangulo r = new Retangulo();
				r.Retangulo(getGraphics(), X1, Y1, X2, Y2);
				String coordenadax1 = Integer.toString(X1);
				String coordenaday1 = Integer.toString(Y1);
				String coordenadax2 = Integer.toString(X2);
				String coordenaday2 = Integer.toString(Y2);
				String area = Integer.toString(r.area(X1, Y1, X2, Y2));
				String perimetro = Integer.toString(r.perimetro(X1, Y1, X2, Y2));
				status.setText("Ponto 1(" + coordenadax1 + ", " + coordenaday1 + ")" + " Ponto 2(" + coordenadax2 + ", " 
				+ coordenaday2 + ")" + " Area: " + area + " Perimetro: " + perimetro);
			}
		});
		panel.add(bretangulo);
		
		JButton btriangulo = new JButton("Triangulo");
		btriangulo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Triangulo t = new Triangulo();
				t.Triangulo(getGraphics(), X, Y);
				String coordenadax1 = Integer.toString(X[0]);
				String coordenaday1 = Integer.toString(Y[0]);
				String coordenadax2 = Integer.toString(X[1]);
				String coordenaday2 = Integer.toString(Y[1]);
				String coordenadax3 = Integer.toString(X[2]); 
				String coordenaday3 = Integer.toString(Y[2]);
				String area = Double.toString(t.area(X, Y));
				String perimetro = Integer.toString(t.perimetro(X, Y));
				status.setText("Ponto 1(" + coordenadax1 + ", " + coordenaday1 + ")" + " Ponto 2(" + coordenadax2 + ", " 
				+ coordenaday2 + ")" + " Ponto 3(" + coordenadax3 + ", " + coordenaday3 + ")" + " Area: " + area + " Perimetro: " + perimetro);
			}
		});
		panel.add(btriangulo);
		
		JButton bcirculo = new JButton("Circulo");
		bcirculo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Circulo c = new Circulo();
				c.Circulo(getGraphics(), X1, Y1, X2, Y2);
				String raio = Integer.toString(c.Raio(X1, Y1, X2, Y2));
				String area = Double.toString(c.Area(X1, Y1, X2, Y2));
				String circunferencia = Double.toString(c.Circunferencia(X1, Y1, X2, Y2));
				status.setText("Raio: " + raio + " Área: " + area + " Valor da Circunferência: " + circunferencia);
			}
		});
		panel.add(bcirculo);
		
		contentPane.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent event) {
				String detalhe;
				if (event.isMetaDown()) {
					detalhe = " com botão direito";
				}
		         else if (event.isAltDown()) // botão do meio do mouse
		        	 detalhe = " com botão do meio";
		         else // botão esquerdo do mouse
		        	 detalhe = " com botão esquerdo";
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				
			}

			@Override
			public void mousePressed(MouseEvent event) {
				status.setText(String.format( "Botão do mouse foi pressionado no ponto: (%d; %d)", 
						event.getX(),event.getY() ));
				X1 = event.getX();
				Y1 = event.getY();
				X[i] = event.getX();
				Y[i] = event.getY();
				i++;
				if(i > 2) {
					i = 0;
				}
			}
			
			@Override
			public void mouseReleased(MouseEvent event) {
				status.setText(String.format( "Botão do mouse foi liberado no ponto: (%d; %d)", 
						event.getX(),event.getY() ));
				X2 = event.getX();
				Y2 = event.getY();
			}
			
		});
		contentPane.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent event) {
				status.setText(String.format( "Mouse foi arrastado no ponto: (%d; %d)", 
						event.getX(),event.getY() ));
			}

			@Override
			public void mouseMoved(MouseEvent event) {
				status.setText(String.format( "Mouse foi movimentado no ponto: (%d; %d)", 
						event.getX(),event.getY() ));
			}
			
		});
		
		setVisible(true);
	}
	
	public static void main(String []a) {
		new Aplicacao();
	}
	
}