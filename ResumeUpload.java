package day4;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ResumeUpload {
    public static void main(String[] args) throws InterruptedException {

        // Path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\bharath patel\\OneDrive\\Desktop\\seleninuDemo\\chromedriver-win64\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		Properties props = new Properties();
        FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
        props.load(fis);
 
        String email = props.getProperty("naukri.email");
        String password = props.getProperty("naukri.password");
        String resumePath = props.getProperty("resume.path");
        String chromeDriverPath = props.getProperty("Properties props = new Properties()");
        FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
        props.load(fis);
 
        String email = props.getProperty("naukri.email");
        String password = props.getProperty("naukri.password");
        String resumePath = props.getProperty("resume.path");
        String chromeDriverPath = props.getProperty("chromedriver.path");
 
        driver.quit();
    }
}
        