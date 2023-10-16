package PractiseSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		String title = driver.getTitle();
		
//		driver.get("https://the-internet.herokuapp.com/");
//		driver.get("https://demoqa.com/");
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
//		driver.close();
		driver.findElement(By.className("banner-image")).click();
//		driver.close();
		driver.quit();

	}

}
