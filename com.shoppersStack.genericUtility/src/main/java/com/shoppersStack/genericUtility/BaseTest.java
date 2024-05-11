package com.shoppersStack.genericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v120.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.shoppersStack.Public_Class_LoginPage;
import com.shoppersStack.Public_class_WelcomePage;
import com.shoppersStack.Public_class_homePage;

public class BaseTest {
	
	public WebDriver driver;
	public static WebDriver ListenerDriver;
	public FileUtility file=new FileUtility();
	public Public_class_WelcomePage welcomepage;
	public Public_Class_LoginPage loginpage;
	public Public_class_homePage homepage;
	public WebDriverUtility webdriverUtil=new WebDriverUtility();
	public Java_Utility java = new Java_Utility();
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;
	public WebDriverWait wait;
	
	@BeforeSuite
	public void bs () {
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void bt(){
		System.out.println("Before Test");
		spark = new ExtentSparkReporter("./reports/"+java.localDateTime()+".html");
		report=new ExtentReports();
		report.attachReporter(spark);
		test=report.createTest("Demo");
	}
	@BeforeClass
	public void bc() throws IOException {
		System.out.println("Before Class");
		String browser = file.readPropertyData("browser");
		String url = file.readPropertyData("url");
		if (browser.contains("chrome")) {
			driver=new ChromeDriver();
			}
		else if (browser.contains("firefox")) {
			driver = new FirefoxDriver();
			}
		else if (browser.contains("edge")) {
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Invalid Browser Name");
		}
		ListenerDriver=driver;
		welcomepage=new Public_class_WelcomePage(driver);
		loginpage = new Public_Class_LoginPage(driver);
		homepage = new Public_class_homePage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		driver.get(url);
	}
	@BeforeMethod
	public void bm() throws IOException {
		System.out.println("Before Method");
		wait = new WebDriverWait(driver , Duration.ofSeconds(40));	
		welcomepage.getLoginbtn().click();
		loginpage.getEmailTf().sendKeys(file.readPropertyData("username"));
		loginpage.getPassBtn().sendKeys(file.readPropertyData("password"));
		loginpage.getLoginBtn().click();
	}
	@AfterMethod
	public void am() throws InterruptedException {
		System.out.println("After method");
		homepage.getMyAccntBtn().click();
		homepage.getLogoutBtn().click();
		
	}
	@AfterClass
	public void ac() throws InterruptedException {
		System.out.println("After Class");
		Thread.sleep(3000);
		driver.quit();
	}
	@AfterTest
	public void at() {
		System.out.println("After Test");
		report.flush();
	}
	@AfterSuite
	public void as() {
		System.out.println("After Suite");
	}
	

}
