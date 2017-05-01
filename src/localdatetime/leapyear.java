package localdatetime;
import java.time.LocalDate;

public class leapyear {
	public  static void main(String [] args){
												  //of() method take (int,int,int )as argument.
	 LocalDate date1 = LocalDate.of(8,2,2);      // a leap year is always divisible by eight.
	 System.out.println(date1.isLeapYear());   	// isLeapYear() method is already declared inside LocalDate class which  is inbuilt and 
												//used to tell whether date given is leap year or not by returning true or false.
	  
	 LocalDate date2 = LocalDate.of(2016,2,2);      // here 2016 is divisible by eight.
	 System.out.println(date2.isLeapYear());  
	}
	
}
