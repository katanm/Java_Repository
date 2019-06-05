public class Airport {
    
    public void name(String adress){
        
        System.out.println(adress);
        
    }
    
    public void code(String kod){
        
        System.out.println("Codul international: " + kod);
    }
    
    public void open(int deschis){
        
        System.out.println("Aeroportul a fost deschis in anul " + deschis);
    }
    
    public void hub(String baza){
        
        System.out.println("HUB: " + baza);
    }
    
    
    public static void main(String[] args){
       
        Airport emp = new Airport();
        emp.name("International Airport Chisinau");
        emp.code("KIV");
        emp.open(1960);
        emp.hub("Airmoldova & FlyOne");
        
        
    }
}
