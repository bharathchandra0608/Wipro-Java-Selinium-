package day4;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class amazon
{
	public static void main(String[] args)
			throws IOException, InterruptedException
	{
		Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\bharath patel\\JavaSelenium\\JavaSelenium\\src\\day4\\Config.properties");
        props.load(fis);        
        String email = props.getProperty("amazon.email");
        String password = props.getProperty("amazon.password");
        String searchItem1 = props.getProperty("searchItem1"); 
       // String searchItem2 = props.getProperty("searchItem2");
         // System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\bharath patel\\\\OneDrive\\\\Desktop\\\\seleninuDemo\\\\chromedriver-win64\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));     
        driver.get("https://www.amazon.in");   
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.id("ap_email_login")).sendKeys(email);
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchItem);
        //driver.findElement(By.id("nav-search-submit-button")).click();
        List<String> products = new ArrayList<>();
        products.add("laptop");
        products.add("headphones");
        products.add("wireless mouse");
        for (String product : products) {
            
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.clear();
            searchBox.sendKeys(product);
            driver.findElement(By.id("nav-search-submit-button")).click();
            driver.findElement(By.cssSelector("#a-autoid-3-announce")).click();
            Thread.sleep(3000);
 
        /*driver.get("https://www.amazon.in");
        driver.findElement(By.id("twotabsearchtextbox"));
        driver.get("https://www.amazon.in");
        searchBox.sendKeys(searchItem2);  
        driver.findElement(By.id("nav-search-submit-button")).click();       
        driver.findElement(By.cssSelector("#a-autoid-3-announce")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(5000);*/
        driver.quit();
	}
        
}
}