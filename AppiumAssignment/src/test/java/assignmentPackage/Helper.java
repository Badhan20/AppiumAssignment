package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Helper extends Base{
	
	//Click on the Read and Accept Button
	public void ClickOnAcceptButton(AndroidDriver driver) throws InterruptedException {

		WebElement  AcceptButton = driver.findElement(By.xpath("//android.widget.Button[@text='I READ & I ACCEPT']"));
		AcceptButton.click();
	}

	//Click on the Drawer section
	public void ClickDrawerSection(AndroidDriver driver) throws InterruptedException {

		WebElement  DrawerIcon = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"NopStation Cart\"]"));
		DrawerIcon.click();

		Thread.sleep(3000);
	}

	//Click on the "Electronics" Category
	public void ClickElectronicsCategory(AndroidDriver driver) throws InterruptedException {

		WebElement  ElectronicsCategoryButton = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Placeholder\"])[5]"));

		ElectronicsCategoryButton.click();

		Thread.sleep(5000);
	}

	//Scroll down to the "Mattress Bedroom"
	public void ScrollToProduct(AndroidDriver driver) throws InterruptedException {

		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"T-Shirt\").instance(0))"));

		Thread.sleep(1000);
	}

	//Click on the "Mattress Bedroom"
	public void ClickOnProduct(AndroidDriver driver) throws InterruptedException {

		WebElement MattressBedroom = driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/tvProductName\"])[11]"));
		MattressBedroom.click();

		Thread.sleep(3000);
	}

	//Scroll down to Quantity Section
	public void ScrollToQuantity(AndroidDriver driver) throws InterruptedException {

		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Manufacturer\").instance(0))"));

		Thread.sleep(3000);
	}

	//Increase Quantity
	public void IncreaseQuantity(AndroidDriver driver) throws InterruptedException {

		WebElement QuantityPlusButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnPlus"));
		QuantityPlusButton.click();

		Thread.sleep(2000);
	}

	//Add Product to Cart
	public void AddToCart(AndroidDriver driver) throws InterruptedException {

		WebElement AddToCartButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart"));
		AddToCartButton.click();

		Thread.sleep(3000);
	}

	//Verify the Product Added to the Cart
	public void VerifyProductAddedToCart (AndroidDriver driver) throws InterruptedException{

		String ToastMessage = driver.findElement(By.xpath("/hierarchy/android.widget.Toast")).getText();

		if(ToastMessage.equals("The product has been added to your shopping cart")) {

			System.out.println("Product successfully added to the cart."); 
		}

		else
		{
			System.out.println("Something went wrong!");
		}

		Thread.sleep(2000);

	}

	//Click on the Cart Button
	public void ClickOnCart(AndroidDriver driver) throws InterruptedException {

		WebElement CartCounterButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/counterIcon"));
		CartCounterButton.click();

		Thread.sleep(3000);
	}

	//Click on the Checkout Button
	public void ClickCheckoutButton(AndroidDriver driver) throws InterruptedException {

		WebElement CheckoutButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut"));
		CheckoutButton.click();

		Thread.sleep(2000);
	}

	//Click on the Checkout as Guest Button
	public void ClickCheckoutAsGuestButton(AndroidDriver driver) throws InterruptedException {

		WebElement CheckoutAsGuestButton = driver.findElement(By.xpath("//android.widget.Button[@text='Checkout as Guest']"));
		CheckoutAsGuestButton.click();

		Thread.sleep(2000);
	}

	//Provide all details in the Checkout billing details page and Click on the "Continue" button
	public void FillUpBillingInformation(AndroidDriver driver) throws InterruptedException {

		//Provide First Name
		WebElement FirstName = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etFirstName"));
		FirstName.sendKeys("Md Mahfuz Ul Alam");

		//Provide Last Name
		WebElement LastName = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etLastName"));
		LastName.sendKeys("Badhan");

		//Provide Email Address
		WebElement EmailAddress = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etEmail"));
		EmailAddress.sendKeys("test@test.com");

		//Click Country Drop Down
		WebElement CountryDropDown = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/countrySpinner"));
		CountryDropDown.click();

		Thread.sleep(2000);

		//Select Country
		WebElement SelectCountry = driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"android:id/text1\"])[2]"));
		SelectCountry.click();

		Thread.sleep(2000);

		//Click State Drop Down
		WebElement StateDropDown = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/stateSpinner"));
		StateDropDown.click();

		Thread.sleep(2000);

		//Select State
		WebElement StateSelect = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"AA (Armed Forces Americas)\"]"));
		StateSelect.click();

		Thread.sleep(2000);

		//Provide Company name
		WebElement CompanyName = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etCompanyName"));
		CompanyName.sendKeys("Test Company");

		//Provide City
		WebElement City = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etCity"));
		City.sendKeys("Miami");

		//Provide Street Address 01
		WebElement StreetLineOne = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress"));
		StreetLineOne.sendKeys("132 My Street");

		//Provide Street Address 02
		WebElement StreetLineTwo = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress2"));
		StreetLineTwo.sendKeys("Lake View");

		//Scroll to the view the rest of the input field
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"CONTINUE\").instance(0))"));


		//Provide ZIP Code
		WebElement ZIPCode = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etZipCode"));
		ZIPCode.sendKeys("12401");

		//Provide Phone Number
		WebElement PhoneNumber = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etPhone"));
		PhoneNumber.sendKeys("98436433");

		//Provide Fax Number
		WebElement FaxNumber = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etFax"));
		FaxNumber.sendKeys("9855433");

		//Click on the "Continue" Button

		WebElement ContinueButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue"));
		ContinueButton.click();

		Thread.sleep(4000);
	}

	//Select Next Day Air and click on the "Continue" button
	public void NextDayAirSelection(AndroidDriver driver) throws InterruptedException {

		WebElement NextDayAirOption = driver.findElement(By.xpath("//com.bs.ecommerce.customViews.RadioGridGroupforReyMaterial[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/radioGridGroup\"]/android.widget.RelativeLayout[4]"));
		NextDayAirOption.click();

		Thread.sleep(2000);

		WebElement NextContinueButton = driver.findElement(By.xpath("(//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnContinue\"])[2]"));
		NextContinueButton.click();

		Thread.sleep(5000);
	}

	//Scroll down to Check/Money Order
	public void ScrollToCheckMoneyOrder(AndroidDriver driver) throws InterruptedException {

		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Money Order\").instance(0))"));

		Thread.sleep(2000);
	}

	//Select Check/Money Order and click on the "Continue" button
	public void SelectCheckMoneyOrder(AndroidDriver driver) throws InterruptedException {

		WebElement CheckMoneyOrderOption = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/tvPaymentMethodName\" and @text=\"Check / Money Order\"]"));
		CheckMoneyOrderOption.click();

		Thread.sleep(2000);

		WebElement OrderContinueButton = driver.findElement(By.xpath("(//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnContinue\"])[2]"));
		OrderContinueButton.click();

		Thread.sleep(15000);
	}

	//Click on the Next Button
	public void ClickOnNext(AndroidDriver driver) throws InterruptedException {

		WebElement NextButton = driver.findElement(By.xpath("//android.widget.Button[@text=\"Next\"]"));
		NextButton.click();

		Thread.sleep(3000);
	}

	//Click on the Confirmation Button
	public void ClickOnConfirm(AndroidDriver driver) throws InterruptedException {

		WebElement ConfirmButton = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue"));
		ConfirmButton.click();

		Thread.sleep(10000);
	}

	//Verify Order Confirmation Message
	public void VerifyOrderConfirmation(AndroidDriver driver) throws InterruptedException {

		WebElement ConfirmationMessage= driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/md_text_message"));

		String ConfirmationText = ConfirmationMessage.getText();

		if(ConfirmationText.contains("Your order has been successfully processed!")) {

			System.out.println("Order has been processed successfully.");
		}

		else 
		{
			System.out.println("Something went wrong!");
		}
		
	}
}

