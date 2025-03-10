Projeto de Backend em Java com Spring e MySQL
Este projeto implementa um backend utilizando:
Java 
Spring Framework
MySQL para gerenciar produtos e categorias. 

Ele foi desenvolvido para demonstrar como criar e manipular entidades no banco de dados, com um foco na relação entre produtos e suas respectivas categorias.

Tecnologias Utilizadas
Java 17 (ou versão superior)
Spring Boot (para criação do projeto e gestão de dependências)
Spring Data JPA (para interação com o banco de dados)
MySQL (banco de dados relacional)
Maven (gerenciamento de dependências)
Insomnia (para testes de API)

Funcionalidades
Cadastro de produtos e categorias.
Relacionamento entre produtos e categorias no banco de dados.
CRUD básico (Create, Read, Update, Delete) para produtos e categorias.
Endpoints RESTful para interação com o front-end ou outras aplicações.
Estrutura do Banco de Dados
O banco de dados MySQL contém duas tabelas principais:

Categoria

id (Long, PK)
nota (varchar)
Produto

id (Long, PK)
nome (varchar)
descricao (varchar)
quantidade_estoque (int)
categoria_id (Long, FK para Categoria)
Relacionamento entre Produto e Categoria
Cada produto pertence a uma categoria. O relacionamento é feito através de uma chave estrangeira (categoria_id) 
na tabela de produtos, que se relaciona com a chave primária (id) da tabela de categorias.

Como Rodar o Projeto
Pré-requisitos
JDK 17 (ou superior)
MySQL
Maven
Insomnia (ou outro cliente de API)
Passo a Passo
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/seuusuario/seuprojeto.git
Entre no diretório do projeto:

bash
Copiar
Editar
cd seuprojeto
Configure o arquivo application.properties com as credenciais do seu banco de dados:

properties
Copiar
Editar
spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
Compile e rode o projeto com Maven:

bash
Copiar
Editar
mvn spring-boot:run
O servidor estará rodando em http://localhost:8080.

Endpoints
Produto
GET /produtos: Lista todos os produtos.
GET /produtos/{id}: Obtém um produto específico.
POST /produtos: Cria um novo produto.
Corpo da requisição:
json
Copiar
Editar
{
  "nome": "Produto A",
  "descricao": "Descrição do produto",
  "quantidade_estoque": 100,
  "categoria_id": 1
}
PUT /produtos/{id}: Atualiza um produto existente.
DELETE /produtos/{id}: Exclui um produto.
Categoria
GET /categorias: Lista todas as categorias.
GET /categorias/{id}: Obtém uma categoria específica.
POST /categorias: Cria uma nova categoria.
Corpo da requisição:
json
Copiar
Editar
{
  "nota": "4.5"
}
PUT /categorias/{id}: Atualiza uma categoria existente.
DELETE /categorias/{id}: Exclui uma categoria.
Como Contribuir
Fork o projeto.
Crie uma branch para a sua feature (git checkout -b minha-feature).
Faça commit das suas alterações (git commit -am 'Adiciona nova feature').
Push para a branch (git push origin minha-feature).
Abra um Pull Request.
Licença
Este projeto está licenciado sob a MIT License.

