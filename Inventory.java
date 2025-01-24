import java.util.ArrayList;
public class Inventory{
  private ArrayList<Item> items;

  public void addItem(Item item){
    items.add(item);
  }
  public Item findItem(String itemID){
    for (int i=0;i<items.size();i++){
      Item itemstack=items.get(i);
      
    }
  }
}
