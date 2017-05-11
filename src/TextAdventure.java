
public class TextAdventure {

	public static void main(String[] args) throws InterruptedException {

		Game game = new Game();
		Parser parser = new Parser();
		boolean oliver = true;

		System.out.println("Welcome!....");
		System.out.println(game.getCurRoom().getDescription());

		while(oliver) {
			parser.parseWords();
			switch(parser.getCommand()) {
			case "wait" : 
				game.waitH();
				break;

			case "go" :
				String direction = parser.getItem();
				if(direction.equals("north")) {
					game.goNorth();
				} else if (direction.equals("south")) {
					game.goSouth();
				} else if (direction.equals("east")) {
					game.goEast();
				} else if (direction.equals("west")) {
					game.goWest();
				}
				break;

			case "attack" :
				game.attack(parser.getItem());
				break;

			case "look " :
				game.look(parser.getItem());
				break;

			case "talk" :
				game.talk(parser.getItem());
				break;

			case "pick" :
				game.pickUp(parser.getItem());
				break;

			case "take" :
				game.pickUp(parser.getItem());
				break;

			case "use" :
				game.useItem(parser.getItem());
				break;

			default:
				System.out.println("Please enter a valid command");
				break;
			}
		}
	}
}
