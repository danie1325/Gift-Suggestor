import java.io.IOException;

public class Event {
	
	/*make an object for every event 
	 * object stores the following characteristics:
	 	*event name
	 	*event date
	 	*event info
	 	*person the gift is for or that the event is thrown for
	 	*price of the gift
	 	*location of the event
	 	*reminderEmail to which reminder will be sent if person opts for a reminder
	 	*reminderDate when which reminder will be sent if person opts for a reminder
	 */
	public Event(String eventName, String eventDate, String info, String person, String price, String location, String reminderEmail1, String reminderDate1) {
		String name = eventName;
		String personInvolved = person; 
		String date = eventDate;
		String eventDescription = info;
		String eventLocation = location;
		String priceRange = price;
		String reminderDate = reminderDate1;
		String reminderEmail = reminderEmail1;
		
	}
	
	public static Event createEvent(String name, String date, String info, String person, String price, String location, String reminderEmail1, String reminderDate1) throws IOException{
		
		//create an instance of the event
		Event event = new Event(name, date, info, person, price, location, reminderEmail1, reminderDate1);
		
		//add the event to the respective hashmaps that need it
		EventsCalendar.addEventToCalendar(date, event);
		
		//return the event
		return event;
	
		
	}
	
	public static void displayEvent(Event event){
		s
	}
	
}
