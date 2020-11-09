package ryanqa.pages;




import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * In this class was added all the factory of objects, in addition to the creation of
 *  a constructor to instantiate the actions with the objects
 * @author Adrián Rojas Lara
 * @version 1-0
 *@since 08-11-2020
 */

public class HomePage {
	
	 WebDriver driver; 
	 
	 /**
	  * Declaration of global variables
	  * @category FindBy
	  */
	 
	 @FindBy(xpath="//div/div[2]/button[2]")
	 WebElement acceptCookie;
	 
	 @FindBy(xpath="//hp-header-menu-item[4]/button")
	 WebElement linkLogin;
	 
	 @FindBy(xpath="//input[@name=\'email\']")
	 WebElement userName;
	 
	 @FindBy(xpath="//input[@name=\'password\']")
	 WebElement pwdLogin;
	 
	 @FindBy(xpath="(//button[@type=\'submit\'])[2]")
	 WebElement btnProcessLogin;
	 
	 @FindBy(xpath="//hp-header-menu-item[3]/button")
	 WebElement labelUserLogin;
	 
	 @FindBy(xpath="//input[@id=\'input-button__departure\']")
	 WebElement departure;
	
	 @FindBy(xpath="//fsw-input-button[2]/div/input")
	 WebElement destination;
	 
	 @FindBy(xpath="//BUTTON/HP-SEARCH-WIDGET-TAB/DIV[normalize-space()=\"flights\"]")
	 WebElement generateCalendar;
	 
	 
	 @FindBy(xpath="//ry-spinner[contains(.,'Search')]") 
	 WebElement searchDepartReturn;
	 
	 @FindBy(xpath ="//div/div/div/div[3]") 
	 WebElement priceDestination;
	               
	 @FindBy(xpath="//fare-card/div/div/button") 
	 WebElement valueTravelLightDestination;
	 
	 @FindBy(css=".card-airline-logo svg") 
	 WebElement priceDeparture;
	 
	 @FindBy(xpath="//DIV[1]/FARE-CARD[1]/DIV[1]/DIV[1]/BUTTON[1]") 
	 WebElement valueTravelLightDeparture;
	 
	 @FindBy(xpath="//button[@type='button']") 
	 WebElement selectTitlePassengers;
	 
	 @FindBy(xpath="//ry-dropdown-item/button") 
	 WebElement typeTitlePassengers;
	 
	 @FindBy(id="formState.passengers.ADT-0.name") 
	 WebElement firtsNamePassengers;
	 
	 @FindBy(id="formState.passengers.ADT-0.surname") 
	 WebElement surNamePassengers;
	 
	 @FindBy(xpath="//span/button" ) 		 
	 WebElement btnAddPassengers;
	 
	 @FindBy(xpath="//DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2]/RY-IMAGE[1]/PICTURE[1]/IMG[1]") 	
	 WebElement randomSeatAllocation;
	 
	 @FindBy(xpath="//random-allocation-info/div/div[3]/div/button") 	
	 WebElement confirmRandomSeatAllocation;
	 
	 @FindBy(css=".product:nth-child(1) .ry-radio-circle-button__label") 
	 WebElement smallBagOnly;
     
	 @FindBy(xpath="//bags-continue-flow/button")
	 WebElement bagsContinueFlow;
	 
	 @FindBy(css=".ry-button--full") 
	 WebElement continueTripFlight;
	 
	 @FindBy(css=".basket-total-icon__tick path")
	 WebElement basketBuyshoppingCart;
	 
	 @FindBy(css=".ry-button--full")
	 WebElement basketTotal;
	 
	 @FindBy(className="section-title")
	 WebElement pagePayment;
	 
     public HomePage(WebDriver driver) {
    	 this .driver=driver;
    	 PageFactory.initElements(driver, this);
     }
     
     //click accept cookies
     public void clickAcceptCookie() {
    	 acceptCookie.click();
    	 timeSleep(1500);
     }
     
     //click in link login
     public void clickLinkLogin() {
    	 linkLogin.click();
     }
     
     // set userName (email) textbox
     public void setUsername(String strUserName) {
    	 userName.sendKeys(strUserName);
     }
     
     // set password  textbox
     public void setPassword(String strPassword) {
    	pwdLogin.sendKeys(strPassword);
     }
     
     //Click in login button
     public void clickLogin() {
    	 btnProcessLogin.click(); 
     }
     
     //Get name label user Log in
     public String getLabelUserLogin() {
    	 return labelUserLogin.getText();
    	 
     }
     
     
     //set departure
     public void setDeparture(String strDeparture) {
    	 departure.sendKeys(strDeparture);	 
     }
     
     // set destine
     public void setDestine(String strDestine) {
    	 destination.sendKeys(strDestine);
     }
     
     //click init calendar
     public void clickInitCalendar() {
    	 generateCalendar.click();
    	 timeSleep(3000);
     }
     
     //click search depart return of flight  
     public void clickSearchDepartReturn() {
    	 searchDepartReturn.click();
    	 timeSleep(3500);
     }
     
     //click price destination
     public void clickPriceDestination() {
    	 priceDestination.click();
    	 timeSleep(2000);
    	 
     }
     
