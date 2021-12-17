package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestClassEx3 {
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Users\\ustjavasdetb413\\Downloads\\chromedriver.exe";
    public WebDriver driver; 
    public String expected = null;
    public String actual = null;
        @BeforeTest
      public void launchBrowser() {
          System.out.println("launching firefox browser"); 
          System.setProperty("webdriver.chrome.driver", driverPath);
          driver= new ChromeDriver();
          driver.get(baseUrl);
          driver.manage().window().maximize();
      }
        @Test(priority = 0)
        public void register() throws InterruptedException{
            driver.findElement(By.linkText("REGISTER")).click() ;
            expected = "Register: Mercury Tours";
            actual = driver.getTitle();
            Assert.assertEquals(actual, expected);
        }
     @Test(priority = 1)
        public void text() throws InterruptedException{
    	 	String t ="To create your account, we'll need some basic information about you.";
    	 	if(driver.getPageSource().contains("To create your account")) {
    	 		System.out.println("Text:"+t+" is present ");
    	 	}else {
    	 		System.out.println("Text :"+t+" is not present ");
    	 	}
     	}
		
     @Test(priority = 2)
		public void addContactInformation() throws InterruptedException {
			driver.findElement(By.name("firstName")).sendKeys("Binu");
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(3000);
			driver.findElement(By.name("lastName")).sendKeys("Baby");
			Thread.sleep(3000);
			driver.findElement(By.name("phone")).sendKeys("7300002100");
			Thread.sleep(3000);
			driver.findElement(By.name("userName")).sendKeys("Binu@gmail.com");
			Thread.sleep(3000);
			
		}
		@Test(priority = 3)
		public void scrollDownWebpage() throws InterruptedException {
			 JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("window.scrollBy(0,350)", "");
	            Thread.sleep(3000);
		}
		
		@Test(priority = 4)
		public void mailingInformation() throws InterruptedException {
			 driver.findElement(By.name("address1")).sendKeys("puthenchira(H)");
			 Thread.sleep(1000);
			 driver.findElement(By.name("city")).sendKeys("Alappuzha");
			 Thread.sleep(1000);
			 driver.findElement(By.name("state")).sendKeys("Kerala");
			 Thread.sleep(1000);
			 driver.findElement(By.name("postalCode")).sendKeys("689595");
			 Thread.sleep(1000);
		}
		@Test(priority = 5)
		public void dropDown() throws InterruptedException {
			Select s1=new Select(driver.findElement(By.name("country")));
			s1.selectByVisibleText("BAHRAIN");
			Thread.sleep(3000);
			s1.selectByValue("INDIA");
			Thread.sleep(3000);
		}
		 @Test (priority=6)
		  public void userinfo() throws InterruptedException {
			 driver.findElement(By.id("email")).sendKeys("Binu@gmail.com");
			 Thread.sleep(1000);
			 driver.findElement(By.name("password")).sendKeys("123");
			 Thread.sleep(1000);
			 driver.findElement(By.name("confirmPassword")).sendKeys("123");
			 Thread.sleep(2000);

		  }
		@Test(priority = 7)
		public void submitButton() throws InterruptedException {
			driver.findElement(By.name("submit")).click();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(3000);
		}
		@Test(priority = 8)
		public void flightFinder() throws InterruptedException {
			//redirect to fightfinder
			driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")).click();
			Thread.sleep(3000);
		}
		@Test(priority = 9)
		public void radioButton() {
			driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
			
		}
		
}
