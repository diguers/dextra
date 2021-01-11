package src;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import jdk.jfr.Timespan;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Wait.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyStepdefs {
    WebDriver driver = new WebDriverGerencia().createWebDriver(DriverManagerType.CHROME);


    @io.cucumber.java.pt.Dado("^que eu acesse a página da VV Test$")
    public void queEuAcesseAPáginaDaVVTest() {
        driver.get("https://bit.ly/3jOMrR9");
    }

    @io.cucumber.java.pt.E("^acesse o menu \"([^\"]*)\"$")
    public void acesseOMenu(String arg0) throws Throwable {
        driver.findElement(By.cssSelector("#menu-item-226 > a")).click();
    }

    @io.cucumber.java.pt.Quando("^eu preencher todos os campos obrigatórios$")
    public void euPreencherTodosOsCamposObrigatórios() {
        driver.findElement(By.id("nf-field-5")).sendKeys("Diego");
        driver.findElement(By.id("nf-field-6")).sendKeys("Conrado");
        driver.findElement(By.id("nf-field-7")).sendKeys("diguers@gmail.com");
        driver.findElement(By.id("nf-field-8")).sendKeys("diguers@gmail.com");
        driver.findElement(By.id("nf-field-17")).sendKeys("11941045821");
        driver.findElement(By.id("nf-label-class-field-10-1")).click();

        new Select(driver.findElement(By.id("nf-field-11"))).selectByVisibleText("mais de 5 anos");

        new Select(driver.findElement(By.id("nf-field-12"))).selectByVisibleText("Sou mega chato");

        driver.findElement(By.id("nf-label-class-field-13-0")).click();
        driver.findElement(By.name("nf-field-14")).sendKeys("C#,Java e Ruby");
        driver.findElement(By.name("nf-field-15")).sendKeys("C#,Java e Ruby");


    }

    @io.cucumber.java.pt.Então("^deve ser direcionado para uma página de sucesso$")
    public void deveSerDirecionadoParaUmaPáginaDeSucesso() {

        driver.findElement(By.id("nf-field-16")).click();

        driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);

        //WebElement TxtBoxContent = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/main/article/div/div/div/div/div[1]/p"));
        //System.out.print(TxtBoxContent.getText());

        String actualString = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/main/article/div/div/div/div/div[1]/p")).getText();
        System.out.print(actualString);
        Assert.assertTrue(actualString.contains("Your form has been successfully submitted."));

        driver.quit();
    }

}
