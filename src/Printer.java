import java.util.ArrayList;

public class Printer {

	private String name;
	private ArrayList<Item> itemInRoom;
	private String description;

	public Printer (String name) {
		this.name = name;
		this.description = "write description here";
		this.itemInRoom = new ArrayList<Item>();
	}


	public void waitH() {
		System.out.println("what happens after wait...");
	}

	public void pickup(Inventory stash, Item itemX) {
		stash.addItem(itemX);
	}

	public void useItem(Inventory stash, Item itemX) {
		if(!stash.contains(itemX)) {
			System.out.println("You do not have" + itemX.getName());
		} else {
			// what'll happen if you use itemX
		}
	}
	
	public void look(String obj) {
		if(obj.equalsIgnoreCase("printer")) {
			System.out.println("Descibe printer...");
		} 


}


}
