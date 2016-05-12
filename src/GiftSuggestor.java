import java.io.IOException;
import java.util.Scanner;

public class GiftSuggestor {
	// needs to write people & events 
	public static void main(String args[])throws IOException{
		//test code
		PeopleDatabase People = new  PeopleDatabase();
		People.createPerson("Bob");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Do you wish to add an event? Answer yes or no");
		String response = input.nextLine();
		if (response.toLowerCase().equals("yes")) {
			System.out.println("Enter Event Name:");
			String eventName = input.nextLine();
			
			System.out.println("Enter Event Type:");
			String eventType = input.nextLine();
			
			System.out.println("Enter Event Information:");
			String eventInfo = input.nextLine();
			
			System.out.println("Enter Person Involved:");
			String personName = input.nextLine();
			People.createPerson(personName);
			
			System.out.println("How much money are you willing to spend on this event?");
			String eventPrice = input.nextLine();
			
			Event event = new Event(eventType, eventInfo, personName, eventPrice);
			
		}
	   }
	}

