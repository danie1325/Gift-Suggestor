import java.io.IOException;

public class Event {
	
	public static Event createEvent(String name, String info, String person, String price, String location){
		Event event = new Event(name, info, person, price, location);
		return event;
		
	}
	
	/*make an object for every event 
	 * object stores event type, short description, and people involved
	 * hashmap key = person name
	 */
	public Event(String eventName, String info, String person, String price, String location, String location2, String reminderEmail1, String reminderDate1) {
		String personInvolved = person;  
		String eventDescription = info;
		String eventLocation = location;
		String priceRange = price;
		
		String reminderDate = reminderDate1;
		String reminderEmail = reminderEmail1;		
	
	public static Event createEvent(String name, String date, String info, String person, String price, String location, String reminderEmail1, String reminderDate1) throws IOException{
		
		//create an instance of the event
		Event event = new Event(name, date, info, person, price, location, reminderEmail1, reminderDate1);
		
		//add the event to the respective hashmaps that need it
		EventsCalendar.addEventToCalendar(date, event);
		
		//add the event to the events hashmap
		addEventToHashmap(name, event);
		
		//return the event
		return event;
	
		
	}
	
	public static void displayEvent(Event event){
		System.out.println("test");
		System.out.println("Would you like a gift suggestion for" + event.name + "?");
	}
	
	
	//store all events in a hashmap for easy searching
	static Hashtable<String, Event> events = new Hashtable<String, Event>();
	
	public static void addEventToHashmap(String name, Event event){
		events.put(name, event);
		
	}
>>>>>>> branch 'master' of https://github.com/danie1325/Gift-Suggestor.git
}
