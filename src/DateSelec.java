import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateSelec {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//.css-1dbjc4n.r-1awozwy.r-16ru68a.r-y47klf.r-1loqt21.r-eu3ka.r-1otgn73.r-1aockid
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@class=\\'css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73\\'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-16ru68a.r-y47klf.r-1loqt21.r-eu3ka.r-1otgn73.r-1aockid")).click();

	}

}
