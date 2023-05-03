package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();
	      
	        driver.get("http://leaftaps.com/opentaps/control/login");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.manage().window().maximize();
	        
	         driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	         
	         
	         driver.findElement(By.id("password")).sendKeys("crmsfa");
	         
	         
	         driver.findElement(By.className("decorativeSubmit")).click();
	         
	         
	         driver.findElement(By.linkText("CRM/SFA")).click();
	         
	         
	         driver.findElement(By.linkText("Leads")).click();
	        
	          driver.findElement(By.linkText("Find Leads")).click();
	     
	          driver.findElement(By.xpath("(//span[text()='Phone'])[1]")).click();
	       
	          driver.findElement(By.name("phoneNumber")).sendKeys("8883891231");
	        
	          String lead=  driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
	          System.out.println(lead);
	          Thread.sleep(1000);
	         
	          driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		      
	          driver.findElement(By.xpath("(//a[@class='subMenuButtonDangerous'])[1]")).click();
		   
	           driver.findElement(By.xpath("(//a[text()='Find Leads'])[1]")).click();
	   
	           driver.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys(lead);
	    
	           driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		   String result= driver.findElement(By.xpath("//div[@id='ext-gen437']")).getText();
	       System.out.println(result);
	   
	}


	}


