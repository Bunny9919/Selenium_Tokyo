package com.shoppersStack_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.shoppersStack.Public_class_AddAddress;
import com.shoppersStack.Public_class_MyProfile;
import com.shoppersStack.Public_class_addressForm;
import com.shoppersStack.genericUtility.BaseTest;

public class Verify_user_is_able_to_add_address_Test extends BaseTest{
	@Test
	public void addAddress() throws EncryptedDocumentException, IOException {
	test.log(Status.INFO,"Navigate to home page");
	homepage.getMyAccntBtn().click();
	homepage.getMyProfileBtn().click();
	test.log(Status.INFO,"Navigate to MyProfile page");
	Public_class_MyProfile myProfilePage = new Public_class_MyProfile(driver);
	myProfilePage.getmyAddressBtn().click();
	test.log(Status.INFO, "Navigated to MyAddressPage");
	Public_class_AddAddress addAddress = new Public_class_AddAddress(driver);
	addAddress.getAddAddressBtn().click();
	test.log(Status.INFO, "Navigated to my address Form Page");
	Public_class_addressForm addFormPage= new Public_class_addressForm(driver);
	addFormPage.getNameTf().sendKeys(file.readExcelData("Sheet1", 1, 0));
	addFormPage.getHouseTf().sendKeys(file.readExcelData("Sheet1", 1, 1));
	addFormPage.getStreetTf().sendKeys(file.readExcelData("Sheet1", 1, 2));
	addFormPage.getLandmarkTf().sendKeys(file.readExcelData("Sheet1", 1, 3));
	webdriverUtil.selectByvalue(addFormPage.getCountryDd(), file.readPropertyData("country"));
	webdriverUtil.selectByvalue(addFormPage.getStateDd(), file.readPropertyData("state"));
	webdriverUtil.selectByvalue(addFormPage.getCityTDd(), file.readPropertyData("city"));
	addFormPage.getPincodeTf().sendKeys(file.readExcelData("Sheet1", 1, 4));
	addFormPage.getPhoneTf().sendKeys(file.readExcelData("Sheet1", 1, 5));
	addFormPage.getAddAddressBtn().click();
	}

}
