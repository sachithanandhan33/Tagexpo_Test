package stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
public class Hookclass 
{
	

  public static WebDriver driver;	
	
	@After(order = 1)
	public void takeScraenshotOnFailure(Scenario scenario) 
	{

	if (scenario.isFailed()) {

	TakesScreenshot ts = (TakesScreenshot) driver;

	byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	scenario.attach(src, "image/png", "screenshot");
	}

	}

	@After(order = 0)
	public void tearDown()
	{
	   driver.close();

	}
}

