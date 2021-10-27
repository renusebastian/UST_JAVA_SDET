import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesInWebdriver {
		public static void main(String[] args) throws Exception {
			// set the geckodriver.exe property
			System.setProperty("webdriver.gecko.driver", "C:/PATH/geckodriver.exe");
			// open firefox
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// open webpage
			driver.get("https://chercher.tech/practice/frames");
			// store the text value
			String textValue = driver.findElement(By.xpath("//label/span")).getText();
			// switch to frame1
			driver.switchTo().frame("frame1");
			// set the value of the textbar to the value stored
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(textValue);
	  }
	}