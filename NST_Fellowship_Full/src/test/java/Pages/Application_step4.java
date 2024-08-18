package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.ExtentITestListenerClassAdapter;
import Utility.MasterData;

@Listeners(ExtentITestListenerClassAdapter.class)
public class Application_step4 extends ExtentITestListenerClassAdapter{
	MasterData info = new MasterData();
	
	@Test(priority = 0)
	public void Information_info() throws InterruptedException, AWTException {
		WebElement title = driver.findElement(By.xpath("//input[@id='registrationForm_research_name']"));
		title.click();
		title.clear();
		title.sendKeys(info.title);
		Thread.sleep(1200);
		
		String file1 = "C:\\Users\\Ariful\\Desktop\\Issues.docx";
		WebElement attachment1 = driver.findElement(By.xpath("//span[contains(text(),'Click to Upload')]"));
		Actions act = new Actions(driver);
		
		act.moveToElement(attachment1).click().perform(); // click action on the button
//		js.executeScript("arguments[0].click()", attachment1); // click action on the button
		
		//path selection for file by toolkit
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection(file1);
		Toolkit .getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//for copy the file path
		rb.keyPress(KeyEvent.VK_CONTROL); //press on control button 
		rb.keyPress(KeyEvent.VK_V); // then press on V button for file
		rb.delay(2000);
		
		//for paste the the file path
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		//click enter button
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	
		Thread.sleep(2000);
		Assert.assertTrue(true);
		
		WebElement research = driver.findElement(By.xpath("//textarea[@id='registrationForm_research_object']"));
		research.click();
		research.clear();
		research.sendKeys(info.title);
		Thread.sleep(1200);
		
		WebElement research_work = driver.findElement(By.xpath("//textarea[@id='registrationForm_research_object']"));
		research_work.click();
		research_work.sendKeys(Keys.ENTER);
		Thread.sleep(1200);		
	}
	@Test(priority = 1)
	public void SuperVisor_Information() throws Exception {
		WebElement supervisor_name = driver.findElement(By.xpath("//input[@id='registrationForm_supervisor_name']"));
		supervisor_name.click();
		supervisor_name.clear();
		supervisor_name.sendKeys(info.SuperName);
		Thread.sleep(1200);
		
		WebElement super_designation = driver.findElement(By.xpath("//input[@id='registrationForm_supervisor_designation']"));
		super_designation.click();
		super_designation.clear();
		super_designation.sendKeys(info.SuperDesignation);
		Thread.sleep(1200);
		
		WebElement super_address = driver.findElement(By.xpath("//textarea[@id='registrationForm_supervisor_address']"));
		super_address.click();
		super_address.clear();
		super_address.sendKeys(info.SuperAddress);
		Thread.sleep(1200);
		
		WebElement super_Pnumber= driver.findElement(By.xpath("//input[@id='registrationForm_supervisor_mobile']"));
		super_Pnumber.click();
		super_Pnumber.clear();
		super_Pnumber.sendKeys(info.SuperPnumber);
		Thread.sleep(1200);
		
		WebElement super_Email= driver.findElement(By.xpath("//input[@id='registrationForm_supervisor_email']"));
		super_Email.click();
		super_Email.clear();
		super_Email.sendKeys(info.SuperEmail);
		Thread.sleep(1200);
	}
	@Test(priority = 2)
	public void DHead_Information() throws Exception {
		WebElement DHead_name = driver.findElement(By.xpath("//input[@id='registrationForm_department_head_name']"));
		DHead_name.click();
		DHead_name.clear();
		DHead_name.sendKeys(info.HeadName);
		Thread.sleep(1200);
		
		WebElement DHead_designation = driver.findElement(By.xpath("//input[@id='registrationForm_department_head_designation']"));
		DHead_designation.click();
		DHead_designation.clear();
		DHead_designation.sendKeys(info.HeadDesignation);
		Thread.sleep(1200);
		
		WebElement DHead_address = driver.findElement(By.xpath("//textarea[@id='registrationForm_department_head_address']"));
		DHead_address.click();
		DHead_address.clear();
		DHead_address.sendKeys(info.SuperAddress);
		Thread.sleep(1200);
		
		WebElement DHead_Pnumber= driver.findElement(By.xpath("//input[@id='registrationForm_department_head_mobile']"));
		DHead_Pnumber.click();
		DHead_Pnumber.clear();
		DHead_Pnumber.sendKeys(info.HeadPnumber);
		Thread.sleep(1200);
		
		WebElement DHead_Email= driver.findElement(By.xpath("//input[@id='registrationForm_department_head_email']"));
		DHead_Email.click();
		DHead_Email.clear();
		DHead_Email.sendKeys(info.HeadEmail);
		Thread.sleep(1200);
	}
}
