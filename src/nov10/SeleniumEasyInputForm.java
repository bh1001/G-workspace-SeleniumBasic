package nov10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javafx.scene.control.Alert;

public class SeleniumEasyInputForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		

		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
	//	driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me!')]")).click();
		
		
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		Thread.sleep(2000);
		((org.openqa.selenium.Alert) alert).accept();
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		((org.openqa.selenium.Alert) alert).accept();
		System.out.println(driver.findElement(By.id("confirm-demo")).getText());
		
		driver.findElement(By.xpath("//*[contains(text(),'Click for Prompt Box')]")).click();
		((WebElement) alert).sendKeys("Mohammad");
		((org.openqa.selenium.Alert) alert).accept();
		System.out.println(driver.findElement(By.id("prompt-demo")).getText());
		
	}

}
