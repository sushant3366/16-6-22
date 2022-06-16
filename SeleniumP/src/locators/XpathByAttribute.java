package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sushant99399");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("sush1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//a[@class='_97w4']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sush1234");


		
}
}