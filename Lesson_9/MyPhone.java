public class MyPhone {
    
    //obiect, capacitate, functii
    
    String name;
    String processor;
    float display;
    String camera;
    int storage;
    
    // text
    
    public void phone() {
        
        System.out.println("This is iPhone 7");
        
    }
    
    public static void main(String[] args) {
        
        MyPhone emp = new MyPhone();
        emp.name = "iPhone 7 ";
        emp.processor = "A10 Fusion chip ";
        emp.display = 4.7F;
        emp.camera = "12MP camera ";
        emp.storage = 128;
        System.out.print(emp.name);
        System.out.print(emp.processor);
        System.out.print(emp.display);
        System.out.print(" inch (diagonal) widescreen LCD ");
        System.out.print(emp.camera);
        System.out.print(emp.storage);
        System.out.println(" GB");
        emp.phone();
        
        
    }
}
