package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

import Utility.ExtentITestListenerClassAdapter;

@Listeners(ExtentITestListenerClassAdapter.class)
public class SaveButton extends ExtentITestListenerClassAdapter{
	
	public void savebutton(WebDriver driver) throws InterruptedException {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Save']")));
	        saveButton.click();
		Thread.sleep(1200);
	}
	public void savebutton1(WebDriver driver) throws InterruptedException {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45)); // increased wait time

	        // Locate the save button
	        WebElement saveButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body.public-theme-wrapper.public-theme-wrapper_en_application_most_nst-fellowship.grant-nst-form.ant-scrolling-effect:nth-child(2) div.ant-modal-root div.ant-modal-wrap.ant-modal-centered div.ant-modal.form-page-modal.form-page-modal-schooling-record div.ant-modal-content:nth-child(2) div.ant-modal-footer > button.ant-btn.ant-btn-primary:nth-child(2)")));
	        System.out.println("Save button found and visible.");

	        // Scroll the element into view
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", saveButton);
	        System.out.println("Scrolled to save button.");

	        // Check if button is disabled
	        String isDisabled = saveButton.getAttribute("disabled");
	        if (isDisabled != null && isDisabled.equals("true")) {
	            System.out.println("Save button is disabled.");
	        } else {
	            System.out.println("Save button is enabled.");
	        }

	        // Use JavaScript to click the button
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", saveButton);
	        System.out.println("Save button clicked using JavaScript.");
	    } catch (Exception e) {
	        System.err.println("Failed to click save button: " + e.getMessage());
	        e.printStackTrace();
	    }
	    Thread.sleep(1200);
	}

}
