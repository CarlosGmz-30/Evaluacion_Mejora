package mx.edu.utez;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class casoPrueba_06 {
    public static void main(String[] args) {
        System.setProperty("webdrive.chrome.driver", "src/main/resources/drivers/chromedrive.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.manage().window().maximize();
        navegador.get("http://localhost:8080/intCapos_war_exploded/index.jsp");


        //Prueba 2: Consultar el historial de pedidos de un usuario
        // Click en el icono de usuario
        navegador.findElement(By.xpath("/html/body/header/nav/ul/button[1]")).click();
        // Agregar tiempo de espera para que se despliegue el menu
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Click en el input de correo electronico
        navegador.findElement(By.xpath("//*[@id=\"email-login\"]")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Iniciar sesion
        navegador.findElement(By.xpath("//*[@id=\"email-login\"]")).sendKeys("20223tn066@utez.edu.mx");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        navegador.findElement(By.xpath("//*[@id=\"contraseña-login\"]")).sendKeys("1234567890");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // Click en el boton Inicar Sesión
        navegador.findElement(By.xpath("//*[@id=\"iniciar\"]")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        navegador.findElement(By.xpath("/html/body/header/nav/ul/button[1]")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        navegador.findElement(By.xpath("//*[@id=\"history\"]")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
}
