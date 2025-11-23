package S3_Exception_Handling;
public class example11 
{
	public static void main(String[] args) throws InterruptedException {
		
		String s1="velocity";
		try
		{
			System.out.println(s1.charAt(9));         //risky code
		}
		catch(StringIndexOutOfBoundsException a)
		{
			System.out.println("StringIndexOutOfBounds Exception handled");  //failure msg
		}
		finally 
		{
			System.out.println("running finally block");
		}
		
		System.out.println("Hi");
		System.out.println("Hello");

        Thread.sleep(2000);
	}
}
