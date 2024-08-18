package Pages;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.ExtentITestListenerClassAdapter;
import Utility.MasterData;

@Listeners(ExtentITestListenerClassAdapter.class)
public class Application_step1 extends ExtentITestListenerClassAdapter{
	MasterData info = new MasterData();
	@Test (priority = 0)
	public void pictureUpload() throws Exception {

		String file = "D:\\downloads\\images.jpg";
		WebElement Profile = driver.findElement(By.xpath("//input[@type='file' and @accept='.jpg,.jpeg,.png,.gif,.bmp']"));
		Profile.sendKeys(file);
	
		Thread.sleep(3200);
	}

	@Test(priority = 1)
	public void name() throws InterruptedException {
		WebElement class_radio = driver.findElement(By.xpath("//span[normalize-space()='MS/MSc']"));
		class_radio.click();
		Thread.sleep(1500);
		
		WebElement Name_bn = driver.findElement(By.id("registrationForm_applicant_name_bn"));
		Name_bn.sendKeys(info.Name_BN);
		Thread.sleep(1000);
		
		WebElement FName_bn = driver.findElement(By.xpath("//input[@id='registrationForm_father_name_bn']"));
		FName_bn.sendKeys(info.FName_BN);
		
		
		WebElement FName_en = driver.findElement(By.xpath("//input[@id='registrationForm_father_name']"));
		FName_en.sendKeys(info.FName_EN);
		
		WebElement genderSelect = driver.findElement(By.xpath("//input[@id='registrationForm_gender']"));
		genderSelect.click();
		genderSelect.sendKeys(info.Gender);
//		genderSelect.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(1000);
		genderSelect.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		
		WebElement MName_en = driver.findElement(By.xpath("//input[@id='registrationForm_mother_name']"));
		MName_en.sendKeys(info.MName_EN);
		
		WebElement MName_bn = driver.findElement(By.xpath("//input[@id='registrationForm_mother_name_bn']"));
		MName_bn.sendKeys(info.MName_BN);
		
		WebElement nationality = driver.findElement(By.xpath("//input[@id='registrationForm_nationality']"));
		nationality.click();
		nationality.sendKeys(info.Nationality);
		nationality.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		nationality.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		WebElement Home_dis = driver.findElement(By.xpath("//input[@id='registrationForm_home_district']"));
		Home_dis.click();
		Home_dis.sendKeys(info.district);
		Home_dis.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		Home_dis.sendKeys(Keys.ENTER);
		Thread.sleep(1000);		
		
	}
	
	@Test(priority = 2)
	public void InputBirthDate() throws Exception {
//	WebElement Birth_year = driver.findElement(By.xpath("//input[@id='registrationForm_dob']"));
//	Birth_year.click();
//	Thread.sleep(2000);
//		
//		WebElement year = driver.findElement(By.cssSelector(".ant-picker-year-btn"));
//	year.click();
//		Thread.sleep(2000);
//
//		WebElement back_button = driver.findElement(By.cssSelector(".ant-picker-header-super-prev-btn"));
//		back_button.click();
//		Thread.sleep(2000);
//		
//		WebElement back_button2 = driver.findElement(By.cssSelector(".ant-picker-header-super-prev-btn"));
//	back_button2.click();
//	Thread.sleep(2000);
//
//		WebElement year_select = driver.findElement(By.xpath("//div[normalize-space()='2000']"));
//		year_select.click();
//		Thread.sleep(2000);
//		
//		WebElement month_select = driver.findElement(By.xpath("//div[normalize-space()='Aug']"));
//	month_select.click();
//	Thread.sleep(2000);
//		
//		WebElement  Day_select = driver.findElement(By.xpath("//div[normalize-space()='10']"));		Day_select.click();
//		Thread.sleep(2000);		
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Locate and click the date input field
	        WebElement birthYear = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='registrationForm_dob']")));
	        birthYear.click();

	        // Click the year button
        WebElement yearButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ant-picker-year-btn")));
	        yearButton.click();
	        // Click the back button twice to go back two years
	        for (int i = 0; i < 2; i++) {
	            WebElement backButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ant-picker-header-super-prev-btn")));
	            backButton.click();
	        }

	        // Select the year 2000
	        WebElement yearSelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='2000']")));
	        yearSelect.click();
        // Select the month August
        WebElement monthSelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='Aug']")));	        monthSelect.click();

	        // Select the day 10th
	        WebElement daySelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='10']")));
	        daySelect.click();
	        
	}
	
	@Test(priority = 3)
	public void PartTwo() throws InterruptedException {
		WebElement Address = driver.findElement(By.xpath("//textarea[@id='registrationForm_applicant_house_road_no']"));
		Address.sendKeys(info.house);
		Thread.sleep(1000);
		
		WebElement Address_bn = driver.findElement(By.xpath("//textarea[@id='registrationForm_applicant_house_road_no_bn']"));
		Address_bn.sendKeys(info.address_bn);
		Thread.sleep(1000);
		
		WebElement NID = driver.findElement(By.xpath("//input[@id='registrationForm_nid']"));
		
		NID.sendKeys(info.nid);
		Thread.sleep(1000);	
	
	}
			
}	 	

	
