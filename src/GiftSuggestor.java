import java.util.ArrayList;
import java.util.Hashtable;

public class GiftSuggestor{
	
	static String giftName;
	static String giftPrice;
	static String giftLink;
	static String suggestion;
	
	/*generate a random int 1-15 that is used to randomely choose one of the gifts from the suggested gift list
	 	*int 0 correlates w/ babyGirlGifts
	 	*int 1 correlates with babyBoyGifts
	 	*int 2 correlates with girlGifts
	 	*int 3 correlates w/ boyGifts
	 	*int 4 correlates with preteenBoyGifts
	 	*int 5 correlates with preteenGirlGifts
	 	*int 6 correlates w/ teenGirlGifts
	 	*int 7 correlates w/ teenBoyGifts
	 	*int 8 correlates w/ youngFemaleAdultGifts
	 	*int 9 correlates w/ youngMaleAdultGifts
	 	*int 10 correlates w/ femaleAdultGifts
	 	*int 11 correlates w/ MaleAdultGifts
	 	*int 12 correlates w/ geekGifts
	 	*int 13 correlates w/ athleteGifts
	 	*int 14 correlates w/ artistGifts
	 	*int 15 correlates w/ entertainementBuffGifts
	 */
	public static int randomInt(int x) { //generate a num from 1-x
		int min = 1;
		int max = x;
		int rand = min + (int)(Math.random() * ((max - min) + 1));
		return rand;
	}
	public static int randomInt2(int x) { //generate a nums 0, 3, 6, 9, 12, 15
		int min = 0;
		int max = x/3;
		int rand = min + (int)(Math.random() * ((max - min) + 1));
		return rand * 3;
	}
	
