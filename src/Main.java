import java.io.IOException;
import java.util.Scanner;

public class Main {
	// needs to write people & events 
	public static void main(String args[])throws IOException{
		String eventName, eventDate, eventInfo, personName, giftPrice, eventLocation, reminderEmail, reminderDate;
		String personName1, personLocation, personGender, personCareer, personPreferences;
		String possibleEventName, possibleEventDate, possibleEventPerson;
		Boolean[] personPreferences1;
		int personAge;
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to add a new event (enter 0) or search for an existing event (enter 1)?");
		String response = input.nextLine();
		
		//person is creating a new instance event --> event will be added to calendar hashmap
		if (response.toLowerCase().equals("0")) {
			
			System.out.println("Enter Event Name:");
			eventName = input.nextLine();
			
			System.out.println("Enter the date the event is on:");
			eventDate = input.nextLine();
			
			System.out.println("Enter the location the event is ocurring at:");
			eventLocation = input.nextLine();
			
			System.out.println("Enter an event descrition:");
			eventInfo = input.nextLine();
			
			
			System.out.println("Will you need to buy a gift for this event?");
			String needGift = input.nextLine();
			if (needGift == "yes"){
				System.out.println("What is the name of the person who will be recieving the gift?");
				personName1 = input.nextLine();
				//CHECK HERE IF PERSON I SLAREADY IN DATABASE IF NOT --> CONTINUE
				System.out.println("Where does the person live (City, State)? ");
				personLocation = input.nextLine();
				System.out.println("How much money are you willing to spend on " + personName1 + "'s gift?");
				giftPrice = input.nextLine();
				System.out.println("Enter the person's age: ");
				personAge = input.nextInt();
				System.out.println("Enter the person's gender (male/female): ");
				personGender = input.nextLine();
				System.out.println("Enter the person's career: ");
				personCareer = input.nextLine();
				personPreferences1 = Person.createPreferences(personAge, personGender);
				Person.createPerson(personName1, personLocation, personAge, personGender, personCareer, personPreferences1);
			}
			else{
				System.out.println("Enter the name of the person involved, or who the event is being thrown for:");
				personName1 = input.nextLine();
				System.out.println("Where does the person live (City, State)? ");
				personLocation = input.nextLine();
				System.out.println("How much money are you willing to spend on " + personName1 + "'s gift?");
				giftPrice = input.nextLine();
				System.out.println("Enter the person's age: ");
				personAge = input.nextInt();
				System.out.println("Enter the person's gender (male/female): ");
				personGender = input.nextLine();
				System.out.println("Enter the person's career: ");
				personCareer = input.nextLine();
				personPreferences1 = Person.createPreferences(personAge, personGender);
				Person.createPerson(personName1, personLocation, personAge, personGender, personCareer, personPreferences1);

			}
			
	
			System.out.println("Would you like an email reminder for this event?");
			String wantReminder = input.nextLine();
			if (wantReminder == "yes"){
				System.out.println("Which email would you like the reminder to be sent to?");
				reminderEmail = input.nextLine();
				System.out.println("When would you like to recieve the reminder (DATE FORMAT)");
				reminderDate = input.nextLine(); //do we even need to get time or just the date?
				//call a method in some sort of class to set a reminder 
			}
			else{
				reminderEmail = "none";
				reminderDate = "none"; 
			}
			
			
			
			
			Event event = Event.createEvent(eventName, eventDate, eventInfo, personName1, giftPrice, eventLocation, reminderEmail, reminderDate);
			
		}
		
		if (response.toLowerCase().equals("1")) {
			
			System.out.println("Do you know the name of the event (yes/no)?");
			String knowEventName = input.nextLine();
			if (knowEventName == "yes"){
				System.out.println("Enter the event name: ");
				possibleEventName = input.nextLine();
			}
			else{
				possibleEventName = null;
			}
			
			System.out.println("Do you know the date of the event (yes/no)?");
			String knowEventDate = input.nextLine();
			if (knowEventDate == "yes"){
				System.out.println("Enter the event date (mm/dd/yy): ");
				possibleEventDate = input.nextLine();
			}
			else{
				possibleEventDate = null;
			}
			System.out.println("Do you know the person involved in the event (yes/no)?");
			String knowEventPerson = input.nextLine();
			if (knowEventPerson == "yes"){
				System.out.println("Enter the name of the person: ");
				possibleEventPerson = input.nextLine();
			}
			else{
				possibleEventPerson = null;
			}
			
			Event possibleEvent = FindEvents.findEvent(possibleEventDate, possibleEventDate, possibleEventPerson);
			if (possibleEvent == null){
				System.out.println("Sorry, we could not find your event");
				//maybe give the user more options?
			}
			else if (possibleEvent != null){
				//display their event
				Event.displayEvent(possibleEvent);
			}
		
			
		}
	   }
	}

