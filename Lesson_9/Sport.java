public class Sport {
    
    public void name(String denumire){
        
        System.out.println(denumire);
        
    }
    
    public void first(int num){
        
        System.out.println("First played: " + num);
    }
    
    public void type(String tipul){
        
        System.out.println(tipul);
    }
    
    public void venue(String spatiu){
        
        System.out.println(spatiu);
    }
    
    
    public static void main(String[] args) {
        
        Sport emp = new Sport();
        emp.name("Squash");
        emp.first(1958);
        emp.type("Racket sport");
        emp.venue("Indoor or outdoor (with glass court)");
        
        
        
    }
}
