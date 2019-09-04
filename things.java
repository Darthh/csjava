package chapter3;

public class things {

	public static void main(String [] args) {
		double millis = System.currentTimeMillis();
		System.out.println(millis);
		int days = (int)toDays(millis);
		System.out.printf("Days: %,d", + days);
	}
		public static double toDays(double millis) {
			double answer = millis/1000/60/60/24;
			return answer;
	

	}
}
