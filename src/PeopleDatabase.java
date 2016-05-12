import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;

public class PeopleDatabase {
	//create a hashmap called people database
	public static Hashtable<String, Person> peopleDatabase = new Hashtable<String, Person>();

	//constructor for one person
	public static void createPerson(String name) throws IOException{
		Person person = Person.addPerson(name);
		peopleDatabase.put(name, person); 
		
		//directory needs to be changed 
		File file = new File("/Users/Amy/Documents/People.txt");
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
		char [] a = new char[50];
		fr.read(a); // reads the content to the array
		for(char c : a)
			System.out.print(c); //prints the characters one by one
		fr.close();
	}




}
