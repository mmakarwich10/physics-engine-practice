package bouncing_off_axes;

import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * Creates an instance of <code>ViewFrame</code>. Serves as the controller for the whole program and the container for <code>ViewPanel</code>.
 * 
 * @author Mason Makarwich
 *
 */

@SuppressWarnings("serial")
public class SimulationController extends JFrame {

	// Class objects
	protected ViewPanel view;
	protected Timer t;
	
	/**
	 * Constructor for instances of <code>ViewFrame</code>. Initializes all of the class object.
	 * 
	 * @param title
	 * @throws HeadlessException
	 */
	
	public SimulationController(String title) throws HeadlessException {
		super(title);
		
		view = new ViewPanel();
		this.add(view);
		this.setVisible(true);
		this.setSize(500, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		TimerListener hey = new TimerListener();
		t = new Timer(31, hey);
		t.start();
	}
	
	public void paint(Graphics g) {
		
		view.repaint();
	}
	
	private class TimerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			repaint();
		}
		
	}

}
