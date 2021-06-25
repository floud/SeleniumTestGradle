import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.Keys.RETURN;

public class AddWebDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",".//src//main//resources//chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://");
        System.out.println(driver.getTitle());
        driver.findElementByXPath("//input[@id='text']").sendKeys("xzxzx");
        WebElement element = driver.findElementByXPath("//input[@id='text']");
        element.sendKeys(RETURN);
        driver.close();
//        driver.findElementByCssSelector("body.not-logged.b-page_infinity-zen_yes.i-ua.i-bem.b-page.b-page_search-bottom_yes.b-page_bg-exp_yes.i-ua_platform_other.i-ua_js_inited:nth-child(2) div.body__wrapper:nth-child(2) div.container.rows:nth-child(3) div.row.rows__row.rows__row_main:nth-child(3) div.col.widgets div.container.container__search.container__line:nth-child(3) div.row.second.text_black_yes div.home-arrow.i-bem.home-arrow_js_inited div.home-arrow__search-wrapper div.home-arrow__search form.search2.mini-suggest.mini-suggest_search_yes.mini-suggest_personal_yes.mini-suggest_theme_flat.mini-suggest_tab-change_yes.mini-suggest_request_xhr.mini-suggest_separate-popup_yes.mini-suggest_autofocus_yes.mini-suggest_direct_yes.mini-suggest_re-request_yes.mini-suggest_favicon_yes.search2_type_2021.i-bem.search2_empty_yes.search2_js_inited:nth-child(1) div.search2__button:nth-child(4) > button.button.mini-suggest__button.button_theme_search.button_size_search.i-bem.button_js_inited");
    }
}
