package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWaitTask2 {

	public static void main(String[] args) {
		  ChromeDriver driver=new ChromeDriver();
	      
	        driver.get("https://login.salesforce.com/");
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
	        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	         
	         driver.findElement(By.id("password")).sendKeys("Leaf@1234");
	         
	         driver.findElement(By.id("Login")).click();
	         
	         driver.findElement(By.className("slds-r8")).click();
	         
	}

}
