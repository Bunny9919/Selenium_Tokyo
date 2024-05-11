package com.shoppersStack.genericUtility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	Select sel ;
	public void selectByvalue(WebElement element , String value) {
		sel = new Select(element);
		sel.selectByValue(value);
	}
	public void selectByindex(WebElement element , int value) {
		sel = new Select(element);
		sel.selectByIndex(value);
	}
	public void SelectByVisibleText(WebElement element , String text) {
		sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	public void deselectByvalue(WebElement element , String value) {
		sel = new Select(element);
		sel.deselectByValue(value);
	}
	public void deselectByindex(WebElement element , int value) {
		sel = new Select(element);
		sel.deselectByIndex(value);
	}
	public void deSelectByVisibleText(WebElement element , String text) {
		sel = new Select(element);
		sel.deselectByVisibleText(text);
		
	}

	public void takewebpageScreenShot(WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp= ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./com.shoppersStack.genericUtility\\Snapshot");
		FileHandler.copy(temp, dest);
		}
	public void takewebelementScreenShot(WebElement element) throws IOException {
		File temp = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("./com.shoppersStack.genericUtility\\Snapshot");
		FileHandler.copy(temp, dest);
		}

}
 