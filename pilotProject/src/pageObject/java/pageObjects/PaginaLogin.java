package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaLogin extends PaginaBase {

    public PaginaLogin (WebDriver driver){
        super (driver);
    }

    public PaginaPerfil logar(String userName, String userPass) {

        realizaLogin(userName, userPass);
        return new PaginaPerfil(getDriver());
    }

    private void realizaLogin (String userName, String userPass){

        getDriver().findElement (By.id("intranetLink")).click();

        getDriver().findElement(By.xpath("//*[@id=\"view\"]/div/div[2]/form/div[1]/input")).clear();
        getDriver().findElement(By.xpath("//*[@id=\"view\"]/div/div[2]/form/div[1]/input")).sendKeys(userName);

        getDriver().findElement(By.xpath("//*[@id=\"view\"]/div/div[2]/form/div[2]/input")).clear();
        getDriver().findElement(By.xpath("//*[@id=\"view\"]/div/div[2]/form/div[2]/input")).sendKeys(userPass);

        getDriver().findElement(By.xpath("//*[@id=\"view\"]/div/div[2]/form/div[3]/div[2]/input")).click();


    }


}
