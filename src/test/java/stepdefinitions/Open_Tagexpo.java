package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import runner_tagexpo_.ReusableMethods;


public class Open_Tagexpo 
{
	public static WebDriver driver;
	
  ReusableMethods reuse=PageFactory.initElements(driver, ReusableMethods.class);

	@Given("the user launches the chromebrowser")
	public void the_user_launches_the_chromebrowser() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Given("the user enters the tagexpo url")
	public void the_user_enters_the_tagexpo_url() throws InterruptedException
	{
		driver.get("http://tagexpo.in/");
		Thread.sleep(3000);
		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
        String expected_title="Tag Expo | Textiles";
        String actualtitle=driver.getTitle();
        System.out.println(actualtitle);
        
        if (actualtitle.equalsIgnoreCase(expected_title)) 
        {
			System.out.println("Page title matched");
		} 
        else 
        {
        	System.out.println("Page title not matched!");
		}
        
	}
	@Then("user able to see the website homepage")
	public void user_able_to_see_the_website_homepage() throws InterruptedException
	{
		reuse.scrolldown(driver);

		WebElement entermail = driver.findElement(By.xpath("//input[@name='email']"));
		entermail.sendKeys("sachinanand584@gmail.com");
		Thread.sleep(5000);

		WebElement subbtn = driver.findElement(By.xpath("//button[@name='submit']"));
		subbtn.click();
		Thread.sleep(5000);
			
	}

}
