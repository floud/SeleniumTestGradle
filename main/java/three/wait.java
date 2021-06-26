 package main.three;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.navigate().to("https://www.spicejet.com/");
// ������� �� ������������
    	/*		Thread.sleep(1000);
//implicit - ���� �������� ���� ���������. �������� �������� � �������� ��� ������� �����������
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
//explicit - ���� �������� ������������� ��������
		WebDriverWait wait = new WebDriverWait(driver, 10);	
		WebElement myElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("123")));
		
//fluent - ������ ������������ ����� �������� �������, ������� ������ ��������� � ����� ������������ ������ ������
		Wait<WebDriver> fwait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

//������, ������� �����, ������, ��� �������� ������ �������� ��������
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		
//������, ������� ����� ����������� �����
		driver.manage().timeouts().setScriptTimeout(50,TimeUnit.SECONDS);
		
//������� ��������� ������ � ������������� � ����
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame"));
		
		
	}

 // ������ c ������� � ����� 
  public void testUntitled() throws Exception {
    driver.get("http://www.google.com");
    element = driver.findElement(By.id("lst-ib"));
    element.sendKeys("Selenium WebDriver Interview questions");
    element.sendKeys(Keys.RETURN);
   List<WebElement> list = driver.findElements(By.className("_Rm"));
   System.out.println(list.size());
*/  
	}


    public void ExpectedConditionExample() throws InterruptedException {
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
	
	
           // saving the GUI element reference into a "element" variable of WebElement type
           WebElement element =  driver.findElement(By.id("Email"));

           // entering username
           element.sendKeys("dummy@gmail.com");
           element.sendKeys(Keys.RETURN);

           // entering password
           driver.findElement(By.id("Passwd")).sendKeys("password");
	 
	       // clicking signin button
           driver.findElement(By.id("signIn")).click();
	 
	       // explicit wait - to wait for the compose button to be click-able
	       WebDriverWait wait = new WebDriverWait(driver,30);
	       
	       WebElement el1 =  driver.findElement( By.xpath("//div[contains(text(),'COMPOSE')]"));
	 
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
	       // click on the compose button as soon as the "compose" button is visible
           driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
	       }


}