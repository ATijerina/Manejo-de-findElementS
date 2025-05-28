
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class InteractWithElements {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        //ejemplo de click
        // Buscar show button
        WebElement showBtn = driver.findElement(By.id("show-textbox"));
        //buscar hide button
        WebElement hideBtn = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
        // 3 Dar clicl en show button
        showBtn.click();
        //4 dar click en hide button
        hideBtn.click();
        //5 click en shown button
        showBtn.click();
        //6 dar click en hide button
        hideBtn.click();


        //ejemplo de sendKeys()
        // 1 buscar  elemento
        WebElement countryTxtbox = driver.findElement(By.id("autocomplete"));
        // 2 escribir usando send keys()
        countryTxtbox.sendKeys("Mexico");

        WebElement nameTxtBox = driver.findElement(By.id("name"));
        nameTxtBox.sendKeys("Andrea");

        //borrar texto

        countryTxtbox.clear();
        nameTxtBox.clear();

        //comando GET
        //getTittle() esto nos va a traer el titulo de la pagina
        System.out.println(driver.getTitle());
        //devuelve la URL actual
        System.out.println(driver.getCurrentUrl());

        //ejemplo getText()
        // 1 encontrar elemento
        WebElement radioBtnbl = driver.findElement(By.xpath("//legend[text()='Radio Button Example']"));
        System.out.println(radioBtnbl.getText());

        //Ejercicio: Traer el texto de "suggestion class example"

        WebElement sugClassE = driver.findElement(By.xpath("//legend[text()='Suggession Class Example']"));
        System.out.println(sugClassE.getText());

        //COMANDOS CONDICIONALES
        //isDisplayed

        WebElement hideShowTxtBx = driver.findElement(By.xpath("//input[@id='show-textbox']"));
        System.out.println("El estatus del textbox isDisplayed es:" + hideShowTxtBx.isDisplayed());
        showBtn.click();
        System.out.println("Ahora el estatus del textbox isDisplayed:" +hideShowTxtBx.isDisplayed());

        //Buscar el radioButton 1
        //Dar click en esste
        //Verificar si esta checked con el comando

        WebElement radio1 = driver.findElement(By.xpath("//input[@value='radio1']"));
        System.out.println("El radio button esta:" + radio1.isSelected());
        radio1.click();

        //tarea darle click al segundo y checar que el primmero se desabilite y luego al 3er boton y revisar que no se deseleccione el 2do
        //elemento checkbox example

        WebElement radioButton2 = driver.findElement(By.xpath("//input[@value = 'radio2']"));
        radioButton2.click();
        System.out.println(radioButton2.isSelected());
        // pendiente terminar WebElement radioButton2=

         //Alert buscar con xpath y seleccionar

         //Manejo de alertas
        WebElement buttonAlert = driver.findElement(By.xpath("//input[@id = 'alertbtn']"));
        buttonAlert.click();
        //thread.sleep(6000);
        // 3 aceptar la alerta
        driver.switchTo().alert().accept();
        //thread.sleep(6000);

        //1 Buscar boton de confirm
        WebElement buttonConfirm= driver.findElement(By.xpath("//input[@value = 'Confirm']"));
        //thread.sleep(6000);
        //2click en el boton confirm
        buttonAlert.click();
        //git status
        //3 aceptar alerta
        driver.switchTo().alert().accept();
        //4 volver a ahcer clcik en el confirm
        //thread.sleep(6000);
        buttonAlert.click();
        //thread.sleep(6000);
        //5 declinar la alerta
        driver.switchTo().alert().dismiss();
        //thread.sleep(6000);

        //TAREA HARDCORE
        //Poner el nombre en el campo de enter your name
        WebElement nameTxtBoxTask = driver.findElement(By.id("name"));
        //thread.sleep(6000);
        //escribir nuestro nomnbre
        nameTxtBoxTask.sendKeys("Andrea");
        //dsr clicl en confirm
        buttonConfirm.click();
        //aceptar o declinar la alarte
        String textAlert = driver.switchTo().alert().getText();// el tex alert lo guardo en un string
        driver.switchTo().alert().dismiss();
        //el de alert get text nos va a permitir traer el texto de la alerta ..traernos el texto a la consola
        System.out.println("El texto de la alerta es, " + textAlert);
        //thread.sleep(6000); //no usar esto en una interview no es tan buena practica, solo porque hace mas lento la automatizacion


        //Manejo de DROPDOWN
        //1 Buscar el elemento en dropdown
        WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
        //thread.sleep(6000);
        //2 crear una instancia y como queramos nombra a nuestro objeto
        Select select = new Select(dropDown);
        //thread.sleep(6000);
        //3 seleccionamos el valor que queremos hay 3 formas
        //por indix
        select.selectByIndex(0);
        //thread.sleep(6000);
        select.selectByValue("option3");
        //thread.sleep(6000);
        select.selectByVisibleText("Option2");
        //thread.sleep(6000);

        //Acciones con selenium veremos Mouse Hover y click derecho
        //Mouse hover
        WebElement mouseHoverButton = driver.findElement(By.id("mousehover"));
        //thread.sleep(6000);
        //Hacer una instancia
        Actions actions = new Actions(driver);
        //thread.sleep(6000);
        //Hacer el hover
        //primero se mueva el elemento "iframe example"
        // poner codigo aqui
        WebElement iFrameButton = driver.findElement(By.xpath("//legend[text()='iFrame Example']"));
        actions.moveToElement(iFrameButton).perform();
        actions.moveToElement(mouseHoverButton).contextClick(mouseHoverButton).build().perform();
        //thread.sleep(6000);

        //USO DEL FINELEMENTSSSSSSSSS
        List<WebElement> encabezados = driver.findElements(By.xpath("//table[@name='courses']//th"));
        for (int i = 0; i < encabezados.size(); i++) {
            System.out.println(encabezados.get(i).getText());
        }
        for (WebElement encabezado : encabezados)
            System.out.println(encabezado.getText());

        driver.quit(); // termina el quit siempre tiene que ir al final
    }

    //picarle a todos los radio button y en el che button
    // darle click y quitarlo agregar pro is select tru tru false false
    //usando find element ..buscar xpat en comun de los elementos que aparezcan 2 de 3 un decir.buscar el selector en comun
    //iterarlos por lista de arreglos y en vez de get text sera el click
    //usingFindelements

}