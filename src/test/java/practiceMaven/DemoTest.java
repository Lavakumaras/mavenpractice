package practiceMaven;

import org.testng.annotations.Test;

public class DemoTest {
@Test(groups= "smoke")
public void script1Test()
{
	System.out.println("changes for conflict");
	}

@Test
public void script2Test()
{
	System.out.println("--test Sript2");
	}


@Test
public void script03Test()
{
	System.out.println("--test Sript03");
	}
@Test
public void script04Test()
{
	System.out.println("--test Sript04");
	}

@Test
public void script05Test()
{
	System.out.println("--test Sript05");
	}
@Test
public void script06Test()
{
	System.out.println("--test Sript06");
	}
}
