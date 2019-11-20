
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Linha extends JPanel{
		private static final long serialVersionUID = 1L;

		public void Linha(Graphics g, int x1, int y1, int x2, int y2) {
			g.setColor(Color.RED);
			g.drawLine(x1, y1, x2, y2);
		}
}
