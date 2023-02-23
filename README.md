# BancoFuctura
Criação da Classe Banco (Atividade curso Java - Módulo 01 (Versão Final)

## Progresso
O projeto continua incompleto, porém com bastante progresso. Foi implementada a `Classe Conta` com os Métodos Personalizados(`toString`, `depositar`, `sacar` e `transferir`) e com seus respectivos Métodos Especiais (`Constructor`, `Getters` e `Setters`). A `Classe Main AgenciaBancaria` foi criada com o intuito de servir como interface para acessar os atributos da `Classe Conta`. Além disso foi criada a `Classe Utils` com a funcionalidade de tratar os valores `Double` e transformá-los em `String` seguindo o padrão `R$ #,##0.00`. O conceito de `ArrayList` foi usado, o que tornou possível o cadastro e armazenamento de outras contas. 

## Pendências

* Conta Poupança além dos métodos herdados terá o método `resgatar`
que transfere valores da Poupança para ContaCorrente;

* A Poupança não aceitará saques e depósitos diretamente, para
depositar ou sacar dinheiro da ContaPoupança será utilizado os métodos
`aplicar` e `resgatar` respectivamente.

## Implementações Futuras

* Implementar a Classe Banco com [Java Forms](https://www.youtube.com/watch?v=UtxTG1_AiXk&list=PLJIP7GdByOyuBKB--fIO2DoQaPVXm9lCw)

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
