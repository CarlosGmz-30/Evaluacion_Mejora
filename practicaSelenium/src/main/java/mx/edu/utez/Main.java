package mx.edu.utez;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        // Configuración do ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        // Creamos la intancias de ChromeDriver
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.get("http://localhost:8080/intCapos_war_exploded/index.jsp");

    }
}