public class Parlament {
    
    public void name(String denumire){
        
        System.out.println(denumire);
        
    }
    
    public void type(String model){
        
        System.out.println(model);
    }
    
    
    public void seats(int membri){
        
        System.out.println(membri);
    }
    
    
    
    public static void main(String[] args) {
        
        Parlament emp = new Parlament();
        emp.name("Parlamentul Republicii Moldova");
        emp.type("Unicameral");
        emp.seats(101);
    
        
    }
}
