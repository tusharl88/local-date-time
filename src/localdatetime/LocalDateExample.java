package localdatetime;
import java.time.LocalDate;
public class LocalDateExample {

		  public static void main (String [] args){
		      
			  //We have directly used class name and made reference variable of its type.
			  // and here implemented now method with help of class name and not by making object from LocalDate class.
			  
		        LocalDate date = LocalDate.now();
		        LocalDate yesterday = date.minusDays(2);       //minusDays() method subtract two days from todays date i.e. now .
		        LocalDate tomorrow = yesterday.plusDays(3);   // plusDays() method adds three days in yesterday.
		        
		        System.out.println(date);
		         System.out.println(yesterday); 
		         System.out.println(tomorrow);
		    }
		}



