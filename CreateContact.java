package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
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
		 	 
		 //create lead
		 driver.findElement(By.linkText("Contacts")).click();		 
		 driver.findElement(By.linkText("Create Contact")).click();
		
		 driver.findElement(By.id("firstNameField")).sendKeys("Swetha");
		 driver.findElement(By.id("lastNameField")).sendKeys("Murali");
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Swetha");
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("MRS");
		 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("development");
		 driver.findElement(By.id("createContactForm_description")).sendKeys("C++ developer");
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("muraliswetha93@gmail.com");
		 
		 WebElement dd = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		 Select dropdown = new Select(dd);
		 dropdown.selectByVisibleText("India");
		 
		 driver.findElement(By.name("submitButton")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateContactForm_description")).clear();
		 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Testleaf march 19");
		 
		 driver.findElement(By.xpath("//input[@value='Update']")).click();
		  
			
			//Get the title of the application
			 String title = driver.getTitle();
			 System.out.println(title);

	}

}
