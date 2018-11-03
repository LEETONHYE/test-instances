package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Study\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		List<WebElement> dates=driver.findElements(By.className("day"));
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		
		//grab the common attributes and put it into the list and iterate(core)
		int count=dates.size();
		for(int i=0;i<count;i++) {
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equals("23")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
						
			
		}
		
	}

}
