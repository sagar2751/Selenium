package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sampleTest 
{
	@Test
	public void test()
	{
		Reporter.log("sample test class executed",true);
		Reporter.log("sample test class modified",true);
		Reporter.log("sample test class definied",true);
	}

}
