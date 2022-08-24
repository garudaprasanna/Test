package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Pavan/OneDrive/Desktop/checks.html");
		List<WebElement> check = driver.findElements(By.xpath("//input"));
		int count=check.size();
		for(int i=0;i<=count-1;i++)
		{
			check.get(i).click();
		}
		for(int i=count-1;i>=0;i--)
		{
			check.get(i).click();
		}
		
	}

}
