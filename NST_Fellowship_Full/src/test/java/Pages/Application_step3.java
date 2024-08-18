package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.ExtentITestListenerClassAdapter;
import Utility.MasterData;

@Listeners(ExtentITestListenerClassAdapter.class)
public class Application_step3 extends ExtentITestListenerClassAdapter {
	MasterData info = new MasterData();
	public void AddButtonInfo()throws Exception {
		WebElement addButton = driver.findElement(By.xpath("//span[normalize-space()='Add Item']"));
		addButton.click();
		Thread.sleep(1500);
	}
	
	public void savebutton() throws InterruptedException {
		WebElement save = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']"));
		save.click();
		Thread.sleep(1200);
	}
	
	@Test(priority = 0)
	public void AcademicInfo() throws Exception {
		AddButtonInfo();
		WebElement Examination = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_examination_id']"));
		Examination.click();
		Thread.sleep(1200);
		Examination.sendKeys(info.Exam1);
		Thread.sleep(1200);
		Examination.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		Examination.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		WebElement  Category = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_organization_category']"));
		Category.click();
		Category.sendKeys(info.Category1);
		Thread.sleep(1200);
		Category.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		Category.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		WebElement  Board = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_university_institute']"));
		Board.click();
		Board.sendKeys(info.Board);
		Thread.sleep(1200);
		Board.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		Board.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		WebElement  country = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_country_id']"));
		country.click();
		country.sendKeys(info.Country);
		Thread.sleep(1200);
		country.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		country.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		WebElement passing_year1 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_passing_year']"));
		passing_year1.click();
		passing_year1.sendKeys(info.Passing_year1);
		Thread.sleep(1200);
		passing_year1.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		WebElement sbuject1 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_group_subject']"));
		sbuject1.click();
		Thread.sleep(1200);
		sbuject1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		sbuject1.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
//		WebElement sbuject_other1 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_group_subject_other']"));
//		sbuject_other1.click();
//		
//		sbuject_other1.sendKeys(info.subject1);
//		Thread.sleep(1200);
		
		WebElement Result_type1 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_result_type']"));
		Result_type1.click();
		Result_type1.sendKeys(info.Result);
		Thread.sleep(1200);
		Thread.sleep(1200);
		Result_type1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		Result_type1.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		WebElement Division1 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_class_gpa']"));
		Division1.click();
		Division1.sendKeys(info.Division);
		Thread.sleep(1200);
		Thread.sleep(1200);
		Division1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		Division1.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		
		WebElement CGPA1 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_result']"));
		CGPA1.click();
		
		CGPA1.sendKeys(info.CGPA1);
		Thread.sleep(1200);	
		savebutton();
		Thread.sleep(1200);
	}
	
	
	
	@Test(priority = 1)
	public void AcademicInfo2() throws Exception {
		
		AddButtonInfo();
		WebElement Examination1 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_examination_id']"));
		Examination1.click();
		Thread.sleep(1200);
		Examination1.sendKeys(info.Exam2);
		Thread.sleep(1200);
		Examination1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		Examination1.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		WebElement  Category1 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_organization_category']"));
		Category1.click();
		Category1.sendKeys(info.Category1);
		Thread.sleep(1200);
		Category1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		Category1.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		WebElement  Board = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_university_institute']"));
		Board.click();
		Board.sendKeys(info.Board);
		Thread.sleep(1200);
		Board.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		Board.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		WebElement  country = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_country_id']"));
		country.click();
		country.sendKeys(info.Country);
		Thread.sleep(1200);
		country.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		country.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		WebElement passing_year2 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_passing_year']"));
		passing_year2.click();
		passing_year2.sendKeys(info.Passing_year2);
		Thread.sleep(1200);
		passing_year2.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		WebElement subject2 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_group_subject']"));
		subject2.click();
		Thread.sleep(1200);
		subject2.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		subject2.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
//		WebElement subject_other2 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_group_subject_other']"));
//		subject_other2.click();
//		
//		subject_other2.sendKeys(info.subject1);
//		Thread.sleep(1200);
		
		WebElement Result_type2 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_result_type']"));
		
		Result_type2.click();
		Result_type2.sendKeys(info.Result);
		Thread.sleep(1200);
		Result_type2.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		Result_type2.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		WebElement Division2 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_class_gpa']"));
		Division2.click();
		Division2.sendKeys(info.Division);
		Thread.sleep(1200);
		Division2.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		Division2.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		
		WebElement CGPA2 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_result']"));
		CGPA2.click();
		
		CGPA2.sendKeys(info.CGPA1);
		Thread.sleep(1200);	
		
		savebutton();
		Thread.sleep(1200);
	}
	
	@Test(priority = 2)
	public void AcademicInfo3() throws Exception {
		
		AddButtonInfo();
		WebElement Examination1 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_examination_id']"));
		Examination1.click();
		Thread.sleep(1200);
		Examination1.sendKeys(info.Exam3);
		Thread.sleep(1200);
		Examination1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		Examination1.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		WebElement  Category1 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_organization_category']"));
		Category1.click();
		Category1.sendKeys(info.Category2);
		Thread.sleep(1200);
		Category1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		Category1.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		WebElement  University = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_university_institute']"));
		University.click();
		University.sendKeys(info.university);
		Thread.sleep(1200);
		University.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		University.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		WebElement  country = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_country_id']"));
		country.click();
		country.sendKeys(info.Country);
		Thread.sleep(1200);
		country.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		country.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		WebElement passing_year3 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_passing_year']"));
		passing_year3.click();
		passing_year3.sendKeys(info.Passing_year3);
		Thread.sleep(1200);
		passing_year3.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		WebElement subject3 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_group_subject']"));
		subject3.click();
		Thread.sleep(1200);
		subject3.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		subject3.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
//		WebElement subject_other2 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_group_subject_other']"));
//		subject_other2.click();
//		
//		subject_other2.sendKeys(info.subject1);
//		Thread.sleep(1200);
		
		WebElement Result_type3 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_result_type']"));
		
		Result_type3.click();
//		Result_type3.sendKeys(info.Result);
		Thread.sleep(1200);
//		Result_type3.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(1200);
		Result_type3.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		WebElement Division3 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_class_gpa']"));
		Division3.click();
		Division3.sendKeys(info.Division);
		Thread.sleep(1200);
		Division3.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		Division3.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		
		
		WebElement CGPA3 = driver.findElement(By.xpath("//input[@id='schoolingRecordForm_result']"));
		CGPA3.click();
		
		CGPA3.sendKeys(info.CGPA2);
		Thread.sleep(1200);	
		
		savebutton();
		Thread.sleep(1200);
	}
	

}
