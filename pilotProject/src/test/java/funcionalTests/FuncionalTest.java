package funcionalTests;

import org.junit.BeforeClass;
import org.junit.Test;
import pageObjects.*;


public class FuncionalTest {

    protected PaginaBase paginaBase = new PaginaBase();
    protected PaginaLogin paginaLogin;
    protected PaginaPerfil paginaPerfil;
    protected PaginaInicial paginaInicial;

    @BeforeClass
    public static void inicializa(){
        System.setProperty("webdriver.gecko.driver", "src/pageObject/resources/geckodriver.exe");
    }

    @Test
    public void realizaAcesso() throws Exception{
        acessoPaginaLogin();
        dadosUsuarioLogin();
        selecaoPerfil();
        fechaNavegador();
    }


    private void acessoPaginaLogin(){
        this.paginaBase.navegacaoPagina("http://car.java2.ti.lemaf.ufla.br/#/intranet/acesso");
    }

    private void dadosUsuarioLogin(){
        this.paginaLogin = new PaginaLogin(this.paginaBase.getDriver());
        this.paginaPerfil = paginaLogin.logar("06926933600", "230503");
    }

    private void selecaoPerfil(){
        this.paginaInicial = paginaPerfil.selecionarPerfil("GO");
    }


    private void fechaNavegador() {
        this.paginaBase.fechandoNavegacao();
    }
}
