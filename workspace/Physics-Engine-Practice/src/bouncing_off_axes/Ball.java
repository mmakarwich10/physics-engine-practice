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
	
	// Class Objects
	protected ViewPanel view;
	
	/**
	 * Constructor for instances of <code>Ball</code>. Initializes all of the class variables and objects.
	 */
	
	public Ball(int x, int y, int hor, int vert, ViewPanel v) {
		
		posX = x;
		posY = y;
		velX = hor;
		velY = vert;
		width = 10;
		height = 10;
		
		view = v;
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
		
		if ((posX <= 0 && velX < 0 ) || (posX >= view.getWidth()-width && velX > 0)) {
			
			velX = -velX;
		} else if ((posY <= 0 && velY < 0) || (posY >= view.getHeight()-height && velY > 0)) {
			
			velY = -velY;
		}
		
		posX += velX;
		posY += velY;
	}

}
