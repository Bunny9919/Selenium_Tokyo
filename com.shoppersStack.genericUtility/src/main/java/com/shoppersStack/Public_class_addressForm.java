package com.shoppersStack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Public_class_addressForm {
	public Public_class_addressForm(WebDriver driver) {
     PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Home")
	private WebElement typeRb;
	
	@FindBy(id ="Name" )
	private WebElement nameTf;
	
    @FindBy(id = "House/Office Info")
	private WebElement houseTf;
	
	@FindBy(id = "Street Info")
	private WebElement streetTf;
	
    @FindBy(id ="Landmark" )
	private WebElement landmarkTf;
	
    @FindBy(id = "Country")
	private WebElement countryDD;
	
	@FindBy(id = "State")
	private WebElement stateDD;
	
	@FindBy(id = "City")
	private WebElement cityDD;
	
	@FindBy(id = "Pincode")
	private WebElement pincodeTf;
	
	@FindBy(id = "Phone Number")
	private WebElement phoneTf;
	
	@FindBy(id = "addAddress")
	private WebElement addAddressBtn;

	public WebElement getTypeRb() {
		return typeRb;
	}

	public WebElement getNameTf() {
		return nameTf;
	}

	public WebElement getHouseTf() {
		return houseTf;
	}

	public WebElement getStreetTf() {
		return streetTf;
	}

	public WebElement getLandmarkTf() {
		return landmarkTf;
	}

	public WebElement getCountryDd() {
		return countryDD;
	}

	public WebElement getStateDd() {
		return stateDD;
	}

	public WebElement getCityTDd() {
		return cityDD;
	}

	public WebElement getPincodeTf() {
		return pincodeTf;
	}

	public WebElement getPhoneTf() {
		return phoneTf;
	}

	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}
	
	

}
