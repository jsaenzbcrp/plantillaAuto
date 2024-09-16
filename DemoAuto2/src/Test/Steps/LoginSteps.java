package Test.Steps;

import Test.Page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import static Test.Page.LoginPage.alertText;

public class LoginSteps {
    private WebDriver driver;

    public LoginSteps(WebDriver driver){
        this.driver = driver;
    }

    public void typeUser(String user)  {
        WebElement userInputElement = driver.findElement(LoginPage.userInput);
        userInputElement.sendKeys(user);
    }
    public void typePass(String pass){
        WebElement passInputElement = driver.findElement(LoginPage.passInput);
        passInputElement.sendKeys(pass);
    }
    public void clicLogin(){
        WebElement btnLogin2 = driver.findElement(LoginPage.loginButton);
        btnLogin2.click();
    }
   public void searchAlert(){
        driver.findElement(alertText).isDisplayed();
    }
}
