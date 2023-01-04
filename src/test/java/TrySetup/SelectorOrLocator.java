package TrySetup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectorOrLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        WebElement webelement= driver.findElement(By.id("customer.firstName"));
        webelement.clear();
        webelement.click();
        webelement.sendKeys("zakir al");
        Thread.sleep(3000);
        String title = driver.findElement(By.className("title")).getText();
        WebElement lastname = driver.findElement(By.name("customer.lastName"));
        lastname.clear();
        lastname.sendKeys("mahfuj");
        Thread.sleep(3000);


        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("gin info")).click();
        Thread.sleep(3000);

        driver.findElement(By.tagName("title")).getText();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div/ul[1]/li[5]/a")).getText();
        Thread.sleep(3000);








        driver.quit();

    }
}
