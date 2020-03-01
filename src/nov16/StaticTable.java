package nov16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class StaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		/*String val = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[2]/td[2]")).getText();
		System.out.println(val);
		
		String val1 = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[1]/td[1]")).getText();
		System.out.println(val1);

		
		String val2 = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[3]/td[3]")).getText();
		System.out.println(val2);

		
		String val3 = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[4]/td[4]")).getText();
		System.out.println(val3);*/
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
          
		
		for ( WebElement row : allRows)
		{
			List<WebElement> cells = row.findElements(By.tagName("td"));
			WebElement th = row.findElement(By.tagName("th"));
			
			
			if(th.getText().equals("fincial center"));
			System.out.println(th.getText());
			
			for ( WebElement cell : cells) {
				System.out.println(cell.getText());
			}
			
		}
		System.out.println();
	}

}
