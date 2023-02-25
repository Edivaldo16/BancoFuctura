# BancoFuctura
Criação da Classe Banco (Atividade curso Java - Módulo 01 (Versão Final)

## Atividade Proposta

* Projeto terá uma Classe para `Conta Corrente` e uma Classe para `Conta Poupança` que herdará da Classe Abstrata `Contas`
* A classe `Contas` deverá ter os atributos: número da conta, nome do titular, saldo disponível e ter métodos para exibir os dados da conta cadastrada,
fazer depósito, exibir o saldo de cada conta e métodos getters e setters dos atributos private
* A Classe `Conta Corrente` além dos métodos herdados terá métodos para fazer saques e para aplicação de valores na Classe `Conta Poupança`
* A Classe `Conta Poupança` além dos métodos herdados terá o método `resgatar()` que transfere valores da Poupança para a Classe `Conta Corrente`
* Deverá ter confirmação para cada operação realizada. Por exemplo: ao realizar um saque informar que o saque foi feito
* O projeto precisa de uma classe que possua o método main. Nesta Classe será feita a criação de objetos, as chamadas aos métodos, atribuição de valores aos atributos

### Observações

* O atributo saldo não deverá ser alterado diretamente, deverá ser criado um método para manipular o atributo saldo
* A primeira ação que deverá ser feita é cadastrar a conta. Tem que ser solicitado ao usuário digitar o seu nome, um número de conta (esse número é aleatório, somente para a conta ter um número quando for mostrar os dados da conta). Ainda no cadastro deverá ser perguntado se será feito um depósito inicial. A ContaCorrente poderá ser criada com saldo R$ 0.00 (zero) ou com o valor de depósito inicial 
* A Poupança não aceitará saques e depósitos diretamente, para depositar ou sacar dinheiro da ContaPoupança será utilizado os métodos `aplicar()` e `resgatar()` respectivamente

## Introdução e Observações

* O projeto foi arquitetado de tal forma que, no ato do cadastro, o cliente apenas precisasse digitar suas informações pessoais como nome, cpf e e-mail que o próprio sistema se encarregaria de gerar uma conta corrente, uma conta poupança e uma senha aleatória para o cliente
* O projeto possui 3 menus principais representado pelos métodos `menuInicial()`, `menuCliente(b, c)` e  `menuGerente(b, c)`. Para poder acessar os menus (métodos) `menuCliente(b, c)` e  `menuGerente(b, c)` será necessário fornecer os dados de login de forma correta. O `menuCliente(b, c)` possui dois submenus representados pelos métodos `acessarContaCorrente()` e `acessarContaPoupanca()`
* Através do menu (método) `menuGerente(b, c)`, o gerente consegue criar cadastro, modificar cadastro além de ter acesso a todos os dados de todas as contas cadastradas
* Nome do cliente não pode ter caracteres especiais e não pode ser composto por espaços. Basicamente o cliente só consegue inserir seu primeiro nome. Isso acontece devido a um tratamento que dei na variável do tipo `String` `pessoa.getNome().matches("[A-Z]*")`. Resolvi tratar a variável dessa forma para evitar que o cliente ou o gerente, no ato do cadastro, inserisse algum número no meio do cadastro. Caso isso aconteca ele dará um erro: **Nome deve ser composto por letras!"**
* Tentei usar tudo que aprendi no curso Java 01 (estruturas de repetição, condicionais, tratamento de exceções e ArrayList)

### Projeto

* Foi criada uma Classe Abstrata `Contas` com todos os atributos private. As Classes `ContaCorrente` e `ContaPoupanca` herdam os atributos e os métodos da Classe Abstrata `Contas`
* O método `toString` foi criado para tratar as variavéis do tipo ´String´ usadas na criação das Classes `Contas`, `ContaCorrente` e `ContaPoupanca`
* A Classe `Pessoa` foi criada com intuito de armazenar os dados pessoais do cliente
* Para se gerar uma conta corrente foi implementado um Construtor na Classe `ContaCorrente`. Para gerar números de conta e senha aleatórios foram usados as Classes `GeradorConta` e `GeradorSenha`. O construtor recebe como parâmetro uma variável do tipo `Pessoa`
* Para se gerar uma conta poupanca foi implementado um Construtor na Classe `ContaPoupanca`. O constrututor foi implementado para receber como parâmetro do tipo `ContaCorrente`. A classe foi implementada de tal forma que todos os atributos do tipo `Pessoa` e senha fossem iguais. As únicas diferenças entre as Classes `ContaCorrente` e `ContaPoupanca` são os métodos Getters e Setters ID, Saldo, Senha e Pessoa 
* A Classe `Utlis` foi criada para tratar a variável double `salario`, de tal forma que ela aparecesse no formato `R$ 0.00`
* Fiz tratamento na variável do tipo `String` cpf para que ela aparecesse no formato `000.000.000 - 00`

### Banco Fuctura

* [Classe Pessoa](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/Pessoa.java)
* [Classe Utils](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/Utils.java)
* [Classe GeradorConta](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/GeradorConta.java)
* [Classe GeradorSenha](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/GeradorSenha.java)
* [Classe Contas](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/Contas.java)
* [Classe ContaCorrente](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/ContaCorrente.java)
* [Classe ContaPoupanca](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/ContaPoupanca.java)
* [Classe Main Banco](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/Banco.java)

### Menus

#### 1. Menu Inicial

![Menus](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/Imagens/1.menuInicial.png)

##### 1.1 Menu Cliente

![Menus](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/Imagens/2.menuCliente.png)

###### 1.1.1 Menu Cliente Conta Corrente

![Menus](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/Imagens/3.AcessarContaCorrente.png)

###### 1.1.2 Menu Cliente Conta Poupança

![Menus](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/Imagens/4.AcessarContaPoupanca.png)

##### 1.2 Menu Gerente

![Menus](https://github.com/Edivaldo16/BancoFuctura/blob/main/Projeto/Imagens/5.menuGerente.png)

## Dificuldades e Aprendizados

* POO é bem complexo, mas com bastante pesquisa, insistência e tempo, as coisas começaram a clarear mais
* Trabalhar com variáveis de outros tipos como `Pessoa`, `ContaCorrente` e `ContaPoupanca`. Aprende muita coisa manipulando objetos dos mais diversos tipos
* Desde 2012, quando tive meu primeiro contato com programação, linguagem C/C++, no curso técnico de automação industrial, sempre que quis comparar dois objetos do mesmo tipo usei o `==`. Após 3 horas quebrando a cabeça sem entender porque que duas variáveis iguais do tipo `String` estavam dando diferente com o operador `==` aprendi a funcionalidade e a importância do operador `.equals()`. Quer comparar duas ou mais variáveis iguais do tipo `String` use `.equals()`. Quer comparar variáveis do tipo `String` e `null` use o `==` 
* Ao usar a estrutura do JOption me deparei com o erro `NumberFormatException`. Depois de muitas pesquisas aprendi que, quando eu apertava o botão cancelar, a variável do tipo `String` recebia um valor `null` e, a estrutura `Integer.parseInt()`, não consegue converter valores vazios. A partir desse erro matei dois coelhos com uma única cajada: tratei o botão Ok quando ele mandava uma string `""` com if e else e tratei o botão cancel que sempre manda `null` com try e catch

## Implementações Futuras

* Implementar a Classe Banco com [Java Forms](https://www.youtube.com/watch?v=UtxTG1_AiXk&list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw).

## Agradecimentos

Essas implementações não seriam possíveis se não fosse pelo professor Francilvan, a monitora de Java 01 Danny, ao grande mestre [Guanabara](https://www.youtube.com/watch?v=KlIL63MeyMY&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&ab_channel=CursoemVídeo) e Zé Codes(links [1](https://www.youtube.com/watch?v=AExKQiCqwGs&ab_channel=Zécodes) e [2](https://www.youtube.com/watch?v=6wo9vvlIhRo&ab_channel=Zécodes)). Este último, se não fosse pela sua implementação, eu não teria conseguido chegar até aqui. 
