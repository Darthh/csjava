package chapter2020;

public class TestCircle {

	public static void main(String[] args) {
	
		Circle circle1 = new Circle();
		System.out.println("The area of circle 1 is: " + circle1.getArea() + " with radius:  " + circle1.radius);
		
							//circle = the radius  // + change the circle 1-2 variable
		Circle circle2 = new Circle(25);
		System.out.println("The area of circle 1 is: " + circle2.getArea() + " with radius:  " + circle2.radius);
		
		Circle circle3 = new Circle(125);
		System.out.println("The area of circle 1 is: " + circle3.getArea() + " with radius:  " + circle3.radius);
		
		
		//changes and modifies circle 2 by setting a diff radius from 25 to 100 
		System.out.println("Let\'s modify the Circle2 object radius");
		circle2.setRadius(100);
		System.out.println("The area of circle 1 is: " + circle2.getArea() + " with radius:  " + circle2.radius);
	


	}
}