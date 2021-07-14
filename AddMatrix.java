package MatrixAddition;
import java.io.*;

public class AddMatrix{
	public static void main(string arg[]) throws NumberFormatException,IOException 
	{
		BufferedReader br = new BufferedReader(new InputstreamReader(System.in));
        int num1[][] = new int[2][2];
        int num2[][] = new int[2][2];
        int num3[][] = new int[2][2];
        int x,y;

        System.out.println("Please insert 1st integer values for matrix addition:");
        for(x=0;x<2;x++)
        {
        	for(y=0;y<2;y++)
        	{
        		num1[x][y] = Integer.parserint(br.readLine());
        	}
        }
        for(x=0;x<num1.lenght;x++)
        {
        	for(y=0;y<2;y++)
        	{
        		System.out.println("" + num1[x][y]);
        	}
        	System.out.println();
        }
        System.out.println("Please insert 2nd integer values for matrix addition:");
        for(x=0;x<2;y++)
        {
        	for(y=0;y<2;y++)
        	{
        		num2[x][y] =Integer.parserInt(br.readLine());
        	}
        }
        for(x=0;x<num2.lenght;x++)
        {
        	for(y=0;y<2;y++)
        	{
        		System.out.println(""+ num2[x][y]);
        	}
            System.out.println();      
        }     
	    for(x=0;x<2;x++)
	    {
	    	for(y=0;y<2;y++)
	    	{
	    		num3[x][y] = num1[x][y] + num2[x][y];
	    	}
	    }
	    System.out.println("The sum of the matrix is :");
	    for(x=0;x<2;x++)
	    {
	    	for(y=0;y<2;y++)
	    	{
	    		system.out.println("num3[x][y]")
	    	}
	    	System.out.println();
	    }
	}  
}