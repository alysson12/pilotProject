package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;

public class PaginaPerfil extends PaginaBase{

    public PaginaPerfil(WebDriver driver){
        super (driver);
    }

    public PaginaInicial emularAcesso (String cliente){

        driver.findElement(By.xpath("//*[@id=\"dashboard-buttons\"]/ul/li[5]/a")).click();

        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }

        WebElement btnEmular = driver.findElement (By.id("btn_emular"));
        Utils.aguardarElemento (btnEmular, driver);
        realizaSelecaoClienteRetaguarda(cliente);
        return new PaginaInicial(getDriver());

    }

    public void realizaSelecaoClienteRetaguarda(String cliente){

//        driver.findElement(By.xpath("//*[@id=\"dashboard-buttons\"]/ul/li[5]/a")).click();
//        WebElement btnCancelar = driver.findElement (By.id("btn_cancelar"));
//        Utils.aguardarElemento(btnCancelar, driver);

        driver.findElement(By.id("select2-comboCliente-container")).click();

        Select comboCliente2 = new Select(driver.findElement(By.id("comboCliente")));
//        comboCliente2.selectByVisibleText(cliente);
        driver.findElement(By.xpath("//*[@id=\"modalEmularAcesso\"]/span/span/span[1]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"modalEmularAcesso\"]/span/span/span[1]/input")).sendKeys(cliente);
//        comboCliente2.getFirstSelectedOption().click();
//        comboCliente2.selectByVisibleText(cliente);
//        Select comboCliente = new Select(driver.findElement(By.id("select2-comboCliente-results")));

//        driver.findElement(By.xpath("//*[@id=\"modalEmularAcesso\"]/span/span/span[1]/input")).clear();
//        driver.findElement(By.xpath("//*[@id=\"modalEmularAcesso\"]/span/span/span[1]/input")).sendKeys(cliente);

//        driver.findElement(By.xpath("//*[@id=\"modalEmularAcesso\"]/span/span")).click();
        //PAREI AQUI
        WebElement selector = driver.findElement(By.id("select2-comboCliente-results"));
//        WebElement selector = driver.findElement(By.id("select2-comboCliente-result-8r8t-2921"));
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", selector);
        selector.click();
//        comboCliente2.selectByVisibleText(cliente);

        driver.findElement(By.id("btn_emular")).click();

    }

    public void realizaSelecaoClienteConciliador(String cliente){

        HashMap <String, Integer> hmap = new HashMap<String, Integer> ();
        //Verificar necessidade classe

    }
}
