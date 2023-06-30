import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Parent-Siblings traverse
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());//relative xpath. (it is considering login button that is sibling of practice button)
		//There are 2 type of xpath 1.relative xpath 2.Absolute xpath
		//Absolute Xpath starts from starting tagname i.e 'html' and syntex starts with '/':- ex: /html/body/header........
		//Relative xpath we can jump and starts from anywhere in middle of the code that is given and we use '//' from starting:- ex://header/div/button......
		
		//Child - Parent traverse
		//header/div/button[1]/parent::div/parent::header
		
		//child-parent-child traverse
		//header/div/button[1]/parent::div/parent::header/a      'a' is one of the child of 'header'
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());

	}

}
