public class Customer {

    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand = 0.0;

    public Customer(String name, double cashOnHand) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public void buy(double totalCash){

    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
