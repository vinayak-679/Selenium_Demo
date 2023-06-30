import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		
		String name ="vinayak";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //will use to wait for the pop up to come up
		String password = getpassword(driver); // or can create object to Locators2 class and can call the getpassword function
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);// Id locator
		driver.findElement(By.name("inputPassword")).sendKeys(password); //Name locator
		driver.findElement(By.className("signInBtn")).click(); //Class Name locator
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container']")).getText());
		driver.findElement(By.xpath("//button[text()='Log Out']")).click(); // instead of tag name we can simply put '*' ex:- //*[text()='Log Out'] this is aslo fine
		driver.close();
	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String password = driver.findElement(By.cssSelector("form p")).getText();
		String[] PasswordArray1 = password.split("'");
		//String[] PasswordArray2 = PasswordArray1[1].split("'");
		//return PasswordArray2[0];
		String PasswordArray2 = PasswordArray1[1].split("'")[0]; // line no. 39 and 41 are same can  use either of one
		return PasswordArray2;
		
		
				
	}

}
