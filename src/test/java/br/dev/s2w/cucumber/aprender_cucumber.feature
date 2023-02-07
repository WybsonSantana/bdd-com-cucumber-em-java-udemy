# language: pt

@Unitários
Funcionalidade: Aprender Cucumber

  Como um aluno
  Eu quero aprender a utilizar Cucumber
  Para que eu possa automatizar critérios de aceitação

  Cenario: Deve executar especificação
    Dado que criei o arquivo corretamente
    Quando executá-lo
    Entao a especificação deve finalizar com sucesso

  @CenárioContador1
  Cenario: Deve incrementar contador
    Dado que o valor do contador é 15
    Quando eu incrementar em 3
    Entao o valor do contador será 18

  @CenárioContador2
  Cenario: Deve incrementar contador
    Dado que o valor do contador é 123
    Quando eu incrementar em 35
    Entao o valor do contador será 158

  @CenárioAtrasoEntrega1
  Cenario: Deve calcular atraso na entrega
    Dado que a entrega é dia 05/04/2023
    Quando a entrega atrasar em 2 dias
    Entao a entrega será efetuada em 07/04/2023

  @CenárioAtrasoEntrega2
  Cenario: Deve calcular atraso na entrega da China
    Dado que a entrega é dia 05/04/2023
    Quando a entrega atrasar em 2 meses
    Entao a entrega será efetuada em 05/06/2023