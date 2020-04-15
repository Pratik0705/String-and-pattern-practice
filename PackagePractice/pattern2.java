package PackagePractice;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		char[] aa = ss.toCharArray();
		for(Character c : aa)
		{
			System.out.println(c);
		}
		int len;
		if(aa.length%2 == 0)
		{
			len = aa.length/2;
		}
		else
		{
			len = (aa.length/2)+1;
		}
		Character []p = new Character[len];
		int j = 0;
		for(int i=0;i<aa.length;i++)
		{
			if(i%2==0)
			{
				p[j++]=aa[i];
			}
		}
		System.out.println("final array content is : ");
		for(Character ca : p)
		{
			System.out.println(ca);
		}
		System.out.println();
		for(int i=0;i<p.length;i++)
		{
			for(int j1=0;j1<=i;j1++)
			{
				System.out.print(p[i]+" ");
			}
			System.out.println();
		}
















	}

}
