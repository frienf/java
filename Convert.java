package FahrenheitToCentigrade;
import java.util.*;

public class convert {
	public static void main(String args[])
	{
		float radian;
		double degree;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert value in Fahrenheit:");
		radian = sc.nextFloat();
		degree = (radian-32)/1.8;
		System.out.println("Celcius Equivalent of "+ radian +" Fahrenheit is "+ degree +" Celcius ");
	}
}