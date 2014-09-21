package bouncing_off_axes;

import java.awt.Graphics;

/**
 * Creates an instance of <code>SimulationController</code>. Controls both the <code>ViewFrame</code> and the <code>Ball</code> objects, as well as the <code>Timer</code> object associated with
 * both.
 * 
 * @author Mason Makarwich
 *
 */

public class SimulationController {

	// Class Objects
	ViewFrame view;
	
	/**
	 * Constructor for instances of <code>SimulationController</code>. Initializes <code>ViewFrame</code>.
	 */
	
	public SimulationController() {
		
		view = new ViewFrame("Test");
	}
}
