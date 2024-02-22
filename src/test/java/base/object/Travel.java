package base.object;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.com.Driver;

//import DataValues.ReadWrite;

public class Travel extends Driver {

	 public Travel(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }
    // Clicking on the insurance button
    @FindBy(how = How.XPATH, using = "//i[@class='icon-bg homeIconsBg icon-bg-new ti']")
    public WebElement travelButton;
    
    public void clickTravelButton() {
        travelButton.click();
    }
    @FindBy(how=How.XPATH,using="//*[@id='country']")
    public WebElement searchButton;
    public void searchButton(String country)
    {
    	searchButton.click();
    	searchButton.sendKeys(country);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='search-country']/ul/li")
    public WebElement searchCountry;
    
    public void searchCountry() {
        searchCountry.click();
    }
    
    @FindBy(how=How.XPATH,using="//*[@class='travel_main_cta']")
    public WebElement nextButton;
    
    public void nextButton()
    {
    	nextButton.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='prequote-wrapper']/div[2]/div/div[1]/div/div[1]/div/div/input")
    public WebElement dateButton;
    
    public void clickDateButton() {
        dateButton.click();
    }

    @FindBy(how = How.XPATH, using = "(//button[@role='cell' and @aria-label='Feb 25, 2024'])")
    public WebElement startDate;
    
    public void selectStartDate() {
        startDate.click();
    }

    @FindBy(how = How.XPATH, using = "(//button[@role='cell' and @aria-label='Feb 29, 2024'])")
    public WebElement endDate;
    
    public void selectEndDate() {
        endDate.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='prequote-wrapper']/div[2]/div/div[2]/button")
    public WebElement proceedToTravellerButton;
    
    public void clickProceedToTravellerButton() {
        proceedToTravellerButton.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='prequote-wrapper']/div[2]/div/div[1]/div[1]/div[2]/label")
    public WebElement numberOfTraveller;
    
    public void clickNumberOfTraveller() {
        numberOfTraveller.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='0']")
    public WebElement dropDown1;
    
    public void selectDropDown1() {
        dropDown1.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='optionBox_0_wrapper']/div[24]/label")
    public WebElement age1;
    
    public void selectAge1() {
        age1.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='1']")
    public WebElement dropDown2;
    
    public void selectDropDown2() {
        dropDown2.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='optionBox_1_wrapper']/div[23]/label")
    public WebElement age2;
    
    public void selectAge2() {
        age2.click();
    }
    
    @FindBy(how=How.XPATH,using="//*[@id='prequote-wrapper']/div[2]/div/div[2]")
    public WebElement NButton;
    public void NButton()
    {
    	NButton.click();
    }
    
    @FindBy(how = How.XPATH, using = "//*[@id='prequote-wrapper']/div[2]/div/div[1]/div[1]/div[2]")
    public WebElement preMedicalCondition;
    
    public void clickPreMedicalCondition() {
        preMedicalCondition.click();
    }

    @FindBy(how = How.ID, using = "mobileNumber")
    public WebElement mobileNumber;

    public void enterMobileNumber(String number) {
        mobileNumber.sendKeys(number);
    }
    @FindBy(how = How.XPATH, using = "//*[@id='prequote-wrapper']/div[2]/div/div[2]/div")
    public WebElement viewPlanButton;
    
    public void clickViewPlanButton() {
        viewPlanButton.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@for='studentTrip']")
    public WebElement studentTrip;
    

    public void clickStudentTrip() {
        studentTrip.click();
    }


    @FindBy(how = How.XPATH, using = "//*[@for='Traveller_1']")
    public WebElement traveller1;
    
    public void clickTraveller1() {
        traveller1.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@for='Traveller_2']")
    public WebElement traveller2;
    
    public void clickTraveller2() {
        traveller2.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='feet']")

	public WebElement Days;

	public void Days_no() {
		Days.click();
		Select select = new Select(Days);
		select.selectByVisibleText("30 Days");
	}

    @FindBy(how = How.XPATH, using = "//*[@id='amt-modal']/div[3]")
    public WebElement tripDurationApplyButton;
    
    public void clickTripDurationApplyButton() {
        tripDurationApplyButton.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/div[2]/aside/section[1]/details/summary/p")
    public WebElement filterButton;
    
    public void clickFilterButton() {
        filterButton.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='17_sort']")
    public WebElement lowHighPrice;
    
    public void clickLowHighPrice() {
        lowHighPrice.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@class='quotesCardWrapper ']")
    public static List<WebElement> insuranceList;
    
    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/article/h1/a")
    public WebElement HomeButton;
    
    public void clickHomeButton()
    {
    	HomeButton.click();
    }

   


   

   

    

    

    

 

    

  

    

    

    

   

    

   

    
    

  

   

   
}

	




	
	/*By Next_button= By.xpath("//*[@class='travel_main_cta']");
	By Date_button= By.xpath("//*[@id='prequote-wrapper']/div[2]/div/div[1]/div/div[1]/div/div/input");
	By Start_date= By.xpath("(//button[@role='cell' and @aria-label='Feb 20, 2024'])");
	By End_date=By.xpath("(//button[@role='cell' and @aria-label='Feb 28, 2024'])");
	By Proceed_to_Traveller_button=By.xpath("//*[@id=\\\"prequote-wrapper\\\"]/div[2]/div/div[2]/button");
	By Number_of_Travallar= By.xpath("//*[@id='prequote-wrapper']/div[2]/div/div[1]/div[1]/div[2]/label");
	By Drop_downn1=By.xpath("//*[@id='0']");
	By Age_1=By.xpath("//*[@id='optionBox_0_wrapper']/div[24]/label");
	By Dropdown_2=By.xpath("//*[@id='1']");
	By Age_2=By.xpath("//*[@id='optionBox_1_wrapper']/div[23]/label");
	By Pre_Medical_Condition=By.xpath("//*[@id='prequote-wrapper']/div[2]/div/div[1]/div[1]/div[2]");
	By Mobile_Number= By.xpath("//*[@id='mobileNumber']");
	By View_plan_button=By.xpath("//*[@id='prequote-wrapper']/div[2]/div/div[2]/div");
	By Student_trip=By.xpath("//*[@for='studentTrip']");
	By Traveller_1=By.xpath("//*[@for='Traveller_1']");
	By Traveller_2=By.xpath("//*[@for='Traveller_2']");
	By Trip_duration=By.xpath("//*[@id='feet']");
	By Trip_duration_Apply_button=By.xpath("//*[@id='amt-modal']/div[3]");
	By Filter_button=By.xpath("//*[@id='root']/div/div[2]/aside/section[1]/details/summary/p");
	By Low_high_price=By.xpath("//*[@id='17_sort']");
	By Insurance_List=By.xpath("//*[@class='quotesCardWrapper ']");
	
	public void TravelInsurance()
	{
		
	}
	*/
