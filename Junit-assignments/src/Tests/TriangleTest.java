package tests;
import org.junit.Test;
import main.Triangle;
import static org.junit.Assert.*;
public class TriangleTest
{
	@Test
	public void testForTriangleToCheckItIsRightAngled()
	{	
		Triangle triangle = new Triangle(3,4,5);
		assertTrue(triangle.isRight());
	}
	@Test
	public void testForTriangleToCheckItIsNotRightAngled()
	{	
		Triangle triangle = new Triangle(2,4,5);
		assertFalse(triangle.isRight());
	}
	@Test
	public void testForTriangleToCheckItIsScalene()
	{	
		Triangle triangle = new Triangle(2,4,5);
		assertTrue(triangle.isScalene());
	}
	@Test
	public void testForTriangleToCheckItIsNotScalene()
	{	
		Triangle triangle = new Triangle(2,4,4);
		assertFalse(triangle.isScalene());
	}
	@Test
	public void testForTriangleToCheckItIsIsosceles()
	{	
		Triangle triangle = new Triangle(2,4,4);
		assertTrue(triangle.isIsosceles());
	}
	@Test
	public void testForTriangleToCheckIsNotIsosceles()
	{	
		Triangle triangle = new Triangle(2,9,4);
		assertFalse(triangle.isIsosceles());
	}
	@Test
	public void testForTriangleToCheckItIsEquilateral()
	{	
		Triangle triangle = new Triangle(4,4,4);
		assertTrue(triangle.isEquilateral());
	}
	@Test
	public void testForTriangleToCheckIsNotEquilateral()
	{	
		Triangle triangle = new Triangle(2,9,4);
		assertFalse(triangle.isEquilateral());
	}
}