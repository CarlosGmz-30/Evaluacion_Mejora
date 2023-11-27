package mx.edu.utez;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class casoPrueba_02 {
    public static void main(String[] args) {
        registroUsuario();
    }

    public static void registroUsuario() {
        // Configuración del ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        // Crear instancia de ChromeDriver
        WebDriver navegador = new ChromeDriver();

        navegador.manage().window().maximize();
        navegador.get("http://localhost:8080/intCapos_war_exploded/index.jsp");

        // Presionamos el botón de usuario para registrar nuevo usuario
        navegador.findElement(By.xpath("/html/body/header/nav/ul/button[1]")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Presionamos el botón de registrar nuevo usuario
        navegador.findElement(By.xpath("//*[@id=\"registrar\"]")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Llenamos la casilla de nombre
        navegador.findElement(By.xpath("//*[@id=\"nombre-register\"]")).sendKeys("Name");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Llenamos la casilla de Apellido
        navegador.findElement(By.xpath("//*[@id=\"apellido-register\"]")).sendKeys("Lastname");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Llenamops la casilla de correo electrónico
        navegador.findElement(By.xpath("//*[@id=\"email-register\"]")).sendKeys("example@utez.edu.mx");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Llenamos la casilla de contraseña
        navegador.findElement(By.xpath("//*[@id=\"contraseña-register\"]")).sendKeys("1234567890");
        navegador.findElement(By.xpath("//*[@id=\"contraseña-register-confirm\"]")).sendKeys("1234567890");

        // Agregamos un scroll a la pantalla para encontrar el botón de registrar
        JavascriptExecutor js = (JavascriptExecutor) navegador;
        js.executeScript("window.scrollBy(0,600)", "");

        // Agregamos un Explicit Wait para esperar a que cargue el elemento en pantalla
        WebDriverWait wait = new WebDriverWait(navegador, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"registro\"]")));

        // Ubicamos el WebElement del botón
        WebElement registerButton = navegador.findElement(By.xpath("//*[@id=\"registro\"]"));

        // Utilizamos JavascriptExecutor para hacer clic en el botón
        js.executeScript("arguments[0].click();", registerButton);

        // Presionamos el botón de usuario para verificar que se registró el usuario
        navegador.findElement(By.xpath("/html/body/header/nav/ul/button[1]")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Esperamos un tiempo adicional
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Cerrar el navegador al finalizar
        navegador.quit();
    }
}
