package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		boolean result=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(result);
		if(result==true)
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("button is disable");
		}
}
}