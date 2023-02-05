package br.dev.s2w.cucumber;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AprenderCucumberStepdefs {

    @Dado("que criei o arquivo corretamente")
    public void que_criei_o_arquivo_corretamente() throws Throwable {
        System.out.println("Teste executado com sucesso!");
    }

    @Quando("executá-lo")
    public void executa_lo() throws Throwable {
    }

    @Entao("a especificação deve finalizar com sucesso")
    public void a_especificacao_deve_finalizar_com_sucesso() throws Throwable {
    }

}