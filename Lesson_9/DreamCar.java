public class DreamCar {
    
    public void car(String denumire){
        
        System.out.println(denumire);
        
    }
    
    public void model(String modelul){
        
        System.out.println(modelul);
    }
    
    public void power(int num){
        
        System.out.println(num + " Hp / cai putere");
    }
    
    public void color(String culoare){
        
        System.out.println(culoare);
    }
    
    
    public static void main(String[] args){
       
        DreamCar emp = new DreamCar();
        emp.car("Volvo");
        emp.model("XC40");
        emp.power(190);
        emp.color("Black");
        
        
    }
}
