
public class Event {

	/*make an object for every event 
	 * object stores event type, short description, and people involved
	 * hashmap key = person name
	 */
	public Event(String type, String info, String people, String price) {
		String peopleInvolved = people;
		String eventDescription = info;
		String eventType = type;
		String priceRange = price;
	}
	
	public static Event createEvent(String type, String info, String people, String price){
		Event event = new Event(type, info, people, price);
		return event;
		
	}

	/**public static Event createEvent() {
		// TODO Auto-generated method stub
		return null;
		
	}**/

	
}
