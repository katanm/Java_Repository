public class HomeWork6Variables15 {

	public static void main (String[] args){

	int number = 24;

	if (number<0) {
		System.out.println(number+ " " + "este numar negativ");

	} else if (number==0) {
	
		System.out.println(number+ " " + "este regal cu 0");
	} else {
	
		System.out.println(number+ " " + "este numar positiv");

	}

	//numar par sau impar

	if (number%2==0) {
	
		System.out.println(number+ " " + "este numar par");
	
	} else {

		System.out.println(number+ " " + "este numar impar");

		}

	// numarul este byte

	if (number > 127) {
			System.out.println(number + " " + "numarul nu se incadreaza in byte");
	
	} else if (number < -127) {
			System.out.println(number + " " + "numeral nu se incadreaza in byte");

	} else { 	
			System.out.println(number + "" + " se incadreaza in byte");	
		}

	} 



}
