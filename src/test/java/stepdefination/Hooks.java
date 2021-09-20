package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Baseclasses.Baseclass;
import io.cucumber.java.After;

 
	public class Hooks {


	    public static WebDriver driver = null;


public static void login() throws Exception
{

       Baseclass.getDriver();
      
			
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		
		  @After public void cleanUp() { Baseclass.driver.close();
		  Baseclass.driver.quit(); }
		 
	}