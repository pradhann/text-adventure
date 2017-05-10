import java.util.ArrayList;

public class Printer implements Room {

	private String name;
	private ArrayList<Item> itemInRoom;
	private String description;

	public Printer (String name) {
		this.name = name;
		this.description = "You are now in a room that has the printer.";
		this.itemInRoom = new ArrayList<Item>();
	}


	public void waitH() {
		System.out.println("You wait by the printer for a while. Nothing happens.");
	}

	public void pickup(Inventory stash, Item itemX) {
		if(itemX.inventory) {
		stash.addItem(itemX);
		System.out.println(itemX.getName() + " has been added to your inventory.");
		} else {
			System.out.println("You can't take " + itemX.getName() + "!");
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
		if(obj.equalsIgnoreCase("printer")) {
			System.out.println("Descibe printer...");
		} 
	}
		
	public void attack(String obj) {
		if(obj.equalsIgnoreCase("printer")) {
			System.out.println("What is this, Office Space?");
		}
	}



}
