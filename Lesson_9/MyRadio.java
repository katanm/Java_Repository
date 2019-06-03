public class MyRadio {
    
    // nume, statia, lansat, frecventa
    
    String name;
    String tape;
    String launch;
    String target;
    float frequency;
    String web;
    
    public void radio(){
        
        System.out.println(" Eliberadio");
    }
    
    public static void main(String[] args){
       
        MyRadio emp = new MyRadio();
        emp.name = "Radio Guerrilla ";
        emp.tape = "Radio network ";
        emp.launch = "29 November 2004 ";
        emp.target = "Young middle-class people between the ages of 25 and 34 ";
        emp.frequency = 94.8f;
        emp.web = "https://www.guerrillaradio.ro";
        System.out.print(emp.name);
        System.out.print(emp.tape);
        System.out.print(" Launch date: ");
        System.out.print(emp.launch);
        System.out.print(" Target: ");
        System.out.print(emp.target);
        System.out.print(" Frequency Bucuresti: ");
        System.out.print(emp.frequency);
        System.out.print(emp.web);
        emp.radio();
        
        
    }
}
