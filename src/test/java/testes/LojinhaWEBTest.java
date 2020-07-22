package testes;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LojinhaWEBTest {

    private WebDriver navegador;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "c:\\Temp\\drivers\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.get("http://165.227.93.41/lojinha-web");

        navegador.findElement(By.cssSelector("#usuario")).sendKeys("admin");
        navegador.findElement(By.id("senha")).sendKeys("admin");
        navegador.findElement(By.cssSelector(".btn")).click();
    }

    @Test
    public void testValidarDadosDeUmProduto() {

        navegador.findElements(By.linkText("PS4")).get(0).click();

        String produtonome = navegador.findElement(By.id("produtonome")).getAttribute("value");
        Assert.assertEquals("PS4", produtonome);

        String componente = navegador.findElement(By.cssSelector(".title")).getText();
        Assert.assertEquals("Lojinha Controle", componente);
        
    }

    @Test
    public void testCadastrarUmNovoProduto() {

        navegador.findElement(By.linkText("ADICIONAR PRODUTO")).click();

        navegador.findElement(By.id("produtonome")).sendKeys("NITENDO 64");
        navegador.findElement(By.id("produtovalor")).sendKeys("60000");
        navegador.findElement(By.id("produtocores")).sendKeys("branco, cinza");
        navegador.findElements(By.cssSelector(".btn")).get(0).click();

        String mensage = navegador.findElement(By.cssSelector(".toast")).getText();

        Assert.assertEquals("Produto adicionado com sucesso", mensage);


    }

    @After
    public void tearDown() {
        navegador.quit();
    }
}