     //click price return
     public void clickValueTravelLightDestination() {
    	 valueTravelLightDestination.click();
    	 timeSleep(2000);
     }
     
     //click price departure
     public void clickPriceDeparture() {
    	 priceDeparture.click();
    	 timeSleep(3000);
     }
     
     //click price departure
     public void clickValueTravelLightDeparture() {
    	 valueTravelLightDeparture.click();
    	 timeSleep(2000);
     }
     
     //click type passenger
     public void clickSelectTitlePassenger() {
    	 selectTitlePassengers.click();
    	 typeTitlePassengers.click();
     }
     
     //set name passenger
     public void setNamePassenger(String strNamePassenger) {
    	 firtsNamePassengers.sendKeys(strNamePassenger);
     }
     
   //set surname passenger
     public void setSurNamePassenger(String strSurNamePassenger) {
    	 surNamePassengers.sendKeys(strSurNamePassenger);
     }
     
     //click add passenger
     public void clickAddPassenger() {
    	 btnAddPassengers.click();
    	 timeSleep(3500);
     }
      
     
     // click random seat
     public void clickRandomSeat() {
    	 randomSeatAllocation.click();
    	 timeSleep(2000);
     }
     
     // click confirm random seat
     public void clickConfirmRandomSeat() {
    	 confirmRandomSeatAllocation.click();
    	 timeSleep(5000);
     }
     
     //click select small bag
     public void selectSmallBagOnly() {
    	 smallBagOnly.click();
    	 timeSleep(2000);
     }
     
     //click bag continue flow
     public void clickBagsContinueFlow() {
    	 bagsContinueFlow.click();
    	 timeSleep(2000);
     }
     
     //click continue trip flight
     public void clickContinueTrip() {
    	 continueTripFlight.click();
    	 timeSleep(4000);
     }
     
     //click icon shopping cart
     public void clickShoppingCart() {
    	 basketBuyshoppingCart.click();
    	 timeSleep(3500);
     }
      
     // click total buy
     public void clickTotalBuy() {
    	 basketTotal.click();
    	 timeSleep(3000);
     }
     
     //get title payment 
     public String getNamePay() {
    	 return pagePayment.getText(); 
     }
     
     /**

      * This POM method will be exposed in test case to login in the application

      * @param strUserName

      * @param strPasword

      * @return

      */
     
     public void loginPage(String strUserName, String strPassword ) {
    	 //Accept cookie
    	 this.clickAcceptCookie();
    	 //click link login
    	 this.clickLinkLogin();
    	 timeSleep(3000);
    	 //fill username
    	 this.setUsername(strUserName);

    	 //fill password
    	 this.setPassword(strPassword);
    	 
    	 //click login button
    	 this.clickLogin();
     }
     
     /**
      * This POM method will  be exposed in test case to select departure and destination
      
      * @param strDeparture
      * 
      * @param strDestine
      * 
      * @return
      * 
      */
     
     public void selectDepartureDestination(String strDeparture,String strDestine) {
    	 //delete txtfield departure
    	 this.deletetxtFieldDeparture();
    	 
    	 //Fill txtField departure 
    	 this.setDeparture(strDeparture);
    	 timeSleep(3000);
    	 //Fill txtFiedl destination
    	 this.setDestine(strDestine);
    	 timeSleep(3000);
     }
     /**
      * * in this method all actions are performed: 
        (*) Select the ticket payment amount
        (*) Type of Baggage
        (*) Adding passenger data
        (*) Validate that you access the air ticket payment page
      * @param strName
      * @param strSurName
      */
     
     public void flightReservationProcess(String strName, String strSurName) {
    	
    	 this.clickSearchDepartReturn();
    	 
         this.clickPriceDestination();
    	 
         this.clickValueTravelLightDestination();
    	 
   	     this.clickPriceDeparture();
   	 
    	 this.clickValueTravelLightDeparture();
    	 
    	  this.clickSelectTitlePassenger();
    	 
    	 this.setNamePassenger(strName);
    	 
    	this.setSurNamePassenger(strSurName);
    	 
    	 this.clickAddPassenger();
    	 
    	 this.clickRandomSeat();
    	 
    	 this.clickConfirmRandomSeat();
    	 
    	  this.selectSmallBagOnly();
    	 
    	 this.clickBagsContinueFlow();
    	 
    	 this.clickContinueTrip();
    	 
    	 this.clickShoppingCart();
    	 
    	 this.clickTotalBuy();
    	 
    	 
    	 
     }

     
     
     
     
     
     
     /**
      *  Simulate keyboard erasure in the text field
      */
     public void deletetxtFieldDeparture() {
    	 for (int i = 0; i < 10; i++)
    	 departure.sendKeys(Keys.BACK_SPACE);
    	 timeSleep(5000);
     }
     
     /**waiting time 
      * 
      * @param lngMiliseconds
      */
     public void timeSleep(long lngMiliseconds) {
      try {
		Thread.sleep(lngMiliseconds);
      } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
      	  }
     }
     
     /**
      * simule a click in object calendar
      */
     public void generateFlightDate() {
    	 
    	 //click in init Calendar
    	 this.clickInitCalendar();
     
     }
     
    
}
