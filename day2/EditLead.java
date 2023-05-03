package week2.day2;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
	      
	        driver.get("http://leaftaps.com/opentaps/control/login");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        
	         driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	      
	         
	         driver.findElement(By.id("password")).sendKeys("crmsfa");
	     
	         
	         driver.findElement(By.className("decorativeSubmit")).click();
	    
	        
	         driver.findElement(By.linkText("CRM/SFA")).click();
	   
	        
         driver.findElement(By.linkText("Leads")).click();
	     	
          driver.findElement(By.linkText("Find Leads")).click();
	     
          driver.findElement(By.name("firstName")).sendKeys("pramila"); 
	     	
      driver.findElement(By.linkText("Find Leads")).click();
	     	
	   driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	     	 String title = driver.getTitle();
	     	 System.out.println("Title of the page is :"+title);
	     	
	     	// driver.findElement(By.className("subMenuButton")).click();
	     	 driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
	     
	     
	     	// WebElement compName = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		      driver.findElement(By.id("updateLeadForm_companyName")).clear();
 
	      driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("testleaf");
	     
	      	driver.findElement(By.className("smallSubmit")).click();
	     
	      	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	      	System.out.println(text);
	      
	      	}
	      	
	}


