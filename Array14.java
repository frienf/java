package ArrayList;
import java.util.*;

public class Array14 { 
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
        list.add("USA");
        list.add("Canada");
        list.add("Nigeria");
        list.add("China");
        System.out.println("these are the elements of array list:" + list);
        list.add(0,"Mexico");
        list.add(3,"Ghana");
        System.out.println("These are the current elements: "+ list);
        list.remove(1);
        list.remove(4);
        System.out.println("This is the remainimg elements after removal: "+ list);
	}
}