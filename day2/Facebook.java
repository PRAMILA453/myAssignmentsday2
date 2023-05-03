package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("pramila");
		driver.findElement(By.name("lastname")).sendKeys("Thangaraj");
		driver.findElement(By.name("reg_email__")).sendKeys("pramilathangaraj453@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Yogita@28");
		
		WebElement drop1 =driver.findElement(By.id("day"));
		Select day =new Select(drop1);
		day.selectByIndex(5);
		
		WebElement drop2 = driver.findElement(By.id("month"));
		Select month = new Select(drop2); 
		month.selectByValue("6");
		
		WebElement drop3 = driver.findElement(By.id("year"));
		Select year = new Select(drop3 );
		year.selectByVisibleText("1998");
		
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
	
		
	}

}
