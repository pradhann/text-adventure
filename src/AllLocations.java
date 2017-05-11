
public class AllLocations {

	private Room[][] allRooms;
	private Room currentRoom;
	private Inventory myStash;
	
	
	public AllLocations () {
		Room room1 = new CSCommons("CSCommons");
		Room room2 = new PMOffice("PMOffice");
		Room room3 = new RobotRoom("RobotRoom");
		Room room4 = new Printer("Printer");
		
		allRooms = new Room[1][1];
		allRooms[0][0] = room1;
		allRooms[0][1] = room2;
		allRooms[1][0] = room3;
		allRooms[1][1] = room4;
		
		currentRoom = room1;
		myStash = new Inventory();
	}
	
	public void go(String direction) {
		
	}
}
