import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class Person {

	public static boolean[] createPreferences(int age, String gender){
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
		boolean[] preferences = new boolean[16]; 
		boolean female;
		boolean male;

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
	public Person(String name, String location, int age, String gender, String career, boolean[] preferences) {
		String personName = name;

	}

	public Person(String[] personInfo) {
		// TODO Auto-generated constructor stub
	}

	//constructor for one person
	public static Person createPerson(String name, String location, int age, String gender, String career, boolean[] preferences) throws IOException{
		//needs to get ______
		Person person = new Person(name, location, age, gender, career, preferences);
		PeopleDatabase.addPersonToDatabase(name, person);
		makeGiftList(preferences);
		return person;
	}
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
	
	//create a personalized gift list for each person, depending on what their preferences are
	public static void makeGiftList(boolean[] preferences){
		String[] giftList = new String[9];
		int random;
		int randOrganize;
		int size = 10;

		//get a random num to choose a random gift
		if (preferences[0]){
			//size = GiftDatabase.babyGirlGifts.size();
			random = Random(size);
			giftList[0] = GiftDatabase.babyGirlGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[1] = GiftDatabase.babyGirlGifts.get(random+1);
			giftList[2] = GiftDatabase.babyGirlGifts.get(random+2);
			random = Random(size);
			giftList[3] = GiftDatabase.babyGirlGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[4] = GiftDatabase.babyGirlGifts.get(random+1);
			giftList[5] = GiftDatabase.babyGirlGifts.get(random+2);
			random = Random(size);
			giftList[6] = GiftDatabase.babyGirlGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[7] = GiftDatabase.babyGirlGifts.get(random+1);
			giftList[8] = GiftDatabase.babyGirlGifts.get(random+2);
		}
		if (preferences[1]){
			//size = GiftDatabase.babyGirlGifts.size();
			random = Random(size);
			giftList[0] = GiftDatabase.babyBoyGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[1] = GiftDatabase.babyBoyGifts.get(random+1);
			giftList[2] = GiftDatabase.babyBoyGifts.get(random+2);
			random = Random(size);
			giftList[3] = GiftDatabase.babyBoyGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[4] = GiftDatabase.babyBoyGifts.get(random+1);
			giftList[5] = GiftDatabase.babyBoyGifts.get(random+2);
			random = Random(size);
			giftList[6] = GiftDatabase.babyBoyGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[7] = GiftDatabase.babyBoyGifts.get(random+1);
			giftList[8] = GiftDatabase.babyBoyGifts.get(random+2);
		}
		if (preferences[2]){
			//size = GiftDatabase.babyGirlGifts.size();
			random = Random(size);
			giftList[0] = GiftDatabase.girlGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[1] = GiftDatabase.girlGifts.get(random+1);
			giftList[2] = GiftDatabase.girlGifts.get(random+2);
			random = Random(size);
			giftList[3] = GiftDatabase.girlGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[4] = GiftDatabase.girlGifts.get(random+1);
			giftList[5] = GiftDatabase.girlGifts.get(random+2);
			random = Random(size);
			giftList[6] = GiftDatabase.girlGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[7] = GiftDatabase.girlGifts.get(random+1);
			giftList[8] = GiftDatabase.girlGifts.get(random+2);
		}
		if (preferences[3]){
			//size = GiftDatabase.babyGirlGifts.size();
			random = Random(size);
			giftList[0] = GiftDatabase.boyGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[1] = GiftDatabase.boyGifts.get(random+1);
			giftList[2] = GiftDatabase.boyGifts.get(random+2);
			random = Random(size);
			giftList[3] = GiftDatabase.boyGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[4] = GiftDatabase.boyGifts.get(random+1);
			giftList[5] = GiftDatabase.boyGifts.get(random+2);
			random = Random(size);
			giftList[6] = GiftDatabase.boyGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[7] = GiftDatabase.boyGifts.get(random+1);
			giftList[8] = GiftDatabase.boyGifts.get(random+2);
		}
		if (preferences[4]){
			//size = GiftDatabase.babyGirlGifts.size();
			random = Random(size);
			giftList[0] = GiftDatabase.preteenGirlGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[1] = GiftDatabase.preteenGirlGifts.get(random+1);
			giftList[2] = GiftDatabase.preteenGirlGifts.get(random+2);
			random = Random(size);
			giftList[3] = GiftDatabase.preteenGirlGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[4] = GiftDatabase.preteenGirlGifts.get(random+1);
			giftList[5] = GiftDatabase.preteenGirlGifts.get(random+2);
			random = Random(size);
			giftList[6] = GiftDatabase.preteenGirlGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[7] = GiftDatabase.preteenGirlGifts.get(random+1);
			giftList[8] = GiftDatabase.preteenGirlGifts.get(random+2);
		}
		if (preferences[5]){
			//size = GiftDatabase.babyGirlGifts.size();
			random = Random(size);
			giftList[0] = GiftDatabase.preteenBoyGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[1] = GiftDatabase.preteenBoyGifts.get(random+1);
			giftList[2] = GiftDatabase.preteenBoyGifts.get(random+2);
			random = Random(size);
			giftList[3] = GiftDatabase.preteenBoyGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[4] = GiftDatabase.preteenBoyGifts.get(random+1);
			giftList[5] = GiftDatabase.preteenBoyGifts.get(random+2);
			random = Random(size);
			giftList[6] = GiftDatabase.preteenBoyGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[7] = GiftDatabase.preteenBoyGifts.get(random+1);
			giftList[8] = GiftDatabase.preteenBoyGifts.get(random+2);
		}
		if (preferences[6]){
			//size = GiftDatabase.babyGirlGifts.size();
			random = Random(size);
			giftList[0] = GiftDatabase.teenGirlGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[1] = GiftDatabase.teenGirlGifts.get(random+1);
			giftList[2] = GiftDatabase.teenGirlGifts.get(random+2);
			random = Random(size);
			giftList[3] = GiftDatabase.teenGirlGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[4] = GiftDatabase.teenGirlGifts.get(random+1);
			giftList[5] = GiftDatabase.teenGirlGifts.get(random+2);
			random = Random(size);
			giftList[6] = GiftDatabase.teenGirlGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[7] = GiftDatabase.teenGirlGifts.get(random+1);
			giftList[8] = GiftDatabase.teenGirlGifts.get(random+2);
		}
		if (preferences[7]){
			//size = GiftDatabase.babyGirlGifts.size();
			random = Random(size);
			giftList[0] = GiftDatabase.teenBoyGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[1] = GiftDatabase.teenBoyGifts.get(random+1);
			giftList[2] = GiftDatabase.teenBoyGifts.get(random+2);
			random = Random(size);
			giftList[3] = GiftDatabase.teenBoyGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[4] = GiftDatabase.teenBoyGifts.get(random+1);
			giftList[5] = GiftDatabase.teenBoyGifts.get(random+2);
			random = Random(size);
			giftList[6] = GiftDatabase.teenBoyGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[7] = GiftDatabase.teenBoyGifts.get(random+1);
			giftList[8] = GiftDatabase.teenBoyGifts.get(random+2);
		}
		if (preferences[8]){
			//size = GiftDatabase.babyGirlGifts.size();
			random = Random(size);
			giftList[0] = GiftDatabase.youngFemaleAdultGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[1] = GiftDatabase.youngFemaleAdultGifts.get(random+1);
			giftList[2] = GiftDatabase.youngFemaleAdultGifts.get(random+2);
			random = Random(size);
			giftList[3] = GiftDatabase.youngFemaleAdultGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[4] = GiftDatabase.youngFemaleAdultGifts.get(random+1);
			giftList[5] = GiftDatabase.youngFemaleAdultGifts.get(random+2);
			random = Random(size);
			giftList[6] = GiftDatabase.youngFemaleAdultGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[7] = GiftDatabase.youngFemaleAdultGifts.get(random+1);
			giftList[8] = GiftDatabase.youngFemaleAdultGifts.get(random+2);
		}
		if (preferences[9]){
			//size = GiftDatabase.babyGirlGifts.size();
			random = Random(size);
			giftList[0] = GiftDatabase.youngMaleAdultGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[1] = GiftDatabase.youngMaleAdultGifts.get(random+1);
			giftList[2] = GiftDatabase.youngMaleAdultGifts.get(random+2);
			random = Random(size);
			giftList[3] = GiftDatabase.youngMaleAdultGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[4] = GiftDatabase.youngMaleAdultGifts.get(random+1);
			giftList[5] = GiftDatabase.youngMaleAdultGifts.get(random+2);
			random = Random(size);
			giftList[6] = GiftDatabase.youngMaleAdultGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[7] = GiftDatabase.youngMaleAdultGifts.get(random+1);
			giftList[8] = GiftDatabase.youngMaleAdultGifts.get(random+2);
		}
		if (preferences[10]){
			//size = GiftDatabase.babyGirlGifts.size();
			random = Random(size);
			giftList[0] = GiftDatabase.femaleAdultGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[1] = GiftDatabase.femaleAdultGifts.get(random+1);
			giftList[2] = GiftDatabase.femaleAdultGifts.get(random+2);
			random = Random(size);
			giftList[3] = GiftDatabase.femaleAdultGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[4] = GiftDatabase.femaleAdultGifts.get(random+1);
			giftList[5] = GiftDatabase.femaleAdultGifts.get(random+2);
			random = Random(size);
			giftList[6] = GiftDatabase.femaleAdultGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[7] = GiftDatabase.femaleAdultGifts.get(random+1);
			giftList[8] = GiftDatabase.femaleAdultGifts.get(random+2);
		}
		if (preferences[11]){
			//size = GiftDatabase.babyGirlGifts.size();
			random = Random(size);
			giftList[0] = GiftDatabase.maleAdultGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[1] = GiftDatabase.maleAdultGifts.get(random+1);
			giftList[2] = GiftDatabase.maleAdultGifts.get(random+2);
			random = Random(size);
			giftList[3] = GiftDatabase.maleAdultGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[4] = GiftDatabase.maleAdultGifts.get(random+1);
			giftList[5] = GiftDatabase.maleAdultGifts.get(random+2);
			random = Random(size);
			giftList[6] = GiftDatabase.maleAdultGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
			giftList[7] = GiftDatabase.maleAdultGifts.get(random+1);
			giftList[8] = GiftDatabase.maleAdultGifts.get(random+2);
		}
		if(preferences[12]){
			//size = GiftDatabase.babyGirlGifts.size();
			random = Random(size);
			randOrganize = Random(2);
			if (randOrganize == 0){
				giftList[0] = GiftDatabase.geekGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
				giftList[1] = GiftDatabase.geekGifts.get(random+1);
				giftList[2] = GiftDatabase.geekGifts.get(random+2);
			}
			if (randOrganize == 1){
				giftList[3] = GiftDatabase.geekGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
				giftList[4] = GiftDatabase.geekGifts.get(random+1);
				giftList[5] = GiftDatabase.geekGifts.get(random+2);
			}
			if (randOrganize == 2){
				giftList[6] = GiftDatabase.geekGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
				giftList[7] = GiftDatabase.geekGifts.get(random+1);
				giftList[8] = GiftDatabase.geekGifts.get(random+2);
			}
			
		}
		if(preferences[13]){
			//size = GiftDatabase.babyGirlGifts.size();
			random = Random(size);
			randOrganize = Random(2);
			if (randOrganize == 0){
				giftList[0] = GiftDatabase.athleteGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
				giftList[1] = GiftDatabase.athleteGifts.get(random+1);
				giftList[2] = GiftDatabase.athleteGifts.get(random+2);
			}
			if (randOrganize == 1){
				giftList[3] = GiftDatabase.athleteGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
				giftList[4] = GiftDatabase.athleteGifts.get(random+1);
				giftList[5] = GiftDatabase.athleteGifts.get(random+2);
			}
			if (randOrganize == 2){
				giftList[6] = GiftDatabase.athleteGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
				giftList[7] = GiftDatabase.athleteGifts.get(random+1);
				giftList[8] = GiftDatabase.athleteGifts.get(random+2);
			}
		}
		if(preferences[14]){
			//size = GiftDatabase.babyGirlGifts.size();
			random = Random(size);
			randOrganize = Random(2);
			if (randOrganize == 0){
				giftList[0] = GiftDatabase.artistGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
				giftList[1] = GiftDatabase.artistGifts.get(random+1);
				giftList[2] = GiftDatabase.artistGifts.get(random+2);
			}
			if (randOrganize == 1){
				giftList[3] = GiftDatabase.artistGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
				giftList[4] = GiftDatabase.artistGifts.get(random+1);
				giftList[5] = GiftDatabase.artistGifts.get(random+2);
			}
			if (randOrganize == 2){
				giftList[6] = GiftDatabase.artistGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
				giftList[7] = GiftDatabase.artistGifts.get(random+1);
				giftList[8] = GiftDatabase.artistGifts.get(random+2);
			}
		}
		if(preferences[15]){
			//size = GiftDatabase.babyGirlGifts.size();
			random = Random(size);
			randOrganize = Random(2);
			if (randOrganize == 0){
				giftList[0] = GiftDatabase.entertainementBuffGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
				giftList[1] = GiftDatabase.entertainementBuffGifts.get(random+1);
				giftList[2] = GiftDatabase.entertainementBuffGifts.get(random+2);
			}
			if (randOrganize == 1){
				giftList[3] = GiftDatabase.entertainementBuffGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
				giftList[4] = GiftDatabase.entertainementBuffGifts.get(random+1);
				giftList[5] = GiftDatabase.entertainementBuffGifts.get(random+2);
			}
			if (randOrganize == 2){
				giftList[6] = GiftDatabase.entertainementBuffGifts.get(random); //get a gift from the array list that is a mult of 3 or the num 0
				giftList[7] = GiftDatabase.entertainementBuffGifts.get(random+1);
				giftList[8] = GiftDatabase.entertainementBuffGifts.get(random+2);
			}
		}


	}

	//generate a random num
	public static int Random(int size){
		Random rand = new Random();
		int random = rand.nextInt(size-1);
		return random;
	}


}


