import java.io.IOException;
import java.util.Scanner;

public class Person {

	public static Boolean[] createPreferences(int age, String gender){
		Scanner input = new Scanner(System.in);
		/*make an array of preferences
		 * index 0: is girl aged 0-4
		 * index 1: is boy aged 0-4
		 * index 2: is girl aged 5-8
		 * index 3: is boy aged 5-8
		 * index 4: is girl aged 9-12
		 * index 5: is boy aged 9-12
		 * index 6: is girl aged 13-19
		 * index 7: is boy aged 13-9
		 * index 8: is girl aged 20-35
		 * index 9: is boy aged 20-35
		 * index 10: is girl aged 36+
		 * index 11: is boy aged 36+
		 * index 12: is nerd
		 * index 13: is athlete
		 * index 14: is artist
		 * index 15: is an entertainement buff
		 */
		Boolean[] preferences = new Boolean[16]; 
		Boolean female;
		Boolean male;

		System.out.println("Is the person a nerd (yes/no)?");
		String nerd = input.nextLine();
		System.out.println("Is the person an athlete (yes/no)?");
		String athlete = input.nextLine();
		System.out.println("Is the person artsy (yes/no)?");
		String artsy = input.nextLine();
		System.out.println("Is the person an entertainement buff (yes/no)?");
		String entertainement = input.nextLine();

		if (nerd == "yes"){
			preferences[12] = true;
		}
		else{
			preferences[12] = false;
		}
		if (athlete == "yes"){
			preferences[13] = true;
		}
		else{
			preferences[13] = false;
		}
		if (artsy == "yes"){
			preferences[14] = true;
		}
		else{
			preferences[14] = false;
		}
		if (entertainement == "yes"){
			preferences[15] = true;
		}
		else{
			preferences[15] = false;
		}


		if (gender == "female" || gender ==  "girl" || gender ==  "woman" || gender ==  "dudette"){
			female = true;
			male = false;
		}
		else{
			female = false;
			male = true;
		}

		//set preferences specific to the person's gender and age
		if (female && (age >= 0 && age <= 4)){
			preferences[0] = true;
			preferences[1] = false;
			preferences[2] = false;
			preferences[3] = false;
			preferences[4] = false;
			preferences[5] = false;
			preferences[6] = false;
			preferences[7] = false;
			preferences[8] = false;
			preferences[9] = false;
			preferences[10] = false;
			preferences[11] = false;
		}
		if (male && (age >= 0 && age <= 4)){
			preferences[0] = false;
			preferences[1] = true;
			preferences[2] = false;
			preferences[3] = false;
			preferences[4] = false;
			preferences[5] = false;
			preferences[6] = false;
			preferences[7] = false;
			preferences[8] = false;
			preferences[9] = false;
			preferences[10] = false;
			preferences[11] = false;
		}
		if (female && (age >= 5 && age <= 8)){
			preferences[0] = false;
			preferences[1] = false;
			preferences[2] = true;
			preferences[3] = false;
			preferences[4] = false;
			preferences[5] = false;
			preferences[6] = false;
			preferences[7] = false;
			preferences[8] = false;
			preferences[9] = false;
			preferences[10] = false;
			preferences[11] = false;
		}
		if (male && (age >= 5 && age <= 8)){
			preferences[0] = false;
			preferences[1] = false;
			preferences[2] = false;
			preferences[3] = true;
			preferences[4] = false;
			preferences[5] = false;
			preferences[6] = false;
			preferences[7] = false;
			preferences[8] = false;
			preferences[9] = false;
			preferences[10] = false;
			preferences[11] = false;
		}
		if (female && (age >= 9 && age <= 12)){
			preferences[0] = false;
			preferences[1] = false;
			preferences[2] = false;
			preferences[3] = false;
			preferences[4] = true;
			preferences[5] = false;
			preferences[6] = false;
			preferences[7] = false;
			preferences[8] = false;
			preferences[9] = false;
			preferences[10] = false;
			preferences[11] = false;
		}
		if (male && (age >= 9 && age <= 12)){
			preferences[0] = false;
			preferences[1] = false;
			preferences[2] = false;
			preferences[3] = false;
			preferences[4] = false;
			preferences[5] = true;
			preferences[6] = false;
			preferences[7] = false;
			preferences[8] = false;
			preferences[9] = false;
			preferences[10] = false;
			preferences[11] = false;
		}
		if (female && (age >= 13 && age <= 19)){
			preferences[0] = false;
			preferences[1] = false;
			preferences[2] = false;
			preferences[3] = false;
			preferences[4] = false;
			preferences[5] = false;
			preferences[6] = true;
			preferences[7] = false;
			preferences[8] = false;
			preferences[9] = false;
			preferences[10] = false;
			preferences[11] = false;
		}
		if (male && (age >= 13 && age <= 19)){
			preferences[0] = false;
			preferences[1] = false;
			preferences[2] = false;
			preferences[3] = false;
			preferences[4] = false;
			preferences[5] = false;
			preferences[6] = false;
			preferences[7] = true;
			preferences[8] = false;
			preferences[9] = false;
			preferences[10] = false;
			preferences[11] = false;
		}
		if (female && (age >= 20 && age <= 35)){
			preferences[0] = false;
			preferences[1] = false;
			preferences[2] = false;
			preferences[3] = false;
			preferences[4] = false;
			preferences[5] = false;
			preferences[6] = false;
			preferences[7] = false;
			preferences[8] = true;
			preferences[9] = false;
			preferences[10] = false;
			preferences[11] = false;
		}
		if (male && (age >= 20 && age <= 35)){
			preferences[0] = false;
			preferences[1] = false;
			preferences[2] = false;
			preferences[3] = false;
			preferences[4] = false;
			preferences[5] = false;
			preferences[6] = false;
			preferences[7] = false;
			preferences[8] = false;
			preferences[9] = true;
			preferences[10] = false;
			preferences[11] = false;
		}
		if (female && age >= 36){
			preferences[0] = false;
			preferences[1] = false;
			preferences[2] = false;
			preferences[3] = false;
			preferences[4] = false;
			preferences[5] = false;
			preferences[6] = false;
			preferences[7] = false;
			preferences[8] = false;
			preferences[9] = false;
			preferences[10] = true;
			preferences[11] = false;
		}
		if (male && age >= 36){
			preferences[0] = false;
			preferences[1] = false;
			preferences[2] = false;
			preferences[3] = false;
			preferences[4] = false;
			preferences[5] = false;
			preferences[6] = false;
			preferences[7] = false;
			preferences[8] = false;
			preferences[9] = false;
			preferences[10] = false;
			preferences[11] = true;
		}

		return preferences;

	}


	/*make an object for every person and have that be stored in the hashmap
	 * object stores gender, living location, age, preferences, etc
	 */
	public Person(String name, String location, int age, String gender, String career, Boolean[] preferences) {
		String personName = name;

	}

	public Person(String[] personInfo) {
		// TODO Auto-generated constructor stub
	}

	//constructor for one person
	public static Person createPerson(String name, String location, int age, String gender, String career, Boolean[] preferences) throws IOException{
		//needs to get ______
		Person person = new Person(name, location, age, gender, career, preferences);
		PeopleDatabase.addPersonToDatabase(name, person);
		return person;
	}


}
