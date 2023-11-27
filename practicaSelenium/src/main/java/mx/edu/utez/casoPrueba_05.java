package mx.edu.utez;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class casoPrueba_05 {
    public static void main(String[] args) {
        crearCategoria();
    }

    public static void crearCategoria() {
        // Configuración del ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        // Crear instancia de ChromeDriver
        WebDriver navegador = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) navegador;

        navegador.manage().window().maximize();
        navegador.get("http://localhost:8080/intCapos_war_exploded/index.jsp");

        // Presionamos el botón de usuario para iniciar sesión
        navegador.findElement(By.xpath("/html/body/header/nav/ul/button[1]")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Llenamos el input de correo con Administrador
        navegador.findElement(By.xpath("//*[@id=\"email-login\"]")).sendKeys("sitcau.utez@gmail.com");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Llenamos el input de contraseña con Administrador
        navegador.findElement(By.xpath("//*[@id=\"contraseña-login\"]")).sendKeys("23tiendaUTEZ");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Presionamos el botón de iniciar sesión
        navegador.findElement(By.xpath("//*[@id=\"iniciar\"]")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        navegador.findElement(By.xpath("/html/body/section/div[1]/i")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        navegador.findElement(By.xpath("/html/body/div/ul/li[5]/div/i")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        navegador.findElement(By.xpath("/html/body/div/ul/li[5]/ul/li[2]/a")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Llenamos el input de nombre de categoría
        navegador.findElement(By.xpath("//*[@id=\"nombre\"]")).sendKeys("Example");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Presionamos el botón de guardar categoría
        navegador.findElement(By.xpath("//*[@id=\"guardar\"]")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Esperamos un tiempo adicional
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Cerrar el navegador al finalizar
        navegador.quit();
    }
}
