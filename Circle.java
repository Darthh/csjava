package chapter2020;

public class Circle {

	double radius = 1;
	
	
	//default 1
	Circle()
	{
		
	}
	
	//double new radius
	Circle(double newRadius)
	{
		radius = newRadius;
	}
	
	
	
	
	//return the area of a circle //
	double getArea()
	{
		return radius * radius * Math.PI;
	}
	
	
	//return the perimeter of a circle
	double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}
	
	
	//void
	void setRadius(double newRadius)
	{
		radius = newRadius;
	}

	
	
	
	
	
	
	
	
}
