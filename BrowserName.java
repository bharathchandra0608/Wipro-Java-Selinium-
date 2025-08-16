package day3;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserName {
    public static void main(String[] args) throws InterruptedException {

        // Optional: in Selenium 4.6+, Selenium Manager can handle driver download automatically
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\bharath patel\\OneDrive\\Desktop\\seleninuDemo\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Get browser capabilities
        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = caps.getBrowserName();
        String browserVersion = caps.getBrowserVersion();

        System.out.println("Browser Name: " + browserName);
        System.out.println("Browser Version: " + browserVersion);

        Thread.sleep(5000);

        driver.quit();
    }
}

