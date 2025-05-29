package ejerciciosSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.*;

public class LoginUsingTestNG {
    @Test
    public void logingWithValidCredentials() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get ("https://rahulshettyacademy.com/locatorspractice/");

        //Buscar y mapper los elementos
        //user name
        WebElement usernameTxtBox = driver.findElement(By.id("inputUsername"));
        //Pasword
        WebElement passwordTxtBox = driver.findElement(By.name("inputPassword"));
        //Sing in button
        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));

        //ingresar usuario
        usernameTxtBox.sendKeys("tester");
        //ingresar contrseña
        passwordTxtBox.sendKeys("rahulshettyacademy");
        //click summit
        submitBtn.click();

        //esperamos
        Thread.sleep(3000);

        //byscar welcomw to..
        WebElement welcomeTxt = driver.findElement(By.xpath("//h1"));
        System.out.println(welcomeTxt.getText());

        driver.quit();
    }

    @Test
    public  void loginWithInvalidCredentials() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //buscar y mapear los elementos
        //username
        WebElement userNametxt = driver.findElement(By.id("inputUsername"));
        //Password
        WebElement passwordTxtbox = driver.findElement(By.name("inputPassword"));
        //sing button
        //WebElement sumitButton2 = driver.(By.xpath("//button[@type='submit']"));

        //ingresar usuariofindElement

        userNametxt.sendKeys("tester");
        //ingresar contraseñ
        passwordTxtbox.sendKeys("contraseñaincorrecta");
        //click summit
      // sumitButton2.click();

        Thread.sleep(3000);

        //buscamos el mensaje de error
        WebElement errorTxt = driver.findElement(By.xpath("//p[@class='error']"));
        System.out.println(errorTxt.getText());





        driver.quit();
    }
}

