package PractiseSel;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practicesets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		WebElement sectionFooter = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(sectionFooter.findElements(By.tagName("a")).size());
		List<WebElement> links = sectionFooter.findElements(By.tagName("a"));
		
		for(int i=1;i<links.size();i++) {
			String conrolEnter = Keys.chord(Keys.CONTROL,Keys.ENTER);
			links.get(i).sendKeys(conrolEnter);
			
		}
		Set<String> tabs= driver.getWindowHandles();
		Iterator<String> inTabs = tabs.iterator();
		while(inTabs.hasNext()) {
			driver.switchTo().window(inTabs.next());
			System.out.println(driver.getTitle());
		}
		

	}

}
