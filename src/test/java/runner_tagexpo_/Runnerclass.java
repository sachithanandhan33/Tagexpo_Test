package runner_tagexpo_;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Sachithanandhan.S\\eclipse-workspace3\\tagexpo\\src\\test\\resources\\featurefiles\\login1clx.feature",
glue="stepdefinitions",plugin= {"pretty","html:target/1clx_sign_in.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},publish=true)

public class Runnerclass
{
  
	
	
}
