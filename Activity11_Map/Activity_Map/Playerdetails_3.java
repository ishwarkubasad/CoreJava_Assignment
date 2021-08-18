package Activity_Map;

import java.util.Map;
import java.util.TreeMap;

public class Playerdetails_3 {
	public static void main(String[] args) {
		   
    Map<Integer,player3> map=new TreeMap<Integer,player3>();    
     
    player3 b1=new player3(57,"Jaspirit Bumrah","Mumbai Indians","Bowler");    
    player3 b2=new player3(7,"MS Dhoni","Chennai Super Kings","Wicket Keeper");       
     
    map.put(2,b2);  
    map.put(1,b1);    
      
    //Traversing map  
    System.out.println("Player details:");
    for(Map.Entry<Integer, player3> entry:map.entrySet()){    
        int key=entry.getKey();  
        player3 b=entry.getValue();   
        System.out.println(b.id+"--"+b.name+"--"+b.team+"--"+b.skill);   
    }    
}    

}
