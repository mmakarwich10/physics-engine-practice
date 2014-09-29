package bouncing_off_axes;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class BallTest {
	
	@Test
	public void testBall() {
		
		Ball b = new Ball(50, 50, 3, 3, null);
		assertEquals("posX must be 50", 50, b.posX);
		assertEquals("posY should be 50", 50, b.posY);
		assertEquals("velX should be 3", 3, b.velX);
		assertEquals("velY should be 3", 3, b.velY);
		assertEquals("width should be 10", 10, b.width);
		assertEquals("height should be 10", 10, b.height);
	}

	@Test
	public void testMove() {
		
		ViewPanel view = new ViewPanel();
		view.setSize(500, 500);
		Ball b = new Ball(50, 50, 3, 3, view);
		
		b.move();
		assertEquals("posX should be 53", 53, b.posX);
		assertEquals("posY should be 53", 53, b.posY);
	}

}
