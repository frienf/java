package UserInput;
import java.io.*;

public class CalculateInput{


public static void main(String args[]){
    int num1 ,num2,output;
    BufferedReader br = new BufferedRead(new InputStreamReader(System.in));
    System.out.println("Enter a number:");
    num1 = Integer.parserInt(br.readLine());
    System.out.println("Enter a another number");
    num2 = Integer.parserInt(br.readLine());
    output = num1 * num2;
    Sytem.out.println("Result is : +output");
   }
}