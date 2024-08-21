package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.ExtentITestListenerClassAdapter;

@Listeners(ExtentITestListenerClassAdapter.class)
public class Upload2 extends ExtentITestListenerClassAdapter{
	
	public void savebutton() throws InterruptedException {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	        
	        // Wait for the Save button to be visible and clickable
	        WebElement saveButton1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Save')])[3]")));
	        saveButton1 = wait.until(ExpectedConditions.elementToBeClickable(saveButton1));
	        
	        // Scroll to the element to ensure it is in view
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", saveButton1);
	        System.out.println("Save button clicked using JavaScript.");

	        // Click the Save button
	 
	        saveButton1.click();
	        Thread.sleep(1200);  // Small delay after clicking

	    } catch (Exception e) {
	        System.out.println("Failed to click the Save button: " + e.getMessage());
	        e.printStackTrace();
	    }
	}
		@Test(priority = 1)
		public void attachment_upload2() throws AWTException,InterruptedException {
	
			
			  try {
		            // Navigate to the URL where the file upload is located
		           

		            // Find the first "Upload" button and click it
		            WebElement attachment1 = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/button[1]"));
		           
		            attachment1.click();
		            
		            String file2 = "D:\\downloads\\Abdul-Alim-E-Challan-copy.pdf";
		            // Wait for the upload dialog or element to become clickable
		            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		            WebElement upload2 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Click to Upload')])[2]")));
		            // Click on upload button using Actions class
		            
		            Actions act1 = new Actions(driver);
		            act1.moveToElement(upload2).click().perform();

		            // Alternatively, use JavaScript to click if Actions don't work
//		            JavascriptExecutor js = (JavascriptExecutor) driver;
//		            js.executeScript("arguments[0].click();", upload1);

		            // Prepare file for upload
		            Robot rb1 = new Robot();
		            rb1.delay(2000);
		            StringSelection ss1 = new StringSelection(file2);
		            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);

		            // Use Robot to paste file path and press Enter
		           // Delay before pasting
		            rb1.keyPress(KeyEvent.VK_CONTROL);
		            rb1.keyPress(KeyEvent.VK_V);
		            Thread.sleep(2000);
		         
		            rb1.keyRelease(KeyEvent.VK_CONTROL);
		            rb1.keyRelease(KeyEvent.VK_V);
		            rb1.delay(2000);  // Delay before pressing Enter
		            rb1.keyPress(KeyEvent.VK_ENTER);
		            rb1.keyRelease(KeyEvent.VK_ENTER);

		            // Additional delay to ensure the file is uploaded
		            Thread.sleep(2000);

		            // Assert and save
//		            Assert.assertTrue(true, "File upload assertion failed");
		          
		            savebutton();
		           
		            // Add a delay for the save button to process
		            Thread.sleep(1200);

		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		}
		
	}


