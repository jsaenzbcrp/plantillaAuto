package Test.Core;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class DriverManager {
    private static WebDriver driver;
    private static Scenario scenario;

    public static WebDriver getDriver(){
       System.setProperty("webdriver.http.factory","jdk-http-client");
        System.setProperty("webdriver.chrome.driver","N:\\Jhamir\\Librerias\\Automatizacion\\Drivers\\chromedriver.exe");
        System.out.println("Iniciando prueba automatizada");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;}

    @Before(order=0)
    public void Setup(){
        System.setProperty("webdriver.http.factory","jdk-http-client");
        System.setProperty("webdriver.chrome.driver","N:\\Jhamir\\Librerias\\Automatizacion\\Drivers\\chromedriver.exe");
        System.out.println("Iniciando prueba automatizada");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Before(order =1)
    public void setScenario(Scenario scenario){
        this.scenario= scenario;
    }
    @After
    public void quitDriver(){
        driver.quit();
    }
    public static void screenShot(WebDriver driver) {
        byte[] evidencia=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
       scenario.attach(evidencia,"image/png","evidencias");

       /* TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("C:\\Users\\2831\\Documents\\DemoAuto2\\src\\Capturas\\image.png");

        //Copy file at destination

        try {
            FileUtils.copyFile(SrcFile, DestFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

    }

}
