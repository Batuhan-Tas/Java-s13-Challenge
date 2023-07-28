package employeeApp;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private int password;
    private String[] healthplans;

    public Employee(int id, String fullName, String email, int password, String[] healthplans){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void addHealthplan(int index, String name){
        try{if(healthplans[index]==null){
            this.healthplans[index] = name;
        } else{
            System.out.println("This location is already assigned");
        }} catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("No such index " + index);
        }


    }

    public String toString(){
        return "Employee Id: " + id + " - fullName: " + fullName + " - Healthplans: " + Arrays.toString(healthplans);
    }




}
