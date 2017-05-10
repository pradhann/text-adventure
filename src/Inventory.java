import java.util.*;

public class Inventory {

	private ArrayList<Item> allItems;

	public Inventory() {
		this.allItems = new ArrayList<>();
	}

	public void addItem(Item item1) {
		this.allItems.add(item1);
	}

	public void removeItem(String item1) {
		this.allItems.remove(item1);
	}
	
	public boolean contains(Item itemX) {
		return allItems.contains(itemX);
	}
	
	public void printInventory() {
		for (int i = 0; i < allItems.size(); i++) {
			System.out.println(allItems.get(i).getName());
		}
	}
}
