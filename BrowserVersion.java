package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
	public class BrowserVersion{
	    public static void main(String[] args) {
	     
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharath patel\\OneDrive\\Desktop\\seleninuDemo\\chromedriver-win64\\chromedriver.exe");
	        
	        ChromeOptions options = new ChromeOptions();

	        options.addArguments("--start-maximized");

	        WebDriver driver = new ChromeDriver (options);

	        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();

	        String browserName = caps.getBrowserName();

	        String browserVersion = caps.getBrowserVersion();

	        System.out.println("Browser Name: " + browserName);

	        System.out.println("Browser Version: "+ browserVersion);

	        driver.get("https://www.google.com");

	        driver.quit();
	        
	        }
	}

	        
