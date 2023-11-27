package mx.edu.utez;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class casoPrueba_04 {
    public static void main(String[] args) {
        crearArticulo();
    }

    public static void crearArticulo() {
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

        // Llenamos el input de nombre del producto
        navegador.findElement(By.xpath("//*[@id=\"nombre\"]")).sendKeys("Product Example");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Llenamos el input de Descripción del producto
        navegador.findElement(By.xpath("//*[@id=\"comentarios\"]")).sendKeys("Product Example Description");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Llenamos el input de precio del producto
        navegador.findElement(By.xpath("//*[@id=\"precio\"]")).sendKeys("499");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Seleccionamos una categoría a la que agregaremos el producto
        navegador.findElement(By.xpath("//*[@id=\"agregarCA\"]")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Agregamos un color al producto, en este caso de una sudadera
        navegador.findElement(By.xpath("//*[@id=\"agregarC\"]")).click();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Agregamos talla al producto
        navegador.findElement(By.xpath("//*[@id=\"agregarT\"]")).click();
        Select selectTalla = new Select(navegador.findElement(By.id("talla")));
        selectTalla.selectByValue("M");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Agregamos cantidad
        navegador.findElement(By.xpath("//*[@id=\"cantidad\"]")).sendKeys("1");
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Agregamos un scroll a la pantalla para encontrar el botón de agregar al carrito
        js.executeScript("window.scrollBy(0,800)", "");

        // Ubicamos el WebElement del botón
        WebDriverWait wait = new WebDriverWait(navegador, Duration.ofSeconds(30));
        WebElement save = navegador.findElement(By.xpath("//*[@id=\"guardar\"]"));

        // Utilizamos JavascriptExecutor para hacer clic en el botón
        js.executeScript("arguments[0].click();", save);

        // Esperamos un tiempo adicional
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Cerrar el navegador al finalizar
        navegador.quit();
    }

    public static void scrollToElement(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
