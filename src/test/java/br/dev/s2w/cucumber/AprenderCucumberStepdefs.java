package br.dev.s2w.cucumber;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
    public void queOValorDoContadorE(Integer valorContador) {
        contador = valorContador;
    }

    @Quando("eu incrementar em {int}")
    public void euIncrementarEm(Integer incremento) {
        contador += incremento;
    }

    @Entao("o valor do contador será {int}")
    public void oValorDoContadorSera(Integer valorContador) {
        Assert.assertEquals(Integer.parseInt(String.valueOf(valorContador)), contador);
    }

    private Calendar dataEntrega = Calendar.getInstance();
    private DateFormat date = new SimpleDateFormat("dd/MM/yyyy");

    @Dado("que a entrega é dia {int}\\/{int}\\/{int}")
    public void queAEntregaEDia(int dia, int mes, int ano) {
        dataEntrega.set(Calendar.DAY_OF_MONTH, dia);
        dataEntrega.set(Calendar.MONTH, mes - 1);
        dataEntrega.set(Calendar.YEAR, ano);
    }

    @Quando("a entrega atrasar em {int} {word}")
    public void aEntregaAtrasarEmDias(int periodo, String tempo) {
        if (tempo.equals("dia") || tempo.equals("dias")) {
            dataEntrega.add(Calendar.DAY_OF_MONTH, periodo);
        }

        if (tempo.equals("mês") || tempo.equals("meses")) {
            dataEntrega.add(Calendar.MONTH, periodo);
        }
    }

    @Entao("a entrega será efetuada em {int}\\/{int}\\/{int}")
    public void aEntregaSeraEfetuadaEm(int dia, int mes, int ano) {
        Calendar novaDataEntrega = Calendar.getInstance();

        novaDataEntrega.set(Calendar.DAY_OF_MONTH, dia);
        novaDataEntrega.set(Calendar.MONTH, mes - 1);
        novaDataEntrega.set(Calendar.YEAR, ano);

        Assert.assertEquals(
                date.format(novaDataEntrega.getTime()),
                date.format(dataEntrega.getTime())
        );
    }

    @Dado("^que o ticket( especial)? é (A.\\d{3})$")
    public void queOTicketEAF(String tipo, String arg1) {
    }

    @Dado("^que o valor da passagem é R\\$ (.*)$")
    public void queOValorDaPassagemER$(Double numero) {
    }

    @Dado("^que o nome do passageiro é \"(.{5,20})\"$")
    public void queONomeDoPassageiroE(String arg1) {
    }

    @Dado("^que o telefone do passageiro é (9\\d{3}-\\d{4})$")
    public void queOTelefoneDoPassageiroE(String telefone) {
    }

    @Dado("^criar os steps$")
    public void criarOsSteps() {
    }

    @Dado("^o teste vai funcionar$")
    public void oTesteVaiFuncionar() {
    }

}