package nov30TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TESTNG {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	                                       }
	     @BeforeTest
	      public void launchBrowser()      {
	          System.out.println("launching firefox browser"); 
	        //  System.setProperty("webdriver.firefox.marionette", driverPath);
	       //   driver = new FirefoxDriver();
	         // driver.get(baseUrl);
	                                        }
	          
	          @Test
	          public void verifyHomepageTitle(){
		          System.out.println("launching firefox browser11"); 

	              String expectedTitle = "Welcome: Mercury Tours";
	              WebDriver driver;
			//	String actualTitle = driver.getTitle();
	             // Assert.assertEquals(actualTitle, expectedTitle);
	                                             }
	          @AfterTest
	          public void terminateBrowser() {
	        	  
		          System.out.println("launching firefox browser22"); 

	            //  driver.close();
	                                          }
	          @Test(priority=0)
	          public void verifyHomepageTitle1(){
		          System.out.println("launching firefox browser1111"); 

	              String expectedTitle = "Welcome: Mercury Tours";
	              WebDriver driver;
                                               }
}



