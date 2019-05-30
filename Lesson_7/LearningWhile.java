public class LearningWhile {

	public static void main(String[] args){

	int c = 0;

	while (c<=100) {
	
		System.out.println("Numarul este " +c);
		c++;
		
	}

	System.out.println("+ Punctul 2.1 / Numerele pare de la 0 la 50");	


	int i;
	i=1;
	while (i<=50) 
 	
	{
	if(i % 2 ==0) {    	
		System.out.println("Numarul par este " + i);
	    
  	} else {
	}
	
	i++;
	}

	System.out.println("+ Punctul 2.2 / Numerele impart de la 50 la 100");

	


	int x = 50;
	
	while (x <=100) {

	if (x % 2 == 1) {
   	
		System.out.println("Numarul impar este " + x);
	    
	}
	
	x++;
	}

	System.out.println("+ Punctul 2.3 / Numerele impart de la 100 la 50");

	


	int x1 = 100;
	
	while (x1 >=50) {

	if (x1 % 2 == 1) {
   	
		System.out.println("Numarul impar este " + x1);
	    
	}
	
	x1--;
	}



  }

}
