import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;

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
	
	public static Event createEvent(String name, String date, String info, String person, String price, String location, String reminderEmail1, String reminderDate1, String directory) throws IOException{
		//directory needs to be changed 
		File file = new File(directory + "/Events.txt");
		// creates the file
		file.createNewFile();
		// creates a FileWriter Object
		FileWriter writer = new FileWriter(file); 

		// Writes the content to the file
		// how to convert from type object (event) to String
		writer.write(date + ": "); 
		writer.write(name + ": "); 
		writer.write("Location: " + location + ", "); 
		writer.write("People: " + person + ", "); 
		writer.write("Info: " + info + ", "); 
		writer.write("Price Range: " + price); 
		writer.flush();
		writer.close();

		//Creates a FileReader Object
		FileReader fr = new FileReader(file); 
		char [] a = new char[100000];
		fr.read(a); // reads the content to the array
		for(char c : a)
		System.out.print(c); //prints the characters one by one
		fr.close();	
	
		//create an instance of the event
		Event event = new Event(name, date, info, person, price, location, reminderEmail1, reminderDate1);
		
		//add the event to the respective hashmaps that need it
		EventsCalendar.addEventToCalendar(date, event);
		
		//add the event to the events hashmap
		addEventToHashmap(name, event);
		
		//return the event
		return event;
	
		
	}
	
	/*method that displays the event details
	 	*shows the following: Event name, event description, person involved, event date, event location, gift price if not null	
	 	*should also ask user if they want a gift suggestion
	 */
	public static void displayEvent(Event event){ 
		System.out.println("test");
		//System.out.println("Would you like a gift suggestion for" + event.name + "?");
		//System.out.println("Would you like a gift suggestion for" + event.name + "?");
	}
	
	
	//store all events in a hashmap for easy searching
	static Hashtable<String, Event> events = new Hashtable<String, Event>();
	
	public static void addEventToHashmap(String name, Event event){
		events.put(name, event);
		
	}
}


