import java.util.*;

public class Parser {

	private Scanner scan;
	private String[] words;

	public Parser() {
		scan = new Scanner(System.in);
		words = new String[2];
	}

	public void parseWords() {
		String[] temp = scan.nextLine().split(" ", 2);		
		words [0] = temp[0];	
		words[1] = null;
		if(temp.length < 2) {
			return;
		} else {
			words[1] = temp[1];
		}
	}

	public String getCommand() {
		return words[0].toLowerCase();
	}

	public String getItem() {
		if(words[1] != null) {
			return words[1].toLowerCase();
		} else {
			return null;
		}
	}
}
