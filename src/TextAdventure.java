
public class TextAdventure {

	public static void main(String[] args) throws InterruptedException {

		Game game = new Game();
		Parser parser = new Parser();
		boolean oliver = true;

		System.out.println("Welcome!....");
		System.out.println(game.getCurRoom().getDescription());

		while(!(game.getCurRoom() instanceof Exit)) {
			parser.parseWords();
			switch(parser.getCommand()) {
			case "wait" : 
				game.waitH();
				break;

			case "inventory" : 
				game.printInventory();
				break;

			case "go" :
				String direction = parser.getItem();
				if(direction != null) {
					if(direction.equals("north")) {
						game.goNorth();
					} else if (direction.equals("south")) {
						game.goSouth();
					} else if (direction.equals("east")) {
						game.goEast();
					} else if (direction.equals("west")) {
						game.goWest();
					}
				} else {
					System.out.println("go where? ");
				}
				break;

			case "attack" :
				if(parser.getItem() == null) {
					System.out.println("Attack what?");
				} else {
					game.attack(parser.getItem());
				}
				break;

			case "look" :
				if(parser.getItem() == null) {
					System.out.println("And what should I look at?");
				} else {
					game.look(parser.getItem());
				}
				break;

			case "talk" :
				if(parser.getItem() == null) {
					System.out.println("I talk to myself all the time... Who should I talk with now?");
				}
				game.talk(parser.getItem());
				break;

			case "pick" :
				if(parser.getItem() == null) {
					System.out.println("pick? pick what? You should definitely pick your game up!");
				} else {
					game.pickUp(parser.getItem());
				}
				break;

			case "take" :
				if(parser.getItem() == null) {
					System.out.println("Please be more specific. What should I take?");
				} else {
					game.pickUp(parser.getItem());
				}
				break;

			case "use" :
				if(parser.getItem() == null) {
					System.out.println("Use what?");
				} else {
					game.useItem(parser.getItem());
				}
				break;

			default:
				System.out.println("I don't recognize that command.");
				break;
			}
		}

		System.out.println("Congratulations! You made it out of Noyce 3rd! \nThanks for playing!");
	}
}
