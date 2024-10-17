📅 Sistema de Gerenciamento de Eventos
Um sistema em Java para gerenciar eventos, incluindo o cadastro de eventos, locais, participantes, e verificação de lotação. Ideal para quem busca uma aplicação simples para organizar eventos e seus participantes.


📖 Sobre o Projeto
Este projeto é um sistema simples de gerenciamento de eventos, desenvolvido em Java. Ele permite que os usuários cadastrem novos eventos, registrem participantes e verifiquem a lotação dos eventos. A aplicação é ideal para aprendizado e desenvolvimento de conceitos de programação orientada a objetos (POO) em Java.

✨ Funcionalidades
Cadastro de eventos com nome, data, local e capacidade máxima.
Registro de participantes em eventos específicos.
Verificação da lotação dos eventos e status de vagas.
Relatório simples de eventos e seus participantes.
🛠 Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:

Java JDK 8+
IDE de sua preferência (recomendado: IntelliJ IDEA ou VS Code)
🚀 Como Executar
Clone o repositório:

bash
Copiar código
git clone https://github.com/seu-usuario/sistema-gerenciamento-eventos.git
Navegue até o diretório do projeto:

bash
Copiar código
cd sistema-gerenciamento-eventos
Abra o projeto em sua IDE de preferência.

Compile e execute a classe Main.java para iniciar a aplicação.

🧑‍💻 Como Utilizar
Ao iniciar o sistema, você será solicitado a inserir as informações do evento:

Nome do evento
Data do evento
Nome e endereço do local
Capacidade máxima do local
Em seguida, será possível adicionar participantes ao evento. Basta fornecer:

Nome do participante
E-mail do participante
Após adicionar os participantes, o sistema exibirá a lotação do evento e a quantidade de vagas disponíveis.

📂 Estrutura do Projeto
bash
Copiar código
sistema-gerenciamento-eventos/
├── src/
│   ├── Evento.java
│   ├── GerenciadorDeEventos.java
│   ├── Local.java
│   ├── Participante.java
│   └── Main.java
├── README.md
└── .gitignore
Evento.java: Classe que representa um evento e armazena informações como nome, data, local e lista de participantes.
GerenciadorDeEventos.java: Classe responsável por gerenciar eventos, incluindo o cadastro de eventos e registro de participantes.
Local.java: Classe que armazena as informações sobre o local onde o evento ocorrerá.
Participante.java: Classe que representa um participante do evento.
Main.java: Classe principal que contém a lógica de interação com o usuário.
💻 Tecnologias Utilizadas
Java: Linguagem de programação para desenvolvimento do sistema.
POO: Conceitos de Programação Orientada a Objetos para organização do código.

Criado apenas por: Lucas Dias
