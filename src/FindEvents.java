import java.util.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FindEvents {

	/*Tasks:
	 * input: date & output: if there's an event on same date
	 * input: name & output: list of events including them
	 * input: event type & output: list of events of that type that are coming up
	 * input: time-frame & output: list of events in that time frame
	 */

	//get current date in yyyy/MM/dd HH:mm:ss format
	public String getCurrentDate(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		return dateFormat.format(cal.getTime());
	}

	public String getCurrentYear(){
		String date = getCurrentDate();
		String Str = new String(date);
		return Str.substring(0, 4);
		
	}

	public String getCurrentMonth(){
		String date = getCurrentDate();
		String Str = new String(date);
		return Str.substring(5,7);
	}

	public String getCurrentDay(){
		String date = getCurrentDate();
		String Str = new String(date);
		return Str.substring(8, 10);
	}
	
	//find an event from an event 
	public Event findEvent(){
		
		return event;
	}

}
