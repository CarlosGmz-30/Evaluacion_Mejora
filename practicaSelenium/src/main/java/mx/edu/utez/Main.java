package mx.edu.utez;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Configuración do ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        // Creamos la intancias de ChromeDriver
        WebDriver navegador = new ChromeDriver();


        navegador.manage().window().maximize();
        navegador.get("http://localhost:8080/intCapos_war_exploded/index.jsp");

        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // Presionamos el botón de usuario para inciar sesión
        navegador.findElement(By.xpath("/html/body/header/nav/ul/button[1]")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Llenamos el input de correo
        navegador.findElement(By.xpath("//*[@id=\"email-login\"]")).sendKeys("20223tn066@utez.edu.mx");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // Llenamos el input de contraseña
        navegador.findElement(By.xpath("//*[@id=\"contraseña-login\"]")).sendKeys("123456789");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // Presionamos el botón de iniciar sesión
        navegador.findElement(By.xpath("//*[@id=\"iniciar\"]")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // Presionamos en el menú de categorías
        navegador.findElement(By.xpath("/html/body/nav/ul/li[1]/a")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // Seleccionamos el producto a agregar al carrito
        navegador.findElement(By.xpath("//*[@id=\"categorys-container\"]/div/div/div[1]/a")).click();
        // Agregtamos un scroll a la pantalla para encontrar el botón de agregar al carrito
        JavascriptExecutor js = (JavascriptExecutor) navegador;
        js.executeScript("window.scrollBy(0,600)", "");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Click en botón de agregar al carrito
        navegador.findElement(By.xpath("//*[@id=\"add-btn-container\"]/button")).click();
        // Click en botón de generar ticket
        navegador.findElement(By.xpath("//*[@id=\"btn-generate-ticket\"]")).click();
    }
}