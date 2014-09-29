package bouncing_off_axes;

import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.JPanel;

/**
 * Creates an instance of <code>ViewPanel</code>. Contains all of the graphics.
 * 
 * @author Mason Makarwich
 *
 */

public class ViewPanel extends JPanel {

	// Class objects
	protected Ball b;
	
	/**
	 * Constructor for instances of <code>ViewPanel</code>. Initializes the ball handle.
	 */
	
	public ViewPanel() {
		
		b = new Ball();
	}
	
	/**
	 * Drawing method. Draws a rectangle.
	 * 
	 * @param g
	 */
	
	public void paint(Graphics g) {
		
		b.move();
		b.draw(g);
	}
}
