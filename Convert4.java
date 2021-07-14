package BinaryToDecimal;
import java.util.*;

public class Convert4 {
	public static void main(String args[])
	{
		int Bnum,Dnum = 0,x=1,num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert only binary number: ");
		Bnum = sc.nextInt();
		int Bnum2 = Bnum;

		while(Bnum != 0)
		{
			num1 = Bnum%10;
			Dnum = Dnum + num1*x;
			x = x*2;
			Bnum = Bnum/10;
		}
		System.out.println("Decimal equivalent of "+ Bnum2 +" is "+ Dnum);
	}
}