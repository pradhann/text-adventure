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
		for(int i = 0; i < 2; i++) {
			words[i] = temp[i];
		}
	}

	public String getCommand() {
		return words[0].toLowerCase();
	}

	public String getItem() {
		return words[1].toLowerCase();
	}
}
