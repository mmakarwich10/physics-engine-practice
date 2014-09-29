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
	
	/**
	 * Overrides the JFrame's inherent <code>paint()</code> method. Tells the <code>ViewPanel</code> to repaint.
	 */
	
	public void paint(Graphics g) {
		
		view.repaint();
	}
	
	/**
	 * Creates an instance of a <code>TimerListener</code>. Serves as the action listener for the Timer in <code>SimulationController</code>.
	 * 
	 * @author Mason Makarwich
	 *
	 */
	
	private class TimerListener implements ActionListener {

		/**
		 * Performs a JFrame repaint call every time the <code>Timer</code> goes off.
		 */
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			repaint();
		}
		
	}

}
