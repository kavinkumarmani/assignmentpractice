package workout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeconcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.uitestpractice.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//iframe
		driver.switchTo().frame("iframe_a");
		driver.findElement(By.id("name")).sendKeys("kavinkumar");
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Testing Controls ']")).click();
		
		

	}

}
