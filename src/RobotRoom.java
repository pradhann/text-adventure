import java.util.ArrayList;

public class RobotRoom {
	private String name;
	private String description;

	public RobotRoom (String name) {
		this.name = name;
		this.description = "You are in a CS classroom. You can see a logged in computer,"
				+ " but there is a scribbler robot blocking access to the computer.";
	}


	public void waitH() {
		System.out.println("You stand in the classroom for a while. You hear scribbler robot beeps, "
				+ "otherwise nothing happens.");
	}

	public void pickup(Inventory stash, Item itemX) {
		System.out.println(itemX.getName() + " is not in the room");
	}

	public void useItem(Inventory stash, Item itemX) {
		if(!stash.contains(itemX)) {
			System.out.println("You do not have" + itemX.getName());
		} else {
			// what'll happen if you use itemX
		}
	}
	
	public void attack(String obj) {
		if (obj.equalsIgnoreCase("robot")) {
			System.out.println("You swipe at the scribbler robot blocking your path,"
					+ "knocking it out of the way. Take that, evil robot!");
		}
	}
	
	




}
