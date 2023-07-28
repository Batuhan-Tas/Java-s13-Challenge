package employeeApp;

import java.util.Arrays;

public class Company {
    private String name;
    private int id;
    private double giro;
    private String[] developerNames;



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    Company(int id, String name, double giro, String[] developerNames){
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name){
        try{
            if(developerNames[index] == null){
                developerNames[index] = name;
            } else{
                System.out.println("This location is already assigned");
            }
        } catch(Exception ex){
            System.out.println("No such Index");
        }

    }
    public String toString(){
        return "Company Name: " +name + " Giro: " + giro + " Developers: " + Arrays.toString(developerNames);
    }
}
