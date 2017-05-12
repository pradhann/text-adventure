import java.util.*;

public class PMOffice implements Room {
	private String name;
	private Map<String, Item> itemMap;
	private String description;
	private static boolean locked;

	public PMOffice () {
		this.name = "PM's Office";
		this.itemMap = new HashMap<String,Item>();
		this.addAllItems();
		this.description = generateDescription();
		locked = true;
	}
	
	public String generateDescription() {
		String ret = "You are standing in PM's office.\nPM is sitting at his computer.";
		if(itemMap.containsKey("ball")) {
			ret = ret + " \nThere is a ball on the table.";
		}
		return ret;
	}
	
	public boolean getLocked() { return locked; }
	
	public static void unlock() { locked = false; }

	private void addAllItems () {

		Item item1 = new Item("ball", "Just a regular old tennis ball.", true, true);
		Item item2 = new Item("pm", "Your professor, Peter-Michael Osera.", false, true);

		itemMap.put("pm", item2);
		itemMap.put("ball", item1);

	}

	public void waitH() {
		System.out.println("You stand in PM's office for a while. PM gives you a weird look.");
	}

	public void pickUp(Inventory stash, String item) {
		if(itemMap.containsKey(item)) {
			if(itemMap.get(item).inventory) {
				stash.getAllItems().put(item, itemMap.get(item));
				itemMap.remove(item);
				System.out.println("Taken.");
			} else {
				System.out.println(item + " cannot be taken.");
			}
		} else {
		 System.out.println(item + " is not in the room!");
		}
	}

	public void useItem(Inventory stash, String itemX) {
		if(!stash.getAllItems().containsKey(itemX)) {
			System.out.println("You do not have " + itemX);
		} else {
			System.out.println("You can't use that here.");
		}
	}

	public void talk(String obj) {
		if (obj.equalsIgnoreCase("PM")) {
			System.out.println("PM says \'Fuck Java!\'");
		} else if (obj.equalsIgnoreCase("ball")) {
			System.out.println("The ball does not respond. I'm starting to question your sanity...");
		}
	}

	public void look(Inventory stash, String obj) {
		if(obj.equalsIgnoreCase("PM")) {
			System.out.println("PM is flustered");
		} else if (obj.equalsIgnoreCase("PM")) {
			System.out.println("The tennis ball rolls an inch closer towards you!");
		} else if (stash.getAllItems().containsKey(obj)) {
			System.out.println(stash.getAllItems().get(obj).getDescription());
		} else {
			System.out.println(obj + "is not in the room");
		}
	}

	public void attack(String obj) {
		if (obj.equalsIgnoreCase("PM")) {
			System.out.println("I don't think you want to do that. PM knows Jiu-Jitsu!");
		} else if (obj.equalsIgnoreCase("ball")) {
			System.out.println("Really? Stop messing around!");
		} else {
			System.out.println("That is not in the room.");
		}
	}
	
	public String getDescription () {
		return generateDescription();
	}
}











