public class Mail {
    
    public void name(String persoana){
        
        System.out.println(persoana);
    }
    
    public void adresa(String email){
        
        System.out.println(email);
        
    }
    public void contacts(int num){
        
        System.out.println("Numarul de contacte: " + num);
        
    }
    
    public static void main(String[] args){
        
        Mail emp = new Mail();
        emp.name("Vasile");
        emp.adresa("vasile@mail.md");
        emp.contacts(300);
    }
}
