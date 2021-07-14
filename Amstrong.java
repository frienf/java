package AmstrongNumber;
import java.util.*;

public class Amstrong {
	public static void main(String args[])
	{
		int x,y,z = 0,ams;
		Scanner sc = new Scanner(System.in);
        System.out.println("please insert only positive numbers:");
        x=sc.nextInt();
        y=x;
        while(y!=0)
        {
        	ans = y%10;
        	z = z + ans*ans*ans;
            y = y/10;
        }
        if(z == x)
        {
        	System.out.println(x + "is an Amstrong Number");
        }
        else
        {
        	System.out.println(x +"is not a Amstrong Number");
        }
	}
}