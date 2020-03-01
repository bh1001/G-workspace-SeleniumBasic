package nov9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.name("userName")).sendKeys("batman");
		driver.findElement(By.name("password")).sendKeys("batman");
		driver.findElement(By.name("login")).click();

	/*	List<WebElement> radios = driver.findElements(By.name("tripType"));
		
		
		System.out.println(radios);
		System.out.println(radios.size());
		
		radios.get(1).click();
		
	WebElement dd= driver.findElement(By.name("passcount"));*/
	
	/*System.out.println("Title:" +driver.getTitle());
	System.out.println("URL:" +driver.getCurrentUrl());
	
	driver.navigate().to("http://www.google.com");
*/

		
		
	/*	driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
         driver.navigate().forward();
 		Thread.sleep(2000);
        driver.navigate().refresh();*/
		
	           List<WebElement>  allLinks=driver.findElements(By.tagName("a"));
	
	     		System.out.println(allLinks.size());

		for (WebElement link : allLinks) {
			
			String text = link.getText();
     		System.out.println("Text is:" +text);
     		
     		
     		if (text.equals("Car Rentals")) {
     		
     		
			String url = link.getAttribute("href");
     		System.out.println("URL is:" +url);
			
link.click();
//break;
     		

		}
     		String url = link.getAttribute("href");
     		System.out.println("URL is:" +url);
			
		

	}
  
}
}
