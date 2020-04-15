package PackagePractice;

public class CustomeException {

	public static void main(String[] args) {
		int z=10;
		System.out.println("value = "+z);
		try
		{
			z++;
			throw new pratikException();
		}		
		catch (pratikException p)
		{
			System.out.println("handeled exception");
		}
	}
}
class pratikException extends Exception
{
	pratikException()
	{
		System.out.println("in exception!!!");
	}
}