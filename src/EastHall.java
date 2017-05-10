import java.util.*;

public class EastHall {
	
	private String name;
	private ArrayList<Item> itemInRoom;
	private String description;
	private final Map<String, Room> possibleDirections = new HashMap<String, Room>();
	
	public EastHall() {
		name = "East Hallway";
		description = "You are standing in the East Hallway. There is a door to the North, a door to the South, and "
				+ "what appears to be a large pile of stuff overflowing from Sam's office that is "
				+ "blocking the path to the East.";
	}
	
	public void waitH() {
		System.out.println("You stand in the CS commons for a while. Nothing happens.");
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
	
	public void go(String direction) {
		if(!possibleDirections.containsKey(direction)) {
			System.out.println("You can't go that way.");
		} else {
			// go that direction
		}
	}
}
