import java.io.IOException;

public class Event {
	
	/*make an object for every event 
	 * object stores event type, short description, and people involved
	 * hashmap key = person name
	 */
	public Event(String eventName, String eventDate, String info, String person, String price, String location, String reminderEmail, String reminderDate) {
		String personInvolved = person; 
		String date = eventDate;
		String eventDescription = info;
		String eventLocation = location;
		String priceRange = price;
	}
	
	public static Event createEvent(String name, String date, String info, String person, String price, String location, String reminderEmail, String reminderDate) throws IOException{
		Event event = new Event(name, date, info, person, price, location, reminderEmail, reminderDate);
		EventsCalendar.addEventToCalendar(date, event);
		return event;
		
		
	}
	
}
