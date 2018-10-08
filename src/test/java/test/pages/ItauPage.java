package test.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.itau.com.br/")
public class ItauPage extends PageObject {

    @FindBy(id="campo_agencia")
    private WebElementFacade cAgencia;

    @FindBy(id="campo_conta")
    private WebElementFacade cConta;
    
    @FindBy(className="btnSubmit")
    private WebElementFacade btnAcessar;
    

    public void loga(String ag, String conta) {
    	this.getDriver().navigate().to("https://www.itau.com.br/");
        cAgencia.sendKeys(ag);
        cConta.sendKeys(conta);
        btnAcessar.click();
    }
    
    public void preencheSenha(String senha) {
		char[] letras = null;
		letras = senha.toCharArray();
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println("SENHA   >>>>>> " + letras[i]);
		//	By botaoSenha = ByUtils.encontraByTextoContains(ByUtils.A_LINK, letras[i]);
		//	getElemento().elementoWebClica(botaoSenha);
			By botaoSenha = By.xpath("//div[@class='teclas clearfix']/a[contains(text(), " + letras[i] + ")]");
			getDriver().findElement(botaoSenha).click();;
		}
	}

    

//    public List<String> getDefinitions() {
//        WebElementFacade definitionList = find(By.tagName("ol"));
//        return definitionList.findElements(By.tagName("li")).stream()
//                             .map( element -> element.getText() )
//                             .collect(Collectors.toList());
//    }
}