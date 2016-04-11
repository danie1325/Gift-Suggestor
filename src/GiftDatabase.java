import java.util.ArrayList;
import java.util.Hashtable;

public class GiftDatabase {
	/*create a hashmap called gift database that stores gifts recommended for each person
	 * key = person name
	 * value = list of gift ideas
	 */
	static Hashtable recommendedGifts = new Hashtable();
	
	//store array lists of random gift ideas for different demographics
	ArrayList<String> girlGifts = new ArrayList<String>();
	ArrayList<String> boyGifts = new ArrayList<String>();
	ArrayList<String> WomanGifts = new ArrayList<String>();
	ArrayList<String> MenGifts = new ArrayList<String>();
	ArrayList<String> nerdGifts = new ArrayList<String>();
	ArrayList<String> athleteGifts = new ArrayList<String>();
	ArrayList<String> fashionistaGifts = new ArrayList<String>();
	ArrayList<String> entertainementBuffGifts = new ArrayList<String>();
	
}
