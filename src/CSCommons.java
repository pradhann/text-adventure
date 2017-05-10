import java.util.ArrayList;

public class CSCommons {

	private String name;
	private ArrayList<Item> itemInRoom;
	private String description;
	
	public CSCommons (String name) {
		this.name = name;
		this.description = "write description here";
		this.itemInRoom = new ArrayList<Item>();
	}
	
	public void addAllItems () {
		Item item1 = new Item("Laptop", "Your laptop.", true);
		Item item2 = new Item("pcard", "Your Pioneer One card.", true);
		Item item3 = new Item("LaptopCharger", "Your laptop charger.", true);
		itemInRoom.add(item1);
		itemInRoom.add(item2);
		itemInRoom.add(item3);
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

	
}

