import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WhiteboxqaAutomation {
	public static void login(WebDriver driver) throws Exception
	{ 
		
	
		 // wrong login
		 driver.findElement(By.cssSelector("#loginButton")).click();
		 driver.findElement(By.cssSelector("#username")).sendKeys("anukrsh@yahoo.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("whiteboxqa1iii");
		 driver.findElement(By.id("login")).click();
		 //taking a screenshot
		 Thread.sleep(2000);
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(scrFile, new File(".//WebdriverAutomation//screenshot1//screenshot.png"));
		 driver.findElement(By.cssSelector("#loginButton")).click();
		 driver.findElement(By.cssSelector("#username")).sendKeys("anukrsh@yahoo.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("whiteboxqa1");
		 driver.findElement(By.id("login")).click();
	}
	public static void elements(WebDriver driver)
	{List<WebElement> elem =  driver.findElements(By.xpath(".//*[@id='navbar-collapse']/ul/li/a"));
    System.out.println(elem.size());
    
		
		for(WebElement el:elem)
		{
			System.out.println(el.getText());
		}
	}
	public static void schedule(WebDriver driver)
	{  // viewing the schedule and course content
		 driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[2]/a")).click();
		 driver.findElement(By.linkText("Course Content")).click();
		 
	}
	public static void demo(WebDriver driver) throws InterruptedException 
	{
		driver.findElement(By.cssSelector(".nav-item:nth-child(3)>a")).click();
		driver.findElement(By.xpath(".//*[@id='example_video_1']/div[5]")).click();
	
		
	}
	public static void recordings(WebDriver driver) throws InterruptedException
	{
		WebElement parentElem,subElem;
		parentElem=driver.findElement(By.xpath("//li[@class='nav-item dropdown']//a"));
		subElem=driver.findElement(By.xpath("//a[contains(@href,'recordings.php')]"));
		Actions action=new Actions(driver);
		action.moveToElement(parentElem).perform();
		action.moveToElement(subElem).click().perform();
		Select dropdown=new Select(driver.findElement(By.id("batch")));
		dropdown.selectByValue("51");
		Select dropdown1=new Select(driver.findElement(By.id("classRecording")));
		dropdown1.selectByVisibleText("2016-01-29 Bhartis Webdrivers 3 class.wmv");
		Thread.sleep(2500);
		driver.findElement(By.linkText("Search")).click();
		driver.findElement(By.id("search-box")).sendKeys("maven");
		
	//	Select select =new Select(driver.findElement(By.xpath(".//select[@id='search-results-box']")));
	//	select.selectByIndex(3);
		driver.findElement(By.linkText("Sessions")).click();
	   Select select=new Select(driver.findElement(By.xpath(".//*[@id='session-type']")));
		select.selectByIndex(4);
		select=new Select(driver.findElement(By.xpath(".//*[@id='session-recordings-list']")));
		select.selectByIndex(3);
		
	}
	public static void faq(WebDriver driver)
	{
		driver.findElement(By.linkText("FAQ")).click();
		driver.findElement(By.xpath(".//*[@id='accordion']/div[1]/div[1]/h4/a")).click();
		
	}
	public static void presentation(WebDriver driver) throws InterruptedException
	{
		WebElement parentElem,subElem;
		parentElem=driver.findElement(By.xpath("//li[@class='nav-item dropdown']//a"));
		subElem=driver.findElement(By.xpath("//a[contains(@href,'presentations.php')]"));
		Actions action=new Actions(driver);
		action.moveToElement(parentElem).moveToElement(subElem).click().build().perform();
		String parentWindow=driver.getWindowHandle();
        System.out.println(parentWindow);
		
		driver.findElement(By.xpath(".//*[@id='presentations']//td/a[text()='AJAX']")).click();
		Set<String> windows=driver.getWindowHandles();
		for(String handle:windows)
		{    System.out.println(handle);
			if (!handle.equals(parentWindow))
			
			{ 
				driver.switchTo().window(handle).close();
				driver.switchTo().window(parentWindow);
				
			}
		}
		driver.findElement(By.xpath(".//button[@id='cheatsheets']")).click();
		driver.findElement(By.xpath(".//*[@id='cheatsheets']//a[text()='CSS Selectors']")).click();
        driver.switchTo().window(parentWindow);
        
	}
	public static void assignments(WebDriver driver)
	{
		WebElement parentElem,subElem;
		parentElem=driver.findElement(By.xpath("//li[@class='nav-item dropdown']//a"));
		subElem=driver.findElement(By.xpath("//a[contains(@href,'assignments.php')]"));
		Actions action=new Actions(driver);
		action.moveToElement(parentElem).moveToElement(subElem).click().build().perform();
		String parentWindow=driver.getWindowHandle();
        System.out.println(parentWindow);
        driver.findElement(By.xpath(".//*[@id='assignment']/div[1]/div[2]/p")).click();
        (driver.findElement(By.xpath(".//*[@id='assignment']/div[1]/div[3]/div/ul/li[5]"))).click();
        
       // driver.findElement(By.xpath(".//*[@id='readassignment']")).click();
        driver.findElement(By.xpath(".//*[@id='assignment-answer']/textarea")).sendKeys("Short for Dalvik Debug Monitor Service, DDMS is a GUI debugging application shipped with the Android SDK that provides screen capture, log dump ");
        driver.findElement(By.xpath(".//*[@id='assignment-submit']")).click();
        driver.findElement(By.xpath(".//button[@id='question']")).click();
        driver.findElement(By.xpath(".//*[@id='question']/p/div[1]/div[2]/p")).click();
        driver.findElement(By.xpath(".//*[@id='question']/p/div[1]/div[3]//div/ul/li[2]")).click();
        driver.findElement(By.xpath(".//*[@id='question']/p/div[2]/div[2]/p")).click();
        driver.findElement(By.xpath(".//*[@id='question']/p/div[2]/div[3]/div/ul/li[31]")).click();
        driver.findElement(By.xpath(".//*[@id='candidateAnswer'/textarea")).sendKeys("No Java doesnt support multiple inheritance");
        driver.findElement(By.xpath(".//*[@id='updateQuestion']")).click();
	}
	public static void contact(WebDriver driver)
	{
		driver.findElement(By.linkText("CONTACT")).click();
		driver.findElement(By.xpath(".//*[@id='contact_body']/div[1]/input")).sendKeys("Aravind");
		driver.findElement(By.xpath(".//*[@id='contact_body']/div[2]/input")).sendKeys("aravind@gmail.com");
		driver.findElement(By.xpath(".//*[@id='contact_body']/div[3]/input")).sendKeys("543-465-7890");
		driver.findElement(By.xpath(".//*[@id='contact_body']/div[4]/textarea")).sendKeys("Hai,This is a test");
		driver.findElement(By.xpath(".//*[@id='submit' ]")).click();
		//creating alert
		 JavascriptExecutor javascript =(JavascriptExecutor)driver;
		 javascript.executeScript("alert('contact has been succesfully added...');");
	      WebDriverWait wait=new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.alertIsPresent());
		 Alert alert=driver.switchTo().alert();
		 System.out.println(alert.getText());
				 alert.accept();
	}
	public static void download(WebDriver driver)
	{// downloading the document
		driver.findElement(By.linkText("Download now")).click();

		driver.quit();
		
	}
	public static void main(String args[]) throws InterruptedException,Exception
	{   
		//Setting the property for internet explorer browser and opening the whiteboxqa
		System.setProperty("webdriver.ie.driver", "C:\\Users\\anukrsh\\Downloads\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
        driver.get("http://whiteboxqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        
        WhiteboxqaAutomation.login(driver);
        WhiteboxqaAutomation.elements(driver);
        WhiteboxqaAutomation.schedule(driver);
        WhiteboxqaAutomation.demo(driver);
        WhiteboxqaAutomation.recordings(driver);
        WhiteboxqaAutomation.presentation(driver);
        WhiteboxqaAutomation.assignments(driver);
        WhiteboxqaAutomation.faq(driver);
        WhiteboxqaAutomation.contact(driver);
        WhiteboxqaAutomation.download(driver);
	}
}
