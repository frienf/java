package CentigradeToFahrenheit;
import java.util.*;

public class Convert1 {
	public static void main(String args[])
	{
		float degreeF;
		double degreeC;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert values in celcius");
		degreeF = sc.nextFloat();
		degreeC = (1.8*degreeF)+32;
		System.out.println("Celcius Equilvalent of "+ degreeF +" is " + degreeC);
	}
}