package SynchronizeArrayList;
import java.util.*;

public class SyncArray implements Cloneable {
	public static void  main(String args[])
	{
		ArrayList<String> list = Collections.synchronizedList(new ArrayList<String>());
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("444");
		list.add("555");
		list.add("666");
		list.add("777");
		list.add("888");
		list.add("999");

		synchronized(list)
		{
			Iterator<String> it = list.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
	}
}