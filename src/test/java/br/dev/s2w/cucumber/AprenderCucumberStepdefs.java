package br.dev.s2w.cucumber;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class AprenderCucumberStepdefs {

    @Dado("que criei o arquivo corretamente")
    public void queCrieiOArquivoCorretamente() {
        System.out.println("Teste executado com sucesso!");
    }

    @Quando("executá-lo")
    public void executaLo() {
    }

    @Entao("a especificação deve finalizar com sucesso")
    public void aEspecificacaoDeveFinalizarComSucesso() {
    }

    private int contador = 0;

    @Dado("que o valor do contador é {int}")
    public void queOValorDoContadorE(Integer int1) {
        contador = int1;
    }

    @Quando("eu incrementar em {int}")
    public void euIncrementarEm(Integer int1) {
        contador += int1;
    }

    @Entao("o valor do contador será {int}")
    public void oValorDoContadorSera(Integer int1) {
        Assert.assertEquals(Integer.parseInt(String.valueOf(int1)), contador);
    }


}