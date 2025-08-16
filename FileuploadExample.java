package day4;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadExample {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\bharath patel\\OneDrive\\Desktop\\seleninuDemo\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		try
		{
			driver.get("http://the-internet.herokuapp.com/upload ");
			File uploadFile=new File("C:\\Users\\bharath patel\\OneDrive\\Pictures\\3203029.jpg");
			WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
			fileInput.sendKeys(uploadFile.getAbsolutePath());
			driver.findElement(By.id("file-submit")).click();
			String resultText= driver.findElement(By.id("uploaded-files")).getText();
			
			System.out.println("Uploaded: " +resultText);
		}
		finally
		{
			driver.quit();
		}
		
	}

}