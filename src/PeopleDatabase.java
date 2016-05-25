import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

public class PeopleDatabase {
	
	//create a hashmap called people database --> can be used to search if a person already exists
	public static Hashtable<String, Person> peopleDatabase = new Hashtable<String, Person>();
	
	//create a hashmap called people;s events --> can be used to search for an event by the person related to it
	public static Hashtable<String, ArrayList<Event>> peoplesEvents = new Hashtable<String, ArrayList<Event>>();

	//constructor for one person
	public static void addPersonToDatabase(String name, Person person, String directory) throws IOException{
		peopleDatabase.put(name, person); 
		
		//directory needs to be changed 
		File file = new File(directory + "/People.txt");
		// creates the file
		file.createNewFile();
		// creates a FileWriter Object
		FileWriter writer = new FileWriter(file); 
		
		// Writes the content to the file
		writer.write(name + " " + peopleDatabase.get(name).toString()); 
		writer.flush();
		writer.close();

		//Creates a FileReader Object
		FileReader fr = new FileReader(file); 
		char [] a = new char[100000];
		fr.read(a); // reads the content to the array
		for(char c : a)
			System.out.print(c); //prints the characters one by one
		fr.close();
	}




}