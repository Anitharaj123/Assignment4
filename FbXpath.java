package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(" https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6l')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anitha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Selvaraj");
		driver.findElement(By.xpath("//input[@name= 'reg_email__']")).sendKeys("9546312871");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("anu123456");
		Select options1=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		options1.selectByVisibleText("10");
		Select options2=new Select(driver.findElement(By.xpath("//select[@id='month']")));
		options2.selectByValue("5");
		Select options3=new Select(driver.findElement(By.xpath("//select[@id='year']")));
		options3.selectByIndex(19);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(5000);
		driver.close();
		String title=driver.getTitle();
		System.out.println(title);
		
		
	
	}
	
	
	

}
