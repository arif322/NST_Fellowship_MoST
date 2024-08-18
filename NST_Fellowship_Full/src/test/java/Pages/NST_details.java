package Pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.ExtentITestListenerClassAdapter;
import Utility.MasterData;

@Listeners(ExtentITestListenerClassAdapter.class)
public class NST_details extends ExtentITestListenerClassAdapter{
	
	MasterData info = new MasterData();
	
	@Test
	public void SelectFellowship() throws Exception{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement scroll_1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/section[1]/section[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/a[1]")));
       scrollToElement(driver, scroll_1);
       Thread.sleep(2000);
       
       WebElement NST = driver.findElement(By.xpath("//a[contains(text(),'National Science and Technology (NST) Fellowship')]"));
       NST.click();
       Thread.sleep(2000);
       
       WebElement Details = driver.findElement(By.xpath("//a[contains(text(),'Details')]"));
       Details.click();
       Thread.sleep(4500);
       
           // Maximum number of retries
       int maxRetries = 3;
       int attempts = 0;
       boolean buttonFound = false;

       // Define the wait
       WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));

       while (attempts < maxRetries && !buttonFound) {
           try {
               // Wait for the Apply button to be clickable
               WebElement applyButton = waits.until(ExpectedConditions.elementToBeClickable(
                   By.xpath("//div[@class='text-center mt-3']//a[@class='btn-apply btn-apply-large text-uppercase fw-bold']")));
               applyButton.click();
               buttonFound = true;  // If found, set the flag to true
               System.out.println("Apply button found and clicked.");
           } catch (NoSuchElementException e) {
               // If the button is not found, reload the page and increment the attempt counter
               System.out.println("Apply button not found. Reloading the page...");
               driver.navigate().refresh();
               attempts++;
           } catch (TimeoutException e) {
               // If the wait times out, handle it here
               System.out.println("Apply button not found within the wait time. Reloading the page...");
               driver.navigate().refresh();
               attempts++;
           }
       }

       // If the button is not found after all retries
       if (!buttonFound) {
           System.out.println("Apply button was not found after " + maxRetries + " retries.");
       }
           Thread.sleep(1500);
       
	}
	
	

	}
