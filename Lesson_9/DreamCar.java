public class DreamCar {
    
    // nume, model, specificatia, culoarea
    
    String name;
    String model;
    String fuel;
    String color;
    int power;
    
    public void car(){
        
        System.out.println("THE SUV BUILT FOR CITY LIFE");
    }
    
    public static void main(String[] args){
       
        DreamCar emp = new DreamCar();
        emp.name = "Volvo ";
        emp.model = "XC40";
        emp.fuel = " Petrol ";
        emp.color = "Black";
        emp.power = 190;
        System.out.print(emp.name);
        System.out.print("Model: ");
        System.out.print(emp.model);
        System.out.print(" Tipul de combustibil: ");
        System.out.print(emp.fuel);
        System.out.print(" Culoarea: ");
        System.out.print(emp.color);
        System.out.print(" Caii Putere: ");
        System.out.print(emp.power);
        System.out.print(" Hp ");
        emp.car();
        
        
    }
}
