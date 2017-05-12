import java.util.*;

public class RobotRoom implements Room {
	private String name;
	private String description;
	private final Map<String, Item> itemMap;
	private static boolean locked;

	public RobotRoom () {
		this.name = "Robot Classroom";
		this.itemMap = new HashMap<String, Item>();
		this.addAllItems();
		this.description = generateDescription();
		locked = true;
	}
	
	public String generateDescription() {
		String ret = "You are in a CS classroom. \nYou can see a logged in computer";
		if(itemMap.containsKey("robot")) {
			ret = ret + ", but there is a scribbler robot blocking access to the computer.";
		} else {
			ret = ret + ".";
		}		
		return ret;
	}
	
	public boolean getLocked() { return locked; }
	
	public static void unlock() { locked = false; }
	
	private void addAllItems() {
		Item item1 = new Item("roobt", "A scribbler robot used by the 161 students.", false, false);
		Item item2 = new Item("computer", "A lab computer.", false, false);
		itemMap.put("robot", item1);
		itemMap.put("computer", item2);
	}


	public void waitH() {
		System.out.println("You stand in the classroom for a while. A scribbler robot sings a didly.");
	}

	public void pickUp(Inventory stash, String item) {
		if (itemMap.containsKey(item)) {
			if(item.equalsIgnoreCase("robot")) {
				System.out.println("Don't pick that thing up, it's evil!");
			} else {
				System.out.println("You can't pick that up.");
			} 
		} else {
			System.out.println(item + " is not in the room.");

		}
	}

	public void useItem(Inventory stash, String item) {
		if (item.equalsIgnoreCase("computer")) {
			if(itemMap.get(item).usable) {
			System.out.println("You use the computer to send a message to the printer.");
			stash.getAllItems().get("pcard").usable = true;
			} else {
				System.out.println("The robot is in the way!");
			}
		} else if(!stash.getAllItems().containsKey(item)) {
			System.out.println("You do not have " + item + ".");
		} else if (stash.getAllItems().get(item).usable) {
			System.out.println("You can't use that here.");
		} else {
			System.out.println("You can't use " + item + "!");

		}
	}


	public void attack(String obj) {
		if (obj.equalsIgnoreCase("robot")) {
			System.out.println("You swipe at the scribbler robot blocking your path, "
					+ "knocking it out of the way. Take that, robo scum!");
			itemMap.remove("robot");
			itemMap.get("computer").usable = true;
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
			return generateDescription();
		}
}
