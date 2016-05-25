import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;
public class EventsCalendar {
	//create a hashmap that is called people database
	static Hashtable<String, Event> calendar = new Hashtable<String, Event>();

	public String getDate(){
		return "";
	}

	String date = getDate();


	public static void addEventToCalendar(String date, Event event) throws IOException{
		//call new event
		calendar.put(date, event); // change event name to an ArrayList of event type objects that will store all event sat that date
	}
}
