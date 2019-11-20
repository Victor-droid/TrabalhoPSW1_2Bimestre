
import java.awt.Color;
import java.awt.Graphics;

public class Quadrado {
	private static final long serialVersionUID = 1L;

	public void Quadrado(Graphics g, int x1, int y1, int x2, int y2) {
		g.setColor(Color.RED);
		double distanciad = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		int distancia = (int) Math.round(distanciad);
		if(x2 - x1 > 0) {
			g.drawRect(x1, y2, distancia, distancia);
		}
		else {
			g.drawRect(x2, y2, distancia, distancia);
		}
	}
	
	public int area(int x1, int y1, int x2, int y2) {
		int area = 0;
		double distanciad = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		int distancia = (int) Math.round(distanciad);
		area = distancia * distancia;
		return area;
	}
	
	public int perimetro(int x1, int y1, int x2, int y2) {
		int perimetro = 0;
		double distanciad = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		int distancia = (int) Math.round(distanciad);
		perimetro = distancia * 4;
		return perimetro;
	}
}
