package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		//Identify the Username field and enter the username
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 
		 //Identify the password and enter the password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 //Click on Login
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 //Click on crm/sfa
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("swetha");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); 
		
		//Get the title of the application
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner')]/a)[1]")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("FIS");
		driver.findElement(By.xpath("//input[@class='smallSubmit' and @value='Update']")).click();
		driver.close();
		
		
		

	}

}
