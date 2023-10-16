package PractiseSel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Herokuprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
//		driver.findElement(By.cssSelector("a[href='/add_remove_elements/']")).click();
//		driver.findElement(By.cssSelector("div.example button")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#elements button")));
//		driver.findElement(By.cssSelector("div#elements button")).click();
//		driver.findElement(By.cssSelector("a[href='/basic_auth']")).click();
//		driver.switchTo().alert().dismiss();
		driver.findElement(By.cssSelector("a[href='/checkboxes']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
		

	}

}
