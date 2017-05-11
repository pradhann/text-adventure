import java.util.*;

public class AllLocations {

	private Room[][] allRooms;
	private Room currentRoom;
	private Inventory myStash;
	private Map<Room, Room> goNorth;
	private Map<Room, Room> goSouth;
	private Map<Room, Room> goEast;
	private Map<Room, Room> goWest;


	public AllLocations () {
		// initializing all the rooms
		Room room1 = new CSCommons("CSCommons");
		Room room2 = new PMOffice("PMOffice");
		Room room3 = new RobotRoom("RobotRoom");
		Room room4 = new Printer("Printer");
		Room room5 = new WestHall();
		Room room6 = new EastHall();


		allRooms = new Room[1][1];
		allRooms[0][0] = room1;
		allRooms[0][1] = room2;
		allRooms[1][0] = room3;
		allRooms[1][1] = room4;

		currentRoom = room1;
		myStash = new Inventory();

		//initializing and adding all the elements in goNorth
		goNorth = new HashMap<>();
		goNorth.put(room3, room6);
		goNorth.put(room6, room1);
		goNorth.put(room4, room5);
		goNorth.put(room5, room2);

		//initializing and adding all the elements in goSouth
		goSouth = new HashMap<>();
		goSouth.put(room6, room3);
		goNorth.put(room1, room6);
		goNorth.put(room5, room4);
		goNorth.put(room2, room5);

		//initializing and adding all the elements in goEast
		goEast = new HashMap<>();
		goEast.put(room2, room1);
		goNorth.put(room5, room6);
		goNorth.put(room4, room3);

		//initializing and adding all the elements in goWest
		goWest = new HashMap<>();
		goEast.put(room1, room2);
		goNorth.put(room6, room5);
		goNorth.put(room3, room4);


	}

	public void go(String )
}
