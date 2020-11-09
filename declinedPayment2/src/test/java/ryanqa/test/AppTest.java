package ryanqa.test;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ryanqa.pages.HomePage;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	String driverPath="C:\\chromedriver.exe"; 
    private String url="https://www.ryanair.com/ie/en";
	WebDriver driver;
	private Actions actions;
	ExtentReports report;
	ExtentTest logger;
	HomePage objPage;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",driverPath);
    	driver= new ChromeDriver();
    	actions = new Actions(driver);
    	report=new ExtentReports("Report/report.html");
    	logger=report.startTest("VerifyBlogTitle");
    	driver.manage().window().maximize();
   		driver.manage().deleteAllCookies();
   		driver.get(url);
   		logger.log(LogStatus.INFO, "Application is up and running");
	}
	@After
    public void tearDown() {
    //  driver.quit();
    }
  
	 /**

     * This test go to https://www.ryanair.com/ie/en

     * Verify login page title as ryanair.adrianrojaslara@gmail.com 

     * Login to application

     * Verify the home page using Dashboard message

     */
	
	 @Test
	public void test_process_booking_payment_cancel() {
		 
		 
		 
		 objPage= new HomePage(driver);
		 
		 objPage.loginPage("ryanair.adrianrojaslara@gmail.com", "445566Ed");
		
		Assert.assertTrue(objPage.getLabelUserLogin().contains("Sign up"));
		
		objPage.selectDepartureDestination("Manchester", "Tenerife South");
		
		actions.sendKeys(Keys.TAB).build().perform();
		
		objPage.clickInitCalendar();
		
		
		for (int i = 0; i < 19; i++) {
    	    actions.sendKeys(Keys.TAB).build().perform();
    	    
    		}
    	actions.sendKeys(Keys.ENTER).build().perform();
    	
    	for (int i = 0; i < 15; i++) {
    	    actions.sendKeys(Keys.TAB).build().perform();
    	    
    		}
    	actions.sendKeys(Keys.ENTER).build().perform();
    	
    	
    	objPage.flightReservationProcess("Adrián","Rojas Lara");
    	assertEquals(objPage.getNamePay(),"Contact details\nWe will use it for flight changes and booking confirmation.  (Fields marked with * are mandatory)");
	}
    
	
}
