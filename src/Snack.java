public class Snack {

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void buy(int quantity){
        getQuantity();
    }

    public Snack(String name, int quantity, int cost, String vendingMachineId) {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public int getCost() {
        return cost * quantity;
    }

    private int    id;
    private String name;
    private int quantity;
    private int    cost;
    private String vendingMachineId;


}
