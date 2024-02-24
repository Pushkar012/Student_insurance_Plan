package policyBazaar.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import com.base.com.Driver;
import base.object.Travel;
import base.object.Car;
import base.object.Health;

public class TravelInsuranceTest {
    public WebDriver driver;
    private Driver driverSetup;
    public Travel travelPage;
    public Car carPage;
    public Health healthPage;
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setUp() {
        driverSetup = new Driver();
        driver = driverSetup.setup();
        travelPage = new Travel(driver);
        carPage= new Car(driver);
        healthPage= new Health(driver);

        // Initialize Extent report
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    @Test(groups= {"sanity"},priority = 1)
    public void testTravelInsurance() throws InterruptedException {
        test = extent.createTest("testTravelInsurance");
        test.log(Status.INFO, "Clicking on the insurance button");

        travelPage.clickTravelButton();

        // Get the window handles
        String parentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();

        // Switch to the child window
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Capture screenshot
        captureScreenshot("testTravelInsurance");
    }

    @Test(groups= {"sanity"},priority = 2)

    public void SelectDestination() throws InterruptedException {
        test = extent.createTest("SelectDestination");
        test.log(Status.INFO, "Selecting destination");
        Thread.sleep(2000);
        travelPage.searchButton("United Kingdom");
        travelPage.searchCountry();
        travelPage.nextButton();

        // Capture screenshot
        captureScreenshot("SelectDestination");
    }

    @Test(groups= {"sanity"},priority = 3)
    public void SelectDate() throws InterruptedException {
        test = extent.createTest("SelectDate");
        test.log(Status.INFO, "Selecting date");
        Thread.sleep(2000);
        travelPage.clickDateButton();
        travelPage.selectStartDate();
        travelPage.selectEndDate();
        travelPage.clickProceedToTravellerButton();
        
        travelPage.clickNumberOfTraveller();
        travelPage.selectDropDown1();
        travelPage.selectAge1();
        travelPage.selectDropDown2();
        travelPage.selectAge2();
        travelPage.NButton();
        
        // Capture screenshot
        captureScreenshot("SelectDate");
    }

    @Test(priority = 4)
    public void ViewPlan() throws InterruptedException {
    	
        test = extent.createTest("ViewPlan");
        test.log(Status.INFO, "Viewing plan");
        Thread.sleep(2000);
        travelPage.clickPreMedicalCondition();
        travelPage.enterMobileNumber("7549234391");
        travelPage.clickViewPlanButton();

        // Capture screenshot
        captureScreenshot("ViewPlan");
    }

@Test(priority = 5)

    public void SelectingStudentTrip() throws InterruptedException {
        test = extent.createTest("SelectingStudentTrip");
        test.log(Status.INFO, "Selecting student trip");

        Thread.sleep(2000);
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,150)", "");
		 

        travelPage.clickStudentTrip();
        Thread.sleep(2000);
        travelPage.clickTraveller1();
        travelPage.clickTraveller2();
        travelPage.Days_no();
        Thread.sleep(2000);
        travelPage.clickTripDurationApplyButton();
        
        travelPage.clickFilterButton();
        travelPage.clickLowHighPrice();

        // Capture screenshot
        captureScreenshot("SelectingStudentTrip");
    }

@Test(priority = 6)

    public void InsuranceData() throws InterruptedException {
        test = extent.createTest("InsuranceData");
        test.log(Status.INFO, "Retrieving insurance data");
        Thread.sleep(2000);
        List<WebElement> planList = Travel.insuranceList;
        for (int i = 0; i <=2 && i < planList.size(); i++) {
            WebElement plan = planList.get(i);
            String itemText = plan.getText();
            String[] lines = itemText.split("\\n");
            if(i==0)
            {
            String provider = lines[i == 0 ? 0 : i + 0];
            String planName = lines[i == 0 ? 1 : i + 1]; 
            String amount = lines[i == 0 ? 4 : i + 4]; 
            System.out.println("Insurance Provider: " + provider);
            System.out.println("Plan Name: " + planName);
            System.out.println("Amount: " + amount);
            System.out.println("----------------------");
            }
            if(i==1)
            {	String provider2 = lines[i == 0 ? 0 : i + 0];
            String planName2 = lines[i == 0 ? 1 : i + 1]; 
            String amount2 = lines[i == 0 ? 4 : i + 4]; 
            	 System.out.println("Insurance Provider: " + provider2);
                 System.out.println("Plan Name: " + planName2);
                 System.out.println("Amount: " + amount2);
                 System.out.println("-------------------------");
            }
            
                if(i==2)
                {	String provider3 = lines[i == 0 ? 0 : i - 1]; 
                String planName3 = lines[i == 0 ? 1 : i + 0]; 
                String amount3 = lines[i == 0 ? 4 : i + 3]; 
                	 System.out.println("Insurance Provider: " + provider3);
                     System.out.println("Plan Name: " + planName3);
                     System.out.println("Amount: " + amount3);
                     System.out.println("----------------------");
            }  
        }

        // Capture screenshot
        captureScreenshot("InsuranceData");

        travelPage.clickHomeButton(); // navigate back to home page 
    }
    
@Test( priority = 7)

    public void SwitchChild()
    {
    	 // Get the window handles
        String parentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();

        // Switch to the child window
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
    
@Test(priority = 8)

    public 	void CarInsurance() throws InterruptedException
    {
    	test = extent.createTest("testCarInsurance");
        test.log(Status.INFO, "Testing car insurance");

        carPage.clickCarInsuranceButton();
        carPage.clickWithoutCarNumber();
        carPage.clickSearchButton();
        carPage.clickRtoButton();
        carPage.clickCarBrandButton();
        carPage.clickCarSearchButton();
        carPage.clickCarSelectButton();
        carPage.clickCarFuelType();
        carPage.clickCarVariant();
      
        // Capture screenshot
        captureScreenshot("testCarInsurance");
    }
	@Test(priority=9)
	public void fillingForm() throws InterruptedException
	{
		
		carPage.enterName("Teju");
        carPage.enterEmail("abc@123");
        carPage.clickCaptureEmail_Error();
        carPage.clickFillingDetails_MobileNumber("12345678");
        carPage.clickApplyButton();
        carPage.clickNavigateBackTo_HomePage();
	}
	
	@Test(priority=10)
	public void HealthInsurance()
	{
		healthPage.clickMenuButton();
		List<WebElement> healthInsuranceList = Health.HealthMenuList;

		// Extract the text values into a separate list
		List<String> textValues = new ArrayList<>();
		for (WebElement health_insurance : healthInsuranceList) {
		    textValues.add(health_insurance.getText());
		}

		// Sort the text values
		Collections.sort(textValues);

		// Print the sorted values
		for (String textValue : textValues) {
			System.out.println("--------------------------HEALTH INSURANCE LIST-----------------------------------");
		    System.out.println(textValue);
		}
	}


    @AfterMethod
    public void afterMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, "Test Case Failed: " + result.getName());
            test.log(Status.FAIL, result.getThrowable());
            // Capture screenshot for failed test case
            captureScreenshot(result.getName() + "_failed");
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, "Test Case Passed: " + result.getName());
            // Capture screenshot for passed test case
            captureScreenshot(result.getName() + "_passed");
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.log(Status.SKIP, "Test Case Skipped: " + result.getName());
        }
    }

    @AfterClass
    public void tearDown() {
       Driver.CloseBrowser();

        // Generate the Extent report
        extent.flush();
    }

    private void captureScreenshot(String screenshotName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = "screenshots/" + screenshotName + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
            test.addScreenCaptureFromPath(destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
