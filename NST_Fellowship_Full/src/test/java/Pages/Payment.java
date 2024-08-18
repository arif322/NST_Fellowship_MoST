package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.ExtentITestListenerClassAdapter;

@Listeners(ExtentITestListenerClassAdapter.class)
public class Payment extends ExtentITestListenerClassAdapter {

	@Test(priority = 0)
	public void SubmitMethod() throws InterruptedException {
		Scroller(null);
		WebElement submit =driver.findElement(By.xpath("//span[normalize-space()='Submit']"));
		submit.click();
		Thread.sleep(1200);
		
	}
	
	public void PrintPreview() {
		WebElement preview = driver.findElement(By.xpath("//span[normalize-space()='Print Preview']"));
		preview.click();
		scrollDownSlowly(null);
		
	}
}
