package bouncing_off_axes;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class BallTest {
	
	@Test
	public void testBall() {
		
		Ball b = new Ball();
		assertEquals("posX must be 50", 50, b.posX);
		assertEquals("posY should be 50", 50, b.posY);
		assertEquals("velX should be 1", 1, b.velX);
		assertEquals("velY should be 1", 1, b.velY);
		assertEquals("width should be 10", 10, b.width);
		assertEquals("height should be 10", 10, b.height);
	}

	@Test
	public void testMove() {
		
		Ball b = new Ball();
		
		b.move();
		assertEquals("posX should be 51", 51, b.posX);
		assertEquals("posY should be 51", 51, b.posY);
	}

}
