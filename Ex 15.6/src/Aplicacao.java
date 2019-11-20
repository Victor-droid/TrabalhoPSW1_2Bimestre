
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
	int contr = 0;
	int contc = 0;
	int contp = 0;
	Retangulo rguardar[] = new Retangulo[500];
	Circulo cguardar[] = new Circulo[500];
	Ponto pguardar[] = new Ponto[500];
	
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
		
		JButton  bponto = new JButton("Ponto");
		bponto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Ponto p = new Ponto();
				p.x1 = x1;
				p.y1 = x1;
				p.Pontof(getGraphics());
				String coordenadax = Integer.toString(x1);
				String coordenaday = Integer.toString(y1);
				status.setText("Coordenadas (" + coordenadax + ", " + coordenaday + ")");
				pguardar[contp] = p;
				contp++;
			}
		});
		panel.add(bponto);
		
		JButton bretangulo = new JButton("Retangulo");
		bretangulo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Retangulo r = new Retangulo();
				r.x1 = x1;
				r.y1 = y1;
				r.x2 = x2;
				r.y2 = y2;
				r.Retangulof(getGraphics());
				String coordenadax1 = Integer.toString(x1);
				String coordenaday1 = Integer.toString(y1);
				String coordenadax2 = Integer.toString(x2);
				String coordenaday2 = Integer.toString(y2);
				String area = Integer.toString(r.area());
				String perimetro = Integer.toString(r.perimetro());
				status.setText("Ponto 1(" + coordenadax1 + ", " + coordenaday1 + ")" + " Ponto 2(" + coordenadax2 + ", " 
				+ coordenaday2 + ")" + " Area: " + area + " Perimetro: " + perimetro);
				rguardar[contr] = r;
				contr++;
			}
		});
		panel.add(bretangulo);
		
		JButton bcirculo = new JButton("Circulo");
		bcirculo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Circulo c = new Circulo();
				c.x1 = x1;
				c.y1 = y1;
				c.x2 = x2;
				c.y2 = y2;
				c.Circulof(getGraphics());
				String raio = Integer.toString(c.Raio());
				String area = Double.toString(c.Area());
				String circunferencia = Double.toString(c.Circunferencia());
				status.setText("Raio: " + raio + " Área: " + area + " Valor da Circunferência: " + circunferencia);
				cguardar[contc] = c;
				contc++;
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
				x1 = event.getX();
				y1 = event.getY();
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
				String contadorr = Integer.toString(contr);
				String contadorc = Integer.toString(contc);
				String contadorp = Integer.toString(contp);
				status.setText(String.format( "Mouse foi movimentado no ponto: (%d; %d) Circulos: " + contadorc 
						+ " Retangulos: " + contadorr + " Pontos: " + contadorp, event.getX(),event.getY() ));
			}
			
		});
		
		setVisible(true);
	}
	
	public static void main(String []a) {
		new Aplicacao();
	}
	
}