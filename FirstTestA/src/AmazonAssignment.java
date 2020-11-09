import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAssignment {
	public static void main(String[] args) {
//		Chromedriver path
		System.setProperty("webdriver.chrome.driver", "/Users/Apple/eclipse-workspace/webdriver/chromedriver");

//		Create a driver and go to amazon.com
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
//		go to sign in page
		WebElement element = driver.findElement(By.xpath("//a[@data-nav-ref=\"nav_custrec_signin\"]"));
		element.click();
		
//		Enter your login name(email)
		WebElement element1 = driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
		element1.sendKeys("mehmetvurall@gmail.com");

//		Click continue button
		WebElement element2 = driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		element2.click();
		
//		Enter valid password
//		WebElement element3 = driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
//		element3.sendKeys("Amazonpassword");
		
//		Enter invalid password
		WebElement element3 = driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
		element3.sendKeys("Amazonpasswordwrong");
		
//		Click to sign in button
		WebElement element4 = driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]"));
		element4.click();
		
		
		

	}

}
