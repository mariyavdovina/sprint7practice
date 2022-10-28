package com.example.demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Test;
import org.junit.After;

public class CookieTest {

    private WebDriver driver;

    @Test
    public void test() {
        // Создаём драйвер для браузера Chrome
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        //driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        driver.get("https://qa-mesto.praktikum-services.ru/");

        Cookie newCookie = new Cookie("my_first_cookie", "15");
        driver.manage().addCookie(newCookie);
        // измени значение куки: сначала нужно удалить куки,
        // например, по имени, а затем добавить снова
        driver.manage().deleteCookieNamed("my_first_cookie");
        newCookie = new Cookie("my_first_cookie", "25");
        driver.manage().addCookie(newCookie);
    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
