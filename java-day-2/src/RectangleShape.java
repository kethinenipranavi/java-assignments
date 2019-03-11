import java.util.*;

public class RectangleShape {
	public static void main(String [] args) {

		double length;
		double breadth;
		Scanner sc=new Scanner(System.in);

		length = sc.nextDouble();
		breadth = sc.nextDouble();
		Rectangle shape1 =new Rectangle(length,breadth);
		shape1.areaOfRectangle();
		shape1.perimeterOfRectangle();
		System.out.println(shape1.tostring());
		length = sc.nextDouble();
		breadth = sc.nextDouble();
		Rectangle shape2 =new Rectangle(length,breadth);
		shape2.areaOfRectangle();
		shape2.perimeterOfRectangle();
		System.out.println(shape2.tostring());
		if(shape1.areaOfRectangle()==shape2.areaOfRectangle())
		System.out.println("Area of rectangles are same");
	else
		System.out.println("Area of rectangles not are same");
	}
}