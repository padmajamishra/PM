package JobTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ScheduleJobTest {
	WebDriver driver;
  @Test
  public void test() {
	  driver.get("http://www.guru99.com");
	  System.out.println("in the guru site now");
	  System.out.println("Page title is : "+driver.getTitle());
  }
  @BeforeTest
  public void SetBrowser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\padma\\Downloads\\chromedriver.exe");
	  driver=new ChromeDriver(); 
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
  }

  @AfterTest
  public void CloseBrowser() {
	  driver.close();
  }

}
