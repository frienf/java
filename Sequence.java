package Fibonacci;

public class Sequence {
	public static void main(String args[])
	{
		int w = 0,x=1,y,z,count = 10;
		System.out.println("The result of Fibonacci Sequence:");
		System.out.print(w + " " + x);

		for(z=2;z<count;z++)
		{
			y = w + x;
			System.out.println(" " + y);
			w = x;
			x = y;
		}
	}
} 