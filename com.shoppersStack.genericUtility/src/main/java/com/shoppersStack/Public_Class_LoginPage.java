package com.shoppersStack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Public_Class_LoginPage {
	public Public_Class_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (id =("Email"))
	private WebElement emailTf;
	
	@FindBy(id = "Password")
	private WebElement passBtn;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginBtn;

	public WebElement getEmailTf() {
		return emailTf;
	}

	public WebElement getPassBtn() {
		return passBtn;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	

}
