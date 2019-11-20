
import java.awt.Color;
import java.awt.Graphics;

public class Ponto {
	private static final long serialVersionUID = 1L;
	public void Ponto(Graphics g, int X1, int Y1) {
		g.setColor(Color.RED);
		g.drawLine(X1, Y1, X1, Y1);
	}
}
