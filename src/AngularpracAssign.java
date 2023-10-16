import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AngularpracAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stubbriver 
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Aishwarya");
		driver.findElement(By.name("email")).sendKeys("aishwaryapathak22@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Aish122");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement sel = driver.findElement(By.id("exampleFormControlSelect1"));
		Select obj = new Select(sel);
		obj.selectByIndex(1);
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("01-11-1996");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

	}

}
