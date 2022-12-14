package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.After;
import org.junit.Test;

import java.time.Duration;

// Класс страницы авторизации
/*
class LoginPageMesto {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By signInButton = By.className("auth-form__button");

    public LoginPageMesto(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username) {
        driver.findElement(emailField).sendKeys(username);
    }
    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickSignInButton() {
        driver.findElement(signInButton).click();
    }
    public void login(String username, String password){
        setUsername(username);
        setPassword(password);
        clickSignInButton();
    }
}
*/

// Класс главной страницы
class HomePageMesto {

    private WebDriver driver;
    // создай локатор для поля «Занятие» профиля пользователя
    private By name = By.className("profile__description");

    public HomePageMesto (WebDriver driver){
        this.driver = driver;
    }
    // метод ожидания загрузки страницы
    public void waitForLoadHomePage(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("header__user")));
    }
    // метод для получения значения поля «Занятие» профиля
/*    public String getActivity(){
        String text = driver.findElement(activity).getText();
        return text;
    }*/
}

// Класс с автотестом
public class FindByText {

    private WebDriver driver;

    @Test
    public void test() {
        // создаем драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // переходим на страницу тестового приложения
        driver.get("https://qa-mesto.praktikum-services.ru/");

        // создай объект класса страницы авторизации
        LoginPageMesto objLoginPage = new LoginPageMesto(driver);

        // выполни авторизацию
        objLoginPage.login("mariya.vdovina@gmail.com",
                "svaneti2020");

        // создай объект класса главной страницы приложения
        HomePageMesto objHomePage = new HomePageMesto(driver);
        // дождись загрузки главной страницы
        objHomePage.waitForLoadHomePage();
        // сохрани в переменную activity значение поля «Занятие»
       // String activity = objHomePage.getActivity();

    }
    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}