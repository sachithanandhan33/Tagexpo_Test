package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Tagexpo_SignIn
{
	public static WebDriver driver;
	
	@Given("the user enters website and clicks signin button")
	public void the_user_enters_website_and_clicks_signin_button() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tagexpo.in/sign-in");
		Thread.sleep(3000);
		
	}
	
	@When("user enters the username {string} and password {string}")
	public void user_enters_the_username_and_password(String string, String string2) throws InterruptedException
	{
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(string);
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys(string2);
		Thread.sleep(3000);
	}
	
	@Then("users sees the result depends on the credential")
	public void users_sees_the_result_depends_on_the_credential() throws InterruptedException 
	{
		WebElement signbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		signbtn.click();
		Thread.sleep(5000);
		
		driver.quit();
		
	}


}
