import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wise {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://wisetest.winwholesale.com/wise?wrkstnid=d925i5&skin=wob");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.findElement(By.id("I_6_53")).sendKeys("winauto5");
		driver.findElement(By.id("I_7_53")).sendKeys("winauto");
		driver.findElement(By.id("I_7_53")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("btnSubmit")).click();
		driver.findElement(By.linkText("Order Processing")).click();
		driver.findElement(By.linkText("Inquiry - Orders by Customer")).click();
		driver.findElement(By.id("txtS1FLTRCUST")).sendKeys("000196");
		driver.findElement(By.id("ddbS1FLTRSTS")).click();
		driver.findElement(By.cssSelector("option[value='MCA']")).click();

	}

}
