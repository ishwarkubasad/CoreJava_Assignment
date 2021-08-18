package Activity_Comparable;


import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DisplayTeamMain_3
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        Map<String, Team_3> map = new TreeMap<>();

        for (int i = 0; i < size; i++) {
            String input = sc.nextLine();
            String splitAr[] = input.split("\\|");
            if (map.containsKey(splitAr[0])) {
                Team_3 getTeam = map.get(splitAr[0]);
                getTeam.addPlayer(splitAr[1]);
            } else {
                Team_3 t2 = new Team_3(splitAr[0]);
                t2.addPlayer(splitAr[1]);
                map.put(splitAr[0], t2);
            }
        }
        for (Map.Entry<String, Team_3> entry : map.entrySet()) 
        {
            System.out.println(entry.getKey());
            Collections.sort(entry.getValue().playerList);
            for (int i = 0; i < entry.getValue().playerList.size(); i++) {
                System.out.println("--" + entry.getValue().playerList.get(i));
            }
        }
        sc.close();
    }

}