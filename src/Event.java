
public class Event {
	
	public static Event createEvent(String name, String info, String person, String price, String location){
		Event event = new Event(name, info, person, price, location);
		return event;
		
	}
	
	/*make an object for every event 
	 * object stores event type, short description, and people involved
	 * hashmap key = person name
	 */
	public Event(String eventName, String info, String person, String price, String location) {
		String personInvolved = person;  
		String eventDescription = info;
		String eventLocation = location;
		String priceRange = price;
	}
	
}
