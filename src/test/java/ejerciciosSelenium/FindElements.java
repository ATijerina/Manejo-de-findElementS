package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        // Encuentro todos los radio buttons y hago clic uno por uno
        List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
        for (WebElement radio : radios) {
            radio.click(); // hace clic

        }

        //  Encuentro todos los checkboxes y hago clic uno por uno
        List<WebElement> checks = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement check : checks) {
            check.click(); // hace clic

        }

        // Cierro el navegador
        driver.quit();
    }
}
