public class Country {
    
    public void name(String denumire){
        
        System.out.println(denumire);
        
    }
    
    public void capital(String oras){
        
        System.out.println("Capitala este orasul: " + oras);
    }
    
    public void population(int num){
        
        System.out.println("Populatia este de " + num);
    }
    
    public void currency(String bani){
        
        System.out.println("Valuta: " + bani);
    }
    
    public static void main(String[] args){
       
        Country emp = new Country();
        emp.name("Republica Moldova");
        emp.capital("Chisinau");
        emp.population(3350900);
        emp.currency("Leu/MDL");
    
        
    }
}
