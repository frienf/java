package SortHashMapByValues;
import java.util.*;

public class SortHashMap {
	public static void main(String args[])
	{
       HashMap<Integer,String> hm = new HashMap<Integer,String>();
       hm.put(7,"Sunday");
       hm.put(4,"Thursday");
       hm.put(2,"Tuesday");
       hm.put(5,"Friday");
       hm.put(1,"Monday");
       hm.put(6,"Saturday");
       hm.put(3,"Wednesday");
       System.out.println("Map before Sorting");
       Set st = hm.entrySet();
       Iterator it = st.iterator();
       while(it.hasNext())
       {
          Map.Entry mpen = (Map.Entry)it.next();
          System.out.println(mpen.getKey() + ":" +mpen.getValue());
       }
       Map<Integer,String> mp = sortbyValues(hm);
       system.out.println("Map After Sorting:");
       Set st1 = mp.entrySet();
       Iterator it1 = st1.iterator();
       while(it1.hasNext())
       {
       	Map.Entry mpen = (Map.entryset());
       	System.out.println(mpen1.getKey() + ":" + mpen1.getValue());
       }

	}
     public class HashMap sortbyValues(Hashmap mp)
     {
     	List lt = new LinkedList(mp.entrySet());
     	collections.sort(lt,new Comparator()
     	{
           public int compare(object o1,objact o2){
           	return ((comparable)((Map.Entry)(o1)).getValue()).compareTo(((Map.Entry)(o1)).getValue());
           }
     	});
        HashMap sorted = new LinkedHashMap();
        for(Iterator it2 =li.iterator();it2.hasNext();)
        {
        	Map.Entry ent = (Map.Entry)it2.next();
        	sorted.put(ent.getkey(),ent.getValue());
        }
        return sorted;
     }






}