package Activity_Setinterface;
import java.util.*;

public class Hashset_2player_of_match {
	public static void main(String[] args) 
	{
    HashSet<String> set = new HashSet<String>();
    Scanner sc = new Scanner(System.in);
    int limit = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < limit; i++) {
        String s = sc.nextLine();
        set.add(s);
    }

    TreeSet<String> treeSet = new TreeSet<String>(set);

    Iterator<String> i = treeSet.iterator();
    while (i.hasNext())
    {
        System.out.println(i.next());
    }

}

}
/*
* 5 Virat Kohli MS Dhoni Rohit Sharma Virat Kohli Gautam Gambir
*/
