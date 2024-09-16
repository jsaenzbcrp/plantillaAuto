import org.openqa.selenium.WebDriver;
import Test.Core.DriverManager;
public class Main {
    public static void main(String[] args) throws InterruptedException {

       WebDriver driver;
       driver=DriverManager.getDriver();

        driver.get("https://github.com/jhamir14sp");
        driver.wait(5000);

        driver.quit();


    }
}