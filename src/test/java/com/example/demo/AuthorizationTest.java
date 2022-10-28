package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import com.example.pagewidgets.LoginPageMestoSelenium;
import org.junit.Test;
import org.junit.After;

public class AuthorizationTest {

    private WebDriver driver;

    @Test
    public void test() {

        //ChromeOptions options = new ChromeOptions(); //Драйвер для браузера
        //options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver();
        driver.get("https://qa-mesto.praktikum-services.ru/");
        // создать объект класса страницы авторизации
        LoginPageMesto objLoginPage = new LoginPageMesto(driver);
        // выполнить авторизацию
        objLoginPage.login("mariya.vdovina@gmail.com",
                "svaneti2020");

    }

    @After
    public void teardown() {
        // Закрыть браузер
        driver.quit();
    }
}
