package SwapNumbers;

public class swap {
	public static void main(String args[])
	{
		int x = 200;
		int y = 500;
		System.out.println("Values before swapping ");
		System.out.println("Values of x is: "+ x);
		system.out.println("Values of y is: "+ y);
		swapvalues(x,y);
	}
	public static void swapvalues(int x,int y);
	{
		int swapv = x;
		x = y;
		y = swapv;
		System.out.println("\n");
		System.out.println("Values after swapping");
		System.out.println("Values of x is:"+ x);
		System.out.println("values of y is:" + y);
	}
}