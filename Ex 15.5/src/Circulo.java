import java.awt.Color;
import java.awt.Graphics;

public class Circulo {
	private static final long serialVersionUID = 1L;
	
	protected int x1;
	protected int y1;
	protected int x2;
	protected int y2;
	
	public void Circulof(Graphics g) {
		g.setColor(Color.RED);
		double distanciad = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		int distancia = (int) Math.round(distanciad);
		if(x2 - x1 > 0) {
			g.drawOval(x1, y2, distancia, distancia);
		}
		else {
			g.drawOval(x2, y2, distancia, distancia);
		}
	}
	
	public int Raio() {
		double distanciad = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		int distancia = (int) Math.round(distanciad);
		int raio = distancia/2;
		return raio;
	}
	
	public double Area() {
		double distanciad = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		int distancia = (int) Math.round(distanciad);
		int raio = distancia/2;
		double area = 3.14 * (raio * raio);
		return area;
	}
	
	public double Circunferencia() {
		double distanciad = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		int distancia = (int) Math.round(distanciad);
		int raio = distancia/2;
		double circunferencia = 2 * 3.14 * raio;
		return circunferencia;
	}
}
