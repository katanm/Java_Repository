public class NumereMultipli {

	public static void main(String[] args){

	System.out.println("Ciclul 'while' pentru 8 din 40");

	int x;
	x=1;
	while (x<=40) 
 	
	{
	if(x % 8 ==0) {    	
		System.out.println("Numarul este " + x);
	    
  	} else {
	}
	
	x++;
	}

	System.out.println();

	System.out.println("Ciclul 'do while' pentru 8 din 40");

	
	int myNumber = 8;
    	//do {
      	//	System.out.println(myNumber);
    	//
     	//	if (myNumber % 8 = 0) {
        	System.out.println("Nu reusesc sa afisez numerele - 8, 16, 24, 32, 40 :( ");
        // break;
     	// }

     	// myNumber++;
    	// } while(myNumber<=40);


	System.out.println();

	System.out.println("Ciclul 'for' pentru 8 din 40");

	for (int i = 8; i <= 40; i = i + 8) {
     	
	System.out.println("Numerele sunt " + i);
    } 

  }

}
