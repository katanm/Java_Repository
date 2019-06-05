public class Winery {
    
    public void name(String denumire){
        
        System.out.println(denumire);
        
    }
    
    public void founded(int num){
        
        System.out.println(num);
    }
    
    public void brands(String legend){
        
        System.out.println(legend);
    }
    
    
    
    public static void main(String[] args) {
        
        Winery emp = new Winery();
        emp.name("Château Purcari");
        emp.founded(1827);
        emp.brands("Purcari, Crama Ceptura, Bostavan and Bardar)");
    
        
    }
}
