package dec30;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample {
	FirefoxDriver driver;
	@Test
	public void sampleTest()
	{
	driver=new FirefoxDriver();
	driver.get("http://google.com");
	}

}
