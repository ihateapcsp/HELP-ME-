
import java.util.ArrayList;
public class Inventory{
  private ArrayList<Item> items;

  public Inventory(){
      this.items = new ArrayList<>();
  }
  public void addItem(Item item){
    items.add(item);
  }
  public Item findItem(String findItemID) {
      for (int i = 0; i < items.size(); i++) {
          Item itemstack = items.get(i);
          if (itemstack.itemID.equals(findItemID)) {
              return itemstack;
          }
      }
      return null; 
  }
  public void displayAllItems(){
    for (int i=0;i<items.size();i++){
      Item itemstack=items.get(i);
      itemstack.displayItemDetails();
    }
  }
}
