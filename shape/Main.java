package shape;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		SFactory shapefactory = new SFactory();
		System.out.println("*********************************************************************");
		System.out.println(" Select the Shape which you want to Draw and Calculate Area of it :- ");
        System.out.println("\t1. Square");
        System.out.println("\t2. Rectangle");
        System.out.println("\t3. Triangle ");
        System.out.println("\t4. Circle");
        System.out.println("\t5. Exit ");
        System.out.println("**********************************************************************");
        int choice = s.nextInt();
		
        switch(choice) 
        {    
        	case 1:
        		Shape sqr = shapefactory.getInstance(Stype.SQUARE);
        		sqr.draw();
        		System.out.println("Area of square is "+sqr.calculateArea());
        		
        		Shape sqr2 = sqr.getClone();
        		sqr2.draw();
        		System.out.println("Area of square is "+sqr2.calculateArea());
        		break;
        	
        	case 2:
        		Shape rectangle = shapefactory.getInstance(Stype.RECTANGLE);
        		rectangle.draw();
        		System.out.println("Area of Rectangle is "+rectangle.calculateArea());
        		
        		Shape rectangle2 = rectangle.getClone();
        		rectangle2.draw();
        		System.out.println("Area of Rectangle is "+rectangle2.calculateArea());
        		break;
        		
        		
        	case 3:
        		Shape triangle = shapefactory.getInstance(Stype.TRIANGLE);
        		triangle.draw();
        		System.out.println("Area of Triangle is "+triangle.calculateArea());
        		
        		Shape triangle2 = triangle.getClone();
        		triangle2.draw();
        		System.out.println("Area of Triangle is "+triangle2.calculateArea());
        		break;
        			
        	case 4:
        		Shape circle = shapefactory.getInstance(Stype.CIRCLE);
        		circle.draw();
        		System.out.println("Area of Circle is "+circle.calculateArea());
        		
        		Shape circle2 = circle.getClone();
        		circle2.draw();
        		System.out.println("Area of Circle is "+circle2.calculateArea());
        		break;
        		
        	case 5:
        		break;
        	
        	default:
        		System.out.println("Enter valid option");
        		break;
        }
        
        
        s.close();
        
	}

	}


