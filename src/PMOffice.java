import java.util.*;

  public class PMOffice {
	private String name;
	private ArrayList<Item> itemInRoom;
	private String description;
	private final Map<String, Room> possibleDirections = new HashMap<String, Room>();

	public PMOffice (String name) {
		this.name = name;
		this.description = "write description here";
		this.itemInRoom = new ArrayList<Item>();
	}

	public void addAllItems () {
		Item item1 = new Item("Tennis Ball", "Just a regular old tennis ball.", true, true);
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
		System.out.println("PM says \'fuck Java.\'");
}
	
	public void look() {
		System.out.println("PM is flustered");
	}
	
	public void attack(String obj) {
		if (obj.equalsIgnoreCase("PM")) {
		System.out.println("I don't think you want to do that. PM knows Jiu-Jitsu!");
		}
	}
	
	public void go(String direction) {
		if(!possibleDirections.containsKey(direction)) {
			System.out.println("You can't go that way.");
		} else {
			// go that direction
		}
	}

	
}
