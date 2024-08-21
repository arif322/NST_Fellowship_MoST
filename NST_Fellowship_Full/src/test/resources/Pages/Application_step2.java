package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.ExtentITestListenerClassAdapter;
import Utility.MasterData;

@Listeners(ExtentITestListenerClassAdapter.class)
public class Application_step2 extends ExtentITestListenerClassAdapter {
	MasterData info = new MasterData();
	
	@Test(priority = 0)
	public void CurrentStudentShip() throws InterruptedException {
		WebElement university = driver.findElement(By.xpath("//input[@id='registrationForm_presently_admitted_university_name']"));
		university.click();
		university.sendKeys(info.university);
		Thread.sleep(1200);
		university.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		university.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		WebElement faculty_name = driver.findElement(By.xpath("//input[@id='registrationForm_present_faculty_school_name']"));
		faculty_name.click();
		faculty_name.sendKeys(info.faculty);
		Thread.sleep(1000);
		faculty_name.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		faculty_name.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		WebElement department = driver.findElement(By.xpath("//input[@id='registrationForm_present_department_subject_name']"));
		department.click();
		department.sendKeys(info.department_name);
		Thread.sleep(1000);
		department.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		department.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		WebElement Group = driver.findElement(By.xpath("//input[@id='registrationForm_applied_group']"));
		Group.click();
		Group.sendKeys(info.Group);
		Thread.sleep(1000);
		Group.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		Group.sendKeys(Keys.ENTER);
		Thread.sleep(1000);	
		
	}

}
