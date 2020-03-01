package nov16;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.findElement(By.id("followall")).click();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		
		
		for (String window :allwindows ) {
			
			if (!window.equals(parentWindow)) {
				
				driver.switchTo().window(window);
				String title = driver.getTitle();
				if (title.contains("Twitter")) {
					driver.findElement(By.id("username_or_email")).sendKeys("08483835599");
					break;
				}
				
			}


	}
     driver.switchTo().window(parentWindow);
	}
	
}
