public class Organization {
    
    // nume, activitati, tipul organizatiei, misiunea, numar angajati
    
    String name;
    String activities;
    String typeOfOrganization;
    String mission;
    byte employee;
    
    public void ong(){
        
        System.out.println("Advancing democracy and human rights");
    }
    
    public static void main(String[] args){
       
        Organization emp = new Organization();
        emp.name = "Lex-Office ";
        emp.activities = "Developing democracy and human rights ";
        emp.typeOfOrganization = "Non-governmental organization ";
        emp.mission = "Promoting and defending human rights, monitoring the democratic processes, and strengthening civil society ";
        emp.employee = 22;
        System.out.print(emp.name);
        System.out.print(emp.activities);
        System.out.print(emp.typeOfOrganization);
        System.out.print(emp.mission);
        System.out.print(emp.employee);
        System.out.print(" angajati. ");
        emp.ong();
        
        
    }
}
