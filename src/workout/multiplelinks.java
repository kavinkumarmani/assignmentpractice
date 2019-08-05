package workout;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplelinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> lst=driver.findElements(By.tagName("a"));
		System.out.println(lst.size());
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i).getText());
		}
		

	}

}
