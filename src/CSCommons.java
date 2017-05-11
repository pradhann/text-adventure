import java.util.*;

public class CSCommons implements Room {

	private String name;
	private Map<String,Item> itemMap;
	private String description;

	public CSCommons (String name) {
		this.name = name;
		this.description = "You are in the CS commons. On the table you see your laptop, your pcard,"
				+ "and your laptop charger. There is a door to the South.";
		this.itemMap = new HashMap<String, Item>();
		addAllItems();
	}

	public void addAllItems () {

		Item item1 = new Item("laptop", "Your laptop.", true, false);
		Item item2 = new Item("pcard", "Your Pioneer One card.", true, true);
		Item item3 = new Item("charger", "Your laptop charger.", true, true);
		itemMap.put("laptop",item1);
		itemMap.put("pcard",item2);
		itemMap.put("charger",item3);


	}

	public void waitH() {
		System.out.println("You stand in the CS commons for a while. Nothing happens.");
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
		if (item.equalsIgnoreCase("laptop")) {
			if (itemMap.get(item).usable) {
				System.out.println("The laptop is dead");
			} else {
				System.out.println("The laptop turns on to reveal the code to unlock the classroom.");
			}
		} else if (item.equalsIgnoreCase("charger")) {
			System.out.println("You plug in your laptop.");
		} else if(!stash.getAllItems().containsKey(item)) {
			System.out.println("You do not have" + item);
		} else if (stash.getAllItems().get(item).usable) {
			System.out.println("You can't use that here.");
		} else {
			System.out.println("You can't use " + item + "!");

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

