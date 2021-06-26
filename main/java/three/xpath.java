package three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        
        //относительный локатор для Email или телефона
		driver.findElement(By.xpath("//table[@role='presentation']/tbody/tr[2]/td/input[@id='email']"));
		//содержит текст Email или Телефон"
		driver.findElement(By.xpath("//label[contains(text(),'Электронный адрес или номер телефона'"));
		//содержит атрибут ATTRIBUTENAME со значением AtributeValue
		driver.findElement(By.xpath("//label[contains(@for,'email'"));
		//начинается с текста «Facebook помогает вам всегда оставаться на связи и общаться со своими знакомыми»
		driver.findElement(By.xpath("//div[starts-with(text(),'Facebook'"));
		//значение атрибута class начинается с _5iyx
		driver.findElement(By.xpath("//div[starts-with(@class,'_5iyx'"));
		//все ноды, следующие за //input[@id='email']
		driver.findElement(By.xpath("//input[@id='email']/following::*"));
		//все ноды tr, следующие за //input[@id='email']
		driver.findElement(By.xpath("//input[@id='email']/following::tr"));
		//все ноды того же уровня, помимо указанной, т е месяц и год, следующие за //select[@id='day']
		driver.findElement(By.xpath("//select[@id='day']/following-sibling::*"));
		//все ноды select/option того же уровня, следующие за указанной, т е выпадашки месяца и года
		driver.findElement(By.xpath("//select[@id='day']/following-sibling::select/option"));
		//предшествующие ноды, помимо указанной
		driver.findElement(By.xpath("//input[@id='day']/preceding::*"));
		//предшествующие ноды select/option, помимо указанной, т е поле ввода email
		driver.findElement(By.xpath("//input[@id='pass']/preceding::input[1]"));
		//предшествующие ноды того же уровня, помимо указанной, т е дата и месяц 
		driver.findElement(By.xpath("//select[@id='year']/preceding-sibling::*"));
		//предшествующие ноды select/option того же уровня, помимо указанной, т е выпадашки даты  и месяца 
		driver.findElement(By.xpath("//select[@id='year']/preceding-sibling::select/option"));	
		
		//xpath для забыл пароль в ФБ - полный. ненадежно! (начинается с html)
		// в случае нескольких элементов берет первый
		
	}
}
