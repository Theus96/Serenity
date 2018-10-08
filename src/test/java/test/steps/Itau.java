package test.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import test.steps.serenity.EndUserSteps;
import test.steps.serenity.FuncItau;

public class Itau {

    @Steps
    FuncItau itau;
    
    @Given("^o usuario coloque login e senha$")
    public void o_usuario_coloque_login_e_senha() throws Exception {
       itau.loga_itau("0440", "083327");
    }

    @When("^loga$")
    public void loga() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^faz um pagamento$")
    public void faz_um_pagamento() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
