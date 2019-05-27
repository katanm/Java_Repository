public class RockefellerVsGates {

	public static void main(String [] args){

	int WhoIsTheRichest;

	String name = "John Davison Rockefeller Sr.";

	int born = 1839;
	int died = 1937;
	int diff = died - born;
	
	int netWorth = 409;
	String money = "US$";
	String value = "billion";

	String spouseName = "Laura Spelman";
	int spouseBorn = 1864;
	int spouseDied = 1915;
	int diffSpouse = spouseDied - spouseBorn;

	byte children = 5;
	String textChildren = "Elizabeth, Alice, Alta, Edith, and John Jr.";
	
	String occupation = "Oil industry business magnate and philanthropy";

	long donationGave = 80_000_000_000L;
	String donationUniver = "University of Chicago";

	boolean x = true;

	boolean y = false;

	System.out.println (name);
	System.out.println ("aged" + " " + diff);
	System.out.println (money + netWorth + " " + value + " "+"in 2018 dollars; inflation-adjusted");
	System.out.println ("Spouse:" + " "+ spouseName);
	System.out.println ("aged" + " " + diffSpouse);
	System.out.println ("Children"+ " " + children + " " + ":" + " " + textChildren);
	System.out.println (occupation);
	System.out.println ("$"+ donationGave + " " + "to" + " " + donationUniver);


	}

}