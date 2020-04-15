package PackagePractice;

import java.util.Scanner;

public class stringLowerUpper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String input = sc.nextLine();


		System.out.println("Upper case conversion = "+input.toUpperCase());
		System.out.println("Lower case conversion = "+input.toLowerCase());

		char [] p = input.toCharArray();

		for(int i=0;i<p.length;i++)
		{
			Character s = p[i];
			if(Character.isLowerCase(s))
			{
				System.out.println("lower case characyer is : " +s);
			}
			
			else if(Character.isUpperCase(s))
			{
				System.out.println("Upper case character is : "+s);
			}
		}



	}

}


















