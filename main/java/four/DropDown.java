package four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//src//main//resources//chromedriver");
		WebDriver driver = new ChromeDriver();

//    	driver.get("https://www.booking.com/index.ru.html");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// TODO Auto-generated method stub
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//div[@id='stateCity-wrapper']/div[2]/div")).click();
		Select selectState = new Select(driver.findElement(By.xpath("//select[@id='stateCity-wrapper']/div[2]/div")));
	}

}
