import java.util.*;

public class Parser {
	
	private Scanner scan;
	private String[] words;
	
	public Parser() {
		scan = new Scanner(System.in);
		words = new String[2];
	}
	
	public void parseWords() {
		words =  scan.nextLine().split(" ", 2);		
	}
	
	public String getCommand() {
		return words[0].toLowerCase();
	}
	
	public String getItem() {
		return words[1].toLowerCase();
	}
}
