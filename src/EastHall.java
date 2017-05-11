import java.util.*;

public class EastHall implements Room {

	private String name;
	private Map<String, Item> itemMap;
	private String description;


	public EastHall() {
		name = "East Hallway";
		description = "You are standing in the East Hallway. There is a door to the North, a door to the South, and "
				+ "what appears to be a large pile of stuff overflowing from Sam's office that is "
				+ "blocking the path to the East.";
	}

	public void waitH() {
		System.out.println("You stand in the East Hall for a while. Nothing happens.");
	}

	public void pickUp(Inventory stash, String item) {
		if(stash.getAllItems().get(item).inventory) {
			stash.getAllItems().put(item, itemMap.get(item));
			System.out.println("Taken.");
		}
	}

	public void useItem(Inventory stash, String item) {
		if(!stash.getAllItems().containsKey(item)) {
			System.out.println("You do not have" + item);
		} else {
			// what'll happen if you use itemX
		}
	}

	public void look(Inventory stash, String obj) {

	}

	public void attack(String obj) {

	}

	public void talk(String obj) {

	}

	public void go(String direction) {
	}
}

