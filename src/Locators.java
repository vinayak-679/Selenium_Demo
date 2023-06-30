import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //will use to wait for the pop up to come up
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");// Id locator
		driver.findElement(By.name("inputPassword")).sendKeys("hellow"); //Name locator
		driver.findElement(By.className("signInBtn")).click(); //Class Name locator
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //CSS Selector locator
		driver.findElement(By.linkText("Forgot your password?")).click(); //Link Text Selector(should be link (tag name should be 'a'))
		Thread.sleep(1000); //will use to wait when page is changing Script will pause for 1 second
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Vinayak");//Xpath locator
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc@gmail.com");//CSS selector
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); // xpath locator with index value 'this is for email field'(if we have common values like 'type="text"' we can bring that particular field by giving index value of that field)
		driver.findElement(By.cssSelector("input[placeholder='Email']:nth-child(3)")).sendKeys("Vinayak@gmail.com"); //xpath to css index may differ check before using it
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876780581"); //parents to child tag(form-input) with index
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); // form is parent tag and p is a child tag
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	}

}
