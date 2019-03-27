package test.steps;

import net.thucydides.core.annotations.Steps;
import test.steps.serenity.FuncItau;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Itau {

    @Steps
    FuncItau itau;
        
    @Given("^o usuario coloque login e senha$")
    public void o_usuario_coloque_login_e_senha() throws Exception {
       itau.loga_itau("0440", "083327");
    }

    @When("^loga '(.*)'")
    public void loga(String senha) throws Exception {
        itau.preencherSenha(senha);
    }

    @Then("^faz um pagamento$")
    public void faz_um_pagamento() throws Exception {
       System.out.println("DEU");
    }

    
}
