
public class Item {

	private final String name;
	private final String description;
	public boolean inventory;
	public boolean usable;


	public Item(String name, String description, boolean inventory, boolean usable) {
		this.description = description;
		this.name = name;
		this.inventory = inventory;
		this.usable = usable;
	}
	
	public String getDescription(){
		return description;
	}

	public String getName() {
		return name;
	}
}
