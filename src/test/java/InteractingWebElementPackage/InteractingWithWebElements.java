package InteractingWebElementPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InteractingWithWebElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(5000);
        WebElement webElement = driver.findElement(By.name("customer.firstName"));
        Thread.sleep(3000);
        webElement.clear();
        webElement.sendKeys("zakir");
        Thread.sleep(3000);
        driver.quit();

    }
}
