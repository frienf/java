package ReverseArray;
import java.util.*;

public class Array7 {
	public static void main(String args[]) throws IOException
	{
		ArrayList al = new ArrayList();
		al.add("E");
		al.add("J");
		al.add("I");
		al.add("K");
		al.add("E");
		System.out.println("Before Reversal:" + al);
		Collections.reverse(al);
		System.out.println("After Reversal:" + al);
	}
}