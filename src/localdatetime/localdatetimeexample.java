package localdatetime;
import java.time.LocalDate; 

import java.time.LocalDateTime;
public class localdatetimeexample {
	
	 
	  public static void main(String[] args) {  
	    LocalDate date = LocalDate.of(2017, 1, 13);			//of(int,int,int) method can take any value 
	    													//i.e. in time or days and can be integer and string.
	    
	    
	    LocalDateTime datetime = date.atTime(1,50,9);        // atTime() method is of LocaldateTime class which takes only 
	    													 // time in integer format.
	    System.out.println(datetime);   
	  }  
	}  

