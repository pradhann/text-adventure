import java.util.*;

public class Printer implements Room {

	private String name;
	private Map<String, Item> itemMap;
	private String description;
	private boolean locked;

	public Printer () {
		this.name = "Printer Room";
		this.description = "You are now in a room that has the printer. \nThere is a door to the North.";
		this.itemMap = new HashMap<String, Item>();
		this.addAllItems();
		locked = false;
	}
	
	public boolean getLocked() { return locked; }

	private void addAllItems() {
		Item item1 = new Item("Printer", "The CS floor printer.", false, false);
		itemMap.put(item1.getName(), item1);
	}


	public void waitH() {
		System.out.println("You wait by the printer for a while. Nothing happens.");
	}

	public void pickUp(Inventory stash, String item) {
		if(itemMap.containsKey(item)) {
			if(itemMap.get(item).inventory) {
				stash.getAllItems().put(item, itemMap.get(item));
				System.out.println("Taken.");
			} else {
				System.out.println(item + " cannot be taken");
			}
		} else {
		 System.out.println(item + " is not in the room!");
		}
	}

	public void useItem(Inventory stash, String item) {
		if (item.equalsIgnoreCase("printer")) {
			System.out.println("Swipe your pcard to print your job.");
		} else if(!stash.getAllItems().containsKey(item)) {
			System.out.println("You do not have " + item);
		} else if (item.equalsIgnoreCase("pcard")) {
			if (stash.getAllItems().get(item).usable) {
				Item paper = new Item("message", "A message to get PM's attention."
						+ " It reads...", true, true);
				itemMap.put("message", paper);
				System.out.println("The printer prints the message you created.");
			} else {
				System.out.println("There are no jobs to print.");
			}
		} else {
			System.out.println("You can't use that here.");
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
