import java.util.*;

public class Parser {
	
	private Scanner scan;
	private String[] words;
	
	public Parser() {
		scan = new Scanner(System.in);
		words = new String[10];
	}
	
	public void parseWords() {
		words = scan.nextLine().split(" ", 10);		
	}
	
	public void getCommand() {
		switch(words[0]) {
		case "go":
			
			break;
		case "use":
			
			break;
		case "talk":
			
			break;
		case "take":
			
			break;
		case "wait":
			
			break;
		case "attack":
			
			break;
		case "look":
			
			break;
		default:
			System.out.println("I don't recognize that command.");
			break;
		}
	}
	

}
