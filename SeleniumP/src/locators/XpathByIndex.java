package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("sushant");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("shinde");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9823504302");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("apocalypse123");


		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}