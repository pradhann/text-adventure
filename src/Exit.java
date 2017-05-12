
public class Exit implements Room {
	
	private String name;
	private String description;
	private static boolean locked;
	
	public Exit() {
		name = "Exit";
		description = "You head down the hallway to the stairs. Free at last!";
		locked = true;
	}
	
	public boolean getLocked() { return locked; }
	
	public static void unlock() { locked = false; }
	
	public void waitH(){ return; }
	public void talk(String toWho) { return; }
	public void pickUp(Inventory stash, String item) { return; }
	public void useItem(Inventory stash, String item) { return; }
	public void attack(String object) { return; }
	public void look(Inventory stash, String object) { return; }
	public String getDescription() { return description; }

}
