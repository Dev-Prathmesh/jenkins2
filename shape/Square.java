package shape;

public class Square implements Shape {

private double length;
	
	public Square()							
	{
		this.length = 0;
	}
	
	public Square(double length) {				
		this.length = length;
	}
	
	public void draw() {						
	      System.out.println("Drawing Square");
	}
	
	public double calculateArea() {				
		return this.length*this.length;
	}

	public Shape getClone() {					
		return new Square(this.length);
	}
	
	
	
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	

}
