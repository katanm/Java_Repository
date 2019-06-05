public class Organization {
    
    public void ong(String name){
        
        System.out.println(name);
    }
    
    public void justice(String slogan){
        
        System.out.println(slogan);
        
    }
    public void employee(int num){
        
        System.out.println("Numarul de angajati: " + num);
        
    }
    
    public static void main(String[] args){
        
        Organization emp = new Organization();
        emp.ong("Lex-Office");
        emp.justice("Justice is the last refuge of the weakness");
        emp.employee(22);
    }
}
