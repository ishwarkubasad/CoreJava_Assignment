package Activity_Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Question_1Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the player name");
        String playerName = scanner.nextLine();
        System.out.println("Enter wickets - seperated by \"|\" symbol");
        String wickets = scanner.next();

        Map<String, List<Wicket>> hashMap = new HashMap<>();

        boolean addPlayer = true;
        while (addPlayer) {
            System.out.println("Enter the player name");
            playerName = scanner.nextLine();
            System.out.println("Enter wickets - seperated by \"|\" symbol");
            wickets = scanner.next();
            String bowlersWickets[] = wickets.split("%|%");
            for (int i = 0; i < bowlersWickets.length; i++) {
                if (hashMap.containsKey(playerName)) {

                }
            }
            System.out.println("Do you want to add another player (yes/no)");
            addPlayer = scanner.nextBoolean();
        }
    }
}
