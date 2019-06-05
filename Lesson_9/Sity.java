public class Sity {
    
    public void name(String denumire){
        
        System.out.println(denumire);
        
    }
    
    public void country(String tara){
        
        System.out.println(tara);
    }
    
    public void firstApearance(String atestare){
        
        System.out.println("First Certification: " + atestare);
    }
    
    public void population(int num){
        
        System.out.println("The population: " + num);
    }
    

    
    public static void main(String[] args) {
        
        Sity emp = new Sity();
        emp.name("Krakow");
        emp.country("Poland");
        emp.firstApearance("Secolul al IX-lea");
        emp.population(771_069);
        
        
        
    }
}
