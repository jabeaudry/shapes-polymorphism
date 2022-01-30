
public class Circle extends PrintableObject implements Shape{

	private double radius;
	
	//constructor no args
	public Circle() {
		radius = 0;
	}
	
	//constructor with args
	public Circle (double radius) {
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius= radius;
	}
	
	public String getName() {
		return(getClass().getSimpleName());
	}
	
	//toString method
	@Override
	public String toString() {
		return(getName()+": "+radius);
	}
	
	@Override
	public void print() {
		toString();
	}

	//parses a string with a circle height and width
		//returns a rectangle object 
		public static Circle parse(String input) {
			String[] myStrings = input.split(",");
			double radius = Integer.parseInt(myStrings[1]);
			Circle circ = new Circle (radius);
			return (circ); 
		}
		
		@Override
		public double getArea() {
			return (2*Math.PI*(Math.pow(radius, 2)));
		}
		
		@Override
		public double getPerimeter()
	    {
	        return 2 * (Math.PI*radius);
	    }

}
