
import java.awt.Color;
import java.awt.Graphics;

public class Retangulo {
	private static final long serialVersionUID = 1L;
	
	protected int x1;
	protected int y1;
	protected int x2;
	protected int y2;
	
	public void Retangulof(Graphics g) {
		g.setColor(Color.RED);
		if(x2 - x1 > 0 && y1 > y2) {
			g.drawRect(x1, y2, x2 - x1, y1 - y2);
		}
		else if(x2 - x1 > 0 && y1 < y2) {
			g.drawRect(x1, y2, x2 - x1, y2 - y1);
		}
		else if(x2 - x1 < 0 && y1 < y2){
			g.drawRect(x2, y2, x1 - x2, y2 - y1);
		}
		else if(x2 - x1 < 0 && y1 > y2){
			g.drawRect(x2, y2, x1 - x2, y1 - y2);
		}
	}
	
	public int area() {
		int area = 0;
		if(x2 - x1 > 0 && y1 > y2) {
			int b = x2 - x1;
			int h = y1 - y2;
			area = b * h;
		}
		else if(x2 - x1 > 0 && y1 < y2) {
			int b = x2 - x1;
			int h = y2 - y1;
			area = b * h;
		}
		else if(x2 - x1 < 0 && y1 < y2){
			int b = x1 - x2;
			int h = y2 - y1;
			area = b * h;
		}
		else if(x2 - x1 < 0 && y1 > y2){
			int b = x1 - x2;
			int h = y1 - y2;
			area = b * h;
		}
		return area;
	}
	
	public int perimetro() {
		int perimetro = 0;
		if(x2 - x1 > 0 && y1 > y2) {
			int b = x2 - x1;
			int h = y1 - y2;
			perimetro = 2 * (b + h);
		}
		else if(x2 - x1 > 0 && y1 < y2) {
			int b = x2 - x1;
			int h = y2 - y1;
			perimetro = 2 * (b + h);
		}
		else if(x2 - x1 < 0 && y1 < y2){
			int b = x1 - x2;
			int h = y2 - y1;
			perimetro = 2 * (b + h);
		}
		else if(x2 - x1 < 0 && y1 > y2){
			int b = x1 - x2;
			int h = y1 - y2;
			perimetro = 2 * (b + h);
		}
		return perimetro;
	}
}