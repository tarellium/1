package webdriverpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlesearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("herndon va wheather");
		element.submit();
		System.out.println("page title is :"+driver.getTitle());

	}

}
