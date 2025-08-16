package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
    public static void main(String[] args) {

        // Set the path to the GeckoDriver executable
        //System.setProperty("webdriver.gecko.driver",
        	//	"C:\\Users\\bharath patel\\OneDrive\\Desktop\\seleninuDemo\\geckodriver-v0.36.0-win-aarch64 (1)\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com");
        
        System.out.println("page title: " + driver.getTitle());
        
            driver.close();
        }
    }

