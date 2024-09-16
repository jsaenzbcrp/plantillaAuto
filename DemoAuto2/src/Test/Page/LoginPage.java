package Test.Page;

import org.openqa.selenium.By;

public class LoginPage {

    /*public static By userInput = By.id("user_login");
    public static By passInput = By.id("user_pass");
    public static By loginButton = By.id("wp-submit");
    */public static By userInput = By.name("username");
    public static By passInput = By.name("password");
    public static By loginButton = By.xpath("//*[@id=\"login-box\"]/div/div[1]/form/fieldset/div[2]/input");
    public static By alertText = By.xpath("//*[@id=\"login-box\"]/div/div[1]/form/fieldset/div[5]");
    public LoginPage(){}
}
