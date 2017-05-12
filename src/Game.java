import java.util.*;

public class Game {

	private Room currentRoom;
	private Inventory myStash;
	private Map<Room, Room> goNorth;
	private Map<Room, Room> goSouth;
	private Map<Room, Room> goEast;
	private Map<Room, Room> goWest;


	public Game () {
		// initializing all the rooms
		Room room1 = new CSCommons();
		Room room2 = new PMOffice();
		Room room3 = new RobotRoom();
		Room room4 = new Printer();
		Room room5 = new WestHall();
		Room room6 = new EastHall();
		Room room7 = new Exit();

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
		goSouth.put(room1, room6);
		goSouth.put(room5, room4);
		goSouth.put(room2, room5);

		//initializing and adding all the elements in goEast
		goEast = new HashMap<>();
		//goEast.put(room2, room1);
		goEast.put(room5, room6);
		//goEast.put(room4, room3);

		//initializing and adding all the elements in goWest
		goWest = new HashMap<>();
		//goWest.put(room1, room2);
		goWest.put(room6, room5);
		goWest.put(room5, room7);
		//goWest.put(room3, room4);

	}

	public void waitH(){
		currentRoom.waitH();
	}

	public void pickUp(String item) {
		currentRoom.pickUp(myStash, item);
	}

	public void useItem(String item) {
		currentRoom.useItem(myStash, item);
	}

	public void attack(String obj) {
		currentRoom.attack(obj);
	}

	public void look(String obj) {
		currentRoom.look(myStash, obj);
	}

	public void talk(String obj) {
		currentRoom.talk(obj);
	}

	public void goNorth() {
		if(goNorth.containsKey(currentRoom)) {
			if(!goNorth.get(currentRoom).getLocked()) {
			currentRoom = goNorth.get(currentRoom);
			System.out.println(currentRoom.getDescription());
			} else {
				System.out.println("The door is locked.");
			}
		} else {
			System.out.println("You can't go north! ");
		}
	}

	public void goSouth() {
		if(goSouth.containsKey(currentRoom)) {
			if(!goSouth.get(currentRoom).getLocked()) {
				currentRoom = goSouth.get(currentRoom);
				System.out.println(currentRoom.getDescription());
			} else {
				System.out.println("The door is locked.");
			}
		} else {
			System.out.println("You can't go south! ");
		}
	}

	public void goEast() {
		if(goEast.containsKey(currentRoom)) {
			if (!goEast.get(currentRoom).getLocked()) {
			currentRoom = goEast.get(currentRoom);
			System.out.println(currentRoom.getDescription());
			} else {
				System.out.println("The door is locked.");
			}
		} else {
			System.out.println("You can't go east! ");
		}
	}

	public void goWest() {
		if(goWest.containsKey(currentRoom)) {
			if (!goWest.get(currentRoom).getLocked()) {
				if(goWest.get(currentRoom) instanceof Exit && (!myStash.getAllItems().containsKey("laptop") 
						|| !myStash.getAllItems().containsKey("charger"))) {
					System.out.println("Don't leave without your laptop and charger!");
				} else {
					currentRoom = goWest.get(currentRoom);
					System.out.println(currentRoom.getDescription());
				}
			} else {
				System.out.println("The door is locked.");
			}
		} else {
			System.out.println("You can't go west! ");
		}
	}

	public Room getCurRoom() {
		return currentRoom;
	}
}
