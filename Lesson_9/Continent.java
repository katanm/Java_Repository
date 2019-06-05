public class Continent {
    
    public void name(String denumire){
        
        System.out.println(denumire);
        
    }
    
    public void countries(int num){
        
        System.out.println(num + " countries");
    }
    
    public void area(long suprafata){
        
        System.out.println("Area: " + suprafata + "km2");
    }
    
    public void population(long cifra){
        
        System.out.println("The population: " + cifra);
    }
    

    
    public static void main(String[] args) {
        
        Continent emp = new Continent();
        emp.name("Europe");
        emp.countries(50);
        emp.area(10180000L);
        emp.population(741447158L);
        
        
        
    }
}
