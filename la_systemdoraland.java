import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class la_systemdoraland {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 2 1 2 3 4 we're swaying on horse back");
            System.out.println("1. Add an Item");
            System.out.println("2. Add Stock");
            System.out.println("3. Remove Stock");
            System.out.println("4. View All Items");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: //add item
                    System.out.print("Enter item ID: ");
                    String itemID = scanner.nextLine();
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter initial quantity: ");
                    int quantity = scanner.nextInt();
                    inventory.addItem(new Item(itemID, name, quantity));
                    System.out.println("Item added successfully.");
                    break;
                    
                case 2: //add stock
                    System.out.print("Enter item ID: ");
                    itemID = scanner.nextLine();
                    System.out.print("Enter quantity to add: ");
                    quantity = scanner.nextInt();
                    Item addItem = inventory.findItem(itemID);
                    if (addItem != null){
                        addItem.addStock(quantity);
                        System.out.println("Added Item sucessfully!");
                    } else{
                        System.out.println("Item Not Found! Try: Rechecking your itemID");
                        
                    }
                    break;
                
                case 3: //remove stock
                    System.out.print("Enter item ID: ");
                    itemID = scanner.nextLine();
                    System.out.print("Enter quantity to remove: ");
                    quantity = scanner.nextInt();
                    Item removeItem = inventory.findItem(itemID);
                    if (removeItem != null){
                        removeItem.removeStock(quantity);
                    } else{
                        System.out.println("Item Not Found! Try: Rechecking your itemID");
                    }
                    break;
                    
                case 4: //view all items
                    inventory.displayAllItems();
                    break;
                    
                case 5: //exit
                    return;
                    
                default: //defaults to exiting the program
                    return;
                
                case 6: //THE HIDDEN
                while (true) {
                    System.out.println("\nThe Ruina... THe Ruina... The RUina..");
                    System.out.println("1. View Combat Pages");
                    System.out.println("2. View Key Pages");
                    System.out.println("3. Leave");
                    System.out.print("Enter your choice: ");
                
                    int libraryChoice = scanner.nextInt();
                    scanner.nextLine(); 
                
                    switch (libraryChoice) {
                            case 1: // View combat pages
                            System.out.println("\nAvailable Combat Pages:");
                            break;
                
                        case 2: // View key pages
                            System.out.println("\nAvailable Key Pages:");
                            break;
                    
                        case 3: // completely exit the program
                            System.out.println("Bro why get booked...");
                            return;
                
                        default:
                            System.out.println("NN?");
                            break;
                    }                        
                }
            }
        }
    }
}
