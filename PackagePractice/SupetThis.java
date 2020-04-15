package PackagePractice;

public class SupetThis {
	SupetThis()
	{
		System.out.println("In parent constructor ");
	}
	public static void main(String[] args) 
	{
		SupetThis st = new SupetThis();
		st.methid1();
		cs1 cs= new cs1();
		cs.method2();}
	void methid1()
	{
		System.out.println("In method1");
	}
}
class cs1 extends SupetThis
{
	cs1()
	{
		//		this();
		super();
		System.out.println("in cs1 constructor");

	}
	void method2()
	{
		System.out.println("in method2");
	}
}














