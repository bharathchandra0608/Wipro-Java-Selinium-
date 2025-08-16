package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class GoogleSearch{
	    public static void main(String[] args) {
	     
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharath patel\\OneDrive\\Desktop\\seleninuDemo\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        try {
	         
	            driver.get("https://www.google.com");

	            WebElement searchBox = driver.findElement(By.name("q"));
	            searchBox.sendKeys("https://www.tutorialspoint.com/selenium/index.htm");

	            searchBox.submit();
	            Thread.sleep(200000);

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	          
	            driver.quit();
	        }
	    }
	}
