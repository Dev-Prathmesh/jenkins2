package shape;

public class SFactory {
public Shape getInstance(Stype type) {
		
		Shape shape = null;
			
		switch(type) 
		{
		
			case SQUARE:
			shape = new Square(5);
			break;
				
			case RECTANGLE:
				shape = new Rectangle(7,5);
				break;
				
			case TRIANGLE:
				shape = new Triangle(9,8);
				break;
				
			case CIRCLE:
				shape = new Circle(15);
				break;
				
		}
		
		return shape;
	}	
}
