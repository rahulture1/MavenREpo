import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		System.out.println(driver.getTitle());
        Select select = new Select(driver.findElement(By.xpath(".//*[@id='searchLanguage']")));
        select.selectByValue("hi");
        select.selectByIndex(19);
        Thread.sleep(3000);
        driver.close();   
	}

}
