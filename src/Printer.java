import java.util.*;

public class Printer {

	private String name;
	private Map<String, Item> itemMap;
	private String description;

	public Printer (String name) {
		this.name = name;
		this.description = "You are now in a room that has the printer.";
		this.itemMap = new HashMap<String, Item>();
	}
	
	public void addAllItems() {
		Item item1 = new Item("Printer", "The CS floor printer.", false, false);
		itemMap.put(item1.getName(), item1);
	}


	public void waitH() {
		System.out.println("You wait by the printer for a while. Nothing happens.");
	}

	public void pickup(Inventory stash, Item itemX) {
		if(itemX.inventory) {
		stash.addItem(itemX);
		System.out.println(itemX.getName() + " has been added to your inventory.");
		} else {
			System.out.println("You can't take " + itemX.getName() + "!");
		}
	}

	public void useItem(Inventory stash, String item) {
		if(!stash.getAllItems().containsKey(item)) {
			System.out.println("You do not have" + item);
		} else {
			// what'll happen if you use itemX
		}
	}
	
	public void look(String obj) {
		if(obj.equalsIgnoreCase("printer")) {
			System.out.println("Descibe printer...");
		} 
	}
		
	public void attack(String obj) {
		if(obj.equalsIgnoreCase("printer")) {
			System.out.println("What is this, Office Space?");
		}
	}
	
	public void talk(String obj) {
		
	}

//	public void go(String direction) {
//		if(!possibleDirections.containsKey(direction)) {
//			System.out.println("You can't go that way.");
//		} else {
//			// go that direction
//		}
//	}

}
