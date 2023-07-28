package employeeApp;

public enum Plan {
    PLAN1("Eco Plan",250),
    PLAN2("Classic Plan",500),
    PLAN3("Full Coverage",1000);

    private String name;
    private int price;

    Plan(String name, int price){
        this.name = name;
        this.price = price;

    }

    public String getName(){
        return name;
    }

    public int getPrice() {
        return price;
    }
}
