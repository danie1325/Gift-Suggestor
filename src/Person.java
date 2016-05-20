
public class Person {

	/*make an object for every person and have that be stored in the hashmap
	 * object stores gender, living location, age, preferences, etc
	 */
	public Person(String name, String location, String age, String gender, String career, String[] preferences) {
		String personName = name;
		
	}

	public Person(String[] personInfo) {
		// TODO Auto-generated constructor stub
	}

	//constructor for one person
	public static Person addPerson(String name, String location, String age, String gender, String career, String[] preferences){
		//needs to get ______
		Person person = new Person(name, location, age, gender, career, preferences);
		return person;
	}


}
