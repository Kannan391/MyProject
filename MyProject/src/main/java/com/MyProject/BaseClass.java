package com.MyProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
     public static WebDriver getBrowser(String type) {
    	 
    	 if (type.equalsIgnoreCase("chrome")) {
    		 
    		 System.setProperty("webdriver.chrome.driver", 
    				 System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
    		 
    		 driver = new ChromeDriver();
			
		}else if (type.equalsIgnoreCase("firefox")) {
    		 System.setProperty("webdriver.gecko.driver", 
    				 System.getProperty("user.dir") + "//Driver//firefoxdriver.exe");
    		 
    		 driver = new FirefoxDriver();

		}
     return driver;
   
    }
     
     public static void getUrl(String url) {
    	 driver.get(url);

	}
     public static void maxi() {
    	 driver.manage().window().maximize();

	}
     
     public static void click(WebElement element) {
     element.click();
	}
    
     public static void sendkeys(WebElement element,String input) {
     element.sendKeys(input);
	}
     
     public static void select(WebElement sel, String selectdoption) {
    	 Select s = new Select(sel);
    	 s.selectByVisibleText(selectdoption);

	}
     public static void selectByIndex(WebElement se, int selectedoption) {
     Select s= new Select(se);
     s.selectByIndex(selectedoption);
     
	}
     public static void clear(WebElement clr) {
     clr.clear();
	}
     
    public static void moveToElement(WebElement element) {
    Actions action = new Actions(driver);
    action.moveToElement(element).build().perform();
	}
    
    public static void scrollIntoView(WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
    
    public static void implicitwait(int seconds) {
    driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
    
    
     public static void takeScreenshot() throws IOException {

    	    TakesScreenshot ts = (TakesScreenshot)driver;
    	    File src = ts.getScreenshotAs(OutputType.FILE);
    	    File dest = new File("C:\\Users\\HariAmmu\\eclipse-workspace\\Selenium\\Screenshots\\myproject2.png");
    	    FileHandler.copy(src, dest);
     
    	    
	}
     
    }		
 
