import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class eCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\vinay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 * ChromeDriver driver = new ChromeDriver();
		 * driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 * 
		 * driver.findElement(By.xpath("//h4[text()=\"Cucumber - 1 Kg\"]")).findElement(
		 * By.xpath("//button[text()='ADD TO CART']")).click();
		 */
		 WebDriver driver;
         driver = WebDriverManager.chromedriver().create();
        //WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
         for(int i=0;i<products.size();i++)
         {
        	String name=products.get(i).getText();
        	
        	if(name.contains("Cucumber")) {
        		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
        		break;
        	}
         }
        
	}

}
