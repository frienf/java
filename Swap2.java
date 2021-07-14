package SwapNumber2;

public class Swap2 {
	public static void main(String args[])
	{
		int x = 200;
		int y = 500;
		System.out.println("Values Before swapping");
		System.out.println("Values of x is:" +x);
		System.out.println("Values of y is:" +y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("\n");
		System.out.println("Values after swapping");
		System.out.println("Values of x is:"+ x);
		System.out.println("Values of y is:"+ y);
	}
}