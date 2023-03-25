package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Main {

    @Test
    public void testCurrencyConversion() {
        System.setProperty("webdriver.chrome.driver", "E:\\Projects\\TESTING\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rba.hr/");
        WebElement tecajnaLista = driver.findElement(By.linkText("Tečajni kalkulator"));
        tecajnaLista.click();
        WebElement tecajniKalkulator = driver.findElement(By.xpath("//a[text()='Tečajni kalkulator']"));
        tecajniKalkulator.click();
        WebElement kupnjaGBP = driver.findElement(By.xpath("//label[text()='GBP']/following-sibling::input"));
        kupnjaGBP.sendKeys("40");
        WebElement prodajaUSD = driver.findElement(By.xpath("//label[text()='USD']/following-sibling::input"));
        prodajaUSD.sendKeys("50");
        WebElement izracunaj = driver.findElement(By.xpath("//button[text()='Izračunaj']"));
        izracunaj.click();
        WebElement kupovniTecaj = driver.findElement(By.xpath("//td[contains(text(),'Kupovni tečaj')]/following-sibling::td"));
        System.out.println("Kupovni tečaj: " + kupovniTecaj.getText());
        WebElement prodajniTecaj = driver.findElement(By.xpath("//td[contains(text(),'Prodajni tečaj')]/following-sibling::td"));
        System.out.println("Prodajni tečaj: " + prodajniTecaj.getText());
        WebElement iznosKupnje = driver.findElement(By.xpath("//td[contains(text(),'Iznos kupnje')]/following-sibling::td"));
        System.out.println("Iznos kupnje: " + iznosKupnje.getText());
        WebElement iznosProdaje = driver.findElement(By.xpath("//td[contains(text(),'Iznos prodaje')]/following-sibling::td"));
        System.out.println("Iznos prodaje: " + iznosProdaje.getText());
        driver.quit();
    }

}
