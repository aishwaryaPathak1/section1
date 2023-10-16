import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EnableDisable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		String opac = driver.findElement(By.id("Div1")).getAttribute("style");
		if(opac.contains("1")) {
			System.out.println("enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		

	}

}
