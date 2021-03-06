package nov16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.name("userName")).sendKeys("batman");
		driver.findElement(By.name("password")).sendKeys("batman");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.name("findFlights")).click();
		
		
		List<WebElement> allRows = driver.findElements(By.xpath("//form[@name='results']/table/tbody/tr"));
		
		for ( WebElement row : allRows) {
			List<WebElement> cells=row.findElements(By.tagName("td"));
		
		for ( WebElement cell : cells) {
			System.out.println(cell.getText());
		}
		System.out.println();
	}

}
}
