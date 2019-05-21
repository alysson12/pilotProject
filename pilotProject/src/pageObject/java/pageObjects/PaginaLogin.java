package pageObjects;

import org.openqa.selenium.WebDriver;
import pageLocators.LocatorPaginaLogin;

public class PaginaLogin extends PaginaBase {

    public PaginaLogin (WebDriver driver){
        super (driver);
    }

    public PaginaPerfil logar(String userName, String userPass) {

        realizaLogin(userName, userPass);
        return new PaginaPerfil(getDriver());
    }

    private void realizaLogin (String userName, String userPass){

        getDriver().findElement(LocatorPaginaLogin.usernameLoc).clear();
        getDriver().findElement(LocatorPaginaLogin.usernameLoc).sendKeys(userName);

//        getDriver().findElement(By.id("username")).clear();
//        getDriver().findElement(By.id("username")).sendKeys(userName);

        getDriver().findElement(LocatorPaginaLogin.passwordLoc).clear();
        getDriver().findElement(LocatorPaginaLogin.passwordLoc).sendKeys(userPass);

//        getDriver().findElement(By.id("password")).clear();
//        getDriver().findElement(By.id("password")).sendKeys(userPass);

        getDriver().findElement(LocatorPaginaLogin.buttonLoginLoc).click();

//        getDriver().findElement(By.xpath("//*[@id=\"loginForm\"]/ul/li[4]/div/button")).click();


    }


}
