package workout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitilywait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		WebElement firstname=driver.findElement(By.id("u_0_l"));
		WebElement lastname=driver.findElement(By.name("lastname"));
		WebElement signup=driver.findElement(By.id("u_0_15"));
		
		
		sendkeys(driver,firstname,5,"kavinkumar");
		sendkeys(driver,lastname,5,"m");
		click(driver,signup,10);
		

	}
	
	public static void sendkeys(WebDriver driver,WebElement element,int timeout,String value) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	public static void click(WebDriver driver,WebElement element,int timeout) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}

        
