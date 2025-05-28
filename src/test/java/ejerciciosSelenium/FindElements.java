package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {
        // Instancio el WebDriver
        System.setProperty("webdriver.chrome.driver", "ruta/al/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Get y agreggro la URL
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        // Selecciono todos los radio buttons a traves de una lista
        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));
        for (WebElement radio : radioButtons) {
            if (!radio.isSelected()) {
                radio.click();
            }
            // Aqui utilice el Sleep para alentar la prueba, batalle un poco con el nuevo metodo
            //que nos enseño Patricia, por eso deje aun el sleep
            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
        }

        // Selecciono todos los check boxes
        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        for (WebElement checkbox : checkBoxes) {
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
        }

        // Cierra el navegador
        driver.quit();
    }
}

