package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdetifyFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Study\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.finalwebsites.com/demos/custom-captcha-image-script/");
		int number=findFramenumber(driver,By.xpath("//*[@id='recaptcha-anchor']/div[5]"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[5]")).click();
		driver.switchTo().defaultContent();
		
		int number1=findFramenumber(driver,By.xpath("//*[@id='recaptcha-verify-button']"));
		driver.switchTo().frame(number1);
		driver.findElement(By.xpath("//*[@id='recaptcha-verify-button']")).click();
	}
	
	
	
	public static int findFramenumber(WebDriver driver, By by) {
		
		int i;
		int framecount=driver.findElements(By.tagName("iframe")).size();
		for(i=0;i<framecount;i++) {
			
			driver.switchTo().defaultContent();
			driver.switchTo().frame(i);
			int ocount=driver.findElements(by).size();
			if(ocount>0) {
				break;
			}
			else {
				System.out.println("continue looping");
			}
			
		}
		driver.switchTo().defaultContent();
		return i;

}
}
