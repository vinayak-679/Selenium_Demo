import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowactivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //to maximize the window
		driver.get("http://google.com");
		driver.navigate().to("https://rahulshettyacademy.com/"); //navigate from google page to another page in same window
		driver.navigate().back(); //navigate back
		driver.navigate().forward(); //navigate forward

	}

}
