package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Study\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().sendKeys("fes");
		driver.switchTo().alert().accept();//yes,done,ok
		//driver.switchTo().alert().dismiss();
		
	}

}
