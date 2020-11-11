package FirstTestA.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Apple/eclipse-workspace/webdriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		WebElement element = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		element.sendKeys("codingbook");
		element.click();
		element.submit();
		
//		WebElement element = driver.findElement(By.xpath("//input[@name=\"q\"]"));
//		element.sendKeys("CodingBook"); 
//		element.submit();
//		
//		driver.findElement(By.xpath("//cite[text()='codingbook.org']")).click();
				
	}

}
