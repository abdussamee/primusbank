package HomePage.primusbank2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ruf
{
  WebDriver driver;
 
  @Test()
  public void testOne() throws InterruptedException
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sami\\Downloads\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://primusbank.qedgetech.com/");
	  driver.close();
  }
}
