package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggesstive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Study\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://ksrtc.in/oprs-web/");
		driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys("BENG");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.cssSelector("#fromPlaceName")).getText());
		//the below doesn't work,cuz sele. can't identify hidden elements-(Ajax implementation)
		//JS DOM can extract hidden elements
		
		//define JavascriptExecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script="return document.getElementById(\"fromPlaceName\").value;";//value to get text
		String text=(String) js.executeScript(script);
		System.out.println(text);
		int i=0;
		//objective:BENGALURU INTERNATION AIPORT		
		while(!text.equalsIgnoreCase("BENGALURU INTNATION AIPORT")) {
			i++;
			driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
			if(i>10) {
				System.out.println("not found");
				break;
			}
		}
		
		
		
		

	}

}
