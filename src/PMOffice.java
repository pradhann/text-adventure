import java.util.*;

public class PMOffice {
	private String name;
	private Map<String, Item> itemMap;
	private String description;

	public PMOffice (String name) {
		this.name = name;
		this.description = "write description here";
		this.itemMap = new HashMap<String,Item>();
	}

	public void addAllItems () {
<<<<<<< HEAD
		Item item1 = new Item("Tennis Ball", "Just a regular old tennis ball.", true);
		Item item2 = new Item("PM", "Peter-Michael Osera", false);
		itemMap.put("PM", item2);
		itemMap.put("Tennis Ball", item1);
=======
		Item item1 = new Item("Tennis Ball", "Just a regular old tennis ball.", true, true);
		itemInRoom.add(item1);
>>>>>>> a7bf5640fbc780f09d810abef0dfcc4bb83ba727

	}

	public void waitH() {
		System.out.println("You stand in PM's office for a while. PM gives you a weird look.");
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

	public void talk() {
		System.out.println("PM says \'fuck Java.\'");
	}

	public void look(String obj) {
		if(obj.equalsIgnoreCase("PM")) {
			System.out.println("PM is flustered");
		} else if (obj.equalsIgnoreCase("PM")) {
			System.out.println("The tennis ball rolls an inch closer towards you!");
		} else {
			System.out.println(obj + "is not in the room");
		}
	}


		public void attack(String obj) {
			if (obj.equalsIgnoreCase("PM")) {
				System.out.println("I don't think you want to do that. PM knows Jiu-Jitsu!");
			}
		}

	}











