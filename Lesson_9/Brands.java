public class Brands {
    
    public void name(String denumire){
        
        System.out.println(denumire);
        
    }
    
    public void founded(String aparitie){
        
        System.out.println(aparitie);
    }
    
    public void founder(String tata){
        
        System.out.println(tata);
    }
    
    public void employees(int angajati){
        
        System.out.println(angajati + " angajati");
    }
    
    public static void main(String[] args) {
        
        Brands emp = new Brands();
        emp.name("IKEA");
        emp.founded("28 July 1943");
        emp.founder("Ingvar Kamprad");
        emp.employees(208000);
        
    }
}
