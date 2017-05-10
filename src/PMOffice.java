import java.util.*;

public class PMOffice implements Room {
	private String name;
	private Map<String, Item> itemMap;
	private String description;

	public PMOffice (String name) {
		this.name = name;
		this.description = "You are standing in PM's office. PM is sitting at his computer and there is a "
				+ "ball on the table.";
		this.itemMap = new HashMap<String,Item>();
	}

	public void addAllItems () {
<<<<<<< HEAD
		Item item1 = new Item("Ball", "Just a regular old tennis ball.", true, true);
		Item item2 = new Item("PM", "Your professor, Peter-Michael Osera.", false, true);
=======
		Item item1 = new Item("Tennis Ball", "Just a regular old tennis ball.", true);
		Item item2 = new Item("PM", "Peter-Michael Osera", false);
>>>>>>> branch 'master' of https://github.com/aberthelsen/text-adventure-berthels-pradhann-1-1.git
		itemMap.put("PM", item2);
		itemMap.put("Tennis Ball", item1);
<<<<<<< HEAD
=======

>>>>>>> branch 'master' of https://github.com/aberthelsen/text-adventure-berthels-pradhann-1-1.git
	}

	public void waitH() {
		System.out.println("You stand in PM's office for a while. PM gives you a weird look.");
	}

	public void pickup(Inventory stash, Item itemX) {
		if(itemX.inventory) {
			stash.getAllItems().put(itemX.getName(), itemX);
		}
	}

	public void useItem(Inventory stash, String itemX) {
		if(!stash.getAllItems().containsKey(itemX)) {
			System.out.println("You do not have " + itemX);
		} else {
			// what'll happen if you use itemX
		}
	}

	public void talk(String obj) {
		if (obj.equalsIgnoreCase("PM")) {
		System.out.println("PM says \'Fuck Java!\'");
		} else if (obj.equalsIgnoreCase("ball")) {
			System.out.println("The ball does not respond. I'm starting to question your sanity...");
		}
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
	
//	public void go(String direction) {
//		if(!possibleDirections.containsKey(direction)) {
//			System.out.println("You can't go that way.");
//		} else {
//			// go that direction
//		}
//	}
//




		public void attack(String obj) {
			if (obj.equalsIgnoreCase("PM")) {
				System.out.println("I don't think you want to do that. PM knows Jiu-Jitsu!");
			} else if (obj.equalsIgnoreCase("ball")) {
				System.out.println("Really? Stop messing around!");
			} else {
				System.out.println("That is not in the room.");
			}
		}

	}











