import java.awt.Color;
import java.awt.Graphics;

public class Quadrado {
	private static final long serialVersionUID = 1L;

	public void Quadrado(Graphics g, int X1, int Y1, int X2, int Y2) {
		g.setColor(Color.RED);
		double distanciad = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
		int distancia = (int) Math.round(distanciad);
		if(X2 - X1 > 0) {
			g.drawRect(X1, Y2, distancia, distancia);
		}
		else {
			g.drawRect(X2, Y2, distancia, distancia);
		}
	}
	
	public int area(int X1, int Y1, int X2, int Y2) {
		int area = 0;
		double distanciad = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
		int distancia = (int) Math.round(distanciad);
		area = distancia * distancia;
		return area;
	}
	
	public int perimetro(int X1, int Y1, int X2, int Y2) {
		int perimetro = 0;
		double distanciad = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
		int distancia = (int) Math.round(distanciad);
		perimetro = distancia * 4;
		return perimetro;
	}
}
