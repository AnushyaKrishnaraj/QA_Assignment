import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WhiteboxQATest {
	public static void login() throws InterruptedException
	{
WebDriver web= new FirefoxDriver();
web.get("http://whiteboxqa.com/");
//web.close();
//web.navigate().to("http://whiteboxqa.com/");
//Thread.sleep(2000);
web.manage().window().maximize();
 web.findElement(By.cssSelector("#loginButton")).click();
 web.findElement(By.cssSelector("#username")).sendKeys("anukrsh@yahoo.com");
 web.findElement(By.cssSelector("#password")).sendKeys("whiteboxqa1");
 web.findElement(By.id("login")).click();
 web.findElement(By.linkText("Home")).click();
 web.findElement(By.cssSelector(".nav-item:nth-child(2)>a")).click();
 Thread.sleep(1500);
 web.findElement(By.linkText("Course Content")).click();
 Thread.sleep(1500);
web.findElement(By.cssSelector(".nav-item:nth-child(3)>a")).click();
web.findElement(By.xpath(".//*[@id='example_video_1']/div[2]")).click();
Thread.sleep(1500);
WebElement parentElem,subElem;


parentElem=web.findElement(By.xpath("//li[@class='nav-item dropdown']//a"));
subElem=web.findElement(By.xpath("//ul[@class='dropdown-menu']//li[1]//a"));
Actions action=new Actions(web);
action.moveToElement(parentElem).moveToElement(subElem).click().build().perform();

//web.findElement(By.linkText("Classes")).click();
Thread.sleep(1500);
Select dropdown=new Select(web.findElement(By.id("batch")));
dropdown.selectByValue("51");
Thread.sleep(1500);
Select dropdown2=new Select(web.findElement(By.id("classRecording")));
dropdown2.selectByValue("XUlS2T-64hE");
Thread.sleep(2500);
web.findElement(By.linkText("Search")).click();
web.findElement(By.id("search-box")).sendKeys("maven");
Thread.sleep(2000);
Select select =new Select(web.findElement(By.xpath(".//*[@id='search-results-box']")));
select.selectByIndex(0);
Thread.sleep(2000);
web.findElement(By.linkText("Sessions")).click();
select=new Select(web.findElement(By.xpath(".//*[@id='session-type']")));
select.selectByIndex(4);
Thread.sleep(2000);
select=new Select(web.findElement(By.xpath(".//*[@id='session-recordings-list']")));
select.selectByIndex(3);
Thread.sleep(2000);

parentElem=web.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[4]/a"));
subElem=web.findElement(By.xpath(".//ul[@class='dropdown-menu']/li[2]/a"));
action.moveToElement(parentElem).moveToElement(subElem).click().build().perform();
Thread.sleep(2000);
web.findElement(By.xpath(".//table//tr[1]/td/a")).click();
Thread.sleep(2000);
String pWindow=web.getWindowHandle();

Thread.sleep(2000);
//web.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
web.findElement(By.linkText("Cheatsheets")).click();
web.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
web.findElement(By.xpath(".//*[@id='cheatsheets']//tr[1]/td[2]/a")).click();
web.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
web.switchTo().window(pWindow);

Thread.sleep(2000);
parentElem=web.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[4]/a"));
subElem=web.findElement((By.xpath(".//a[@href='assignments.php']")));
action.moveToElement(parentElem).moveToElement(subElem).click().build().perform();
WebDriverWait wait=new WebDriverWait(web,20);
WebElement elem=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='assignment']//p[@class='label']")));
//select=new Select(web.findElement(By.xpath(".//*[@id='assignment']/div[1]/div[2]/p")));
//select.selectByIndex(2);
//action.moveToElement(parentElem).moveToElement(subElem).click().build().perform();
web.findElement(By.linkText("FAQ")).click();
web.findElement(By.xpath(".//*[@id='accordion']/div[1]/div[1]/h4/a")).click();
//web.findElement(By.xpath(".//*[@id='accordion']/div[1]/div[1]/h4/a")).click();
Thread.sleep(2000);
web.findElement(By.linkText("CONTACT")).click();
web.findElement(By.xpath(".//*[@id='contact_body']/div[1]/input")).sendKeys("Aravind");
web.findElement(By.xpath(".//*[@id='contact_body']/div[2]/input")).sendKeys("aravind@gmail.com");
web.findElement(By.xpath(".//*[@id='contact_body']/div[3]/input")).sendKeys("543-465-7890");
web.findElement(By.xpath(".//*[@id='contact_body']/div[4]/textarea")).sendKeys("Hai,This is a test");
web.findElement(By.xpath(".//*[@id='submit' ]")).click();
web.findElement(By.linkText("Download now")).click();
web.quit();
}
	public static void main(String args[]) throws InterruptedException
	{
		WhiteboxQATest.login();
	}
}