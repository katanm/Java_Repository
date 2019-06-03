public class Airport {
    
    // nume, orasul, denuimirea prescurtata, capacitatea anuala pasageri
    
    String name;
    String code;
    String sity;
    int open;
    int passengers;
    String hub;
    String web;
    
    public void air(){
        
        System.out.println("Welcome to Moldova!");
    }
    
    public static void main(String[] args){
       
        Airport emp = new Airport();
        emp.name = "Chisinau Airport ";
        emp.code = "KIV";
        emp.sity = "Chisinau ";
        emp.open = 1960;
        emp.passengers = 2828626;
        emp.hub = "Airmoldova & FlyOne";
        emp.web = "airport.md";
        System.out.print(emp.name);
        System.out.print(emp.code);
        System.out.print(emp.sity);
        System.out.print(emp.open);
        System.out.print(" Statistics 2018: ");
        System.out.print(emp.passengers);
        System.out.print(" Passengers ");
        System.out.print(emp.hub);
        System.out.print(emp.web);
        emp.air();
        
        
    }
}
