package PackagePractice;

public class pattern {
	public static void main(String[] args) {
		System.out.println("Pyramid of stars");
		char[] cc = {'a','b','c','d'};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(cc[j]);
			}
			System.out.println();
		}
		abcdp obj = new abcdp();
		obj.abc1();
	}	
}

final class abcdp
{
	void abc1()
	{
		System.out.println("star pyramid : ");
		int n =5;
		for(int i=0;i<n;i++)
		{
			for(int j=n-i;j>1;j--)				
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}






