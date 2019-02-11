public class Snack {

    private static int maxId = 0;
    private int    id;
    private String name;
    private int quantity;
    private int    cost;
    private String vendingMachineId;

    public Snack(String name, int quantity, int cost, String vendingMachineId) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

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

    public int getCost() {
        return cost * quantity;
    }


}
