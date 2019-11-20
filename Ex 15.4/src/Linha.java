
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Linha extends JPanel{
		private static final long serialVersionUID = 1L;

		public void Linha(Graphics g, int X1, int Y1, int X2, int Y2) {
			g.setColor(Color.RED);
			g.drawLine(X1, Y1, X2, Y2);
		}
}
