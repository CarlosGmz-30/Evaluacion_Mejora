package mx.edu.utez;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Configuración do ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        // Creamos la intancias de ChromeDriver
        WebDriver navegador = new ChromeDriver();


        navegador.manage().window().maximize();
        navegador.get("http://localhost:8080/intCapos_war_exploded/index.jsp");

        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navegador.findElement(By.xpath("/html/body/header/nav/ul/button[1]")).click();
        navegador.findElement(By.xpath("//*[@id=\"email-login\"]")).sendKeys("20223tn066@utez.edu.mx");
        navegador.findElement(By.xpath("//*[@id=\"contraseña-login\"]")).sendKeys("123456789");
        navegador.findElement(By.xpath("//*[@id=\"iniciar\"]")).click();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navegador.findElement(By.xpath("/html/body/nav/ul/li[1]/a")).click();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navegador.findElement(By.xpath("//*[@id=\"categorys-container\"]/div/div/div[1]/a")).click();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        JavascriptExecutor js = (JavascriptExecutor) navegador;
        js.executeScript("window.scrollBy(0,300)", "");
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        navegador.findElement(By.xpath("//*[@id=\"add-btn-container\"]/button")).click();
    }
}