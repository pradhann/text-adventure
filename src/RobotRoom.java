import java.util.*;

public class RobotRoom implements Room{
	private String name;
	private String description;
	private final Map<String, Item> itemMap;

	public RobotRoom (String name) {
		this.name = name;
		this.description = "You are in a CS classroom. You can see a logged in computer,"
				+ " but there is a scribbler robot blocking access to the computer.";
		this.itemMap = new HashMap<String, Item>();
	}
	
	public void addAllItems() {
		Item item1 = new Item("Scribbler Robot", "A scribbler robot used by the 161 students.", false, false);
		Item item2 = new Item("Computer", "A lab computer.", false, false);
		itemMap.put(item1.getName(), item1);
		itemMap.put(item2.getName(), item2);
	}


	public void waitH() {
		System.out.println("You stand in the classroom for a while. You hear scribbler robot beeps, "
				+ "otherwise nothing happens.");
	}

	public void pickup(Inventory stash, Item itemX) {
		System.out.println(itemX.getName() + " is not in the room");
	}

	public void useItem(Inventory stash, Item itemX) {
		if(itemX.usable) {
			if(!stash.contains(itemX)) {
				System.out.println("You do not have" + itemX.getName());
			} else {
				// what'll happen if you use itemX
			}
		} else {
			System.out.println("You can't use " + itemX.getName() + "!");
		}
	}

	public void attack(String obj) {
		if (obj.equalsIgnoreCase("robot")) {
			System.out.println("You swipe at the scribbler robot blocking your path,"
					+ "knocking it out of the way. Take that, evil robot!");
		}
	}

<<<<<<< HEAD
	public void look(String obj) {
=======
	
	public void look() {
>>>>>>> branch 'master' of https://github.com/aberthelsen/text-adventure-berthels-pradhann-1-1.git
		
	}
<<<<<<< HEAD
	
//	public void go(String direction) {
//		if() {
//			System.out.println("You can't go that way.");
//		} else {
//			// go that direction
//		}
//	}



=======
>>>>>>> branch 'master' of https://github.com/aberthelsen/text-adventure-berthels-pradhann-1-1.git

}
