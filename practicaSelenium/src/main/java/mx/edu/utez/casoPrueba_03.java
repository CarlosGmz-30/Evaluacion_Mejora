package mx.edu.utez;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class casoPrueba_03 {
    public static void main(String[] args) {
        iniciarSesion();
    }

    public static void iniciarSesion() {
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
        navegador.findElement(By.xpath("//*[@id=\"email-login\"]")).sendKeys("example@utez.edu.mx");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Llenamos el input de contraseña
        navegador.findElement(By.xpath("//*[@id=\"contraseña-login\"]")).sendKeys("1234567890");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Presionamos el botón de iniciar sesión
        navegador.findElement(By.xpath("//*[@id=\"iniciar\"]")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Presionamos el botón de usuario para verificar que se ionició sesión correctamente
        navegador.findElement(By.xpath("/html/body/header/nav/ul/button[1]")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Esperamos un tiempo adicional (puedes ajustar esto según sea necesario)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Cerramos el navegador
        navegador.quit();
    }
}
