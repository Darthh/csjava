package chapter2020;

public class Date {

	//object oriented java, does class and info over a database crossover via platforms with also same classes.
	//via python backend on pc to swift ios platform via phone
	
	
	
	//accessor getter, mutator setter
		
		//instance variables
		int day;
		int month;
		int year;
	
	
		//methods
		public int getdaysInMonth() {

			if(month == 4 || month == 6 || month == 9 || month==11) 
			{
				return 30;
			}
			else if (month == 2)
			{
				if(isLeapYear()) 
				{
					return 20;
				}
			}
			else {
				return 31;
			}	
		}
		
		public boolean isLeapYear()
		{
			return(year % 400 == 0 || (year % 4 == 0 && year % 100 !=0 ));
		}
		
		
		public class testDate
		{
			public static void main(String[] args)
			{
			
			
			Date d1 = new Date();
			d1.setDay(10);
			d1.setMonth(3);
			d1.setYear(1971);
			System.out.println(d1.isLeapYear());
			
			Date d2 = new Date();
			d2.setDay(18);
			d2.setMonth(3);
			d2.setYear(2003);
			System.out.println(d2.isLeapYear());
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			d1.year = 2000;
			d1.month = 10;
			d1.day = 17;
			System.out.println(d1.getdaysInMonth());
			System.out.println(d1.isLeapYear());
			
			
		}
	}
		//day setters and getters
		public int getDay() 
		{
			return day;
		}
		
		public void setDay(int day1)
		{
			day = day1;
		}
		//month
		public int getMonth()
		{
			return month;
		}
		
		public void setMonth(int month1)
		{
			month = month1;
		}
		
		//year
		
		public int getYear()
		{
			return year;
		}
		
		public void setYear(int year1)
		{
			year = year1;
		}
		
		
		
		
		
		
		
		
		
		

}
