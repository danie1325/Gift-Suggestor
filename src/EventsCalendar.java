import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;
public class EventsCalendar {
	//create a hashmap called people database
	static Hashtable<String, Event> calendar = new Hashtable<String, Event>();

	public String getDate(){
		return "";
	}

	String date = getDate();
	static String type;
	static String info;
	static String people = "";
	static String price;

	public static void addEventDate(String date) throws IOException{
		//call new event
		Event event = Event.createEvent(type, info, people, price);
		calendar.put(date, event);
		
		//directory needs to be changed 
		File file = new File("/Users/Amy/Documents/Events.txt");
		// creates the file
		file.createNewFile();
		// creates a FileWriter Object
		FileWriter writer = new FileWriter(file); 

		// Writes the content to the file
		// how to convert from type object (event) to String
		writer.write(date + " " + calendar.get(date)); 
		writer.flush();
		writer.close();

		//Creates a FileReader Object
		FileReader fr = new FileReader(file); 
		char [] a = new char[50];
		fr.read(a); // reads the content to the array
		for(char c : a)
			System.out.print(c); //prints the characters one by one
		fr.close();
	}




}
