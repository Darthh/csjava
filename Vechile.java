package Thursday;

	// Vechile -> MotorCycle ,Vechile -> Car, Vechile -> Truck
					//Car -> Sedan, Car -> SUV,

	//F - E - P

	//V - M T C- SUV SED
	//-------------------------------------------------------
	public class Vechile extends Car {
		public static void main(String[] args) {
			new Vechile();
		}

		public Vechile() {
			System.out.println("Vechile");
		}
		
	} //end of Car
	//------------------------------------------------------------------------
	class Car extends Sedan{
		//employee    //person

	public Car(){
		new Car();
		
		System.out.println("Car");
		
	}

		public Car(String s)
		{
			System.out.println(s);
			}
		} //end of employee
	
	
	
	
	class Car extends Truck {
	
	}
	//---------------------------------------------------------------

		class Sedan{

		public Sedan(){
			
			System.out.println("Sedan");
			}
		
	} //end of person