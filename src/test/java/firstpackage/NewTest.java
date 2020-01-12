package firstpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void launchBrowser() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ethans\\Desktop\\Sachin_Selenium_Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		System.out.println("Chrome browser is launched");

		Thread.sleep(5000);
		
		driver.quit();
	  
	  
  }
}
