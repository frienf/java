package DecimalToOctal;
import java.util.*;

public class Convert3 {
    public static void main(String args[])
    {
        int Dnum,x=1,y,num1;
        int Onum[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert Decimal Numbers only:");
        DNum = sc.nextInt();
        num1 = Dnum;
        while(num1 != 0)
        {
        	ONum[x++] = num1%8;
        	num1 = num1/8
        } 
        System.out.println("Octal equivalent of" + DNum +"is");
        for(y=x-1;y>0;y--)
        {
        	System.out.println(Onum[y]);
        }
    }
}