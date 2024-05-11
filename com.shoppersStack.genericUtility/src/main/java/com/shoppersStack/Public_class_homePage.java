package com.shoppersStack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Public_class_homePage {
	
	public Public_class_homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='B']")
	private WebElement myAccntBtn;
	
	@FindBy(xpath = "//li[text()='My Profile']")
	private WebElement myProfileBtn;
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logoutBtn;

	public WebElement getMyAccntBtn() {
		return myAccntBtn;
	}

	public WebElement getMyProfileBtn() {
		return myProfileBtn;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	
}
