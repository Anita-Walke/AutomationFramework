package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class RadioButtonClass extends BaseClass {
	
	public static void RadioClick(List<WebElement> wb,String value)
	{
		if(value=="Yes")
		{
			wb.get(0).click();
		}
		else if(value=="No")
		{
			wb.get(0).click();
		}
		
	}

	public static void RadioCheckClick(WebElement wb)
	{
		wb.click();
	}
}
