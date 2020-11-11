package FirstTestA.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver", "/Users/Apple/eclipse-workspace/webdriver/chromedriver");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(5000); 
		
		WebElement element = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		element.sendKeys("CodingBook"); 
		element.submit();
		Thread.sleep(5000); 
		
		driver.findElement(By.xpath("//cite[text()='codingbook.org']")).click();
		Thread.sleep(5000); 

		driver.findElement(By.linkText("Test Automation")).click();
		Thread.sleep(5000); 

		driver.findElement(By.xpath("//a[@data-tab=\"#tab-curriculum\"]")).click();
		Thread.sleep(5000); 

		driver.findElement(By.xpath("//span[contains(text(),'Basic Test Automation – Assignments')]")).click();
		Thread.sleep(5000); 

		driver.findElement(By.xpath("//a[contains(text(), 'https://www.youtube.com/watch?v=LYqbNg5I9sA')]")).click();
	}

}
