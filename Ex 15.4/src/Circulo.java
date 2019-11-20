
import java.awt.Color;
import java.awt.Graphics;

public class Circulo {
	private static final long serialVersionUID = 1L;
	
	public void Circulo(Graphics g, int X1, int Y1, int X2, int Y2) {
		g.setColor(Color.RED);
		double distanciad = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
		int distancia = (int) Math.round(distanciad);
		if(X2 - X1 > 0) {
			g.drawOval(X1, Y2, distancia, distancia);
		}
		else {
			g.drawOval(X2, Y2, distancia, distancia);
		}
	}
	
	public int Raio(int X1, int Y1, int X2, int Y2) {
		double distanciad = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
		int distancia = (int) Math.round(distanciad);
		int raio = distancia/2;
		return raio;
	}
	
	public double Area(int X1, int Y1, int X2, int Y2) {
		double distanciad = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
		int distancia = (int) Math.round(distanciad);
		int raio = distancia/2;
		double area = 3.14 * (raio * raio);
		return area;
	}
	
	public double Circunferencia(int X1, int Y1, int X2, int Y2) {
		double distanciad = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
		int distancia = (int) Math.round(distanciad);
		int raio = distancia/2;
		double circunferencia = 2 * 3.14 * raio;
		return circunferencia;
	}
}
