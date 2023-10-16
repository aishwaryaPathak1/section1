package PractiseSel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(15000);
		
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#form-field-travel_comp_date")));
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		Thread.sleep(3000);
		while(!driver.findElement(By.className("flatpickr-current-month")).getText().contains("April")) {
			driver.findElement(By.className("flatpickr-next-month")).click();
			System.out.println(driver.findElement(By.className("flatpickr-current-month")).getText());
		}
		
	}

}
