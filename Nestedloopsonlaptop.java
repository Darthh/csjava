package chapter3;
			 
public class Nestedloopsonlaptop {
		 public static void main(String[] args) {
			 q14a();
			 q14b();
			 q14c();
			 q14d();
			 q14e();
			 q15();
			 q16();
			 q17();
			 q18();
			 q19();
			 q20();
			 q21();
			 q22();
			 q23();
			 q24();
			 q25();	 
		 }
		 public static void q14a() {
			System.out.println("Question 14a: ");
		    for(int i=1; i<=6; i++)
		    System.out.println(2 * i);
		 }
		 public static void q14b() {
			System.out.println("Question 14b: ");
		    for(int i=1; i<=6; i++)
		    System.out.println(15 * i - 11); 
		 }
		 public static void q14c() {
				System.out.println("Question 14c: ");
			    for(int i=1; i<=6; i++)
			    System.out.println(-10 * i + 40);
		 }
		 public static void q14d() {
				System.out.println("Question 14d: ");
			    for(int i=1; i<=6; i++)
			    System.out.println(4 * i - 11);
		 }
		 public static void q14e() {
				System.out.println("Question 14e: ");
			    for(int i=1; i<=6; i++)
			    System.out.println(-3 * i + 100);
		 }
			 public static void q15()  {
				 System.out.println("Question 15: ");
			     for(int i=1; i<=6; i++)
			 System.out.println(18*(i-1)-4);
			 }
			 public static void q16() {
				 System.out.println("Question 16: ");
				 int number = 4;
				 for (int count = 1; count <= number; count++) {
				 System.out.println(number);
				 number = number / 2;
				 }
			 }   
			 public static void q17() {
				 System.out.println("Question 17: ");
				 int total = 25;
				 for (int number = 1; number <= (total / 2); number++) {
				 total = total - number;
				 System.out.println(total + " " + number);
				 }
			 }
			 public static void q18() {
				 System.out.println("Question 18: ");
				 System.out.println("+---+");
				 for (int i = 1; i <= 3; i++) {
				 System.out.println("\\ /");
				 System.out.println("/ \\");
				 }
				 System.out.println("+---+");
			 }
			 public static void q19() {
				 System.out.println("Question 19: ");
				 for (int i = 1; i <= 3; i++)
					 System.out.println("How many lines");
					 System.out.println("are printed?");
			 }
			 public static void q20() {
				 System.out.println("Question 20: ");
				 System.out.print("T-minus ");
				 for (int i = 5; i >= 1; i--) {
				 System.out.print(i + ", ");
				 }
				 System.out.println("Blastoff!"); 
			 }
			 public static void q21() {
				 System.out.println("Question 21: ");
				 for (int i = 1; i <= 5; i++) {
					 for (int j = 1; j <= 10; j++) {
					 System.out.print((i * j) + " ");
					 }
					 System.out.println();
					 }
			 }
			 public static void q22() {
				 System.out.println("Question 22: ");
			 for (int i = 1; i <= 10; i++) {
				 for (int j = 1; j <= 10 - i; j++) {
				 System.out.print(" ");
				 }
				 for (int j = 1; j <= 2 * i - 1; j++) {
				 System.out.print("*");
				 }
				 System.out.println();
				 }
			 }
			 public static void q23() {
				 System.out.println("Question 23: ");
			 for (int i = 1; i <= 2; i++) {
				 for (int j = 1; j <= 3; j++) {
				 for (int k = 1; k <= 4; k++) {
				 System.out.print("*");
				 }
				 System.out.print("!");
				 }
				 System.out.println();
				 }
			 }
			 public static void q24() {
				 System.out.println("Question 24: ");
				 for (int i = 1; i <= 2; i++) {
					 for (int j = 1; j <= 3; j++) {
					 for (int k = 1; k <= 4; k++) {
						 System.out.print("*");
					 }
					 }
					 System.out.print("!");
					 System.out.println();
					 }
			 }
			 public static void q25() {
				 System.out.println("Question 25: ");
				 for (int i = 1; i <= 2; i++) {
					 for (int j = 1; j <= 3; j++) {
					 for (int k = 1; k <= 4; k++) {
					 System.out.print("*");
					 System.out.print("!");
					 }
					 System.out.println();
				    }
				 }
			}
	 }
	