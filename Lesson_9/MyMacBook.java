public class MyMacBook {

    public void name(String denumire){
        
        System.out.println(denumire);
        
    }
    
    public void laptop(String putere){
        
        System.out.println("Procesorul: " + putere);
    }
    
    public void memory(int num){
        
        System.out.println("Memoria operativa: " + num + "GB");
    }
    
    
    public static void main(String[] args) {
        
        MyMacBook emp = new MyMacBook();
        emp.name("MacBook Pro");
        emp.laptop("3.1 GHz Intel Core i7");
        emp.memory(16);
        
        
    }
    

}
