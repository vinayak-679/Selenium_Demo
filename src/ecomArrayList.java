import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ecomArrayList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vinay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		
		//Implicit Wait Global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String[] itemsNeeded = { "Brocolli", "Cucumber" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		ecomArrayList b = new ecomArrayList();
		b.addItems(driver, itemsNeeded); // This is one way to call the function using object

		// or we can change to static method so that no need to create object we can
		// directly call the function
		clickonCart(driver);
		
	}

	public void addItems(WebDriver driver, String[] itemsNeeded) {

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			// we are getting brocolli - 1 kg we need to split it and only should get
			// brocolli
			// should remove white space
			String formatedName = name[0].trim();

			// Convert array into array List
			// check whether item extracted present in array list
			List itemNeededList = Arrays.asList(itemsNeeded);

			if (itemNeededList.contains(formatedName)) {
				j++;
				// click on the add to cart button
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
			}

		}
	}

	public static void clickonCart(WebDriver driver) {
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//Explicit Wait applied only for the next code Local wait
		//WebDriverWait w = new WebDriverWait(driver,5);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}
}
