package ryanqa.test;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.BeforeClass;
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
	static ExtentReports report;
	static ExtentTest test;
	HomePage objPage;

 @BeforeClass	
 public static void startTest() { 
	 report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
	 test = report.startTest("TestRyanAir");
 }
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",driverPath);
    	driver= new ChromeDriver();
    	test.log(LogStatus.INFO,"Use Chrome browser");
    	actions = new Actions(driver);
    	driver.manage().window().maximize();
    	test.log(LogStatus.INFO,"Windows maximize");
   		driver.manage().deleteAllCookies();
   		test.log(LogStatus.INFO,"Delete cookies");
   		driver.get(url);
   		test.log(LogStatus.INFO, "Application is up and running");
	}
	
	@After
    public void tearDown() {
    //  driver.quit();
    }
	
	@AfterClass
	public static void endTest(){
		report.endTest(test);
		report.flush();
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
		 
		 
		 objPage.loginPage("gestoria.atf@gmail.com", "Walker123");
		 test.log(LogStatus.PASS,"Login with the user  ryanair.adrianrojaslara@gmail.com");
		 
		Assert.assertTrue(objPage.getLabelUserLogin().contains("Sign up"));
		
		objPage.selectDepartureDestination("Manchester", "Tenerife South");
		test.log(LogStatus.PASS,"Given I make a booking from Manchester to Tenerife South on  for 1 adult ");
		
		actions.sendKeys(Keys.TAB).build().perform();
		
		objPage.clickInitCalendar();
		
		
		for (int i = 0; i < 19; i++) {
    	    actions.sendKeys(Keys.TAB).build().perform();
    	    
    		}
    	actions.sendKeys(Keys.ENTER).build().perform();
    	
    	test.log(LogStatus.PASS,"Date Depart always is random");
    	for (int i = 0; i < 15; i++) {
    	    actions.sendKeys(Keys.TAB).build().perform();
    	    
    		}
    	actions.sendKeys(Keys.ENTER).build().perform();
    	test.log(LogStatus.PASS,"Date return always is random");
    	
    	objPage.flightReservationProcess("Adrián","Rojas Lara");
    	test.log(LogStatus.PASS,"Date passenger  Adrián Rojas");
    	assertEquals(objPage.getNamePay(),"Contact details\nWe will use it for flight changes and booking confirmation.  (Fields marked with * are mandatory)");
    	test.log(LogStatus.PASS,"we verify that we are on the card payment page.");
    	
    	
    	this.objPage.setTypeCardNumber("5540 0289 4697 2012");
    	test.log(LogStatus.PASS," Use the card number : "+ "5540 0289 4697 2012");
     	
    	this.objPage.setClickMonthCardNumber();
    	this.objPage.selecTypeMonthCardNumber();
    	test.log(LogStatus.PASS," the month  expire of card : "+ "October");
    	
    	this.objPage.setClickYearCardNumber();
    	this.objPage.selecTypeYearCardNumber();
    	test.log(LogStatus.PASS," the year expire of card : "+ "2024");
    	
    	this.objPage.setTypeCVV("645");
    	test.log(LogStatus.PASS," Fill CVV  : "+ "645");

    	this.objPage.typeNameCreditCar();
    	actions.sendKeys("My Gold Card").build().perform();
    	test.log(LogStatus.PASS," Fill save the card name  : "+ "My gold card");

    
    	objPage.typeStreetCreditCar("Street Duquesa Villahermosa");
    	test.log(LogStatus.PASS," Fill the name street  : "+ "Street Duquesa Villahermosa");
    	
     	objPage.typeCityCreditCar("Zaragoza");
    	test.log(LogStatus.PASS," Fill the city card ");
    	
    	
     	objPage.typeCountryCreditCar("Spain");
    	test.log(LogStatus.PASS," Fill the country card ");
    	
    	objPage.typePhoneCreditCar("633566510");
    	test.log(LogStatus.PASS," Fill the contact phone card ");
    	
    	objPage.typeZipCreditCar();
    	actions.sendKeys("50010").build().perform();
    	test.log(LogStatus.PASS," Fill the contact Zip postal ");
    	
    	objPage.clickRadioAcppeConditions();
    	test.log(LogStatus.PASS," accept Conditions ");
    	
    	
    	
    	objPage.clickPayButton();
    	test.log(LogStatus.PASS," Click Pay Button ");
    	
    	
	}
    
	
}
