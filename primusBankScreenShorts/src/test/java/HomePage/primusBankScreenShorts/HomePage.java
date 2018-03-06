package HomePage.primusBankScreenShorts;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage
{
	WebDriver driver;
	@BeforeTest
	public void beforeTest() 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sami\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http:fb.com/");
	}
	
	public void takeScreenshort(String intger) throws IOException
	{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\sami\\eclipse-workspace\\primusBankScreenShorts\\screenShorts\\"+intger+".png"));	
	}
  @Test(priority=0,groups="groupOne",enabled=false)
  public void links() throws IOException, InterruptedException 
  {
	  driver.findElement(By.id("u_0_c")).click();
	  takeScreenshort("u_0_c");
	  Thread.sleep(3000); 
  }
  @Test(priority=1,groups="two")
  public void method2() throws IOException
  {
	  driver.findElement(By.id("u_0_b")).click();
	  takeScreenshort("u_0_b");
  }
  
  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(5000);
	  driver.quit();
  }
}
