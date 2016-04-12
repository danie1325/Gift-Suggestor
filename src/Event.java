
public class Event {

	/*make an object for every event 
	 * object stores event type, short description, and people involved
	 * hashmap key = person name
	 */
	public Event(String type, String info, String people) {
		String peopleInvolved = people;
		String eventDescription = info;
		String eventType = type;
	}
	
	public static Event createEvent(String type, String info, String people){
		Event event = new Event(type, info, people);
		return event;
		
	}

	/**public static Event createEvent() {
		// TODO Auto-generated method stub
		return null;
		
	}**/

	
}
