package localdatetime;
import java.time.LocalTime;  
public class localtimeexample {

  
  public static void main(String[] args) {
	  
    LocalTime time = LocalTime.now();  
    System.out.println(time);  
    
    LocalTime a = LocalTime.of(5, 10,50);
    LocalTime b = a.minusHours(2);
    LocalTime c = b.minusMinutes(5);
    System.out.println(b);
    System.out.println(c);
    
    LocalTime d = c.plusHours(4);
    LocalTime e = d.plusMinutes(23);
    System.out.println(d);
    System.out.println(e);
  }  
}

