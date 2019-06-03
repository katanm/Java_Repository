public class MyMacBook {

    //obiect, capacitate, functii

    String name;
    String processor;
    String memory;
    int storage;
    
    // text
    
    public void description() {
        
        System.out.println("More power. More performance. More pro.");
        
    }
    
    public static void main(String[] args) {
        
        MyMacBook emp = new MyMacBook();
        emp.name = "MacBook Pro ";
        emp.processor = "3.1 GHz Intel Core i7 ";
        emp.memory = "512GB SSD ";
        emp.storage = 16;
        System.out.print(emp.name);
        System.out.print(emp.processor);
        System.out.print(emp.memory);
        System.out.print(emp.storage);
        System.out.println(" GB");
        emp.description();
                           
        
    }
    
  
    
    

}
