
public class Exit implements Room {
	
	private String name;
	private String description;
	private boolean locked;
	
	public Exit() {
		name = "Exit";
		description = "...";
		locked = true;
	}
	
	public void waitH(){ return; }
	public void talk(String toWho) { return; }
	public void pickUp(Inventory stash, String item) { return; }
	public void useItem(Inventory stash, String item) { return; }
	public void attack(String object) { return; }
	public void look(Inventory stash, String object) { return; }
	public String getDescription() { return description; }

}
