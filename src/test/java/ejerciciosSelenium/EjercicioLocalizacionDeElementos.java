package ejerciciosSelenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class EjercicioLocalizacionDeElementos {

    public static void main(String[] args) {

        // Aqui estoy creando una instancia de chrome
        WebDriver driver = new ChromeDriver();
        // Aqui estoy abriendo la URL a traves del metdo get perenece a Driver
        //Driver es un objeto del tipo webdriver
        driver.get ("https://rahulshettyacademy.com/AutomationPractice/");

        // Creo un objeto del ripo webElement el cual es igual a driver.find...
        //lo localizo con el ID

        WebElement buttonOpenWindow = driver.findElement(By.id("openwindow"));
        WebElement buttonOpenTab = driver.findElement(By.id("opentab"));
        WebElement textFieldName = driver.findElement(By.id("name"));
        WebElement buttonAlert = driver.findElement(By.id("alertbtn"));
        WebElement buttonConfirm = driver.findElement(By.id("confirmbtn"));
        WebElement buttonHide = driver.findElement(By.id("hide-textbox"));
        WebElement buttonShow = driver.findElement(By.id("show-textbox"));
        WebElement textFieldHideShow = driver.findElement(By.id("displayed-text"));

        //Buscando por name
        WebElement textFieldNameByName = driver.findElement(By.name("enter-name"));
        WebElement textFieldHideShowByName = driver.findElement(By.name("show-hide"));

        //Buscando por className
        //Los 3 elementos tienen la misma class name findElement  devuelve todos, pero solo interactua con el primero, por ende decidi guardarlo en una lista
        //cuando quiera hacer algo con esos elementos tendre que iterar con ellos con un for
        List<WebElement> radioButtons = driver.findElements(By.className("radioButton"));





    }
}
