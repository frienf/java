package ArrayAverage;

public class Array12 {
	public static void main(String args[])
	{
		int[] num1 = new int[] {66,489,7,23,12,54,70,97,200};
		int sum = 0;
		for(int y = 0;y<num1.length;y++)
		{
			sum = sum+num1[y];
		}
		float average = sum /num1.length;
		System.out.println("The result of the array average is:" + average);
	}
}