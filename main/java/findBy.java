import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findBy {

	public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", ".//src//main//resources//chromedriver");
    	WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        System.out.println("Launched the chrome browser with the given url");
//        driver.manage().window().maximize();
        if (!driver.getTitle().equals("Facebook")){
            System.out.println("Наименование страницы не соответствует facebook");
        }
        System.out.println(driver.getTitle().equals("Facebook") ? "xz": 0);


        WebElement login = driver.findElement(By.name("email"));
        login.sendKeys("DsdsA");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("Sfdsf");
        driver.findElement(By.name("login")).click();

        Thread.sleep(10000);
        //login
		driver.close();

		
		/*
		driver.findElement(By.id("search-inp"));
		driver.findElement(By.name("user_v1[query]"));
		driver.findElement(By.className("search_inp collapse giTrackElementHeader"));
		driver.findElement(By.tagName("input"));
		driver.findElement(By.cssSelector(".search_inp.collapse.giTrackElementHeader"));
		driver.findElement(By.xpath("//input[@id=search-inp]"));
		driver.findElement(By.linkText("javascript:void(0);"));
		driver.findElement(By.partialLinkText("void(0)"));
		 */

	}

}
