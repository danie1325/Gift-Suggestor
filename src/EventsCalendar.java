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
	static String price;
	
	public static void addEventDate(String date){
		//call new event
		Event event = Event.createEvent(type, info, people, price);
		calendar.put(date, event);
		
	}
	
	
	

}
