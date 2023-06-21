# UserForum
A API UserForum é uma aplicação desenvolvida em Spring Boot que fornece operações CRUD (Create, Read, Update, Delete) para gerenciar dados de um fórum de usuários.

**Recursos Disponíveis**
A API UserForum disponibiliza os seguintes recursos:

GET /users: Recupera todos os usuários do fórum.
GET /users/{id}: Recupera um usuário específico com base no ID.
POST /users: Cadastra um novo usuário no fórum.
PUT /users/{id}: Atualiza as informações de um usuário existente.
DELETE /users/{id}: Exclui um usuário do fórum.
Formato dos Dados
A API utiliza o formato JSON para envio e recebimento de dados. As solicitações e respostas devem estar no formato JSON.

**Executando a API**

Para executar a API UserForum, siga os passos abaixo:

Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.
Faça o download do código-fonte do projeto ou clone-o utilizando o comando git clone <URL do repositório>.
Navegue até o diretório raiz do projeto.
Execute o comando ./mvnw spring-boot:run para iniciar a aplicação.
A API estará disponível em http://localhost:8080.
Endpoints
A seguir estão os endpoints disponíveis para interagir com a API:

**Recuperar todos os usuários**
URL: GET http://localhost:8080/users

**Resposta de Exemplo:**
[
  {
    "id": 1,
    "name": "João Silva",
    "email": "joao@example.com"
  },
  {
    "id": 2,
    "name": "Maria Souza",
    "email": "maria@example.com"
  },
  ...
]

Recuperar um usuário específico
URL: GET http://localhost:8080/users/{id}

**Resposta de Exemplo:**
{
  "id": 1,
  "name": "João Silva",
  "email": "joao@example.com"
}

**Cadastrar um novo usuário**
URL: POST http://localhost:8080/users

Corpo da Requisição:

{
  "name": "Pedro Santos",
  "email": "pedro@example.com"
}

**Atualizar as informações de um usuário**
URL: PUT http://localhost:8080/users/{id}

Corpo da Requisição:
{
  "name": "Maria Souza",
  "email": "maria@example.com"
}

**Excluir um usuário**
URL: DELETE http://localhost:8080/users/{id}

**Contribuição**

Se você deseja contribuir para o desenvolvimento da API UserForum, fique à vontade para fazer um fork do repositório, implementar melhorias e enviar um pull request.

