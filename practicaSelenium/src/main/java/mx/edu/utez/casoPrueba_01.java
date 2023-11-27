package mx.edu.utez;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class casoPrueba_01 {
    public static void main(String[] args) {
        agregarCarrito();
    }

    public static void agregarCarrito() {
        // Configuración del ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        // Crear instancia de ChromeDriver
        WebDriver navegador = new ChromeDriver();

        navegador.manage().window().maximize();
        navegador.get("http://localhost:8080/intCapos_war_exploded/index.jsp");

        // Presionamos el botón de usuario para iniciar sesión
        navegador.findElement(By.xpath("/html/body/header/nav/ul/button[1]")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Llenamos el input de correo
        navegador.findElement(By.xpath("//*[@id=\"email-login\"]")).sendKeys("20223tn066@utez.edu.mx");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Llenamos el input de contraseña
        navegador.findElement(By.xpath("//*[@id=\"contraseña-login\"]")).sendKeys("123456789");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Presionamos el botón de iniciar sesión
        navegador.findElement(By.xpath("//*[@id=\"iniciar\"]")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Presionamos en el menú de categorías
        navegador.findElement(By.xpath("/html/body/nav/ul/li[1]/a")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Seleccionamos el producto a agregar al carrito
        navegador.findElement(By.xpath("//*[@id=\"categorys-container\"]/div/div/div[1]/a")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Agregamos un scroll a la pantalla para encontrar el botón de agregar al carrito
        JavascriptExecutor js = (JavascriptExecutor) navegador;
        js.executeScript("window.scrollBy(0,600)", "");

        // Agregamos un Explicit Wait para esperar a que cargue el elemento en pantalla
        WebDriverWait wait = new WebDriverWait(navegador, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"add-btn-container\"]/button")));

        // Ubica el WebElement del botón
        WebElement addButton = navegador.findElement(By.xpath("//*[@id=\"add-btn-container\"]/button"));

        // Utiliza JavascriptExecutor para hacer clic en el botón
        js.executeScript("arguments[0].click();", addButton);

        // Esperamos un tiempo adicional (puedes ajustar esto según sea necesario)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click en botón de generar ticket
        navegador.findElement(By.xpath("//*[@id=\"btn-generate-ticket\"]")).click();

        // Cerrar el navegador al finalizar
        navegador.quit();
    }
}
