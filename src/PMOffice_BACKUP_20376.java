import java.util.ArrayList;

public class PMOffice {
	private String name;
	private ArrayList<Item> itemInRoom;
	private String description;

	public PMOffice (String name) {
		this.name = name;
		this.description = "write description here";
		this.itemInRoom = new ArrayList<Item>();
	}

	public void addAllItems () {
<<<<<<< HEAD
		Item item1 = new Item("Ball", "descp");
=======
		Item item1 = new Item("Tennis Ball", "Just a regular old tennis ball.", true);
>>>>>>> 8774f0b7f9a134508e06ee13a9525eb0480d0a09
		itemInRoom.add(item1);

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
<<<<<<< HEAD
		System.out.println("PM says....");
	}

	public void look(String obj) {
		if(obj.equalsIgnoreCase("PM")) {
			System.out.println("PM is flustered");
		} else if (obj.equalsIgnoreCase("ball")) {
			System.out.println("Might be helpful to get rid of Oliver");
		} else {
			System.out.println(obj + " is not in the room");
		}
=======
		System.out.println("PM says \'fuck Java.\'");
}
	
	public void look() {
		System.out.println("PM is flustered");
>>>>>>> 8774f0b7f9a134508e06ee13a9525eb0480d0a09
	}
	
	public void attack(String obj) {
		if (obj.equalsIgnoreCase("PM")) {
		System.out.println("I don't think you want to do that. PM knows Jiu-Jitsu!");
		}
	}
	
}











