public class President {
    
    public void name(String denumire){
        
        System.out.println(denumire);
        
    }
    
    public void formation(String instituit){
        
        System.out.println("Formation: "+ instituit);
    }
    
    
    public void salary(int money){
        
        System.out.println("Salary: $" + money + " annually");
    }
    
    
    
    public static void main(String[] args) {
        
        President emp = new President();
        emp.name("President of the United States");
        emp.formation("March 4, 1789");
        emp.salary(400000);
    
        
    }
}
