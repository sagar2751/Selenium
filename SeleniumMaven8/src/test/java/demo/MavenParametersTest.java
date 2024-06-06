package demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenParametersTest 
{
	@Test
	public void receiveData()
	{
		String URL = System.getProperty("url");
		Reporter.log(URL,true);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(URL);
	}

}


//mvn test -Dtest=MavenParametersTest -Durl=https://demowebshop.tricentis.com/  this command is used in cmd to run the url