
/**
 * may you find your book in this place
 */


public class Item
{
    public String itemID;
    public String name;
    public int quantity;

    public Item(String itemID, String name, int quantity)
    {
        this.itemID = itemID;
        this.name = name;
        this.quantity = quantity;
    }

    public void addStock(int amount) {
        quantity += amount;
    }
    
    public boolean removeStock(int amount) {
        if (amount <= 0) {
            System.out.println("There is literally a remove command, No Name.");
            return false;
        }
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println(amount + " items removed. New stock: " + quantity);
            return true;
        } else {
            System.out.println("Insufficient ITEMS IN STOCK. Available: " + quantity);
            return false;
        }
    }

    public void displayItemDetails() {
        System.out.println("ID: " + itemID);
        System.out.println("Name: " + name);
        System.out.println("Amount: " + quantity);
    }
}
