package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("SWETHA");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("MURALI");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("muraliswetha93@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("test123");
		
		WebElement dayDrop = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select day=new Select(dayDrop);
		day.selectByValue("10");
		
		WebElement monthDrop = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month=new Select(monthDrop);
		month.selectByVisibleText("Jul");
		
		WebElement yrDrop = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select yr=new Select(yrDrop);
		yr.selectByValue("1993");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		//driver.findElement(By.xpath("//input[@name='sex' and @value='1']"));
		
	}

}
