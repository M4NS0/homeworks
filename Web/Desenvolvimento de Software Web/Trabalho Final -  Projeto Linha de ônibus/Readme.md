#### Sistema de controle de linhas de ônibus

Esse sistema deve permitir: cadastro de linhas de ônibus com descrição de sua rota,
cadastro de motoristas, cadastro de ônibus e alocação de motoristas por linha e ônibus.

A alocação de motoristas por linha e ônibus depende da linha, do motorista e do ônibus(todos em combobox). 

A pesquisa de alocação de motoristas deve ser realizada por nome do motorista (ou parte do nome), nome da linha (ou parte desse nome) ou identificação do ônibus. 

Para pesquisas String considerar que o usuário poderá informar dados completos ou parciais, sendo que as informações pesquisadas devem ser mostradas em uma tableview, quando uma linha da tableview for selecionada, as informações correspondentes devem ser apresentadas na aba cadastro para que o usuário possa efetuar a atualização. Os outros cadastros podem ter pesquisa usando combobox.

Após selecionar um item na combobox de pesquisa, os dados da pesquisa devem ser
apresentados na aba de cadastro. Criar o relatório geral de linhas de ônibus por ordem alfabética motorista. 

*Como os motoristas são alocados diariamente, criar o relatório de linhas de ônibus por ordem de motorista, indicando as linhas que o motorista percorreu, mas considerando a filtragem por um determinado motorista.

Todas as janelas de cadastro devem possuir uma aba de cadastro e outra de pesquisa. A
aba cadastro deve ser sempre ativada quando os dados da pesquisa preencherem os
campos da aba cadastro.

##### Diretórios

> Pasta Identificação: A pasta identificação deve constar alguns dados do aluno e 
> também sobre o seu respectivo projeto, como: matrícula, nome do aluno, ano e
> semestre letivo, nome da disciplina, sigla e nome do projeto.

> Pasta Documentos_Projeto: deve conter apenas um documento no formato 
> doc ou docx contendo:
> 
> - o diagrama geral de casos de uso do respectivo sistema, 
> - um diagrama de sequência correspondente à uma tela de CRUD do sistema, 
> - diagrama de classes do sistema, destacando as classes do modelo do sistema, 
> - diagrama de entidade e relacionamento com o seu respectivo diagrama de contexto.

> Pasta Codigo_Projeto deve conter o código fonte do sistema, com suas
> respectivas bibliotecas. O código do projeto deve estar em uma pasta de 
> projeto do Eclipse de tal forma que possa ser facilmente importado para o Eclipse.

> A sub Pasta Banco_Dados deve conter um script para geração do banco de dados
> e de suas respectivas tabelas com seus respectivos dados de teste, sendo que o banco
> de dados deve ser no padrão MYSQL ou POSTGRES. Além disso, destacar o nome do
> banco, o usuário, senha para conexão e o tipo do banco (MYSQL ou POSTGRES)

##### Notas

- Deverá ser criado uma arquittura em camadas
- Acesso ao BD exclusivamente pelo JDBC ou arquivos de configuração .Properties
- Informações em português exceto quando internacionalização for exigida

##### Normas e Pontuações

###### Parte I

1. As páginas de cadastro devem apresentar uma caixa de texto para pesquisa e
uma tabela com os dados cadastrados, semelhante ao apresentado em sala de
aula.
- Até 2.0 pontos 

2. As janelas de cadastro devem possuir os detalhes básicos indicados no
enunciado de cada tema;
- Até 2.0 pontos

3. O sistema deve possuir pelo menos um relatório básico, indicado no enunciado
do tema e poderá ter um relatório complementar (indicado com um asterisco)
que faz parte da EAD (frequência e avaliação);
- Até 1.0 ponto

4. O sistema deverá apresentar, opcionalmente, configuração de, pelo menos, dois
idiomas: inglês e português, fazendo parte da EAD (no mínimo, a frequência);
- Até 1.0 (ponto extra)

5. O Sistema deve fornecer um login com usuário e senha, sendo que os usuários
devem ser cadastrados no sistema como Administrador ou Usuário Padrão. O
Administrador poderá executar qualquer atividade no sistema. O usuário Padrão
só poderá efetuar certas atividades (estabelecidas pelo desenvolvedor). Deve
utilizar SessionStorage (Pesquisar).
- Até 1.5 pontos
  
6. O sistema deve possuir validações de informações essenciais. Não deve aceitar
letras em caixas de texto que deve receber só números e vice-versa. Não deve
aceitar datas inválidas. Não deve aceitar certos campos vazios ou nulos (que
deverão ser estabelecidos pelo desenvolvedor. Como é o caso de validar a
obrigatoriedade única de determinada informação (como cpf repetido ou outro
de vital importância para um cadastro), pois não faz sentido gravar informações
nulas ou repetidas). Em caso de inconsistências de validação, o sistema deverá
apresentar mensagens correspondentes;
- Até 2.0 pontos

7. O sistema deve apresentar comentários no formato JAVADOC na parte inicial
de cada classe da aplicação, informando dados que identifiquem a classe, seus
objetivos, seu criador e datra. A pesquisa de uso do JAVADOC também faz
parte da EAD (Frequência e avaliação).
- Até 1.5 pontos

> OBSERVAÇÃO: a aplicação deve possuir pelo menos um cadastro principal, que
> deve referenciar, pelo menos, duas combos de tabelas auxiliares e dois cadastros
> auxiliares.

###### Parte II

1. Os diagramas da documentação devem estar de acordo com a codificação
apresentada no projeto;
- Até 3.0 pontos
  
2. A aplicação deve executar sem erros;
- Até 5.0 pontos

3. A aplicação deve possuir, pelo menos, dois cadastros funcionando corretamente
(CRUD funcionando completamente), desde que sejam um cadastro básico e um
principal (o cadastro principal é geralmente o mais complexo);
- Até 2 pontos


###### Parte III

1. Sistema executado corretamente
- Até 5.0 pontos
- Execução incorreta (parcial ou total) =0%
 
2. O professor avaliará o trabalho posteriormente, importando o projeto e o banco de
dados conforme o estabelecido;

3. projeto for instalado corretamente
- até 2.0 pontos
  
1. banco de dados for instalado corretamente: 
- Até 2.0 pontos
  
1. documentação armazenada corretamente
- Até 2.0 pontos

3. diagrama do banco de dados de acordo com a aplicação
- Até 2.0 pontos
  
1. análise geral da aplicação
- Até 2.0 pontos

###### Cálculo 

N2=MÉDIA(PARTE I, PARTE II, PARTE IIIa, PARTE IIIb*0.5)