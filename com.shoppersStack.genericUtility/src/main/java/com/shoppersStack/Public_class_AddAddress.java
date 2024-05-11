package com.shoppersStack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Public_class_AddAddress {
	public Public_class_AddAddress(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddressBtn;
	
	@FindBy(xpath = "(//span[contains(@class,'MuiButton-start')])[2]")
	private WebElement deleteBtn;
	
	@FindBy(xpath = "(//button[text()='Yes'])[1]")
	private WebElement yesBtn;
	
	

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}
	

	public WebElement getYesBtn() {
		return yesBtn;
	}
	
	
	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}
	
	

}
