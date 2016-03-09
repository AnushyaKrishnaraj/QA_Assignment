import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpediaTest
{
public static void main(String args[])
{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.expedia.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath(".//*[@id='primary-header-package']")).click();
	driver.findElement(By.xpath(".//*[@id='tab-flightHotelCar-tab']/div")).click();
	driver.findElement(By.xpath(".//*[@id='package-origin']")).sendKeys("s");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	List<WebElement>parElem=driver.findElements(By.xpath(".//div[@class='display-group-results']/li"));
	for(WebElement w:parElem)
	{   
		if (w.getText().equals("San Francisco (QSF-All Airports) near San Francisco, CA"))
		{
			w.click();
			break;
		}}
	
	driver.findElement(By.xpath(".//*[@id='package-destination']")).sendKeys("H");
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='typeahead-list']/div/div/ul")));
	parElem=driver.findElements(By.xpath(".//div[@class='display-group-results']/li"));
	for(WebElement w:parElem)
	{   System.out.println(w.getText());
		if (w.getText().contains("Hawaii"))
		{
		w.click();
		break;
		}
	}
	driver.findElement(By.xpath(".//*[@id='package-departing']")).click();
	parElem=driver.findElements(By.xpath(".//*[@class='cal-month']/header/h2"));
	for(WebElement w:parElem)
	{   System.out.println(w.getText());
		if( w.getText().equals("MAR 2016"))
		{
			List<WebElement> elem=driver.findElements(By.xpath(".//ul[@class='cal-dates']/li/a"));


			for(WebElement w1:elem)
			{ System.out.println(w1.getText());
				if(w1.getText().equals("3"))
				{   
					w1.click();
				break;}
			}
		}
	}
			driver.findElement(By.xpath(".//*[@id='package-returning']")).click();
			parElem=driver.findElements(By.xpath(".//*[@class='cal-month']/header/h2"));
			for( WebElement w1:parElem)
			{   System.out.println(w1.getText());
				if( w1.getText().equals("MAR 2016"))
				{
					List<WebElement> elem1=driver.findElements(By.xpath(".//ul[@class='cal-dates']/li/a"));


					for(WebElement w11:elem1)
					{ System.out.println(w11.getText());
						if(w11.getText().equals("8"))
						{   
							w11.click();
						break;}
					}
				}
			}
			//	System.out.println(w1.getText());
			Select sel =new Select(driver.findElement(By.xpath(".//select[@id='package-rooms']")));
			sel.selectByIndex(1);
			 sel= new Select(driver.findElement(By.xpath(".//*[@id='package-1-adults']")));
			sel.selectByValue("2");
			sel= new Select(driver.findElement(By.xpath(".//*[@id='package-1-children']")));
			sel.selectByVisibleText("2");
			WebDriverWait wait1= new WebDriverWait(driver,10);
			wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='package-1-age-select-1']")));
			sel= new Select(driver.findElement(By.xpath(".//*[@id='package-1-age-select-1']")));
			sel.selectByValue("4");
			sel= new Select(driver.findElement(By.xpath(".//*[@id='package-1-age-select-2']")));
			sel.selectByValue("2");
			driver.findElement(By.xpath(".//*[@id='partialHotelBooking']")).click();
			//driver.findElement(By.xpath(".//*[@id='advanced-options']")).click();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//sel=new Select(driver.findElement(By.xpath(".//a[@id='package-advanced-preferred-class']")));
		//sel.selectByIndex(3);
			String pWindow=driver.getWindowHandle();
		driver.findElement(By.xpath(".//*[@id='search-button']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Set<String> windows=driver.getWindowHandles();
		 for (String s: windows)
		 {
			 System.out.println(s);
		 if(! s.equals(pWindow))
		 driver.switchTo().window(pWindow);
		// else
		//	 driver.switchTo().window(s).close();
		 }
			
}		
}	