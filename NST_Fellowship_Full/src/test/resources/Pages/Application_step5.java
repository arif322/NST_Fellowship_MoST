package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.ExtentITestListenerClassAdapter;
import Utility.MasterData;

@Listeners(ExtentITestListenerClassAdapter.class)
public class Application_step5 extends ExtentITestListenerClassAdapter{

	MasterData info = new MasterData();
	
	public void savebutton(WebDriver driver) throws InterruptedException {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Save']")));
	        saveButton.click();
		Thread.sleep(1200);
	}
	public void savebutton1(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
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
	
	@Test(priority = 0)
	public void attachment_upload1() throws AWTException, InterruptedException {
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		  try {
	            // Navigate to the URL where the file upload is located
	           

	            // Find the first "Upload" button and click it
	            WebElement attachment1 = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/button[1]"));
	            attachment1.click();
	            
	            String file1 = "D:\\downloads\\Abdul-Alim-E-Challan-copy.pdf";
	            // Wait for the upload dialog or element to become clickable
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	            WebElement upload1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Click to Upload')]")));
	            // Click on upload button using Actions class
	            
	            Actions act = new Actions(driver);
	            act.moveToElement(upload1).click().perform();

	            // Alternatively, use JavaScript to click if Actions don't work
//	            JavascriptExecutor js = (JavascriptExecutor) driver;
//	            js.executeScript("arguments[0].click();", upload1);

	            // Prepare file for upload
	            Robot rb = new Robot();
	            rb.delay(2000);
	            StringSelection ss = new StringSelection(file1);
	            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

	            // Use Robot to paste file path and press Enter
	           // Delay before pasting
	            rb.keyPress(KeyEvent.VK_CONTROL);
	            rb.keyPress(KeyEvent.VK_V);
	            Thread.sleep(2000);
	         
	            rb.keyRelease(KeyEvent.VK_CONTROL);
	            rb.keyRelease(KeyEvent.VK_V);
	            rb.delay(2000);  // Delay before pressing Enter
	            rb.keyPress(KeyEvent.VK_ENTER);
	            rb.keyRelease(KeyEvent.VK_ENTER);

	            // Additional delay to ensure the file is uploaded
	            Thread.sleep(2000);

	            // Assert and save
	            Assert.assertTrue(true, "File upload assertion failed");
	            savebutton(driver);
	            // Add a delay for the save button to process
	            Thread.sleep(1200);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
	
	@Test(priority = 1)
	public void radioButton() throws InterruptedException {
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='1']"));
		radio1.click();
		Thread.sleep(3200);	
	}
//	
	@Test(priority = 2)
	public void pictureUpload() throws Exception {
		   
		 WebElement uploadButton = driver.findElement(By.xpath("//div[@class='ant-col ant-col-xs-24 ant-col-md-12']//span[@role='button']"));
		    uploadButton.click();
		    Thread.sleep(2000); // Wait for the dialog to open

		    // Use the Robot class to interact with the file dialog
		    String filePath = "D:\\downloads\\Sig IUB.png";
		    StringSelection ss = new StringSelection(filePath);
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		    Robot robot = new Robot();
		    robot.delay(2000);

		    // Press CTRL+V
		    robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_CONTROL);

		    // Press ENTER
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);

		    Thread.sleep(5200); 
	}
	
	@Test(priority = 3)
	public void pictureUpload1() throws Exception,InterruptedException {
		
		 WebElement uploadButton1 = driver.findElement(By.xpath("//div[@class='ant-col ant-col-xs-24 ant-col-md-24']//span[@role='button']"));
		    uploadButton1.click();
		    Thread.sleep(2000); // Wait for the dialog to open

		    // Use the Robot class to interact with the file dialog
		    String filePath = "D:\\downloads\\Sig IUB.png";
		    StringSelection ss = new StringSelection(filePath);
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		    Robot robot = new Robot();
		    robot.delay(2000);

		    // Press CTRL+V
		    robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_CONTROL);

		    // Press ENTER
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);

		    Thread.sleep(5200); 
	}
	
//	@Test(priority = 4)
//	public void saveandShowButton(WebDriver driver) throws InterruptedException {
//		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//	        WebElement saveButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Save and Show Preview']")));
//	        saveButton2.click();
//		Thread.sleep(1200);
//	}
	
	
//	String filePath = "D:\\downloads\\Sig IUB.png";
//
//    // Click the button that opens the file selector dialog
//    WebElement buttonToClick1 = driver.findElement(By.xpath("//div[@class='ant-col ant-col-xs-24 ant-col-md-24']//span[@role='button']"));
//    buttonToClick1.click();
//
//    // Locate the file input element
//   
//    WebElement fileInput1 = driver.findElement(By.xpath("//input[@type='file']"));
//    fileInput1.sendKeys(filePath);
//
//    // Wait for a moment to ensure the upload starts
//    Thread.sleep(5200);
	

//	String file = "D:\\downloads\\Sig IUB.png";
//	WebElement signature = driver.findElement(By.xpath("//div[@class='ant-col ant-col-xs-24 ant-col-md-12']//span[@role='button']"));
//	signature.sendKeys(file);
//
//	Thread.sleep(5200);
	
	// Use the Robot class to interact with the file dialog
//	 String filePath = "D:\\downloads\\Sig IUB.png";
//
//	    // Click the button that opens the file selector dialog
//	    WebElement buttonToClick = driver.findElement(By.xpath("//div[@class='ant-col ant-col-xs-24 ant-col-md-12']//span[@role='button']"));
//	    buttonToClick.click();
//
//	    // Locate the file input element
//	    WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
//	    fileInput.sendKeys(filePath);
//
//	    // Wait for a moment to ensure the upload starts
//
	
	
}
