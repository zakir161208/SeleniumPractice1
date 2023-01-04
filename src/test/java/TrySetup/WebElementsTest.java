package TrySetup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class WebElementsTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        List<WebElement> webelements = driver.findElements(By.tagName("a"));
        System.out.println("Total Link"  + webelements.size());

        for (WebElement webelement1:webelements
             )
            System.out.println(webelement1.getText());

    }
}
