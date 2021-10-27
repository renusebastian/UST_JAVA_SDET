import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector_iframes {
	public static WebDriver driver;
	 
	 public static void main(String[] args) {
	 
	  
	  System.out.println("Launching the chrome driver  ");  
	    
	  // Set the chrome driver exe file path
	  System.setProperty("webdriver.chrome.driver","E:\\selenium_sumit\\chromedriver_win32_2.36\\chromedriver.exe");  
	  
	  // Instantiate the chrome driver
	  driver = new ChromeDriver();
	  
	  // wait time
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  // set the browser URL in get() to load the webpage
	     driver.get("https://skptricks.github.io/learncoding/selenium-demo/login%20registration%20page/Register.html");  
	     
	     // locating an elements by its ID
	     driver.findElement(By.cssSelector("input#regUsername")).sendKeys("sumit"); 
	     driver.findElement(By.cssSelector("input#regEmail")).sendKeys("sumit@gmail.com"); 
	     driver.findElement(By.cssSelector("input#regPassword")).sendKeys("1234567890"); 

	 } 

	}




