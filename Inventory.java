
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
      //what is this Nn
      //i genuinely don't know what this does
      //Well Like. IT's more. Idk what Itemstack is.
      //Well no it's more like Why
      //Dw I Lg
      //shut nn lg me 
      /**
      for (int i=0;i<items.size();i++){
        Item itemstack=items.get(i);
        itemstack.displayItemDetails();
      }
      */
      if (items.isEmpty()){
        System.out.println("YOU GOT NOTHING NN");
      }else{
        for (Item item:items){
          item.displayItemDetails();
        }
      }
  }
}

