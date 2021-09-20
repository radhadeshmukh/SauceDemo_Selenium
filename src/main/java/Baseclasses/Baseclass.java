package Baseclasses;


import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass{
 public static WebDriver driver;
 public static  Properties prop;
 
  
public static WebDriver getDriver() throws Exception
 {
	prop = new Properties();
	 FileInputStream fs= new FileInputStream("src/main/java/Baseclasses/GlobalVariable.properties");
	 prop.load(fs);
	
	 System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe")
	 driver= new ChromeDriver();
	
	//driver.get(prop.getProperty("URL2"));
	String url= Readnotepad.readFileAsString("src/main/java/Baseclasses/notepad");
driver.get(url);
driver.manage().window().maximize();
	 return driver;
 }
}
