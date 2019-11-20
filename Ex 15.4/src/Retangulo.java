import java.awt.Color;
import java.awt.Graphics;

public class Retangulo {
	private static final long serialVersionUID = 1L;
	
	public void Retangulo(Graphics g, int X1, int Y1, int X2, int Y2) {
		g.setColor(Color.RED);
		if(X2 - X1 > 0 && Y1 > Y2) {
			g.drawRect(X1, Y2, X2 - X1, Y1 - Y2);
		}
		else if(X2 - X1 > 0 && Y1 < Y2) {
			g.drawRect(X1, Y2, X2 - X1, Y2 - Y1);
		}
		else if(X2 - X1 < 0 && Y1 < Y2){
			g.drawRect(X2, Y2, X1 - X2, Y2 - Y1);
		}
		else if(X2 - X1 < 0 && Y1 > Y2){
			g.drawRect(X2, Y2, X1 - X2, Y1 - Y2);
		}
	}
	
	public int area(int X1, int Y1, int X2, int Y2) {
		int area = 0;
		if(X2 - X1 > 0 && Y1 > Y2) {
			int b = X2 - X1;
			int h = Y1 - Y2;
			area = b * h;
		}
		else if(X2 - X1 > 0 && Y1 < Y2) {
			int b = X2 - X1;
			int h = Y2 - Y1;
			area = b * h;
		}
		else if(X2 - X1 < 0 && Y1 < Y2){
			int b = X1 - X2;
			int h = Y2 - Y1;
			area = b * h;
		}
		else if(X2 - X1 < 0 && Y1 > Y2){
			int b = X1 - X2;
			int h = Y1 - Y2;
			area = b * h;
		}
		return area;
	}
	
	public int perimetro(int X1, int Y1, int X2, int Y2) {
		int perimetro = 0;
		if(X2 - X1 > 0 && Y1 > Y2) {
			int b = X2 - X1;
			int h = Y1 - Y2;
			perimetro = 2 * (b + h);
		}
		else if(X2 - X1 > 0 && Y1 < Y2) {
			int b = X2 - X1;
			int h = Y2 - Y1;
			perimetro = 2 * (b + h);
		}
		else if(X2 - X1 < 0 && Y1 < Y2){
			int b = X1 - X2;
			int h = Y2 - Y1;
			perimetro = 2 * (b + h);
		}
		else if(X2 - X1 < 0 && Y1 > Y2){
			int b = X1 - X2;
			int h = Y1 - Y2;
			perimetro = 2 * (b + h);
		}
		return perimetro;
	}
}
