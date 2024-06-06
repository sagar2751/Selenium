package cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class hyundaiTest 
{
	@Test(groups = "system")
	public void launch()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.advaithhyundai.com/?gad_source=1&gclid=Cj0KCQjw6auyBhDzARIsALIo6v9a4o-IBacXaaxaxN_CNxk_MDiL_TzmL9kLnKunPvBiW3dLSMny5i4aAq0lEALw_wcB");
		Reporter.log("hyundai test page executed",true);
	}

}
