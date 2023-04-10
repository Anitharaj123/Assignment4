package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Anitha");
		driver.findElement(By.id("lastNameField")).sendKeys("Selvaraj");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Anu");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("raj");
		driver.findElement(By.name("departmentName")).sendKeys("DEPARTMENT");
		WebElement description=driver.findElement(By.id("createContactForm_description"));
		description.sendKeys("I am creating contact in TL");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("anuselvaraj6594@gmail.com");
		Select options1=new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		options1.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement description1=driver.findElement(By.id("updateContactForm_description"));
		description1.clear();
		driver.findElement(By.name("importantNote")).sendKeys("This is contact number");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}
