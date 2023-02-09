package tagexpo_other_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContentTest 
{
  public static WebDriver driver;
  
  @SuppressWarnings("unlikely-arg-type")
  
@Test
  public void f() 
  {
	  
	  
	      //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	      WebDriverManager.chromedriver().setup();
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.1clxlite.com");
	      
	      String pageTitle = driver.getTitle();
	      System.out.println(pageTitle);
	      
	      if (pageTitle.equals("CREATE YOUR BUSINESS WEBSITE IN 3 MINUTES")) 
	      {
	        System.out.println("Page title is correct");
	      } 
	      else 
	      {
	        System.out.println("Page title is incorrect");
	      }
	      
	      
	      WebElement pageHeader = driver.findElement(By.xpath("//body[1]/div[1]/section[3]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/p[1]"));
	      String text=pageHeader.getText();
	      System.out.println(pageHeader);
	      
	      
	      
			/*
			 * if (pageHeader.equals("xfdvdv")) {
			 * System.out.println("Page header is correct"); } else {
			 * System.out.println("Page header is incorrect"); }
			 */
	     // driver.quit();
	    }
	  

  }

