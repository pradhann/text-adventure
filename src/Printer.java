import java.util.*;

public class Printer implements Room {

	private String name;
	private Map<String, Item> itemMap;
	private String description;

	public Printer (String name) {
		this.name = name;
		this.description = "You are now in a room that has the printer.";
		this.itemMap = new HashMap<String, Item>();
		this.addAllItems();
	}

	private void addAllItems() {
		Item item1 = new Item("Printer", "The CS floor printer.", false, false);
		itemMap.put(item1.getName(), item1);
	}


	public void waitH() {
		System.out.println("You wait by the printer for a while. Nothing happens.");
	}

	public void pickUp(Inventory stash, String item) {
		if(stash.getAllItems().get(item).inventory) {
			stash.getAllItems().put(item, itemMap.get(item));
			System.out.println("Taken.");
		} else {
			System.out.println("You can't take " + item + "!");
		}
	}

	public void useItem(Inventory stash, String item) {
		if(!stash.getAllItems().containsKey(item)) {
			System.out.println("You do not have" + item);
		} else {
			if (item.equalsIgnoreCase("pcard")) {
				Item paper = new Item("Message", "A message to get PM's attention", true, true);
				itemMap.put("Message", paper);
				System.out.println("The printer prints the message you created.");
			} else {
				System.out.println("You can't use that here.");
			}
		}
	}

	public void look(Inventory stash, String obj) {
		if (itemMap.containsKey(obj)) {
			System.out.println(itemMap.get(obj).getDescription());
		} else if (stash.getAllItems().containsKey(obj)) {
			System.out.println(stash.getAllItems().get(obj).getDescription());
		} else {
			System.out.println("Look at what now?");
		}
	}

	public void attack(String obj) {
		if(obj.equalsIgnoreCase("printer")) {
			System.out.println("What is this, Office Space?");
		} else {
			System.out.println("Stop attacking things that aren't there.");
		}
	}

	public void talk(String obj) {
		System.out.println("I think you're starting to lose it...");		
	}
	
	public String getDescription () {
		return description;
	}
}
