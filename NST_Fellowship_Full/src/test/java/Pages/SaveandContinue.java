package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.ExtentITestListenerClassAdapter;

@Listeners(ExtentITestListenerClassAdapter.class)
public class SaveandContinue extends ExtentITestListenerClassAdapter {
	
	@Test
	public void SaveandContinueButton() throws InterruptedException {
		WebElement saveButton = driver.findElement(By.xpath("//span[normalize-space()='Save and Continue']"));
		saveButton.click();
		Thread.sleep(5000);
	}

}
