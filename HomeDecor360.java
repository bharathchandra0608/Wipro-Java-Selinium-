package day4;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HomeDecor360 {

public static void main(String args[]) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://360homedecor.uk/book-appointment");
	WebElement brand = driver.findElement(By.id("choose_branch"));
	brand.click();
	Select dropdown = new Select(brand);
	dropdown.selectByValue("veneer");
	WebElement style= driver.findElement(By.id("choose_style"));
	style.click();
	Select dropdown1 = new Select(style);
	dropdown1.selectByValue("mediterranean");
	driver.findElement(By.id("first_name")).sendKeys("Bharath");
	driver.findElement(By.id("last_name")).sendKeys("Chandra");
	driver.findElement(By.id("apt_city")).sendKeys("HYD");
	driver.findElement(By.name("phone_number")).sendKeys("7824894408");
	driver.findElement(By.id("email")).sendKeys("bharathpetel0608@gmail.com");
	
	File uploadFile= new File("C:/Users/2002d/Downloads/image.png");
	
	driver.findElement(By.cssSelector("#layoutFiles")).sendKeys(uploadFile.getAbsolutePath());
	
	driver.findElement(By.cssSelector("#privacyPolicy")).isSelected();
	
	driver.findElement(By.cssSelector("#appointment_form > div.col-12.text-center> button")).click();
	Thread.sleep(5000);

	driver.quit();

}

}