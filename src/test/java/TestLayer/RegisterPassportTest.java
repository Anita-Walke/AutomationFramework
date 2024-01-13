package TestLayer;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPassport;
import UtilityLayer.ExcelReader;

public class RegisterPassportTest extends BaseClass {
	
	@BeforeTest
	public void setUp()
	{
		BaseClass.initialization();
	}
	@Test(priority=1)
	public void RegisterPassportTestFunctionlity()
	{
		RegisterPassport  registerPassport=new RegisterPassport();
		registerPassport.registerPassportFunctionlity("Goa", "aanita", "wwlke", "12/10/2023","aanita@gmail.com", "Yes", "ani", "aanita@123", "aanita@123", "Birth City", "mumbai");
	}
//	@Test(priority=2,dataProvider = "pdata")
//	public void RegisterPassportTestFunctionlity1(String city,String name,String sname,String date,String email,String yesno,String lid,String pass,String cpass,String question,String answer)
//	{
//		RegisterPassport  registerPassport=new RegisterPassport();
//		registerPassport.registerPassportFunctionlity(city,name,sname,date,email,yesno,lid,pass,cpass,question, answer);
//	}
	
	@DataProvider(name="pdata")
	public Object[][] getData() throws IOException
	{
		ExcelReader excelReader=new ExcelReader("D:\\PassportData.xlsx");
		Object data[][]=excelReader.getAllData(0);
		return data;
		
	}

}
