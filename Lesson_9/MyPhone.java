public class MyPhone {
    
    public void name(String denumire){
        
        System.out.println(denumire);
        
    }
    
    public void chip(String phone){
        
        System.out.println("Procesorul: " + phone);
    }
    
    public void storage(int num){
        
        System.out.println("Memoria: " + num + " GB");
    }
    
    
    public static void main(String[] args) {
        
        MyPhone emp = new MyPhone();
        emp.name("iPhone 7");
        emp.chip("A10 Fusion chip");
        emp.storage(128);
   
        
        
    }
}
