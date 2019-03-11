public class Rectangle { 
	private double length;
	private double breadth;

		public Rectangle(double length,double breadth) {
			this.length=length;
			this.breadth=breadth;
		}
	public double areaOfRectangle() {
		return length * breadth;
	}
	public double perimeterOfRectangle() {
		return 2 * (length + breadth);
	}
	public String tostring() {
		return "Area of rectangle = "+ areaOfRectangle()+"\nperimeter of rectangle ="+ perimeterOfRectangle();
	}
}