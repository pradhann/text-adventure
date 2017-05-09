import java.util.ArrayList;

public class RobotRoom {
	private String name;
	private String description;

	public RobotRoom (String name) {
		this.name = name;
		this.description = "write description here";
	}


	public void waitH() {
		System.out.println("what happens after wait...");
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
	
	




}
