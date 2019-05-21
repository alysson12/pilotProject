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

        getDriver().findElement(By.id("username")).clear();
        getDriver().findElement(By.id("username")).sendKeys(userName);

        getDriver().findElement(By.id("password")).clear();
        getDriver().findElement(By.id("password")).sendKeys(userPass);

        getDriver().findElement(By.xpath("//*[@id=\"loginForm\"]/ul/li[4]/div/button")).click();


    }


}
