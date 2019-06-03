public class AirCompany {
    
    // nume, codul international, locatia, flota, destinatii, web
    
    String name;
    String code;
    String hub;
    int founded;
    byte fleet;
    byte destinations;
    String web;
    
    public void air(){
        
        System.out.println("Born to fly");
    }
    
    public static void main(String[] args){
       
        AirCompany emp = new AirCompany();
        emp.name = "Air Moldova ";
        emp.code = "9U";
        emp.hub = "Chisinau International Airport ";
        emp.founded = 1993;
        emp.fleet = 8;
        emp.destinations = 32;
        emp.web = "airmoldova.md";
        System.out.print(emp.name);
        System.out.print(emp.code);
        System.out.print(emp.hub);
        System.out.print(" Anul fondarii: ");
        System.out.print(emp.founded);
        System.out.print(" Flota: ");
        System.out.print(emp.fleet);
        System.out.print(" Numarul de destinatii: ");
        System.out.print(emp.destinations);
        System.out.print(emp.web);
        emp.air();
        
        
    }
}
