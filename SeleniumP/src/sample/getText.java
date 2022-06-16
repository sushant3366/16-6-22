package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		String txt=	driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).getText();
		System.out.println(txt);
		
		
		
		
		
		
		
		
}
}