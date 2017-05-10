import java.util.ArrayList;

  public class PMOffice {
	private String name;
	private ArrayList<Item> itemInRoom;
	private String description;

	public PMOffice (String name) {
		this.name = name;
		this.description = "write description here";
		this.itemInRoom = new ArrayList<Item>();
	}

	public void addAllItems () {
		Item item1 = new Item("Tennis Ball", "descp");
		itemInRoom.add(item1);

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
	
	public void talk() {
		System.out.println("PM says....");
}
	
	public void look() {
		System.out.println("PM is flustered");
	}
}
