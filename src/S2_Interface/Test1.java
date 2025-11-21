package S2_Interface;

public interface Test1 
{
	void m1();
	
	void m2();

	default void m3()
	{
        System.out.println("default method m3- completed in Test1 interface");
	}
	
	default void m4()
	{
        System.out.println("default method m4- completed in Test1 interface");
	}
}