	/*
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
	public static String suggestGift(){
		ArrayList<String> validArrays = new ArrayList<String>();
		for (int i = 0; i < 15; i++){
			if (Person.preferences[i]){
				validArrays.add(Integer.toString(i));
			}
		}
		int x = validArrays.size();
		int index = randomInt(x); 
		int arrayNum = Integer.parseInt(validArrays.get(index));
		if (arrayNum == 0){
			int rand = randomInt2(GiftDatabase.babyGirlGifts.size());
			giftName = GiftDatabase.babyGirlGifts.get(rand);
			giftPrice = GiftDatabase.babyGirlGifts.get(rand+1);
			giftLink = GiftDatabase.babyGirlGifts.get(rand+2);
			
		}
		if (arrayNum == 1){
			int rand = randomInt2(GiftDatabase.babyBoyGifts.size());
			giftName = GiftDatabase.babyBoyGifts.get(rand);
			giftPrice = GiftDatabase.babyBoyGifts.get(rand+1);
			giftLink = GiftDatabase.babyBoyGifts.get(rand+2);
			
		}
		if (arrayNum == 2){
			int rand = randomInt2(GiftDatabase.girlGifts.size());
			giftName = GiftDatabase.girlGifts.get(rand);
			giftPrice = GiftDatabase.girlGifts.get(rand+1);
			giftLink = GiftDatabase.girlGifts.get(rand+2);
			
		}
		if (arrayNum == 3){
			int rand = randomInt2(GiftDatabase.boyGifts.size());
			giftName = GiftDatabase.boyGifts.get(rand);
			giftPrice = GiftDatabase.boyGifts.get(rand+1);
			giftLink = GiftDatabase.boyGifts.get(rand+2);
			
		}
		if (arrayNum == 4){
			int rand = randomInt2(GiftDatabase.preteenBoyGifts.size());
			giftName = GiftDatabase.preteenBoyGifts.get(rand);
			giftPrice = GiftDatabase.preteenBoyGifts.get(rand+1);
			giftLink = GiftDatabase.preteenBoyGifts.get(rand+2);
			
		}
		if (arrayNum == 5){
			int rand = randomInt2(GiftDatabase.preteenGirlGifts.size());
			giftName = GiftDatabase.preteenGirlGifts.get(rand);
			giftPrice = GiftDatabase.preteenGirlGifts.get(rand+1);
			giftLink = GiftDatabase.preteenGirlGifts.get(rand+2);
			
		}
		if (arrayNum == 6){
			int rand = randomInt2(GiftDatabase.teenGirlGifts.size());
			giftName = GiftDatabase.teenGirlGifts.get(rand);
			giftPrice = GiftDatabase.teenGirlGifts.get(rand+1);
			giftLink = GiftDatabase.teenGirlGifts.get(rand+2);
			
		}
		if (arrayNum == 7){
			int rand = randomInt2(GiftDatabase.teenBoyGifts.size());
			giftName = GiftDatabase.teenBoyGifts.get(rand);
			giftPrice = GiftDatabase.teenBoyGifts.get(rand+1);
			giftLink = GiftDatabase.teenBoyGifts.get(rand+2);
			
		}
		if (arrayNum == 8){
			int rand = randomInt2(GiftDatabase.youngFemaleAdultGifts.size());
			giftName = GiftDatabase.youngFemaleAdultGifts.get(rand);
			giftPrice = GiftDatabase.youngFemaleAdultGifts.get(rand+1);
			giftLink = GiftDatabase.youngFemaleAdultGifts.get(rand+2);
			
		}
		if (arrayNum == 9){
			int rand = randomInt2(GiftDatabase.youngMaleAdultGifts.size());
			giftName = GiftDatabase.youngMaleAdultGifts.get(rand);
			giftPrice = GiftDatabase.youngMaleAdultGifts.get(rand+1);
			giftLink = GiftDatabase.youngMaleAdultGifts.get(rand+2);
			
		}
		if (arrayNum == 10){
			int rand = randomInt2(GiftDatabase.femaleAdultGifts.size());
			giftName = GiftDatabase.femaleAdultGifts.get(rand);
			giftPrice = GiftDatabase.femaleAdultGifts.get(rand+1);
			giftLink = GiftDatabase.femaleAdultGifts.get(rand+2);
			
		}
		if (arrayNum == 11){
			int rand = randomInt2(GiftDatabase.maleAdultGifts.size());
			giftName = GiftDatabase.maleAdultGifts.get(rand);
			giftPrice = GiftDatabase.maleAdultGifts.get(rand+1);
			giftLink = GiftDatabase.maleAdultGifts.get(rand+2);
			
		}
		if (arrayNum == 12){
			int rand = randomInt2(GiftDatabase.geekGifts.size());
			giftName = GiftDatabase.geekGifts.get(rand);
			giftPrice = GiftDatabase.geekGifts.get(rand+1);
			giftLink = GiftDatabase.geekGifts.get(rand+2);
			
		}
		if (arrayNum == 13){
			int rand = randomInt2(GiftDatabase.athleteGifts.size());
			giftName = GiftDatabase.athleteGifts.get(rand);
			giftPrice = GiftDatabase.athleteGifts.get(rand+1);
			giftLink = GiftDatabase.athleteGifts.get(rand+2);
			
		}
		if (arrayNum == 14){
			int rand = randomInt2(GiftDatabase.artistGifts.size());
			giftName = GiftDatabase.artistGifts.get(rand);
			giftPrice = GiftDatabase.artistGifts.get(rand+1);
			giftLink = GiftDatabase.artistGifts.get(rand+2);
			
		}
		if (arrayNum == 15){
			int rand = randomInt2(GiftDatabase.entertainementBuffGifts.size());
			giftName = GiftDatabase.entertainementBuffGifts.get(rand);
			giftPrice = GiftDatabase.entertainementBuffGifts.get(rand+1);
			giftLink = GiftDatabase.entertainementBuffGifts.get(rand+2);
			
		}
		
		
	
		
		
		suggestion = "We sugest you buy your friend a" + giftName + ". It costs around $" + giftPrice + ". You can find one at this link: " + giftLink;
		return suggestion;
	}
}

