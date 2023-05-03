package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAttributes {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
	      
	        driver.get("http://leaftaps.com/opentaps/control/login");
	        driver.manage().window().maximize();
           driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
           driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmfsa");
           driver.findElement(By.xpath("//input[@className=decorativeSubmit']")).click();
         //  driver.findElement(By.xpath("")).click();
	}

}
