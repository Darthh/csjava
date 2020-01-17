package chapter2020;

public class Rectangle {

	
	Rectangle rectangle1 = new Rectangle(5, 8);

	
	
	
	//1st rectangle
	int tsides = 4; //top 
	int bsides = 5; //bottom
	
	//2nd rectangle 
	int rsides = 5; //right
	int lsides = 8; //left
	
	
	
	
	//defining the rectangle
	public Rectangle(int newTsides, int newBsides)
	{
		tsides = newTsides;
	}
	

	//getting area of 1st rectangle
	int getArea()
	{
		return tsides * bsides;
	}
	
	//getting perimeter of 1st rectangle
	int getPerimeter()
	{
		return (tsides + bsides) * 2;
	}
	
	//getting area of 2nd rectangle
	int getArea2()
	{
		return rsides * lsides;
	}
	
	//getting perimeter of 2nd rectangle
	int getPerimeter2()
	{
		return (rsides + lsides) * 2;
	}
	
	//-----------------------------
	//triangle
	
	public class Triangle {
		int base = 1;
		int height = 1;
	}
	
	

	
	
	
	
	
	
	
	
	
}
