package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class DropDownSelection extends BaseClass {

	public static void selectDropDownElement(WebElement wb,String value)
	{
		Select sel=new Select(wb);
		sel.selectByVisibleText(value);
		
	}
}
