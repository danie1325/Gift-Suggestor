import java.util.Hashtable;
public class PeopleDatabase {
	//create a hashmap called people database
	static Hashtable peopleDatabase = new Hashtable();

	//constructor for one person
	public static void createPerson(String name){
		Person person = Person.addPerson("name");
		peopleDatabase.put("name", person); 
	}







}
