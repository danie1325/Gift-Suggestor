import java.util.Hashtable;
public class EventsCalendar {
	//create a hashmap called people database
	static Hashtable calendar = new Hashtable();
	
	
	
	public String getDate(){
		return "";
	}
	
	String date = getDate();
	static String type;
	static String info;
	static String people = "";
	
	public static void addEventDate(String date){
		//call new event
		Event event = Event.createEvent(type, info, people);
		calendar.put(date, event);
		
	}
	
	
	

}
