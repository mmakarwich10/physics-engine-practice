package bouncing_off_axes;

/**
 * This is the driver class of this program.
 * 
 * @author Mason Makarwich
 *
 */

public class Main {

	/**
	 * The driving method.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Physics Engine Practice - Bouncing Balls");
		SimulationController view = new SimulationController("Test");
		
	}

}
