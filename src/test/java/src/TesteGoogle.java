package src;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Wait.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class TesteGoogle {

    @Test
    public void teste()  {

        WebDriver driver = new WebDriverGerencia().createWebDriver(DriverManagerType.CHROME);

        driver.get("https://bit.ly/3jOMrR9");

        //driver.findElement(By.linkText("Pesquisa – QA")).click();
        //driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/nav/div/ul/li[6]/a")).click();
        driver.findElement(By.cssSelector("#menu-item-226 > a")).click();

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

        //botao enviar
        //driver.findElement(By.name("nf-field-16")).click();



        //        .selectByVisibleText("mais de 5 anos")

        //new Select(driver.findElement(By.id("nf-field-11")).isSelected()
        //.selectBox.selectByVisibleText("mais de 5 anos");








        //driver.quit();

		//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new InternetExplorerDriver();
//		driver.manage().window().setSize(new Dimension(1200, 765));
        //Assert.assertEquals("Auxílio emergencial ao cidadão", driver.getTitle());

        //driver.findElement(By.xpath("/html/body[@class='mat-typography']/app-root/app-inicio/div[@class='divIntroDesktop']/div[@class='parteAzul']/div[@class='lateral']/div[@class='botoesLaterais']/div/button[@class='mat-focus-indicator botao telaInicial secundario branco mat-stroked-button mat-button-base']/span[@class='mat-button-wrapper']")).click();

        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //driver.findElement(By.id("mat-input-0")).click();


        //driver.findElement(By.id("mat-input-0")).sendKeys("271.414.974-04");

        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        //driver.findElement(By.id("/html/body[@class='mat-typography']/app-root/app-acompanhamento-validacao[@class='ng-star-inserted']/div[@class='ng-star-inserted']/footer[@class='footer']/button[@class='mat-focus-indicator botao normal mat-raised-button mat-button-base']")).click();

        //driver.findElement(By.xpath("/html/body[@class='mat-typography']/app-root/app-acompanhamento-validacao[@class='ng-star-inserted']/div[@class='ng-star-inserted']/footer[@class='footer']/button[@class='mat-focus-indicator botao normal mat-raised-button mat-button-base']")).click();

        //nome
        //driver.findElement(By.xpath("/html/body[@class='mat-typography']/app-root/app-acompanhamento-cadun[@class='ng-star-inserted']/div[@class='container ng-star-inserted']/form[@class='form ng-pristine ng-invalid ng-touched']/div[@class='colunaLeft']/div[@class='input-size']/mat-form-field[@class='mat-form-field ng-tns-c83-1 mat-primary mat-form-field-type-mat-input mat-form-field-appearance-legacy mat-form-field-can-float mat-form-field-should-float mat-form-field-has-label ng-pristine ng-invalid mat-form-field-invalid ng-touched mat-focused']/div[@class='mat-form-field-wrapper ng-tns-c83-1']/div[@class='mat-form-field-flex ng-tns-c83-1']/div[@class='mat-form-field-infix ng-tns-c83-1']/input[@id='mat-input-1']")).click();
        //driver.findElement(By.xpath("/html/body[@class='mat-typography']/app-root/app-acompanhamento-cadun[@class='ng-star-inserted']/div[@class='container ng-star-inserted']/form[@class='form ng-pristine ng-invalid ng-touched']/div[@class='colunaLeft']/div[@class='input-size']/mat-form-field[@class='mat-form-field ng-tns-c83-1 mat-primary mat-form-field-type-mat-input mat-form-field-appearance-legacy mat-form-field-can-float mat-form-field-should-float mat-form-field-has-label ng-pristine ng-invalid mat-form-field-invalid ng-touched mat-focused']/div[@class='mat-form-field-wrapper ng-tns-c83-1']/div[@class='mat-form-field-flex ng-tns-c83-1']/div[@class='mat-form-field-infix ng-tns-c83-1']/input[@id='mat-input-1']")).sendKeys("Fatima Pereira da Silva");

        //dataNascto
        //driver.findElement(By.xpath("/html/body[@class='mat-typography']/app-root/app-acompanhamento-cadun[@class='ng-star-inserted']/div[@class='container ng-star-inserted']/form[@class='form ng-untouched ng-pristine ng-invalid']/div[@class='colunaRigth']/div[@class='input-size'][1]/mat-form-field[@class='mat-form-field ng-tns-c83-5 mat-primary mat-form-field-type-mat-input mat-form-field-appearance-legacy mat-form-field-can-float mat-form-field-should-float mat-form-field-has-label ng-untouched ng-pristine ng-invalid mat-focused']/div[@class='mat-form-field-wrapper ng-tns-c83-5']/div[@class='mat-form-field-flex ng-tns-c83-5']/div[@class='mat-form-field-infix ng-tns-c83-5']/input[@id='mat-input-5']")).click();
        //driver.findElement(By.xpath("/html/body[@class='mat-typography']/app-root/app-acompanhamento-cadun[@class='ng-star-inserted']/div[@class='container ng-star-inserted']/form[@class='form ng-untouched ng-pristine ng-invalid']/div[@class='colunaRigth']/div[@class='input-size'][1]/mat-form-field[@class='mat-form-field ng-tns-c83-5 mat-primary mat-form-field-type-mat-input mat-form-field-appearance-legacy mat-form-field-can-float mat-form-field-should-float mat-form-field-has-label ng-untouched ng-pristine ng-invalid mat-focused']/div[@class='mat-form-field-wrapper ng-tns-c83-5']/div[@class='mat-form-field-flex ng-tns-c83-5']/div[@class='mat-form-field-infix ng-tns-c83-5']/input[@id='mat-input-5']")).sendKeys("19/12/1960");



//		driver.quit();
        }

    }
