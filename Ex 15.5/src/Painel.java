
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

public class Painel extends JFrame {

	private JPanel contentPane;
	
	int x1;
	int y1;
	int x2;
	int y2;
	Circulo cguardar[] = new Circulo[500];
	Circulo c = new Circulo();
	int i = 0;
	
	public Painel() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(Color.BLACK);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel status = new JLabel("Mensagens de evento do mouse");
		add(status, BorderLayout.NORTH);
		
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
				c.x1 = event.getX();
				c.y1 = event.getY();
			}
			
			@Override
			public void mouseReleased(MouseEvent event) {
				c.x2 = event.getX();
				c.y2 = event.getY();
				c.Circulof(getGraphics());
				String raio = Integer.toString(c.Raio());
				String area = Double.toString(c.Area());
				String circunferencia = Double.toString(c.Circunferencia());
				status.setText("Raio: " + raio + " Área: " + area + " Valor da Circunferência: " + circunferencia);
				cguardar[i] = c;
				i++;
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
				String contador = Integer.toString(i);
				status.setText(String.format( "Mouse foi movimentado no ponto: (%d; %d) Circulos: " + contador, 
						event.getX(),event.getY() ));
			}
			
		});
		
		setVisible(true);
	}
	
	public static void main(String []a) {
		new Painel();
	}
	
}