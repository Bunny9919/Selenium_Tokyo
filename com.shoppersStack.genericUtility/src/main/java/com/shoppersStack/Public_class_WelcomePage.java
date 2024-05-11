package com.shoppersStack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Public_class_WelcomePage {

	public Public_class_WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	@FindBy(id = "loginBtn")
	private WebElement loginbtn;
	
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
}
