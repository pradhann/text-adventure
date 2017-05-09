import java.util.*;

public abstract class Room {

	private String name;
	private ArrayList<Item> items;
	private String description;
	private final Map<String, Room> possibleDirections = new HashMap<String, Room>();

	public Room (String name) {
		this.name = name;
	}

	public abstract void setDescription(String dep);

	public String getDescription() {
		return this.description;
	}

	public String getName() {
		return name;
	}

	public void addItem (Item item) {
		this.items.add(item);
	}
	
	 public void deleteItem(Item item) {
	        this.items.remove(item);
	    }

	public ArrayList<Item> getItems() {
		return this.items;
	}
}
