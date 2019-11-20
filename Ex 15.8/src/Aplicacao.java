
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
	
	int x1;
	int y1;
	int x2;
	int y2;
	int X[] = new int[3];
	int Y[] = new int[3];
	int i = 0;
	
	public Aplicacao() {
		
		Lista lista = new Lista();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel status = new JLabel("Mensagens de evento do mouse");
		add(status, BorderLayout.SOUTH);
		
		JButton blinha = new JButton("Linha");
		blinha.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Linha l = new Linha();
				l.Linha(getGraphics(), x1, y1, x2, y2);
				String coordenadax1 = Integer.toString(x1);
				String coordenaday1 = Integer.toString(y1);
				String coordenadax2 = Integer.toString(x2);
				String coordenaday2 = Integer.toString(y2);
				status.setText("Ponto 1(" + coordenadax1 + ", " + coordenaday1 + ")" + " Ponto 2(" + coordenadax2 + ", " + coordenaday2 + ")");
				lista.adiciona(l);
			}
		});
		panel.add(blinha);
		
		JButton bquadrado = new JButton("Quadrado");
		bquadrado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Quadrado q = new Quadrado();
				q.Quadrado(getGraphics(), x1, y1, x2, y2);
				String coordenadax1 = Integer.toString(x1);
				String coordenaday1 = Integer.toString(y1);
				String coordenadax2 = Integer.toString(x2);
				String coordenaday2 = Integer.toString(y2);
				String area = Integer.toString(q.area(x1, y1, x2, y2));
				String perimetro = Integer.toString(q.perimetro(x1, y1, x2, y2));
				status.setText("Ponto 1(" + coordenadax1 + ", " + coordenaday1 + ")" + " Ponto 2(" + coordenadax2 + ", " 
				+ coordenaday2 + ")" + " Area: " + area + " Perimetro: " + perimetro);
				lista.adiciona(q);
			}
		});
		panel.add(bquadrado);
		
		JButton  bponto = new JButton("Ponto");
		bponto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Ponto p = new Ponto();
				p.Ponto(getGraphics(), x1, y1);
				String coordenadax = Integer.toString(x1);
				String coordenaday = Integer.toString(y1);
				status.setText("Coordenadas (" + coordenadax + ", " + coordenaday + ")");
				lista.adiciona(p);
			}
		});
		panel.add(bponto);
		
		JButton bretangulo = new JButton("Retangulo");
		bretangulo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Retangulo r = new Retangulo();
				r.Retangulo(getGraphics(), x1, y1, x2, y2);
				String coordenadax1 = Integer.toString(x1);
				String coordenaday1 = Integer.toString(y1);
				String coordenadax2 = Integer.toString(x2);
				String coordenaday2 = Integer.toString(y2);
				String area = Integer.toString(r.area(x1, y1, x2, y2));
				String perimetro = Integer.toString(r.perimetro(x1, y1, x2, y2));
				status.setText("Ponto 1(" + coordenadax1 + ", " + coordenaday1 + ")" + " Ponto 2(" + coordenadax2 + ", " 
				+ coordenaday2 + ")" + " Area: " + area + " Perimetro: " + perimetro);
				lista.adiciona(r);
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
				lista.adiciona(t);
			}
		});
		panel.add(btriangulo);
		
		JButton bcirculo = new JButton("Circulo");
		bcirculo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Circulo c = new Circulo();
				c.Circulo(getGraphics(), x1, y1, x2, y2);
				String raio = Integer.toString(c.Raio(x1, y1, x2, y2));
				String area = Double.toString(c.Area(x1, y1, x2, y2));
				String circunferencia = Double.toString(c.Circunferencia(x1, y1, x2, y2));
				status.setText("Raio: " + raio + " Área: " + area + " Valor da Circunferência: " + circunferencia);
				lista.adiciona(c);
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
		        else if (event.isAltDown()) {
		        	detalhe = " com botão do meio"; 
		        }
		        else {
		        	detalhe = " com botão esquerdo";
		        }
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
				x1 = event.getX();
				y1 = event.getY();
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
				x2 = event.getX();
				y2 = event.getY();
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