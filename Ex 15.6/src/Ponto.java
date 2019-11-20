
import java.awt.Color;
import java.awt.Graphics;

public class Ponto {
	private static final long serialVersionUID = 1L;
	
	protected int x1;
	protected int y1;
	
	public void Pontof(Graphics g) {
		g.setColor(Color.RED);
		g.drawLine(x1, y1, x1, y1);
	}
}
