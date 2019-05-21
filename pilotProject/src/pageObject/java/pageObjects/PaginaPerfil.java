package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageLocators.LocatorPaginaPerfil;

import java.util.HashMap;

public class PaginaPerfil extends PaginaBase{

    public PaginaPerfil(WebDriver driver){
        super (driver);
    }

    public PaginaInicial emularAcesso (String cliente){

//        driver.findElement(By.xpath("//*[@id=\"dashboard-buttons\"]/ul/li[5]/a")).click();
        driver.findElement(LocatorPaginaPerfil.acessoClienteLoc).click();

        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }


//        WebElement btnEmular = driver.findElement (By.id("btn_emular"));
        WebElement btnEmular = driver.findElement(LocatorPaginaPerfil.acaoEmularLoc);
        Utils.aguardarElemento (btnEmular, driver);
        realizaSelecaoClienteRetaguarda(cliente);
        return new PaginaInicial(getDriver());

    }

    public void realizaSelecaoClienteRetaguarda(String cliente){

//        driver.findElement(By.id("select2-comboCliente-container")).click();
        driver.findElement(LocatorPaginaPerfil.emularAcessoLoc).click();

        driver.findElement(LocatorPaginaPerfil.buscaClienteLoc).clear();
        driver.findElement(LocatorPaginaPerfil.buscaClienteLoc).sendKeys(cliente);
//        driver.findElement(By.xpath("//*[@id=\"modalEmularAcesso\"]/span/span/span[1]/input")).clear();
//        driver.findElement(By.xpath("//*[@id=\"modalEmularAcesso\"]/span/span/span[1]/input")).sendKeys(cliente);

//        Provavelmente importante
//        Utils.aguardarElemento(LocatorPaginaPerfil.selecaoClienteLoc, driver);

        driver.findElement(LocatorPaginaPerfil.selecaoClienteLoc).click();
//        WebElement selector = driver.findElement(By.id("select2-comboCliente-results"));
//        selector.click();

        driver.findElement(LocatorPaginaPerfil.botaoEmularLoc).click();
//        driver.findElement(By.id("btn_emular")).click();

    }

    public void realizaSelecaoClienteConciliador(String cliente){

        HashMap <String, Integer> hmap = new HashMap<String, Integer> ();
        //Verificar necessidade classe

    }
}
