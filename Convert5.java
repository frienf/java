package DecimalToHexadecimal;
import java.util.*;

public class Convert5 {
	public static void main(String args[])
	{
		int dnum,num1;
		String hNum = "";
		char Hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		Scanner sc = new Scanner(System.in);
		System.out.println("Please ,insert Decimal number:");
		dNum = sc.nextInt();
		int dNum1 = dNum;
		while(dNum>0)
		{
			num1 = dnum%16;
			hNum = Hex[num1] +hNum;
			dNum = dNum/16;
		}
		System.out.println("Hexidecimal Equivalent of " + dNum1 +" is " + hNum);
	}
}