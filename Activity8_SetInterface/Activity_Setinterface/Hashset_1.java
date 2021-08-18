package Activity_Setinterface;

import java.util.*;

public class Hashset_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashSet<String> set = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < limit; i++) {
            String s = sc.nextLine();
            set.add(s);
        }
        
        System.out.println(set.size());  
    }

}
/*
 * 5 Virat Kohli MS Dhoni Rohit Sharma Virat Kohli Gautam Gambir
 */