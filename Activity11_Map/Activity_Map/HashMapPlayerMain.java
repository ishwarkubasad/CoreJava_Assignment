package Activity_Map;
import Activity_Map.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HashMapPlayerMain {
	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the bowler name");
	        String bowlerName = scanner.nextLine();
	        System.out.println("Enter wickets - seperated by \"|\" symbol");
	        String wicketCount = scanner.next();
	        
	        Map<String, List<Wicket>> hashMap = new HashMap<>();
	       

	        boolean addPlayer = true;
	        
	       
	        while (addPlayer) {
	        	
	            System.out.println("Enter the bowler name");
	            bowlerName = scanner.nextLine();
	            System.out.println("Enter wickets - seperated by \"|\" symbol");
	            wicketCount = scanner.next();
	            String bowlersWickets[] = wicketCount.split("%|%");
	            for (int i = 0; i < bowlersWickets.length; i++) {
	                if (hashMap.containsKey(bowlerName)) {

	                }
	            }
	            System.out.println("Do you want to add another player (yes/no)");
	            addPlayer = scanner.nextBoolean();
	        }
	    }
	}
