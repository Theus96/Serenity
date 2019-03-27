package test.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.itau.com.br/")
public class ItauPage extends PageObject {

    @FindBy(id="agencia")
    private WebElementFacade cAgencia;

    @FindBy(id="conta")
    private WebElementFacade cConta;
    
    @FindBy(id="btnLoginSubmit")
    private WebElementFacade btnAcessar;
    
    @FindBy(id="acessar")
    private WebElementFacade btnAcessarSenha;
    
    @FindBy(id="senha")
    private WebElementFacade tecladoSenha;
    

    public void loga(String ag, String conta) throws InterruptedException {
    	this.getDriver().navigate().to("https://www.itau.com.br/");
        cAgencia.sendKeys(ag);
        cConta.sendKeys(conta);
        btnAcessar.click();
        
        Thread.sleep(10000);
    }
    
    public void preencheSenha(String senha) throws InterruptedException {
		char[] letras = null;
		letras = senha.toCharArray();
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println("SENHA   >>>>>> " + letras[i]);
		//	By botaoSenha = ByUtils.encontraByTextoContains(ByUtils.A_LINK, letras[i]);
		//	getElemento().elementoWebClica(botaoSenha);
			By botaoSenha = By.xpath("//div[@class='teclas clearfix']/a[contains(text(), " + letras[i] + ")]");
			getDriver().findElement(botaoSenha).click();
		}
		btnAcessarSenha.click();
	}

    

//    public List<String> getDefinitions() {
//        WebElementFacade definitionList = find(By.tagName("ol"));
//        return definitionList.findElements(By.tagName("li")).stream()
//                             .map( element -> element.getText() )
//                             .collect(Collectors.toList());
//    }
}