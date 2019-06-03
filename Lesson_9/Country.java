public class Country {
    
    // capitala, limba, imnul, populatia, GDP, valuta, cod telefonic, internet
    
    String name;
    String capital;
    String language;
    int population;
    String border1;
    String border2;
    int area;
    int gdp;
    String currency;
    int phoneCode;
    String internetTLD;
    
    public void tara(){
        
        System.out.println("Republic of Moldova is a parliamentary republic with a president as head of state and a prime minister as head of government.");
    }
    
    public static void main(String[] args){
       
        Country emp = new Country();
        emp.name = "Republic of Moldova. ";
        emp.capital = "Chisinau. ";
        emp.language = "Romanian. ";
        emp.population = 3350900;
        emp.border1 = "Ukraine ";
        emp.border2 = "Romania ";
        emp.area = 33846;
        emp.gdp = 30271;
        emp.currency = "Leu (MDL)";
        emp.phoneCode = 373;
        emp.internetTLD = ".md";
        System.out.print(emp.name);
        System.out.print(emp.capital);
        System.out.print(" Oficial language: ");
        System.out.print(emp.language);
        System.out.print(" Border: ");
        System.out.print(emp.border1);
        System.out.print(" & ");
        System.out.print(emp.border2);
        System.out.print(emp.area);
        System.out.print(" km2. ");
        System.out.print("$");
        System.out.print(emp.gdp);
        System.out.print(" billion. ");
        System.out.print(emp.currency);
        System.out.print(" +");
        System.out.print(emp.phoneCode);
        System.out.print(emp.internetTLD);
        emp.tara();
        
        
    }
}
