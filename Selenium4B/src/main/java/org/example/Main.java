package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Main {
    public static void main(String[] args) {
        // Configuración de ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        // CASO DE PRUEBA 1: Buscar en google Selenium

        // Paso 1: Abrir el navegador
        // Crear una instancia del ChromeDriver
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        // Paso 2:Ingresar a www.google.com
        navegador.get("https://www.google.com");
        // Paso 3; Hacer click en la barra de búsqueda
        navegador.findElement(By.xpath("//*[@id=\"APjFqb\"]")).click();
        // Paso 4: Escribir "selenium"
        navegador.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium\n");
        // Paso 5: Hacer click en el botón de buscar
        //navegador.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        navegador.navigate().back();

    }
}