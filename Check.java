package VowelConsonant;
import java.util.*;

public class Check {
	public static void main(String args[])
	{
		char c = ' ';
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please insert a character: ");
		try
		{
			c = (char)br.read();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		switch(c)
		{
			case 'a':
			    System.out.println(c +" is a Vowel");
			    break;
			case 'e':
			    System.out.println(c +" is a Vowel");
			    break;
			case 'i':
			    System.out.println(c + "is a Vowel");
			    break;
			case 'o':
			    System.out.println(c + "is a Vowel");
			    break;
			case 'u':
			    System.out.println(c + "is a Vowel");
			    break;
			case 'A':
			    System.out.println(c + "is a Vowel");
			    break;
			case 'E':
			    System.out.println(c + "is a Vowel");
			    break;
			case 'I':
			    System.out.println(c + "is a Vowel");
			    break;
			case 'O':
			    System.out.println(c + "is a Vowel");
			    break;
			case 'U':
			    System.out.println(c + "is a Vowel");
			    break;
			default:
			    System.out.println(c + "is a consonant");
			    break;    
		}

	}
}