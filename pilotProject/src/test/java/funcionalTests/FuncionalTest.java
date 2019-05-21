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
        selecaoCliente();
        buscandoVendas();
        fechaNavegador();
    }


    private void acessoPaginaLogin(){
        this.paginaBase.navegacaoPagina("http://192.168.121.211:8080/retaguarda/retaguarda/index/show");
    }

    private void dadosUsuarioLogin(){
        this.paginaLogin = new PaginaLogin(this.paginaBase.getDriver());
        this.paginaPerfil = paginaLogin.logar("alysson.pereira@equals.com.br", "123456");
    }

    private void selecaoCliente(){
        this.paginaInicial = paginaPerfil.emularAcesso("TORRA TORRA");
    }

    private void buscandoVendas() {
        this.paginaInicial.AdquirentesVendas();
    }


    private void fechaNavegador() {
        this.paginaBase.fechandoNavegacao();
    }
}
