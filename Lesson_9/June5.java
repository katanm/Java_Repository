public class June5 {
    
    public void day(String inThisDay){
        
        System.out.println("On this day: " + inThisDay);
        
    }
    
    public void country(String tara){
        
        System.out.println(tara);
    }
    
    public void national(String local){
        
        System.out.println("In Danish: " + local);
    }
    
    public void constitution(int num){
        
        System.out.println("The first constitution of " + num);
    }
    

    
    public static void main(String[] args) {
        
        June5 emp = new June5();
        emp.day("Constitution Day");
        emp.country("Denmark");
        emp.national("Grundlovsdag");
        emp.constitution(1849);
        
        
        
    }
}
