import java.util.*;

public class WestHall implements Room {
	private String name;
	private Map<String, Item> itemMap;
	private String description;
	private boolean locked;


	public WestHall() {
		name = "West Hallway";
		description = "You are standing in the West Hallway. \nThere is a door to the South and the hallway continues"
				+ " to the East. PM's office is to the North. \nOliver the dog is blocking the West exit.";
		this.addAllItems();
		locked = false;
	}
	
	public boolean getLocked() { return locked; }

	public void addAllItems() {
		itemMap = new HashMap<>();
		Item item1 = new Item("oliver", "The cutest dog on the CS floor.", false, false);
		itemMap.put("oliver", item1);
	}

	public void waitH() {
		System.out.println("You stand in the West Hall for a while. Nothing happens.");
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
		if(!stash.getAllItems().containsKey(item)) {
			System.out.println("You do not have" + item);
		} else {
			if(item.equalsIgnoreCase("message")) {
				System.out.println("You slide the message under the door to get PM's "
						+ "attention and after a few seconds you hear the door unlock");
				PMOffice.unlock();
			} else if (item.equalsIgnoreCase("ball")) {
				System.out.println("You throw the ball and Oliver goes running after it, allowing"
						+ " you to exit the third floor and head back to your dorm.");
				Exit.unlock();
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
		if (itemMap.containsKey(obj)) {
			System.out.println("Stop attacking your own things!");
		} else if (obj.equalsIgnoreCase("Oliver")) {
			System.out.println("Who would do that?! You monster!");
		} else {
			System.out.println("Stop attacking things that aren't here.");
		}		
	}

	public void talk(String obj) {
		if (obj.equalsIgnoreCase("Oliver")) {
			System.out.println("Bark! Woof!");
		} else {
			System.out.println("I'm starting to question your sanity...");
		}
	}


	public String getDescription () {
		return description;
	}
}


