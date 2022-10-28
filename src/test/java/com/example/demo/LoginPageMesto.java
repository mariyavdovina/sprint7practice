package com.example.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageMesto {

    private WebDriver driver;
    //локатор поля ввода email
    private By emailField = By.id("email");
    //локатор поля ввода пароля
    private By passwordField = By.id("password");
    //локатор кнопки входа в приложение
    private By signInButton = By.className("auth-form__button");
    //конструктор класса
    public LoginPageMesto(WebDriver driver){
        this.driver = driver;
    }
    //метод заполняет поля ввода email
    public void setUsername(String username) {
        driver.findElement(emailField).sendKeys(username);
    }
    //метод заполненяет поля ввода пароля
    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    //метод кликает по кнопке авторизации
    public void clickSignInButton() {
        driver.findElement(signInButton).click();
    }
    //метод авторизации в приложении: объединяет ввод email, пароля и клик по кнопке
    public void login(String username, String password){
        setUsername(username);
        setPassword(password);
        clickSignInButton();
    }
}
