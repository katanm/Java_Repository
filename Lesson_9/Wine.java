public class Wine {
    
    public void name(String denumire){
        
        System.out.println(denumire);
        
    }
    
    public void ingredients(String continut){
        
        System.out.println(continut);
    }
    
    public void alcool(float tarie){
        
        System.out.println(tarie + "%");
    }
    
    public void variant(String culoare){
        
        System.out.println(culoare);
    }
    
    public static void main(String[] args) {
        
        Wine emp = new Wine();
        emp.name("Merlot");
        emp.ingredients("Grapes");
        emp.alcool(12.5f);
        emp.variant("red");
        
    }
}
