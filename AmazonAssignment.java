import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAssignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Apple/eclipse-workspace/webdriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
		WebElement element = driver.findElement(By.xpath("//a[@data-nav-ref=\"nav_custrec_signin\"]"));
		element.click();
		WebElement element1 = driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
		element1.sendKeys("mehmetvurall@gmail.com");
//		element1.submit();
		
		WebElement element2 = driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		element2.click();
		
//		WebElement element3 = driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
//		element3.sendKeys("Amazon@2020");
		
		WebElement element3 = driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
		element3.sendKeys("Amazon@20201");
		
		WebElement element4 = driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]"));
		element4.click();
		
		
		

	}

}
