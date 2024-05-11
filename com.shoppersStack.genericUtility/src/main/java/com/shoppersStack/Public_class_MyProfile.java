package com.shoppersStack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Public_class_MyProfile {
	public Public_class_MyProfile(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='My Addresses']")
	private WebElement myAddressBtn;

	public WebElement getmyAddressBtn() {
		return myAddressBtn;
	}
	
	
}
