import java.util.*;

public class Inventory {

	private Map<String, Item> allItems;

	public Inventory() {
		this.allItems = new HashMap<String, Item>();
	}

	public void addItem(Item item1) {
		this.allItems.put(item1.getName(), item1);
	}

	public void removeItem(String item1) {
		this.allItems.remove(item1);
	}
	
	public boolean contains(Item itemX) {
		return allItems.containsKey(itemX.getName());
	}
	
	public Map<String, Item> getAllItems() {
		return allItems;
	}
	
	public void printInventory() {
		//TODO
	}
}
