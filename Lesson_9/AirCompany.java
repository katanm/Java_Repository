public class AirCompany {
    
    public void air(String name){
        
        System.out.print(name + ": Born to fly.");
    }
    
    public void founded(int year){
        
        System.out.print("Anul fondarii: " + year);
    }
    
    public void destinations(int sity){
        
        System.out.print("Compania are " + sity + "destinatii");
        
    }
    
    public void page(String web){
        
        System.out.print("Acceseaza: " + web);
        
    }
    
    public static void main(String[] args){

        AirCompany emp = new AirCompany();
            emp.air("Air Moldova");
            emp.founded(1993);
            emp.destinations(32);
            emp.page("www.airmoldova.md");
            
    }
}

