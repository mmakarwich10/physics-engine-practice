package bouncing_off_axes;

import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

/**
 * Creates an instance of <code>ViewFrame</code>. Serves and the container for <code>ViewPanel</code>.
 * 
 * @author Mason Makarwich
 *
 */

@SuppressWarnings("serial")
public class ViewFrame extends JFrame {

	// Class objects
	protected ViewPanel view;
	
	/**
	 * Constructor for instances of <code>ViewFrame</code>. Initializes the <code>ViewPanel</code>.
	 * 
	 * @param title
	 * @throws HeadlessException
	 */
	
	public ViewFrame(String title) throws HeadlessException {
		super(title);
		
		view = new ViewPanel();
		this.add(view);
		this.setVisible(true);
		this.setSize(500, 400);
	}
	
	public void paint(Graphics g) {
		
		view.draw(g);
	}

}