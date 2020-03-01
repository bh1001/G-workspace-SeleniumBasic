 package nov3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		WebElement textBox=driver.findElement(By.name("userName"));
		
		textBox.sendKeys("batman");
		
        WebElement textBox1=driver.findElement(By.name("password"));
		
		textBox1.sendKeys("12345");
		
		 WebElement click=driver.findElement(By.name("Sign-In"));
			
			click.sendKeys("Sign-In");
			
	/*	driver.findElement(By.linkText("REGISTER")).click();
		
		
      WebElement textBox=driver.findElement(By.name("firstName"));
		
		textBox.sendKeys("abc");
		
		 WebElement textBox1=driver.findElement(By.name("lastName"));
			
			textBox1.sendKeys("pqr");
			
         WebElement textBox2=driver.findElement(By.name("phone"));
			
			textBox2.sendKeys("1234567890");
			
			
	     WebElement textBox3=driver.findElement(By.name("userName"));
				
				textBox3.sendKeys("bkwalhe1996@gmail.com");
				
		WebElement textBox4=driver.findElement(By.name("address1"));
					
					textBox4.sendKeys("hadapsar pune 28 ");
			
	    WebElement textBox5=driver.findElement(By.name("address2"));
						
						textBox5.sendKeys("near manish market");
						
						
	     WebElement textBox6=driver.findElement(By.name("city"));
							
							textBox6.sendKeys("pune");
							
							
		 WebElement textBox7=driver.findElement(By.name("state"));
								
								textBox7.sendKeys("Maharashtra");
								
		 WebElement textBox8=driver.findElement(By.name("postalCode"));
									
									textBox8.sendKeys("411028");
									
		 WebElement textBox9=driver.findElement(By.name("email"));
										
										textBox9.sendKeys("lmn");
										
		WebElement textBox10=driver.findElement(By.name("password"));
											
											textBox10.sendKeys("1001");
											
	 WebElement textBox11=driver.findElement(By.name("confirmPassword"));
												
												textBox11.sendKeys("1001");
												
												
												
	 WebElement click=driver.findElement(By.name("SUBMIT"));
													
										click.sendKeys("");
				
		*/
	}

}
