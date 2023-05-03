package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassTask1 {



	public static void main(String[] args) throws InterruptedException {
		  ChromeDriver driver=new ChromeDriver();
	      
	        driver.get("http://leaftaps.com/opentaps/control/login");
	        driver.manage().window().maximize();
	         driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	         Thread.sleep(1000);
	         driver.findElement(By.id("password")).sendKeys("crmsfa");
	         Thread.sleep(1000);
	         driver.findElement(By.className("decorativeSubmit")).click();
	         Thread.sleep(1000);
	         driver.findElement(By.linkText("CRM/SFA")).click();
	         Thread.sleep(1000);
	         driver.findElement(By.linkText("Leads")).click();
	         driver.findElement(By.linkText("Create Lead")).click();
	         Thread.sleep(1000);
	         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Org.Testleaf");
	         Thread.sleep(1000);
	         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pramila");
	         Thread.sleep(1000);
	         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thangaraj");
	         Thread.sleep(1000);
	       //  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Prami");
	       //  Thread.sleep(1000);
	       //  driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Testing");
	      //   Thread.sleep(1000);
	       //  driver.findElement(By.id("createLeadForm_description")).sendKeys("Im a Fresher");
	       //  Thread.sleep(1000);
	        // driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pramilathangaraj453@gmail.com");
	       //  Thread.sleep(1000);
	         
	         WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
             
	         Select source =new Select(drop1);
             
	         source.selectByIndex(4);

	         WebElement drop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	        
	         Select MarketingCampaign = new Select(drop2);
	       
	         MarketingCampaign.selectByVisibleText("Automobile"); 
	         

	       
	         WebElement drop3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	        
	         Select Ownership = new Select(drop3);
	        
	         Ownership .selectByValue("OWN_CCORP"); 
	         
	         
	         
	         
	      //   driver.findElement(By.name("submitButton")).click();

	}

}
