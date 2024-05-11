package com.shoppersStack_TestScripts;

import org.testng.annotations.Test;

import com.shoppersStack.Public_class_AddAddress;
import com.shoppersStack.Public_class_MyProfile;
import com.shoppersStack.genericUtility.BaseTest;

public class Verify_User_Is_Able_To_Delete_Address_Test extends BaseTest {
	@Test
	public void deleteAddress() throws InterruptedException {
		homepage.getMyAccntBtn().click();
		homepage.getMyProfileBtn().click();
		
		Public_class_MyProfile profilePage=new Public_class_MyProfile(driver);
		profilePage.getmyAddressBtn().click();
		
		Public_class_AddAddress addressPage = new Public_class_AddAddress(driver);
		Thread.sleep(2000);
		addressPage.getDeleteBtn().click();
		Thread.sleep(2000);
		addressPage.getYesBtn().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
	}

}
