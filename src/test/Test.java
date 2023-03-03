package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("HELLOP");
			System.setProperty("webdriver.chrome.driver", "D:\\ExcelR\\Drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			Thread.sleep(5000);
			WebElement password = driver.findElement(By.partialLinkText("Forgotten"));
			System.out.println("password "+password);
			password.click();
			Thread.sleep(5000);
			driver.close();
		} catch (Exception e) 
		{
			System.out.println("Exception"+e.getMessage());
			
		}

	}

}
