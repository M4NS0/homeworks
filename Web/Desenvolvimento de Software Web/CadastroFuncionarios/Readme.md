PONTIFÍCIA UNIVERSIDADE CATÓLICA DE GOIÁS

ECEC-Escola de Ciências Exatas e da Computação

CMP1491-Desenvolvimento de Aplicações Web

Atividade – Projeto Servlet

A empresa XYZ necessita de uma aplicação web que permita manter o cadastro de seus funcionários, sendo que cada funcionário possui um cargo e são lotados em um
determinado setor da empresa. Você foi indicado para analisar e projetar essa aplicação na plataforma Java, usando Servlets no lado do servidor para acessar e manter as informações em banco de dados relacional, sob MVC. No lado do cliente você deve utilizar HTML, CSS, Bootstrap, JavaScript e jQuery. Ficou estabelecido os seguintes detalhes:

a)Para se cadastrar um funcionário deve-se considerar: nome, cpf, data de nascimento, salário base, cargo e o setor onde o funcionário está lotado;

b)O cargo deve ser selecionado em um componente HTML select, sendo que esse componente deve estar sempre atualizado quando novos cargos forem cadastrados.

c)A lotação deve ser também selecionada em um componente HTML select, sendo que esse componente deve estar sempre atualizado quando novos setores da empresa
forem cadastrados;

d)O ideal é inserir um botão ao lado de cada select de tal forma que esse botão possa receber um evento click do usuário para atualizar o respectivo componente select, sempre que o usuário desejar atualizar as informações do respectivo componente select;

e)Projetar o banco de dados que permita armazenar os dados de funcionários, cargos e lotações, criando o Diagrama de Entidade e Relacionamento e o Diagrama Lógico do banco de dados;

f)As informações dos cargos e das lotações deverão ser inseridas diretamente no banco de dados a qualquer momento, mesmo que a aplicação já esteja em produção;

g)Toda vez que um funcionário for incluído, alterado ou excluído, seus dados devem ser atualizados em uma tabela. Essa tabela deve possuir todos os campos correspondentes a cada funcionário, incluindo o nome da lotação e do cargo do funcionário. Essa tabela deve possui dois botões: Editar e Excluir;

h)Quando o botão Editar for selecionado, o sistema deve apresentar um formulário, abaixo da tabela, com os dados do respectivo funcionário selecionado na linha da tabela, para que o usuário possa efetuar as devidas alterações no banco de dados. Após confirmar a alteração, o formulário deve desaparecer da página e a tabela deve ser atualizada com os dados que foram alterados;

i)Quando o botão Excluir for selecionado, a respectiva linha deve ser removida da tabela HTML e os dados devem ser excluídos do banco de dados;

j)O formulário deve ter, portanto, dois botões: Salvar e Limpar. O primeiro atualiza os dados e o segundo remove o formulário da página;

k)Todos os eventos da página devem ser efetuados via JavaScript / jQuery para atualizar os componentes na página e para enviar dados para o servidor / Servlet.

l)Crie um campo para pesquisar um funcionário por nome. Esse campo deve ficar acima da tabela HTML. O usuário poderá informar um nome completo, uma parte de um nome ou deixar o campo vazio. Quando confirmar, o sistema deve pesquisar no banco de dados todos os clientes que atendam a pesquisa. Limpar a tabela HTML e mostrar os registros na tabela HTML.

*Fica como desafio inserir pesquisa flexível que permita efetuar a consulta por cargo, lotação ou nome.

**Validar os dados que são digitados para que:

- quando numéricos, não aceitem outros caracteres

- quando gravar as informações tipo string, estas devem ser todas em maiúsculas, mesmo
que o usuário informe com caracteres minúsculos

-nome, cpf, cargo e setor devem ser obrigatórios

-não aceitar dois funcionários com o mesmo cpf