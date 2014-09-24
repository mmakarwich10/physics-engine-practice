package bouncing_off_axes;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Creates an instance of <code>Ball</code>. A ball is a movable sprite that is represented graphically by a circle.
 * 
 * @author Mason Makarwich
 *
 */

public class Ball {
	
	// Class Variables
	protected int posX;
	protected int posY;
	protected int velX;
	protected int velY;
	protected int width;
	protected int height;
	
	/**
	 * Constructor for instances of <code>Ball</code>. Initializes all of the class variables.
	 */
	
	public Ball() {
		
		posX = 50;
		posY = 50;
		velX = 1;
		velY = 1;
		width = 10;
		height = 10;
	}
	
	/**
	 * Draws the ball.
	 * 
	 * @param g
	 */
	
	public void draw(Graphics g) {
		
		g.setColor(Color.RED);
		g.fillOval(posX, posY, width, height);
	}
	
	/**
	 * Moves the ball.
	 */
	
	public void move() {
		
		posX += velX;
		posY += velY;
	}

}
