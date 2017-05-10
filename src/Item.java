
public class Item {

	private final String name;
	private final String description;
	public boolean inventory;


	public Item(String name, String description, boolean inventory) {
		this.description = description;
		this.name = name;
		this.inventory = inventory;
	}

	public String getName() {
		return name;
	}
}
