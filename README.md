# BancoFuctura
Criação da Classe Banco (Atividade curso Java - Módulo 01 (Versão Final)

## Atividade Proposta

* Projeto terá uma Classe para `Conta Corrente` e uma Classe para `Conta Poupança` que herdará da Classe abstrata `Contas`
* A classe `Contas` deverá ter os atributos: número da conta, nome do titular, saldo disponível e ter métodos para exibir os dados da conta cadastrada,
fazer depósito, exibir o saldo de cada conta e métodos getters e setters dos atributos private
* A Classe `Conta Corrente` além dos métodos herdados terá métodos para fazer saques e para aplicação de valores na Classe `Conta Poupança`
* A Classe `Conta Poupança` além dos métodos herdados terá o método `resgatar()` que transfere valores da Poupança para a Classe `Conta Corrente`
* Deverá ter confirmação para cada operação realizada. Por exemplo: ao realizar um saque informar que o saque foi feito
* O projeto precisa de uma classe que possua o método main. Nesta Classe será feita a criação de objetos, as chamadas aos métodos, atribuição de valores aos atributos

### Observações

* O atributo saldo não deverá ser alterado diretamente, deverá ser criado um método para manipular o atributo saldo
* A primeira ação que deverá ser feito é cadastrar a conta. Tem que ser solicitado ao usuário digitar o seu nome, um número de conta (esse número é aleatório, somente para a conta ter um número quando for mostrar os dados da conta). Ainda no cadastro deverá ser perguntado se será feito um depósito inicial. A ContaCorrente poderá ser criada com saldo R$ 0.00 (zero) ou com o valor de depósito inicial 
* A Poupança não aceitará saques e depósitos diretamente, para depositar ou sacar dinheiro da ContaPoupança será utilizado os métodos `aplicar()` e `resgatar()` respectivamente

## Projeto

* Foi criada uma Classe Abstrata `Contas` com todos os atributos private. As Classes `ContaCorrente` e `ContaPoupanca` herdam os atributos e os métodos da Classe Contas
* 

## Implementações Futuras

* Implementar a Classe Banco com [Java Forms](https://www.youtube.com/watch?v=UtxTG1_AiXk&list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw).

## Projeto Atual

* [Classe Pessoa](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/Pessoa.java)
* [Classe Utils](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/Utils.java)
* [Classe GeradorConta](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/GeradorConta.java)
* [Classe GeradorSenha](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/GeradorSenha.java)
* [Classe Contas](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/Contas.java)
* [Classe ContaCorrente](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/ContaCorrente.java)
* [Classe ContaPoupanca](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/ContaPoupanca.java)
* [Classe Main Banco](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/Banco.java)

## Agradecimentos

Essas implementações não seriam possíveis se não fosse pelo professor Francilvan, a monitora de Java 01 Danny, ao grande mestre [Guanabara](https://www.youtube.com/watch?v=KlIL63MeyMY&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&ab_channel=CursoemVídeo) e Zé Codes(links [1](https://www.youtube.com/watch?v=AExKQiCqwGs&ab_channel=Zécodes) e [2](https://www.youtube.com/watch?v=6wo9vvlIhRo&ab_channel=Zécodes)). Este último, se não fosse pela sua implementação, eu não teria conseguido chegar até aqui. 
