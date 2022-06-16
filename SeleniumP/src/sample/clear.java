package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='email']")).clear();
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz");
		
		
		 WebElement UN = driver.findElement(By.xpath("//input[@id='email']"));
		 UN.sendKeys("abcd");
		 Thread.sleep(2000);
		 UN.clear();
		 Thread.sleep(2000);
		 UN.sendKeys("xyz");



		
		

}
}