package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.DropDownSelection;
import UtilityLayer.RadioButtonClass;
import UtilityLayer.UtilClass;

public class RegisterPassport  extends BaseClass{

//	@FindBy(id="//label[text()='Passport Office']")
//	WebElement applyat;
	
	@FindBy(xpath="//label[text()='Passport Office']")
	WebElement applyat;
	
//	@FindBys({@FindBy(xpath="//select[@name='dcdrLocation']")})
//	List<WebElement> passportOffice;
	
	@FindBy(xpath="//select[@name='dcdrLocation']")
	WebElement passportOffice;
	
	
	@FindBy(xpath="//input[@name='givenName']")
	WebElement givenName;
	
	@FindBy(xpath="//input[@name='surname']")
	WebElement surName;

	@FindBy(xpath="//input[@name='dob']")
	WebElement calender;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement emailId;
	
	@FindBys({@FindBy(xpath="//input[@name='emailloginSame']")})
	List<WebElement> LoginIdRadio;
	
	@FindBy(xpath="//input[@name='loginId']")
	WebElement loginId;
	
	@FindBy(xpath="//input[@name='pwd']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='confirmPwd']")
	WebElement cpassword;
	
	@FindBy(xpath="//select[@name='hintQues']")
	WebElement hintQuestion;
	
	@FindBy(xpath="//input[@name='hintAns']")
	WebElement hintAns;
	
	
	public RegisterPassport()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void registerPassportFunctionlity(String city,String name,String sname,String date,String email,String yesno,String lid,String pass,String cpass,String question,String answer)
	{
		RadioButtonClass.RadioCheckClick(applyat);
		DropDownSelection.selectDropDownElement(passportOffice, city);
		UtilClass.sendKeys(givenName,name);
		UtilClass.sendKeys(surName, sname);
//		calender.click();
		UtilClass.sendKeys(calender, date);
		UtilClass.sendKeys(emailId, email);
		RadioButtonClass.RadioClick(LoginIdRadio, yesno);
		UtilClass.sendKeys(loginId, lid);
		UtilClass.sendKeys(password, pass);
		UtilClass.sendKeys(cpassword, cpass);
		DropDownSelection.selectDropDownElement(hintQuestion, question);
		UtilClass.sendKeys(hintAns, answer);
		
		
		
		
	}
	
	
}
