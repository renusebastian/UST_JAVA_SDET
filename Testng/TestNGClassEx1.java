package TestNGPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClassEx1 {
	WebDriver d;
	@BeforeTest
	public void launchWebapp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ustjavasdetb413\\Downloads\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.calculator.net/");
		d.manage().window().maximize();
	}
		
	@Test
	public void calculatorPercent() {
		/*
		
	      d.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
	     // d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      d.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
	      
	      d.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[3]")).click();
	      
	      d.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
	       String result=d.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();
	       System.out.println("Result : "+result);
	      
	*/
		d.findElement(By.xpath("//*[@id=\"contentout\"]/table/tbody/tr/td[3]/div[2]/a")).click();
		
		d.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
		
		d.findElement(By.id("cpar1")).sendKeys("50");
		
		d.findElement(By.id("cpar2")).sendKeys("5");
		
		d.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[2]/td/input[2]")).click();
		
		String str=d.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();
		
		System.out.println("Result :"+ str );
	      
	
	}
}
