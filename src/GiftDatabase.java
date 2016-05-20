import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

public class GiftDatabase {
	/*store array lists of random gift ideas for different demographics in alternating thirds: 
	 *first index = gift name
	 **2nd = price range
	 *3rd = link to gift example
	 *4th = beginning of next gift cycle
	 */

	public void createGiftDatabase() throws IOException{
		//directory needs to be changed 
		File file = new File("/Users/Amy/Documents/Events.txt");
		// creates the file
		file.createNewFile();
		// creates a FileWriter Object
		FileWriter writer = new FileWriter(file); 

		ArrayList<String> babyGirlGifts = new ArrayList<String>();
		writer.write("Gifts for Baby Girls(Ages 0 -4): ");

		static ArrayList<String> babyGirlGifts = new ArrayList<String>();

		babyGirlGifts.add("Onesie");
		babyGirlGifts.add("10-30");
		babyGirlGifts.add("http://goo.gl/lCFUex");
		babyGirlGifts.add("Shoes");
		babyGirlGifts.add("5-25");
		babyGirlGifts.add("http://goo.gl/3JJHfN");
		babyGirlGifts.add("Bath Toys");
		babyGirlGifts.add("5-10");
		babyGirlGifts.add("http://goo.gl/GyvoFY");
		babyGirlGifts.add("Blanket");
		babyGirlGifts.add("5-20");
		babyGirlGifts.add("http://goo.gl/hTtzBr");
		babyGirlGifts.add("Swaddle");
		babyGirlGifts.add("10-40");
		babyGirlGifts.add("http://goo.gl/HE8lsz");
		babyGirlGifts.add("Clothing Set");
		babyGirlGifts.add("5-15");
		babyGirlGifts.add("http://goo.gl/F1rveJ");
		babyGirlGifts.add("Play Matt");
		babyGirlGifts.add("40-100");
		babyGirlGifts.add("http://goo.gl/9P4LdJ");
		babyGirlGifts.add("Learning Toy");
		babyGirlGifts.add("15-30");
		babyGirlGifts.add("http://goo.gl/VcWSQt");
		babyGirlGifts.add("Stuffed Animal");
		babyGirlGifts.add("5-20");
		babyGirlGifts.add("http://goo.gl/zBRw7H");
		babyGirlGifts.add("Dress");
		babyGirlGifts.add("10-30");
		babyGirlGifts.add("http://goo.gl/YFdSnt");

		// Writes the content to the file
		for(String s: babyGirlGifts) {
			writer.write(s); 
		}


		//gifts for boys ages 0-4
 
		ArrayList<String> babyBoyGifts = new ArrayList<String>();
		writer.write("Gifts for Baby Boys(Ages 0 -4): ");
		writer.write("babyBoyGifts:");
 
		static ArrayList<String> babyBoyGifts = new ArrayList<String>();
 
		babyBoyGifts.add("Onesie");
		babyBoyGifts.add("10-30");
		babyBoyGifts.add("https://goo.gl/Qmno6k");
		babyBoyGifts.add("Onesie");
		babyBoyGifts.add("10-30");
		babyBoyGifts.add("https://goo.gl/nNVAJP");
		babyBoyGifts.add("Bath Toys");
		babyBoyGifts.add("5-10");
		babyBoyGifts.add("http://goo.gl/GyvoFY");
		babyBoyGifts.add("Blanket");
		babyBoyGifts.add("10-20");
		babyBoyGifts.add("http://goo.gl/5Sbj2Q");
		babyBoyGifts.add("Swaddle");
		babyBoyGifts.add("10-40");
		babyBoyGifts.add("http://goo.gl/HYMQ8R");
		babyBoyGifts.add("Play Matt");
		babyBoyGifts.add("40-70");
		babyBoyGifts.add("http://goo.gl/9P4LdJ");
		babyBoyGifts.add("Pants");
		babyBoyGifts.add("10-25");
		babyBoyGifts.add("http://goo.gl/ArYb9j");
		babyBoyGifts.add("Shirt");
		babyBoyGifts.add("5-15");
		babyBoyGifts.add("http://goo.gl/sNshMy");
		babyBoyGifts.add("Stuffed Animal");
		babyBoyGifts.add("5-20");
		babyBoyGifts.add("http://goo.gl/lkW5bb");
		babyBoyGifts.add("Learning Toy");
		babyBoyGifts.add("15-30");
		babyBoyGifts.add("http://goo.gl/d54NTj");

		// Writes the content to the file
		for(String s: babyBoyGifts) {
			writer.write(s); 
		}

		//gifts for girls ages 5-8
 
		ArrayList<String> girlGifts = new ArrayList<String>();
		writer.write("Gifts for Girls(Ages 5 - 8): ");
 
		static ArrayList<String> girlGifts = new ArrayList<String>();
 
		girlGifts.add("Book");
		girlGifts.add("5-20");
		girlGifts.add("http://goo.gl/IHqGq7");
		girlGifts.add("Watch");
		girlGifts.add("10-20");
		girlGifts.add("http://goo.gl/Z2vkyn");
		girlGifts.add("Fancy Doll");
		girlGifts.add("50-100");
		girlGifts.add("http://goo.gl/J831Rh");
		girlGifts.add("Play-Set");
		girlGifts.add("50-100");
		girlGifts.add("http://goo.gl/2utSqp");
		girlGifts.add("Shirt");
		girlGifts.add("15-40");
		girlGifts.add("http://goo.gl/BF0s05");
		girlGifts.add("Pants/Skirt");
		girlGifts.add("15-30");
		girlGifts.add("http://goo.gl/q4BiMl");
		girlGifts.add("Dress");
		girlGifts.add("30-100");
		girlGifts.add("http://goo.gl/WPGXWf");
		girlGifts.add("Shoes");
		girlGifts.add("25-50");
		girlGifts.add("http://goo.gl/W6RNbz");
		girlGifts.add("Makeup Kit");
		girlGifts.add("5-15");
		girlGifts.add("http://goo.gl/oLCBxf");
		girlGifts.add("Accesories");
		girlGifts.add("10-25");
		girlGifts.add("http://goo.gl/eiuzuW");

		// Writes the content to the file
		for(String s: girlGifts) {
			writer.write(s); 
		}

		//gifts for boys ages 5-8
 
		ArrayList<String> boyGifts = new ArrayList<String>();
		writer.write("Gifts for Boys(Ages 5 - 8): ");
 
		static ArrayList<String> boyGifts = new ArrayList<String>();
 
		boyGifts.add("Shoes");
		boyGifts.add("25-50");
		boyGifts.add("http://goo.gl/KRxlvS");
		boyGifts.add("Book");
		boyGifts.add("5-20");
		boyGifts.add("http://goo.gl/JgDcQ8");
		boyGifts.add("Play-Set");
		boyGifts.add("10-30");
		boyGifts.add("http://goo.gl/QIbUbv");
		boyGifts.add("Sports Equipment");
		boyGifts.add("10-20");
		boyGifts.add("http://goo.gl/arQyfX");
		boyGifts.add("Shirt");
		boyGifts.add("10-25");
		boyGifts.add("http://goo.gl/3C12gb");
		boyGifts.add("Pants");
		boyGifts.add("20-50");
		boyGifts.add("http://goo.gl/pw2wc1");
		boyGifts.add("Jacket");
		boyGifts.add("20-50");
		boyGifts.add("http://goo.gl/QjQgCt");
		boyGifts.add("Watch");
		boyGifts.add("10-20");
		boyGifts.add("http://goo.gl/sc4TMd");
		boyGifts.add("Toy");
		boyGifts.add("20-40");
		boyGifts.add("http://goo.gl/8gGwYa");
		boyGifts.add("Accesory");
		boyGifts.add("10-20");
		boyGifts.add("http://goo.gl/IBF9vT");

		// Writes the content to the file
		for(String s: boyGifts) {
			writer.write(s); 
		}

		//gifts for boys ages 9-12
 
		ArrayList<String> preteenBoyGifts = new ArrayList<String>();
		writer.write("Gifts for Preteen Boys(Ages 9 - 12): ");
 
		static ArrayList<String> preteenBoyGifts = new ArrayList<String>();
 
		preteenBoyGifts.add("Sports Related Gifts");
		preteenBoyGifts.add("20-40");
		preteenBoyGifts.add("http://goo.gl/E28ayi");
		preteenBoyGifts.add("Book Set");
		preteenBoyGifts.add("10-20");
		preteenBoyGifts.add("http://goo.gl/disuFt");
		preteenBoyGifts.add("Build/Science Set");
		preteenBoyGifts.add("10-20");
		preteenBoyGifts.add("http://goo.gl/23M1vr");
		preteenBoyGifts.add("Shirt");
		preteenBoyGifts.add("15-25");
		preteenBoyGifts.add("http://goo.gl/XNmXVb");
		preteenBoyGifts.add("Pants");
		preteenBoyGifts.add("http://goo.gl/bOqdNm");
		preteenBoyGifts.add("15-30");
		preteenBoyGifts.add("Jacket");
		preteenBoyGifts.add("10-30");
		preteenBoyGifts.add("http://goo.gl/ecqDJQ");
		preteenBoyGifts.add("Giftcard");
		preteenBoyGifts.add("your choice");
		preteenBoyGifts.add("http://goo.gl/it65Fk");
		preteenBoyGifts.add("Accesories");
		preteenBoyGifts.add("10-20");
		preteenBoyGifts.add("http://goo.gl/hA8b0c");
		preteenBoyGifts.add("Body Care Products (ex: cologne)");
		preteenBoyGifts.add("10-20");
		preteenBoyGifts.add("http://goo.gl/OWrmJ1");

		// Writes the content to the file
		for(String s: preteenBoyGifts) {
			writer.write(s); 
		}

		//gifts for girls ages 9-12
 
		ArrayList<String> preteenGirlGifts = new ArrayList<String>();
		writer.write("Gifts for Preteen Girls(Ages 9 - 12): ");
 
		static ArrayList<String> preteenGirlGifts = new ArrayList<String>();
 
		preteenGirlGifts.add("Sports Gift");
		preteenGirlGifts.add("10-30");
		preteenGirlGifts.add("http://goo.gl/K9GgmB");
		preteenGirlGifts.add("Giftcard");
		preteenGirlGifts.add("your choice"); //WATCH OUT WHEN PRICE STRING --> INT
		preteenGirlGifts.add("http://goo.gl/it65Fk");
		preteenGirlGifts.add("Accesories");
		preteenGirlGifts.add("10-30");
		preteenGirlGifts.add("http://goo.gl/uiaMTK");
		preteenGirlGifts.add("Book Set");
		preteenGirlGifts.add("10-20");
		preteenGirlGifts.add("http://goo.gl/disuFt");
		preteenGirlGifts.add("Build/Science Set");
		preteenGirlGifts.add("10-20");
		preteenGirlGifts.add("http://goo.gl/23M1vr");
		preteenGirlGifts.add("Dress");
		preteenGirlGifts.add("15-30");
		preteenGirlGifts.add("http://goo.gl/BBjDqV");
		preteenGirlGifts.add("Skirt");
		preteenGirlGifts.add("10-25");
		preteenGirlGifts.add("http://goo.gl/GixWs4");
		preteenGirlGifts.add("Pants");
		preteenGirlGifts.add("15-30");
		preteenGirlGifts.add("http://goo.gl/UlSCXn");
		preteenGirlGifts.add("Shirt");
		preteenGirlGifts.add("10-25");
		preteenGirlGifts.add("http://goo.gl/SMxbWQ");
		preteenGirlGifts.add("Makeup/Nail Polish");
		preteenGirlGifts.add("10-20");
		preteenGirlGifts.add("http://goo.gl/pYwJpn");

		// Writes the content to the file
		for(String s: preteenGirlGifts) {
			writer.write(s); 
		}

		//gifts for girls ages 13-19
 
		ArrayList<String> teenGirlGifts = new ArrayList<String>();
		writer.write("Gifts for Teen Girls(Ages 13 - 19): ");
 
		static ArrayList<String> teenGirlGifts = new ArrayList<String>();
 
		teenGirlGifts.add("Giftcard");
		teenGirlGifts.add("you choose");
		teenGirlGifts.add("http://goo.gl/1rE677");
		teenGirlGifts.add("Pants");
		teenGirlGifts.add("30-50");
		teenGirlGifts.add("https://goo.gl/yW41lQ");
		teenGirlGifts.add("Skirt");
		teenGirlGifts.add("20-40");
		teenGirlGifts.add("https://goo.gl/4fdF3r");
		teenGirlGifts.add("Dress/Romper");
		teenGirlGifts.add("20-40");
		teenGirlGifts.add("https://goo.gl/1wZyTo");
		teenGirlGifts.add("Shirt");
		teenGirlGifts.add("10-30");
		teenGirlGifts.add("https://goo.gl/rmW1CL");
		teenGirlGifts.add("Jacket");
		teenGirlGifts.add("30-70");
		teenGirlGifts.add("http://goo.gl/3dygdY");
		teenGirlGifts.add("Shoes");
		teenGirlGifts.add("25-50");
		teenGirlGifts.add("https://goo.gl/xKvpTv");
		teenGirlGifts.add("Accesory");
		teenGirlGifts.add("5-40");
		teenGirlGifts.add("http://goo.gl/rYNEd7");
		teenGirlGifts.add("Makeup/Nail Polish");
		teenGirlGifts.add("20-50");
		teenGirlGifts.add("http://goo.gl/Tp9WaE");
		teenGirlGifts.add("Book");
		teenGirlGifts.add("5-30");
		teenGirlGifts.add("http://goo.gl/WXc8vF");

		// Writes the content to the file
		for(String s: teenGirlGifts) {
			writer.write(s); 
		}

		//gifts for boys ages 13-19
 
		ArrayList<String> teenBoyGifts = new ArrayList<String>();
		writer.write("Gifts for Teen Boys(Ages 13 - 19): ");
 
		static ArrayList<String> teenBoyGifts = new ArrayList<String>();
 
		teenBoyGifts.add("Giftcard");
		teenBoyGifts.add("you choose");
		teenBoyGifts.add("http://goo.gl/1rE677");
		teenBoyGifts.add("Book");
		teenBoyGifts.add("5-30");
		teenBoyGifts.add("http://goo.gl/WXc8vF");
		teenBoyGifts.add("Body Care Products (ex: cologne)");
		teenBoyGifts.add("15-30");
		teenBoyGifts.add("http://goo.gl/8Vvsp1");
		teenBoyGifts.add("Sports Gifts");
		teenBoyGifts.add("15-30");
		teenBoyGifts.add("http://goo.gl/32pfml");
		teenBoyGifts.add("Shirt");
		teenBoyGifts.add("15-30");
		teenBoyGifts.add("https://goo.gl/0oYWkA");
		teenBoyGifts.add("Pants");
		teenBoyGifts.add("20-40");
		teenBoyGifts.add("https://goo.gl/dhESQE");
		teenBoyGifts.add("Jacket");
		teenBoyGifts.add("30-60");
		teenBoyGifts.add("https://goo.gl/35NnXu");
		teenBoyGifts.add("Accesory");
		teenBoyGifts.add("10-20");
		teenBoyGifts.add("https://goo.gl/Tkm3GF");
		teenBoyGifts.add("Shoes");
		teenBoyGifts.add("20-30");
		teenBoyGifts.add("https://goo.gl/i4Nhw6");
		teenBoyGifts.add("Headphones");
		teenBoyGifts.add("100-300");
		teenBoyGifts.add("http://goo.gl/BzbRTu");

		// Writes the content to the file
		for(String s: teenBoyGifts) {
			writer.write(s); 
		}

		//gifts for girls ages 20-35
 
		ArrayList<String> youngFemaleAdultGifts = new ArrayList<String>();
		writer.write("Gifts for Female Young Adults(Ages 20 - 35): ");
 
		static ArrayList<String> youngFemaleAdultGifts = new ArrayList<String>();
 
		youngFemaleAdultGifts.add("Shirt");
		youngFemaleAdultGifts.add("10-30");
		youngFemaleAdultGifts.add("https://goo.gl/CAKvSM");
		youngFemaleAdultGifts.add("Shoes");
		youngFemaleAdultGifts.add("25-50");
		youngFemaleAdultGifts.add("http://goo.gl/D2WJIY");
		youngFemaleAdultGifts.add("Jewelry");
		youngFemaleAdultGifts.add("40-100");
		youngFemaleAdultGifts.add("http://goo.gl/8p4YX7");
		youngFemaleAdultGifts.add("Accesory");
		youngFemaleAdultGifts.add("5-40");
		youngFemaleAdultGifts.add("https://goo.gl/bM7BOC");
		youngFemaleAdultGifts.add("Makeup/Nail Polish");
		youngFemaleAdultGifts.add("20-50");
		youngFemaleAdultGifts.add("http://goo.gl/Tp9WaE");
		youngFemaleAdultGifts.add("Giftcard");
		youngFemaleAdultGifts.add("you choose");
		youngFemaleAdultGifts.add("http://goo.gl/1rE677");
		youngFemaleAdultGifts.add("Concert Tickets");
		youngFemaleAdultGifts.add("30-200");
		youngFemaleAdultGifts.add("http://goo.gl/Ojipcq");
		youngFemaleAdultGifts.add("Personalized Computer/Phone Case");
		youngFemaleAdultGifts.add("20-40");
		youngFemaleAdultGifts.add("http://goo.gl/BK4zsj");
		youngFemaleAdultGifts.add("Alcohol");
		youngFemaleAdultGifts.add("20-50");
		youngFemaleAdultGifts.add("http://goo.gl/VzVAyA");
		youngFemaleAdultGifts.add("Skirt");
		youngFemaleAdultGifts.add("20-40");
		youngFemaleAdultGifts.add("https://goo.gl/opKXjm");
		youngFemaleAdultGifts.add("DressDress/Romper");
		youngFemaleAdultGifts.add("20-40");
		youngFemaleAdultGifts.add("http://goo.gl/KIU2lF");
		youngFemaleAdultGifts.add("Pants");
		youngFemaleAdultGifts.add("20-50");
		youngFemaleAdultGifts.add("https://goo.gl/YuSIUq");
		youngFemaleAdultGifts.add("Jacket");
		youngFemaleAdultGifts.add("30-70");
		youngFemaleAdultGifts.add("https://goo.gl/Fm4L7I");
		youngFemaleAdultGifts.add("Sports Tickets");
		youngFemaleAdultGifts.add("30-200");
		youngFemaleAdultGifts.add("http://goo.gl/RzrjEd");
		youngFemaleAdultGifts.add("Accesory");
		youngFemaleAdultGifts.add("5-40");
		youngFemaleAdultGifts.add("https://goo.gl/IRczuh");
		youngFemaleAdultGifts.add("Fancy Shoes");
		youngFemaleAdultGifts.add("100-300");
		youngFemaleAdultGifts.add("http://goo.gl/DLuro4");
		youngFemaleAdultGifts.add("Formal Dress");
		youngFemaleAdultGifts.add("100-200");
		youngFemaleAdultGifts.add("http://goo.gl/IoobNt");

		// Writes the content to the file
		for(String s: youngFemaleAdultGifts) {
			writer.write(s); 
		}

		//gifts for boys ages 20-35
 
		ArrayList<String> youngMaleAdultGifts = new ArrayList<String>();
		writer.write("Gifts for Male Young Adults(Ages 20 - 35): ");
 
		static ArrayList<String> youngMaleAdultGifts = new ArrayList<String>();
 
		youngMaleAdultGifts.add("Concert Tickets");
		youngMaleAdultGifts.add("30-200");
		youngMaleAdultGifts.add("http://goo.gl/Ojipcq");
		youngMaleAdultGifts.add("Giftcard");
		youngMaleAdultGifts.add("you choose");
		youngMaleAdultGifts.add("http://goo.gl/1rE677");
		youngMaleAdultGifts.add("Personalized Computer/Phone Case");
		youngMaleAdultGifts.add("20-40");
		youngMaleAdultGifts.add("http://goo.gl/BK4zsj");
		youngMaleAdultGifts.add("Alcohol");
		youngMaleAdultGifts.add("20-50");
		youngMaleAdultGifts.add("http://goo.gl/VzVAyA");
		youngMaleAdultGifts.add("Shirt");
		youngMaleAdultGifts.add("30-50");
		youngMaleAdultGifts.add("http://goo.gl/OUatP3");
		youngMaleAdultGifts.add("Pants");
		youngMaleAdultGifts.add("30-50");
		youngMaleAdultGifts.add("https://goo.gl/HzETbt");
		youngMaleAdultGifts.add("Jacket");
		youngMaleAdultGifts.add("30-150");
		youngMaleAdultGifts.add("http://goo.gl/qoGB3N");
		youngMaleAdultGifts.add("Body Care Products (ex: cologne)");
		youngMaleAdultGifts.add("50-100");
		youngMaleAdultGifts.add("http://goo.gl/gzhQEn");
		youngMaleAdultGifts.add("Accesory");
		youngMaleAdultGifts.add("10-30");
		youngMaleAdultGifts.add("http://goo.gl/JB0TTd");
		youngMaleAdultGifts.add("Sports Tickets");
		youngMaleAdultGifts.add("30-200");
		youngMaleAdultGifts.add("http://goo.gl/RzrjEd");
		youngMaleAdultGifts.add("Headphones");
		youngMaleAdultGifts.add("100-300");
		youngMaleAdultGifts.add("http://goo.gl/BzbRTu");
		youngMaleAdultGifts.add("Suit");
		youngMaleAdultGifts.add("150-300");
		youngMaleAdultGifts.add("http://goo.gl/Zcqjhz");
		youngMaleAdultGifts.add("Tie");
		youngMaleAdultGifts.add("50-100");
		youngMaleAdultGifts.add("http://goo.gl/0i1Sk6");

		// Writes the content to the file
		for(String s: youngMaleAdultGifts) {
			writer.write(s); 
		}

		//gifts for girls ages 36+
 
		ArrayList<String> femaleAdultGifts = new ArrayList<String>();
		writer.write("Gifts for Female Adults(Ages 36+): ");
 
		static ArrayList<String> femaleAdultGifts = new ArrayList<String>();
 
		femaleAdultGifts.add("Alcohol");
		femaleAdultGifts.add("20-50");
		femaleAdultGifts.add("http://goo.gl/VzVAyA");
		femaleAdultGifts.add("Giftcard");
		femaleAdultGifts.add("you choose");
		femaleAdultGifts.add("http://goo.gl/1rE677");
		femaleAdultGifts.add("Personalized Computer/Phone Case");
		femaleAdultGifts.add("20-40");
		femaleAdultGifts.add("http://goo.gl/BK4zsj");
		femaleAdultGifts.add("Book");
		femaleAdultGifts.add("10-30");
		femaleAdultGifts.add("http://goo.gl/IvMe7r");
		femaleAdultGifts.add("Shirt");
		femaleAdultGifts.add("50-100");
		femaleAdultGifts.add("http://goo.gl/Gpo94K");
		femaleAdultGifts.add("Jacket");
		femaleAdultGifts.add("100-200");
		femaleAdultGifts.add("http://goo.gl/EblQyM");
		femaleAdultGifts.add("Formal Dress");
		femaleAdultGifts.add("150-300");
		femaleAdultGifts.add("http://goo.gl/hK0i83");
		femaleAdultGifts.add("Pants");
		femaleAdultGifts.add("30-50");
		femaleAdultGifts.add("http://goo.gl/fJwCvA");
		femaleAdultGifts.add("Fancy Shoes");
		femaleAdultGifts.add("100-300");
		femaleAdultGifts.add("http://goo.gl/DLuro4");
		femaleAdultGifts.add("Jewlery");
		femaleAdultGifts.add("70-200");
		femaleAdultGifts.add("http://goo.gl/2AmgFt");
		femaleAdultGifts.add("Purse/Wallet");
		femaleAdultGifts.add("200-400");
		femaleAdultGifts.add("http://goo.gl/tuR2oX");
		femaleAdultGifts.add("Watch");
		femaleAdultGifts.add("150-300");
		femaleAdultGifts.add("http://goo.gl/86f0hG");

		// Writes the content to the file
		for(String s: femaleAdultGifts) {
			writer.write(s); 
		}

		//gifts for boys ages 36+
 
		ArrayList<String> maleAdultGifts = new ArrayList<String>();
		writer.write("Gifts for Male Adults(Ages 36+): ");
 
		static ArrayList<String> maleAdultGifts = new ArrayList<String>();
 
		maleAdultGifts.add("Alcohol");
		maleAdultGifts.add("20-50");
		maleAdultGifts.add("http://goo.gl/VzVAyA");
		maleAdultGifts.add("Giftcard");
		maleAdultGifts.add("you choose");
		maleAdultGifts.add("http://goo.gl/1rE677");
		maleAdultGifts.add("Pants");
		maleAdultGifts.add("40-100");
		maleAdultGifts.add("http://goo.gl/1wd4Ev");
		maleAdultGifts.add("Shirt");
		maleAdultGifts.add("30-50");
		maleAdultGifts.add("http://goo.gl/x4smto");
		maleAdultGifts.add("Suit");
		maleAdultGifts.add("150-300");
		maleAdultGifts.add("http://goo.gl/Zcqjhz");
		maleAdultGifts.add("Personalized Computer/Phone Case");
		maleAdultGifts.add("20-40");
		maleAdultGifts.add("http://goo.gl/BK4zsj");
		maleAdultGifts.add("Jacket");
		maleAdultGifts.add("150-300");
		maleAdultGifts.add("http://goo.gl/jPFqzE");
		maleAdultGifts.add("Tie");
		maleAdultGifts.add("50-100");
		maleAdultGifts.add("http://goo.gl/0i1Sk6");
		maleAdultGifts.add("Shoes");
		maleAdultGifts.add("50-100");
		maleAdultGifts.add("http://goo.gl/7kmjmi");
		maleAdultGifts.add("Book");
		maleAdultGifts.add("10-30");
		maleAdultGifts.add("http://goo.gl/IvMe7r");
		maleAdultGifts.add("Wallet");
		maleAdultGifts.add("50-100");
		maleAdultGifts.add("http://goo.gl/jbyqxL");
		maleAdultGifts.add("Cufflinks");
		maleAdultGifts.add("50-100");
		maleAdultGifts.add("http://goo.gl/7rXsxz");
		maleAdultGifts.add("Watch");
		maleAdultGifts.add("200-500");
		maleAdultGifts.add("http://goo.gl/fbGvgh");
		maleAdultGifts.add("Body Care Products (ex: cologne)");
		maleAdultGifts.add("50-100");
		maleAdultGifts.add("http://goo.gl/gzhQEn");

		// Writes the content to the file
		for(String s: maleAdultGifts) {
			writer.write(s); 
		}

		//gifts for nerds!
 
		ArrayList<String> geekGifts = new ArrayList<String>();
		writer.write("Gifts for Nerds: ");
 
		static ArrayList<String> geekGifts = new ArrayList<String>();
 
		geekGifts.add("Gadget Fighting Toy");
		geekGifts.add("100-200");
		geekGifts.add("http://goo.gl/mmKBGb");
		geekGifts.add("Batman Electrical Outlet Sticker");
		geekGifts.add("2-5");
		geekGifts.add("http://goo.gl/E13E7E");
		geekGifts.add("Ghostbusters Board Game");
		geekGifts.add("100-130");
		geekGifts.add("http://goo.gl/4ntJwt");
		geekGifts.add("Hogwarts Aceptance Letter");
		geekGifts.add("25-45");
		geekGifts.add("http://goo.gl/ey5qqJ");
		geekGifts.add("Halo Needler REplica");
		geekGifts.add("200-250");
		geekGifts.add("http://goo.gl/8m1nQx");
		geekGifts.add("Death Star Floating Speaker");
		geekGifts.add("200-250");
		geekGifts.add("http://goo.gl/nsgkwD");
		geekGifts.add("Superhero Napkins");
		geekGifts.add("5-15");
		geekGifts.add("http://goo.gl/T2w99W");
		geekGifts.add("Lunar Globe");
		geekGifts.add("600-700");
		geekGifts.add("http://goo.gl/IYR6A5");
		geekGifts.add("Harry Potter Charm Bracelet");
		geekGifts.add("15-25");
		geekGifts.add("http://goo.gl/csXiS6");
		geekGifts.add("Pokemon Uno");
		geekGifts.add("10-20");
		geekGifts.add("http://goo.gl/fgWytG");
		geekGifts.add("Geeky Hoodie");
		geekGifts.add("65-80");
		geekGifts.add("http://goo.gl/MbI9pT");
		geekGifts.add("Star Wars R2-D2 Cupcake Molds");
		geekGifts.add("10-20");
		geekGifts.add("http://goo.gl/mb3p5T");

		// Writes the content to the file
		for(String s: geekGifts) {
			writer.write(s); 
		}

		//gifts for athletes
 
		writer.write("Gifts for Athletes: ");
		ArrayList<String> athleteGifts = new ArrayList<String>();
 
		static ArrayList<String> athleteGifts = new ArrayList<String>();
 
		athleteGifts.add("See Through Bottom Canoe");
		athleteGifts.add("2000-2500");
		athleteGifts.add("http://goo.gl/3PsVT3");
		athleteGifts.add("Survival Bows");
		athleteGifts.add("70-100");
		athleteGifts.add("http://goo.gl/kcw29k");
		athleteGifts.add("Water Bottle");
		athleteGifts.add("10-20");
		athleteGifts.add("http://goo.gl/qd7hrH");
		athleteGifts.add("Fitbit");
		athleteGifts.add("80-100");
		athleteGifts.add("http://goo.gl/hHGqeJ");
		athleteGifts.add("Sport's Team Jersey");
		athleteGifts.add("20-40");
		athleteGifts.add("http://goo.gl/AjBGmV");
		athleteGifts.add("Excersize Machine");
		athleteGifts.add("500-1000");
		athleteGifts.add("http://goo.gl/f95vEQ");
		athleteGifts.add("Yoga Equipment");
		athleteGifts.add("20-40");
		athleteGifts.add("http://goo.gl/x2OPVB");
		athleteGifts.add("Sports Game Tickets");
		athleteGifts.add("your choice");
		athleteGifts.add("http://goo.gl/8uUgdI");
		athleteGifts.add("Team Sports Equipment");
		athleteGifts.add("25-50");
		athleteGifts.add("http://goo.gl/7jyFMw");
		athleteGifts.add("Workout Clothes");
		athleteGifts.add("20-60");
		athleteGifts.add("http://goo.gl/hN85Do");

		// Writes the content to the file
		for(String s: athleteGifts) {
			writer.write(s); 
		}

		//gifts for artists
 
		ArrayList<String> artistGifts = new ArrayList<String>();
		writer.write("Gifts for Artists: ");
 
		static ArrayList<String> artistGifts = new ArrayList<String>();
 
		artistGifts.add("142-Piece Wood Art Set");
		artistGifts.add("20-30");
		artistGifts.add("http://goo.gl/UWZC5Q");
		artistGifts.add("Sketch Pad");
		artistGifts.add("5-10");
		artistGifts.add("http://goo.gl/tRbCxB");
		artistGifts.add("Jewelry Making Tool Kit");
		artistGifts.add("20-30");
		artistGifts.add("http://goo.gl/EWqryt");
		artistGifts.add("Just My Style My Very Own Jewelry Studio");
		artistGifts.add("10-15");
		artistGifts.add("http://goo.gl/5n8smY");
		artistGifts.add("Jewelry Basics Class in a Boxy Kit");
		artistGifts.add("20-30");
		artistGifts.add("http://goo.gl/fxKQst");
		artistGifts.add("Oil Paint Set");
		artistGifts.add("15-20");
		artistGifts.add("http://goo.gl/BKXsAm");
		artistGifts.add("Sewing Kit");
		artistGifts.add("10-20");
		artistGifts.add("http://goo.gl/v53uUF");
		artistGifts.add("Artist Brushes");
		artistGifts.add("15-30");
		artistGifts.add("http://goo.gl/je9uKX");
		artistGifts.add("Quilting and Sewing Machine");
		artistGifts.add("700-1000");
		artistGifts.add("http://goo.gl/SJ5DEJ");
		artistGifts.add("Heat Press");
		artistGifts.add("200-250");
		artistGifts.add("http://goo.gl/pYWCt7");

		// Writes the content to the file
		for(String s: artistGifts) {
			writer.write(s); 
		}

		//gifts for people that love movies, plays, museums, and music
 
		ArrayList<String> entertainementBuffGifts = new ArrayList<String>();
		writer.write("Gifts for Entertainment Buffs: ");
 
		static ArrayList<String> entertainementBuffGifts = new ArrayList<String>();
 
		entertainementBuffGifts.add("Dexter: The Complete Series Collection");
		entertainementBuffGifts.add("150-200");
		entertainementBuffGifts.add("http://goo.gl/ETWuPu");
		entertainementBuffGifts.add("The Tiny Book of tiny Stories");
		entertainementBuffGifts.add("10-15");
		entertainementBuffGifts.add("http://goo.gl/l9SF1F");
		entertainementBuffGifts.add("Fandango Gift Card");
		entertainementBuffGifts.add("25-50");
		entertainementBuffGifts.add("http://goo.gl/IKsYSn");
		entertainementBuffGifts.add("Movies Trivia Game");
		entertainementBuffGifts.add("10-15");
		entertainementBuffGifts.add("http://goo.gl/vP0HbA");
		entertainementBuffGifts.add("TCM Freatest Classic Films Collection: Broadway Musicals");
		entertainementBuffGifts.add("10-15");
		entertainementBuffGifts.add("http://goo.gl/yMDCIO");
		entertainementBuffGifts.add("TCM Freatest Classic Films Collection: Holiday");
		entertainementBuffGifts.add("10-15");
		entertainementBuffGifts.add("http://goo.gl/2I2GMN");
		entertainementBuffGifts.add("TCM Freatest Classic Films Collection: Comedy");
		entertainementBuffGifts.add("10-15");
		entertainementBuffGifts.add("http://goo.gl/DYku67");
		entertainementBuffGifts.add("TCM Freatest Classic Films Collection: Romantic Comedies");
		entertainementBuffGifts.add("10-15");
		entertainementBuffGifts.add("http://goo.gl/bDuKvK");
		entertainementBuffGifts.add("Harry potter: Collectible Quidditch Set");
		entertainementBuffGifts.add("20-30");
		entertainementBuffGifts.add("http://goo.gl/Lbmnaa");
		entertainementBuffGifts.add("Movie Collectible Poster");
		entertainementBuffGifts.add("10,000-50,000");
		entertainementBuffGifts.add("http://goo.gl/5cru5q");

 
		// Writes the content to the file
		for(String s: entertainementBuffGifts) {
			writer.write(s); 
		}

		writer.flush();
		writer.close();
	}
 
	
	
	
		/*create a hashmap called gift database that stores gifts recommended for each person
		 * key = person name
		 * value = list of gift ideas
		 */
		static Hashtable recommendedGifts = new Hashtable();

		//public String[] recommendGifts(Person person){
			//String[] recommendedGifts = person.suggestedGifts();
			
		//}
	
 
}

