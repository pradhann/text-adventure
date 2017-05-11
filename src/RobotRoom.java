import java.util.*;

public class RobotRoom implements Room {
	private String name;
	private String description;
	private final Map<String, Item> itemMap;

	public RobotRoom (String name) {
		this.name = name;
		this.description = "You are in a CS classroom. You can see a logged in computer,"
				+ " but there is a scribbler robot blocking access to the computer.";
		this.itemMap = new HashMap<String, Item>();
		this.addAllItems();
	}
	
	private void addAllItems() {
		Item item1 = new Item("Scribbler Robot", "A scribbler robot used by the 161 students.", false, false);
		Item item2 = new Item("Computer", "A lab computer.", false, false);
		itemMap.put(item1.getName(), item1);
		itemMap.put(item2.getName(), item2);
	}


	public void waitH() {
		System.out.println("You stand in the classroom for a while. You hear scribbler robot beeps, "
				+ "otherwise nothing happens.");
	}

	public void pickUp(Inventory stash, String item) {
		if (itemMap.containsKey(item)) {
			if(item.equalsIgnoreCase("robot")) {
				System.out.println("Don't pick that thing up, it's evil!");
			} else {
				System.out.println("You can't pick that up");
			} 
		} else {
			System.out.println(item + " is not in the room");

		}
	}

	public void useItem(Inventory stash, String item) {
		if (item.equalsIgnoreCase("computer")) {
			System.out.println("You use the computer to print off a message to get PM's attention.");
		} else if(!stash.getAllItems().containsKey(item)) {
			System.out.println("You do not have" + item);
		} else if (stash.getAllItems().get(item).usable) {
			System.out.println("You can't use that here.");
		} else {
			System.out.println("You can't use " + item + "!");

		}
	}


	public void attack(String obj) {
		if (obj.equalsIgnoreCase("robot")) {
			System.out.println("You swipe at the scribbler robot blocking your path,"
					+ "knocking it out of the way. Take that, evil robot!");
		} else if (obj.equalsIgnoreCase("computer")) {
			System.out.println("What is this, Office Space? You would have to pay for "
					+ "that if you broke it.");
		} else {
			System.out.println("Stop attacking things that aren't here!");
		}
	}


		public void look(Inventory stash, String obj) {
			 if (itemMap.containsKey(obj)) {
				System.out.println(itemMap.get(obj).getDescription());
			 } else if (stash.getAllItems().containsKey(obj)) {
				 System.out.println(stash.getAllItems().get(obj).getDescription());
			} else {
				System.out.println("Look at what now?");
			}
		}
		
		public void talk(String obj) {
			System.out.println("There is no one to talk to.");
		}
		
		public String getDescription () {
			return description;
		}
}
