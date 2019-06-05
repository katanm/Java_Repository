public class MyRadio {
    
    public void name(String radio){
        
        System.out.println(radio);
        
    }
    
    public void launch(String lansare){
        
        System.out.println("Radioul a fost lansat pe data de " + lansare);
    }
    
    public void target(String ascultatori){
        
        System.out.println(ascultatori);
    }
    
    public void frequency(float num){
        
        System.out.println(num + "FM");
    }
    
    
    public static void main(String[] args) {
        
        MyRadio emp = new MyRadio();
        emp.name("Radio Guerrilla");
        emp.launch("29 November 2004");
        emp.target("Young middle-class people between the ages of 25 and 34");
        emp.frequency(94.8f);
        
        
        
    }
}
