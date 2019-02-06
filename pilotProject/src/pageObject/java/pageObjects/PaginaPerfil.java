package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaPerfil extends PaginaBase{

    public PaginaPerfil(WebDriver driver){
        super (driver);
    }

    public PaginaInicial selecionarPerfil (String perfil){

        WebElement modalPerfil = driver.findElement (By.xpath ("//*[@id=\"modalPerfil\"]/div/div"));
        Utils.aguardarElemento (modalPerfil, driver);
        realizaSelecaoPerfil(perfil);
        return new PaginaInicial(getDriver());

    }

    public void realizaSelecaoPerfil(String perfil){

        if (perfil.equals ("Administrador de Analise")){
            driver.findElement (By.xpath ("//*[@id=\"modalPerfil\"]/div/div/div[2]/form/div[3]/div[1]/div[1]/div")).click();
        }
        else if (perfil.equals ("Tecnico")){
            driver.findElement (By.xpath ("//*[@id=\"modalPerfil\"]/div/div/div[2]/form/div[3]/div[2]/div[3]/div")).click();
        }
        else if (perfil.equals ("GO")){
            driver.findElement (By.xpath ("//*[@id=\"modalPerfil\"]/div/div/div[2]/form/div[3]/div[2]/div[1]/div")).click();
        }

    }
}
