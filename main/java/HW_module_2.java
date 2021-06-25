import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HW_module_2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ".//src//main//resources//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.booking.com");
        WebElement login = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[2]/div[6]/a[1]"));
        login.click();
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("login");
        username.sendKeys(Keys.RETURN);
        Thread.sleep(1000);
        WebElement passField = driver.findElement(By.className("bui-input-text__control"));
        passField.sendKeys("password");
        passField.sendKeys(Keys.RETURN);
        Thread.sleep(1000);
        WebElement yourAcc = driver.findElement(By.id("profile-menu-trigger--title"));
        System.out.print("\"Your account\" is displayed: ");
        System.out.println(yourAcc.isDisplayed()? "Yes" : "No");
        System.out.print("\"Your account\" is enabled: ");
        System.out.println(yourAcc.isEnabled()? "Yes" : "No");

        driver.close();
    }
}
