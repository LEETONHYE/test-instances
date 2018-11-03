package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Study\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/21103/mumbai-vs-delhi-final-vijay-hazare-trophy-2018-19");
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int ocount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0;i<ocount-2;i++) {
			String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int tvalue=Integer.parseInt(value);
			sum=sum+tvalue;
		}
		
		String Extravalue=table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int IEvalue=Integer.parseInt(Extravalue);
		sum=sum+IEvalue;
		System.out.println(sum);
		String Totalvalue=table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int Atotalvalue=Integer.parseInt(Totalvalue);
		if(Atotalvalue==sum) {
			System.out.println("count matches");
		}
		else {
			System.out.println("count fails");
		}
		
	}

}
