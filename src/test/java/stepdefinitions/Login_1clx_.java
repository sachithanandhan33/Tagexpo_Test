package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_1clx_ extends Hookclass
{
	public static WebDriver driver;
	
	@Given("the User enter into login page")
	public void the_user_enter_into_login_page() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.1clxlite.com/login/");
	}
	
	@When("the user enters valid {string} and {string}")
	public void the_user_enters_valid_and(String string, String string2) throws InterruptedException
	{
		WebElement entername = driver.findElement(By.xpath("//input[@id='email']"));
		entername.sendKeys(string);
		Thread.sleep(3000);
		
		WebElement enterpass = driver.findElement(By.xpath("//input[@id='lpassword']"));
		enterpass.sendKeys(string2);
		Thread.sleep(3000);
		
		
		
	}
	
	@Then("the user will get results depends on their credentials")
	public void the_user_will_get_results_depends_on_their_credentials() 
	{
		WebElement loginbtn = driver.findElement(By.xpath("//button[@id='sisubmit']"));
		loginbtn.click();
		
		WebElement errormsg = driver.findElement(By.xpath("//div[@id='error_login']"));
		if (errormsg.isDisplayed()) 
		{
			 System.out.println(errormsg.getText());
		} 
		else 
		{
            System.out.println("Element not displayed!");
		}
	}


}
