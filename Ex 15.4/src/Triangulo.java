
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Triangulo extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public void Triangulo(Graphics g, int X[], int Y[]) {
		g.setColor(Color.RED);
		g.drawLine(X[0], Y[0], X[1], Y[1]);
		g.drawLine(X[1], Y[1], X[2], Y[2]);
		g.drawLine(X[0], Y[0], X[2], Y[2]);
	}
	
	public double area(int X[], int Y[]) {
		double distanciad1 = Math.sqrt(Math.pow(X[1] - X[0], 2) + Math.pow(Y[1] - Y[0], 2));
		int distancia1 = (int) Math.round(distanciad1);
		double distanciad2 = Math.sqrt(Math.pow(X[2] - X[1], 2) + Math.pow(Y[2] - Y[1], 2));
		int distancia2 = (int) Math.round(distanciad2);
		double distanciad3 = Math.sqrt(Math.pow(X[2] - X[0], 2) + Math.pow(Y[2] - Y[0], 2));
		int distancia3 = (int) Math.round(distanciad3);
		int perimetro = distancia1 + distancia2 + distancia3;
		double semip = perimetro/2;
		double area = Math.sqrt(semip * (semip - distancia1)*(semip - distancia2)*(semip - distancia3));
		return area;
	}
	
	public int perimetro(int X[], int Y[]) {
		double distanciad1 = Math.sqrt(Math.pow(X[1] - X[0], 2) + Math.pow(Y[1] - Y[0], 2));
		int distancia1 = (int) Math.round(distanciad1);
		double distanciad2 = Math.sqrt(Math.pow(X[2] - X[1], 2) + Math.pow(Y[2] - Y[1], 2));
		int distancia2 = (int) Math.round(distanciad2);
		double distanciad3 = Math.sqrt(Math.pow(X[2] - X[0], 2) + Math.pow(Y[2] - Y[0], 2));
		int distancia3 = (int) Math.round(distanciad3);
		int perimetro = distancia1 + distancia2 + distancia3;
		return perimetro;
	}
	
}