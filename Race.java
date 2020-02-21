package chapter2020;
import java.util.*;

public class Race {
	public static void main(String[] args) {
		/*
		 * Program
		 */
		theRace();
	}

	public static void theRace() {
		/*
		 * Variables
		 */
		int raceNumber = 1;
		int[] place;

		/*
		 * Vehicle Objects
		 */
		Motorcycle motorC = new Motorcycle();
		Truck motorT = new Truck();
		Sedan motorS = new Sedan();
		SUV motorSUV = new SUV();

		/*
		 * Loop 10 times
		 */
		for (int i = 0; i < 10; i++) {
			/*
			 * Variables
			 */
			int position = 1, m = 0, t = 0, s = 0, su = 0;
			System.out.println("--------------------------------------------------------------\n\nRace: " + raceNumber);
			// Create new instance of objects all over again
			motorC = new Motorcycle();
			motorT = new Truck();
			motorS = new Sedan();
			motorSUV = new SUV();
			place = new int[5];

			// Place total acceleration of each racer in array place
			place[0] = motorC.getTotalAccel();
			place[1] = motorT.getTotalAccel();
			place[2] = motorS.getTotalAccel();
			place[3] = motorSUV.getTotalAccel();

			// Sort Array Into Fastest
			Arrays.sort(place);

			//Go backwards and name each place depending on faster acceleration
			for (int j = place.length - 1; j > 0; j--) {
				if (place[j] == motorC.getTotalAccel() && m == 0) {
					System.out.println("\nMotorcycle " + position + " place.\nWith an acceleration of " + motorC.getAcceleration() + " and deceleration of trap of " + (motorC.getTotalAccel() - motorC.getAcceleration()));
					m++;
					position++;
				}
				else if (place[j] == motorT.getTotalAccel() && t == 0) {
					System.out.println("\nTruck " + position + " place.\nWith an acceleration of " + motorT.getAcceleration() + " and deceleration of trap of " + (motorT.getTotalAccel() - motorT.getAcceleration()));
					t++;
					position++;
				}
				else if (place[j] == motorS.getTotalAccel() && s == 0) {
					System.out.println("\nSedan " + position + " place.\nWith an acceleration of " + motorS.getAcceleration() + " and deceleration of trap of " + (motorS.getTotalAccel() - motorS.getAcceleration()));
					s++;
					position++;
				}
				else if (place[j] == motorSUV.getTotalAccel() && su == 0) {
					su++;
					System.out.println("\nSUV " + position + " place.\nWith an acceleration of " + motorSUV.getAcceleration() + " and deceleration of trap of " + (motorSUV.getTotalAccel() - motorSUV.getAcceleration()));
					position++;
				}
				else {
					System.out.println("Broken");
				}
			}
			//Increment number of races passed
			raceNumber++;
		}
	}
}