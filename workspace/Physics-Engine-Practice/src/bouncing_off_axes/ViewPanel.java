package bouncing_off_axes;

import java.awt.Graphics;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

/**
 * Creates an instance of <code>ViewPanel</code>. Contains all of the graphics.
 * 
 * @author Mason Makarwich
 *
 */

public class ViewPanel extends JPanel {

	// Class objects
	protected ArrayList<Ball> ballList = new ArrayList<Ball>();

	/**
	 * Constructor for instances of <code>ViewPanel</code>. Initializes the ball handle.
	 */

	public ViewPanel() {

		Random gen = new Random();
		int j;
		int k;
		int l;
		int m;
		for(int i = 0; i<100; i++) {
			
			j = gen.nextInt(350);
			k = gen.nextInt(350);
			l = gen.nextInt(10);
			m = gen.nextInt(10);
			Ball b = new Ball(j, k, l, m, this);
			ballList.add(b);
		}

	}

	/**
	 * Drawing method. Moves the ball and then draws it.
	 * 
	 * @param g
	 */

	public void paint(Graphics g) {

		for(int i = 0; i<ballList.size(); i++) {
			Ball b = ballList.get(i);
			b.move();
			b.draw(g);
		}
	}
}
