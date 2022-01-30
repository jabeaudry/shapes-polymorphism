
public class Rectangle extends PrintableObject implements Shape {

	private double height;
	private double width;
	
	//no arg constructor
	Rectangle() {
		height = 0;
		width = 0;
	}
	
	//constructor with args
	Rectangle (double height, double width){
		this.height = height;
		this.width = width;
	}
	
	//height  mutator and accesor
	public void setHeight (double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	//width mutator and accesor
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	@Override
	public String getName() {
		return(getClass().getSimpleName());
	}
	
	//toString method
	@Override
	public String toString() {
		return(getName()+": "+width +", "+height);
	}
	
	@Override
	public void print() {
		toString();
	}
	
	//parses a string with a rectangle height and width
	//returns a rectangle object 
	public static Rectangle parse(String input) {
		String[] myStrings = input.split(",");
		double width = Integer.parseInt(myStrings[1]);
		double height = Integer.parseInt(myStrings[2]);
		Rectangle rect = new Rectangle(width, height);
		return (rect); 
	}
	
	@Override
	public double getArea() {
		return (width*height);
	}
	
	@Override
	public double getPerimeter()
    {
        return 2 * (width + height);
    }

}
