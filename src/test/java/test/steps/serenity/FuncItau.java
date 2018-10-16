package test.steps.serenity;

import net.thucydides.core.annotations.Step;
import test.pages.ItauPage;

public class FuncItau {

    ItauPage itauPage;

    @Step
    public void loga_itau(String ag, String conta) {
        itauPage.loga(ag, conta);
    }

    @Step
    public void preencherSenha(String senha) throws InterruptedException {
    	itauPage.preencheSenha(senha);
    }
    
}