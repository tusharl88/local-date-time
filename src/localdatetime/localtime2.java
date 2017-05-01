package localdatetime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class localtime2 {
public static void main(String [] args){
	ZoneId a = ZoneId.of("Asia/Kolkata");  // here of() method has String asia/delhi
	LocalTime time1 = LocalTime.now(a);
	System.out.println(time1);
	
	ZoneId b = ZoneId.of("Asia/Tokyo");
	LocalTime time2 = LocalTime.now(b);
	System.out.println(time2);
	
	long hours = ChronoUnit.HOURS.between(time1,time2);
	System.out.println(hours+ "hours");
	
	long minutes = ChronoUnit.MINUTES.between(time1,time2);	
	System.out.println(minutes+"minutes");
	}
}
