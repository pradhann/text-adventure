import java.util.*;

public class CSCommons {

	private String name;
	private Map<String,Item> itemMap;
	private String description;
	
	public CSCommons (String name) {
		this.name = name;
		this.description = "write description here";
		this.itemMap = new HashMap<String, Item>();
	}
	
	public void addAllItems () {
<<<<<<< HEAD
		Item item1 = new Item("Laptop", "Your laptop.", true);
		Item item2 = new Item("pcard", "Your Pioneer One card.", true);
		Item item3 = new Item("LaptopCharger", "Your laptop charger.", true);
		itemMap.put("Laptop",item1);
		itemMap.put("pcard",item2);
		itemMap.put("LaptopCharger",item3);
=======
		Item item1 = new Item("Laptop", "Your laptop.", true, false);
		Item item2 = new Item("pcard", "Your Pioneer One card.", true, true);
		Item item3 = new Item("LaptopCharger", "Your laptop charger.", true, true);
		itemInRoom.add(item1);
		itemInRoom.add(item2);
		itemInRoom.add(item3);
>>>>>>> a7bf5640fbc780f09d810abef0dfcc4bb83ba727
	}
	
	public void waitH() {
		System.out.println("You stand in the CS commons for a while. Nothing happens.");
	}
	
	public void pickup(Inventory stash, Item itemX) {
		if(itemX.inventory) {
		stash.addItem(itemX);
		}
	}
	
	public void useItem(Inventory stash, Item itemX) {
		if(!stash.contains(itemX)) {
			System.out.println("You do not have" + itemX.getName());
		} else {
			// what'll happen if you use itemX
		}
	}

	public void look(String obj) {
		
	}
	
}

