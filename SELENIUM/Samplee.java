import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samplee {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ustjavasdetb409\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.navigate().to("http://www.google.com/");
		d.findElement(By.name("csi"));
				String s = d.getTitle();
				System.out.println(s);
				s.equals("Google");
				}

}
