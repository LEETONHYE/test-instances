package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sychronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Study\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get("https://alaskatrips.poweredbygps.com/");
		driver.findElement(By.id("tab-hotel-tab-hp")).click();
		driver.findElement(By.cssSelector("#hotel-destination-hp-hotel")).sendKeys("NYC");
		driver.findElement(By.cssSelector("#hotel-destination-hp-hotel")).sendKeys(Keys.TAB);
		//driver.findElement(By.xpath("//form[@id='gcw-hotel-form-hp-hotel']//div[@class='cols-nested ab25184-location']//button[@type='button']]")).sendKeys(Keys.TAB);
		driver.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys(Keys.ENTER);
		
		WebDriverWait d=new WebDriverWait(driver,20);
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'Westgate')]")));
		driver.findElement(By.xpath("//a[contains(@href,'Westgate')]")).click();
		
	}

}
