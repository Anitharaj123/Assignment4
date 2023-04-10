package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		WebElement name=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		String name1=name.getText();
		System.out.println(name1);
		name.click();
		
	
		
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		if (title.contains("Duplicate Lead")) {
			System.out.println("The title is verified");
			
		}else {
			System.out.println("The title is wrong");
		}
		
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    
	    String name2=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
	    if (name2.equalsIgnoreCase(name2)) {
			System.out.println("The Duplication is done");	
		}else {
			System.out.println("Duplication not done ");
		}
	   
	    
	    
	    
		
		
		
		
		

	}

}
