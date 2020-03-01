package nov9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		
		driver.get("https://www.toolsqa.com/automation-practice-form/");

	/*	WebElement textBox=driver.findElement(By.name("firstname"));
		textBox.sendKeys("batman");
		WebElement textBox1=driver.findElement(By.name("lastname"));
		textBox1.sendKeys("baan");*/
		

		Thread.sleep(5000);
		driver.findElement(By.id("cookie_action_close_header")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("batman");
		driver.findElement(By.id("lastname")).sendKeys("batman");
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-1")).click();
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.id("tool-1")).click();
		
      
		/*Select. multi = new Select(driver.findElement(By.id("continentsmultiple")));
		multi.selectByValue("sa");*/
		

	}

}
