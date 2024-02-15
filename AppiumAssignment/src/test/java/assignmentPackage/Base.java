package assignmentPackage;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base extends ExtendReport{

	AndroidDriver driver;

	@BeforeTest
	public void DeviceSetUp() {
		try {

			DesiredCapabilities caps = new DesiredCapabilities();

			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "realme C33");
			caps.setCapability(MobileCapabilityType.UDID, "2B04233000004971");
			caps.setCapability(MobileCapabilityType.APP, "G:\\Software Testing\\Appium\\Necessary Files\\nopstationCart_4401.apk");

			URL baseURL = new URL("http://127.0.0.1:4723/wd/hub");

			driver = new AndroidDriver(baseURL, caps);

			Thread.sleep(5000);

		} catch (Exception exp) {
			System.out.println("Cause is: "+exp.getCause());
			System.out.println("Message is: "+exp.getMessage());
			exp.getStackTrace();
		}
	}

	@Test (priority = 1)
	public void VerifyItemAdditionToCart() throws InterruptedException {

		Helper initiateObj = new Helper();

		ExtentTest captureAndAddToReport = extent.createTest("Verify Item Addition To Cart");

		captureAndAddToReport.log(Status.INFO, "Click on I READ & I ACCEPT button.");

		initiateObj.ClickOnAcceptButton(driver);

		captureAndAddToReport.pass("Successfully clicked on I READ & I ACCEPT button.");


		captureAndAddToReport.log(Status.INFO, "Click on Drawer Section.");

		initiateObj.ClickDrawerSection(driver);

		captureAndAddToReport.pass("Successfully clicked on Drawer Section.");


		captureAndAddToReport.log(Status.INFO, "Click on Electronice Category.");

		initiateObj.ClickElectronicsCategory(driver);

		captureAndAddToReport.pass("Successfully clicked on Electronice Category.");


		captureAndAddToReport.log(Status.INFO, "Scroll to Mattress Bedroom.");

		initiateObj.ScrollToProduct(driver);

		captureAndAddToReport.pass("Mattress Bedroom is visible on the screen.");


		captureAndAddToReport.log(Status.INFO, "Click on the Mattress Bedroom.");

		initiateObj.ClickOnProduct(driver);

		captureAndAddToReport.pass("Successfully clicked on Mattress Bedroom.");


		captureAndAddToReport.log(Status.INFO, "Scroll to Quantity");

		initiateObj.ScrollToQuantity(driver);

		captureAndAddToReport.pass("Quantity is visible on the screen.");


		captureAndAddToReport.log(Status.INFO, "Click on Plus button to increase Quantity.");

		initiateObj.IncreaseQuantity(driver);

		captureAndAddToReport.pass("Quantity increased to 2.");


		captureAndAddToReport.log(Status.INFO, "Click on Add to Cart.");

		initiateObj.AddToCart(driver);

		captureAndAddToReport.pass("Successfully clicked on Add to Cart.");


		captureAndAddToReport.log(Status.INFO, "Veriy Mattress Bedroom is added to the cart.");

		initiateObj.VerifyProductAddedToCart(driver);

		captureAndAddToReport.pass("Mattress Bedroom is successfully added to the cart.");
	}

	@Test (priority = 2)
	public void VerifyOrderConfirmation() throws InterruptedException {

		Helper initiateObj = new Helper();

		ExtentTest captureAndAddToReport = extent.createTest("Verify Order Confirmation");


		captureAndAddToReport.log(Status.INFO, "Click on the Cart.");

		initiateObj.ClickOnCart(driver);

		captureAndAddToReport.pass("Successfully clicked on the Cart.");


		captureAndAddToReport.log(Status.INFO, "Click on the Checkout.");

		initiateObj.ClickCheckoutButton(driver);

		captureAndAddToReport.pass("Successfully clicked on the Checkout.");


		captureAndAddToReport.log(Status.INFO, "Click on the Checkout as Guest.");

		initiateObj.ClickCheckoutAsGuestButton(driver);

		captureAndAddToReport.pass("Successfully clicked on the Checkout as Guest.");


		captureAndAddToReport.log(Status.INFO, "Fill up Billing Information.");

		initiateObj.FillUpBillingInformation(driver);

		captureAndAddToReport.pass("Billing Information is filled up.");


		captureAndAddToReport.log(Status.INFO, "Select Next Day Air option and click on Continue button.");

		initiateObj.NextDayAirSelection(driver);

		captureAndAddToReport.pass("Next Day Air option is selectted and Contine button is clicked.");


		captureAndAddToReport.log(Status.INFO, "Scroll to Check/Money Order");

		initiateObj.ScrollToCheckMoneyOrder(driver);

		captureAndAddToReport.pass("Check/Money Order is visible on the screen.");


		captureAndAddToReport.log(Status.INFO, "Select Check/Money Order option and click on Continue button.");

		initiateObj.SelectCheckMoneyOrder(driver);

		captureAndAddToReport.pass("Check/Money Order option is selectted and Contine button is clicked.");


		captureAndAddToReport.log(Status.INFO, "Click on the Next.");

		initiateObj.ClickOnNext(driver);

		captureAndAddToReport.pass("Successfully clicked on the Next.");


		captureAndAddToReport.log(Status.INFO, "Click on the Confirm.");

		initiateObj.ClickOnConfirm(driver);

		captureAndAddToReport.pass("Successfully clicked on the Confirm.");


		captureAndAddToReport.log(Status.INFO, "Veriy order is confirmed.");

		initiateObj.VerifyOrderConfirmation(driver);

		captureAndAddToReport.pass("Oder verified successfully");
	}

	@AfterTest
	public void TearDown() {

		driver.quit();
	}
}
