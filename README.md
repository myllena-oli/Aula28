<h1 align="center"> Aula 28 </h1>

`Exercício 1`: <h5>Siga as instruções abaixo para implementar o exercicio:
- Crie uma interface Lampada com métodos ligar() e desligar(),
cujo contrato significa simplesmente imprimir mensagens
informativas na tela;
- Crie uma classe FabricaLampada que possui duas classes filhas
que implementam a interface Lampada: Incandescente e
Fluorescente;
- Crie ainda um método construir(), que receba um parâmetro
indicando o tipo de lâmpada e retorne o objeto Lampada
criado;
- Crie uma classe Exercicio01 com o método main(). Pergunte ao
usuário qual lâmpada ele quer construir, ligue e desligue a
lâmpada.</h5>

Primeiro foi criada uma interface Lampada com os métodos ligar e desligar. Depois foi criado uma classe chamada "FabricaLampada", onde em um primeiro momento nada foi feito.<br>
Após isso, foram criadas as classes Incandescente e Fluorescente, onde ambas herdam da classe FabricaLampada. Nessas duas classes foi implementada a Interface Lampada criada inicialmente, sendo assim, ambas possuem os comportamentos da interface, que são os métodos ligar() e desligar.<br>
Os métodos foram sobrescritos, sendo que na classe Incandescente o método de ligar printa uma mensagem dizendo que a lâmpada incandescente ligou, e para o método desligar, printa que desligou. A mesma lógica foi aplicada para a classe Fluorescente, só mudando a mensagem.<br>
Voltando para a classe FabricaLampada, foi implementado o método Construir. Esse método recebe uma String e a partir do conteúdo dessa String, cria um objeto de um tipo Incandescente ou Fluorescente, por esse motivo o método é do tipo Objeto.<br>
Por fim, foi construída a classe Exercicio01, que possui o método principal (main). Nele é mostrado um texto e coletado uma informação do usuário, através do Scanner. Utilizando um objeto do tipo FabricaLampada chamado "fabrica", foi realizado o chamado do método construir, o objeto retornado foi convertido para um objeto da Interface Lampada e com isso foram feitos os chamados para ligar e desligar a lampada. Caso o usuário insira algum dado inválido, o retorno será Null, e será printado sobre o erro.

`Exercício 2`: <h5>Nosso banco precisa tributar dinheiro de alguns bens que nossos clientes possuem. Para isso, vamos criar uma interface para o cálculo dos tributos.<br>
Lemos essa interface da seguinte maneira: "todos que quiserem ser tributáveis precisam saber calcular tributos, devolvendo um double".
<br>Alguns bens são tributáveis e outros não:
- a. ContaPoupanca não é tributável
- b. já para ContaCorrente você precisa pagar 1% da conta
- c. SeguroDeVida tem uma taxa fixa de 42 reais.
<p>Escreva classes que implementem esta interface e calculem o tributo de acordo com a regra de negócio acima.</h5></p>

Primeiro foi criado uma interface chamada Tributos que tem como método calcularTributo que é do tipo double e recebe como parâmetro um valor do tipo double.<br>
Após isso, foi criada a classe abstrata TiposDeConta que tem como atributos o numeroConta, o nome, o cpf e o saldo. Foi feito o construtor e o getter de saldo. <br>
Em seguida, foram criadas as classes ContaPoupança, ContaCorrente e SeguroDeVida. Todas elas herdam a TiposDeConta e implementam a interface Tributos.<br>
Na ContaPoupança, o método calcularTributo foi sobrescrito retornando o valor 0, na contaCorrente ele retorna o valor recebido multiplicado por 0.01, e na SeguroDeVida ele retorna 42.<br>
Na main foram criados três instâncias de objetos, um do tipo ContaPoupança, outro do tipo ContaCorrente e outro do tipo SeguroDeVida. E, por fim, foram printadas as mensagens de quanto deve ser pago de imposto para cada conta, onde cada variável chamou o método calcularTributo enviando como valor o getter de saldo.











