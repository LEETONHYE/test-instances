package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.give the count of links on the page
		//2.the count of links on the foot-section
		System.setProperty("webdriver.chrome.driver", "C:\\Study\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footdriver.findElements(By.tagName("a")).size());
		WebElement columndriver=footdriver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		//4. click each link in the column and check if the pages are open
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) {
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		}
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		driver.quit();
	}

}
