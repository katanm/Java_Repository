public class Football {
    
    public void sport(String denumire){
        
        System.out.println(denumire);
        
    }
    
    public void founded(int num){
        
        System.out.println(num);
    }
    
    public void team(int echipe){
        
        System.out.println(echipe + " teams");
    }
    
    public void champions(String campion){
        
        System.out.println("Current champions: " + campion);
    }
    
    
    public static void main(String[] args) {
        
        Football emp = new Football();
        emp.sport("UEFA European Championship");
        emp.founded(1958);
        emp.team(55);
        emp.champions("Portugal");
        
        
        
    }
}
