package PrintArray;
import java.util.*;

public class Array {
	public static void main(String args[])
	{
		int x[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Our Array is:");
		for(int y = 0;y < x.length;y++)
		{
			System.out.print(" " + x[y]);
		}
	}
}