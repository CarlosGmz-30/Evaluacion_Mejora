package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Practica1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            testForm();
        }
    }

    public static void testForm() {
        // Configuración de ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        // Crear una instancia del ChromeDriver
        WebDriver navegador = new ChromeDriver();
        String url = "https://demoqa.com/automation-practice-form";
        String nameInput = "//*[@id=\"firstName\"]";
        String lastnameInput = "//*[@id=\"lastName\"]";
        String emailInput = "//*[@id=\"userEmail\"]";
        String genderInput = "//*[@id=\"genterWrapper\"]/div[2]";
        String mobileInput = "//*[@id=\"userNumber\"]";
        String submit = "//*[@id=\"submit\"]";
        String gender = "Male";

        // 1.Abrir el sitio web
        navegador.get(url);
        // 2.Llenar el campo de nombre
        navegador.findElement(By.xpath(nameInput)).sendKeys("Carlos");
        // 3. Llenar el campo de apellido
        navegador.findElement(By.xpath(lastnameInput)).sendKeys("Martínez");
        // 4. Llenar el campo de email
        navegador.findElement(By.xpath(emailInput)).sendKeys("20223tn066@utez.edu.mx");
        // Seleccionar el género
        switch (gender) {
            case "Male":
                genderInput = "//*[@id=\"genterWrapper\"]/div[2]/div[1]/label";
                break;
            case "Female":
                genderInput = "//*[@id=\"genterWrapper\"]/div[2]/div[2]/label";
                break;
            case "Other":
                genderInput = "//*[@id=\"genterWrapper\"]/div[2]/div[3]/label";
                break;
            default:
                break;
        }
        navegador.findElement(By.xpath(genderInput)).click();
        // 6. Llenar el cammpo de número
        navegador.findElement(By.xpath(mobileInput)).sendKeys("7772238283");

        // 7. Enviar el formulario
        navegador.findElement(By.xpath(submit)).submit();

        // 8. Esperar 5 segundos
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 9.Cerrar la ventana
        navegador.close();
    }

}
