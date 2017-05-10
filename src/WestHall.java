import java.util.*;

public class WestHall {
	private String name;
	private Map<String, Item> itemMap;
	private String description;

	
	public WestHall() {
		name = "West Hallway";
		description = "You are standing in the West Hallway. There is a door to the South and the hallway continues"
				+ " to the East. PM's office is to the North. Oliver the dog is blocking the West exit.";
	}
	
	public void addAllItems() {
		Item item1 = new Item("Oliver", "The cutest dog on the CS floor.", false, false);
		itemMap.put(item1.getName(), item1);
	}
	
	public void waitH() {
		System.out.println("You stand in the West Hall for a while. Nothing happens.");
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

	public void look(String obj) {
		
	}
	
	public void attack(String obj) {
		
	}
	
	public void talk(String obj) {
		
	}
	
//	public void go(String direction) {
//		if(!possibleDirections.containsKey(direction)) {
//			System.out.println("You can't go that way.");
//		} else {
//			// go that direction
//		}
//	}

}
