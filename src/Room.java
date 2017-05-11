
public interface Room {
	
	public void waitH();
	public void talk(String toWho);
	public void pickUp(Inventory stash, String item);
	public void useItem(Inventory stash, String item);
	public void attack(String object);
	public void look(Inventory stash, String object);
	public String getDescription();
}
