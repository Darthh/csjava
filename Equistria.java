package chapter3;

import java.text.*;

	public class Equistria {

		public static void main(String[] args) {
		//number format
		NumberFormat formatter = new DecimalFormat("#0.00");     

	//diameter reach
	int pathDiameter = 20;

	//loaction var
	int baltimoreX = 29;
	int baltimoreY = 16;
	int manehattanX = 34;
	int manehattanY = 8;

	int losPegasusX = 6;
	int losPegasusY = 9;
	int neighagraFallsX = 22;
	int neighagraFallsY = 7;

	int badlandsX = 25;
	int badlandsY = 24;
	int ponyvilleX = 16;
	int ponyvilleY = 14;

	System.out.println("Question #1 ");
	//roadtrip
	System.out.println("The circumference is: " + formatter.format(roadTrip1(pathDiameter)) + "km");
	System.out.println();

	System.out.println("Question #2 ");
	//distance
	System.out.println("Baltimore to Manehattan: " + formatter.format(distance(baltimoreX, baltimoreY, manehattanX, manehattanY)) + "km");
	System.out.println("Los Pegasus to Neighagra Falls: " + formatter.format(distance(losPegasusX, losPegasusY, neighagraFallsX, neighagraFallsY)) + "km");
	System.out.println("Badlands to Ponyville: " + formatter.format(distance(badlandsX, badlandsY, ponyvilleX, ponyvilleY)) + "km");
	System.out.println();

	System.out.println("Question #3 ");
	System.out.println("Top 3 Destinations: Manehattan, Los Pegasus, Neighagra Falls");
	
	//mypath
	System.out.println("The total distance is : " + formatter.format(MyPath()) + "km");
	System.out.println();

	//totaltrip
	System.out.println("Question #4 ");
	System.out.println("Baltimore, Manehattan, Ponyville trip distance: " + formatter.format(totalTrip(baltimoreX, baltimoreY, manehattanX, manehattanY, ponyvilleX, ponyvilleY)) + "km");


} //next 3 } are end of mains

	// circumference formula
	public static double roadTrip1(int d) {
	double cirumference = d * Math.PI;
	return cirumference;
}

	//the 3 locations 
	public static double distance(int x1, int x2, int y1, int y2) {
	double xDif = Math.pow(x2 - x1, 2);
	double yDif = Math.pow(y2 - y1, 2);
	double distance = Math.sqrt(xDif + yDif);
	return distance;
}
    //my path2
	public static double MyPath() {
		
	//names of 3 locations
	int manehattanX = 34;
	int manehattanY = 8;
	
	int losPegasusX = 6;
	int losPegasusY = 9;
	
	int neighagraFallsX = 22;
	int neighagraFallsY = 7;
	
	
	double xDif1 = Math.pow(losPegasusX - manehattanX, 2);
	double yDif1 = Math.pow(losPegasusY - manehattanY, 2);
	double distance1 = Math.sqrt(xDif1 + yDif1);
	
	double xDif2 = Math.pow(manehattanX - neighagraFallsX, 2);
	double yDif2 = Math.pow(manehattanY - neighagraFallsY, 2);
	double distance2 = Math.sqrt(xDif2 + yDif2);
	
	double totalDistance = distance1 + distance2;
	return totalDistance;
}
	//3 locations - total distance 3
	public static double totalTrip(int x1, int x2, int y1, int y2, int x3, int y3) {
	double xDif1 = Math.pow(x2 - x1, 2);
	double yDif1 = Math.pow(y2 - y1, 2);
	double distance1 = Math.sqrt(xDif1 + yDif1);
	double xDif2 = Math.pow(x2 - y3, 2);
	double yDif2 = Math.pow(y2 - y3, 2);
	double distance2 = Math.sqrt(xDif2 + yDif2);
	double xDif3 = Math.pow(x3 - x1, 2);
	double yDif3 = Math.pow(y3 - y1, 2);
	
	double distance3 = Math.sqrt(xDif3 + yDif3);
	double totalDistance = distance1 + distance2 + distance3;
	return totalDistance;
	}
	
}//End of class
	
	
	
	
	
	