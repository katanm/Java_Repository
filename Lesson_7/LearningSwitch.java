public class LearningSwitch {

	public static void main(String[] args){

	char ch = 'K';

	switch(ch) {

		case 'A': 
		case 'E':
		case 'I': 
		case 'O': 
		case 'U': 
			System.out.println(ch + " este o vocala");
			break;

		case 'B': 
		case 'C': 
		case 'D': 
		case 'F': 
		case 'G': 
		case 'H': 
		case 'J': 
		case 'K': 
		case 'L': 
		case 'M': 
		case 'N': 
		case 'P': 
		case 'Q': 
		case 'R': 
		case 'S': 
		case 'T': 
		case 'V': 
		case 'W': 
		case 'Y': 
		case 'Z': 
			System.out.println(ch + " este o consoana");
			break;
}
		
		System.out.println("+ Punctul 1.2");		

		byte nota = 8;
		
		switch(nota){
		
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Insuficient");
		break;
		case 6:
		case 7:
			System.out.println("Satisfacator");
		break;
		case 8:
		case 9:
			System.out.println("Bine");
		break;
		case 10:
			System.out.println("Excelent");
		break;

		}
	}


}