package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaInicial extends PaginaBase{

    public PaginaInicial (WebDriver driver){
        super(driver);
    }

    public void AdquirentesVendas (){

        //Pegando a aba atual (Retaguarda)
        String winHandleBefore = driver.getWindowHandle();

        driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[1]/ul/li[3]/a")).click();


        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
    }



}
