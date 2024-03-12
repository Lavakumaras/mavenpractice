package practiceMaven;

import org.testng.annotations.Test;

public class PracticeTest3 {
	@Test(groups= "smoke")
	public void script5Test()
	{
		System.out.println("--test Sript5");
		}

	@Test(groups= {"smoke","regression"})
	public void script6Test()
	{
		System.out.println("--test Sript6");
		}
	
	@Test(groups= "smoke")
	public void script06Test()
	{
		System.out.println("--test Sript06");
		}

	@Test(groups= {"smoke","regression"})
	public void script07Test()
	{
		System.out.println("--test Sript07");
		}
}
