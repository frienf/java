package StringArray;
import java.io.*;

public class Array3 {
	public static void main(String args[]) throws IOException
	{
		String st[] = new String[7];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please , insert String element:");
		for(int x=0;x<7;x++)
		{
			st[x] = br.readLine();
		}
		System.out.println("The Result of the string values are ");
		for(int x=0;x<7;x++)
		{
			System.out.println(" " + st[x]);
		}
	}
}