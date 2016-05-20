import java.io.IOException;
import java.util.Scanner;

public class GiftSuggestor {
	// needs to write people & events 
	public static void main(String args[])throws IOException{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to add a new event (enter 0) or search for an existing event (enter 1)?");
		String response = input.nextLine();
		if (response.toLowerCase().equals("0")) {
			
			System.out.println("Enter Event Name:");
			String eventName = input.nextLine();
			
			System.out.println("Enter information about the event:");
			String eventInfo = input.nextLine();
			
			System.out.println("Enter the name of the person involved, or who the event is being thrown for:");
			String personName = input.nextLine();
			Person.addPerson(personName);
			
			System.out.println("Enter location the event is ocurring at:");
			String eventLocation = input.nextLine();
			
			
			System.out.println("How much money are you willing to spend on this event?");
			String eventPrice = input.nextLine();
			
			Event event = new Event(eventName, eventInfo, personName, eventPrice, eventLocation);
			
		}
		if (response.toLowerCase().equals("1")) {
		
			
		}
	   }
	}

