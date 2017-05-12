import java.util.*;

public class EastHall implements Room {

	private String name;
	private Map<String, Item> itemMap;
	private String description;
	private boolean locked;


	public EastHall() {
		name = "East Hallway";
		description = "You are standing in the East Hallway. \nThere is a door to the North, a door to the South, and "
				+ "what appears to be a large \npile of stuff overflowing from Sam's office that is "
				+ "blocking the path to the East.";
		locked = false;
	}
	
	public boolean getLocked() { return locked; }
	
	public void addAllItems() {
		Item item = new Item("trash", "A pile of things overflowing from Sam's office.", false, false);
		itemMap.put("trash", item);
	}

	public void waitH() {
		System.out.println("You stand in the East Hall for a while. Nothing happens.");
	}

	public void pickUp(Inventory stash, String item) {
		if(itemMap.containsKey(item)) {
			if(itemMap.get(item).inventory) {
				stash.getAllItems().put(item, itemMap.get(item));
				System.out.println("Taken.");
			} else {
				System.out.println(item + " cannot be taken.");
			}
		} else {
		 System.out.println(item + " is not in the room!");
		}
	}

	public void useItem(Inventory stash, String item) {
		if(!stash.getAllItems().containsKey(item)) {
			System.out.println("You do not have" + item);
		} else {
			if (item.equalsIgnoreCase("code")) {
				System.out.println("You use the code to open the locked door.");
				// Unlock the door
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
		if (itemMap.containsKey(obj)) {
			System.out.println("Stop attacking your own things!");
		} else if (obj.equalsIgnoreCase("Pile of stuff")) {
			System.out.println("The pile doesn't budge. In fact, it appears to grow slightly"
					+ "larger... better not do that again...");
		} else {
			System.out.println("Stop attacking things that aren't here.");
		}		
	}

	public void talk(String obj) {
		System.out.println("I'm starting to question your sanity...");
	}
	
	public String getDescription () {
		return description;
	}
}

