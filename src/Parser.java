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
	

}
