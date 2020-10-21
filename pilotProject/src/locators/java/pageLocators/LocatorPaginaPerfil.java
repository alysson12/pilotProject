package pageLocators;

import org.openqa.selenium.By;

public class LocatorPaginaPerfil {

    public static By acessoClienteLoc = By.xpath("//*[@id=\"dashboard-buttons\"]/ul/li[5]/a");
    public static By acaoEmularLoc = By.id("btn_emular");


    public static By emularAcessoLoc = By.id("select2-comboCliente-container");
//    public static By comboClienteLoc = By.id("comboCliente");
    public static By buscaClienteLoc = By.xpath("//*[@id=\"modalEmularAcesso\"]/span/span/span[1]/input");
    public static By selecaoClienteLoc = By.id("select2-comboCliente-results");
    public static By botaoEmularLoc = By.id("btn_emular");
}
