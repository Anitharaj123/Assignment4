package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Axpath {

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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Anitha");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String title1=driver.getTitle();
		System.out.println(title1);
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a")).click();
        driver.findElement(By.xpath("//a[text()='Qualify Lead']/following::a")).click();
        WebElement Cname=driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
        Cname.clear();
        Cname.sendKeys("Software Company");
        driver.findElement(By.xpath("//td[@colspan='4']/input")).click();
        WebElement cname2=driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
        String name=cname2.getText();
        if(Cname.equals(name))
        {
        	System.out.println("The cmpany name not changed");
        
        }else {
        	System.out.println("The company name changed");
        }
        
        
        
        
		
		
		
		
	}

}
