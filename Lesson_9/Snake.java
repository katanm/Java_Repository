public class Snake {
    
    public void name(String denumire){
        
        System.out.println(denumire);
        
    }
    
    public void latin(String text){
        
        System.out.println(text);
    }
    
    public void species(String text2){
        
        System.out.println(text2);
    }
    
    public void length(int num){
        
        System.out.println("The lengtht: " + num + " ft");
    }
    

    
    public static void main(String[] args) {
        
        Snake emp = new Snake();
        emp.name("Black mamba");
        emp.latin("Dendroaspis polylepis");
        emp.species("Extremely venomous snake");
        emp.length(10);
        
        
        
    }
}
