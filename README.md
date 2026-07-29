# 📚 Cotuba

> **Fork do projeto Cotuba**, criado por **Alexandre Aquiles**, utilizado como laboratório de estudos para evolução de arquitetura de software, aplicação dos princípios **SOLID**, Design Patterns e boas práticas de desenvolvimento em Java.

![Java](https://img.shields.io/badge/Java-21-orange)
![Maven](https://img.shields.io/badge/Maven-3.8+-blue)
![Status](https://img.shields.io/badge/Status-Em%20Evolução-success)

---

# 📖 Sobre o Projeto

O **Cotuba** é uma aplicação de linha de comando (**CLI**) desenvolvida em **Java**, responsável por gerar e-books nos formatos **PDF** e **EPUB** a partir de arquivos escritos em **Markdown**.

Este repositório é um **fork** do projeto criado por **Alexandre Aquiles** para acompanhar o livro **Desbravando SOLID: Práticas Avançadas para Códigos de Qualidade em Java Moderno**.

Embora acompanhe a evolução proposta pelo livro, este fork possui um objetivo mais amplo: analisar as decisões arquiteturais adotadas, explorar alternativas de implementação e documentar a evolução da aplicação sob a perspectiva de arquitetura de software.

Ao longo do projeto são aplicadas refatorações incrementais, princípios SOLID e padrões de projeto, sempre buscando melhorar atributos como manutenibilidade, extensibilidade, desacoplamento e testabilidade.

---

# 🎯 Objetivo

Este projeto foi criado com foco em evolução contínua de software.

Ao longo do desenvolvimento serão aplicados conceitos como:

- Princípios SOLID;
- Clean Code;
- Design Patterns;
- Refatoração;
- Arquitetura em Camadas;
- Inversão de Dependências;
- Modularização;
- Testes automatizados;
- Extensibilidade através de plugins.

O objetivo é demonstrar como uma aplicação inicialmente simples pode evoluir para uma arquitetura desacoplada, flexível, testável e de fácil manutenção.

---

# 🏛 Arquitetura

A aplicação possui uma arquitetura organizada por responsabilidades.

## CLI

Responsável por:

- interpretar os parâmetros informados pelo usuário;
- localizar o diretório contendo os capítulos do livro;
- iniciar o fluxo de geração do e-book.

## Parser Markdown

Realiza a leitura dos arquivos `.md` e transforma seu conteúdo em uma representação intermediária independente do formato de saída.

## Geradores

Cada formato possui uma implementação específica.

Atualmente o projeto suporta:

- 📄 PDF
- 📱 EPUB

A arquitetura foi planejada para permitir a inclusão de novos formatos sem alterações significativas no núcleo da aplicação.

---

# 🧱 Aplicação dos Princípios SOLID

Durante a evolução do projeto serão implementados os cinco princípios SOLID.

## Single Responsibility Principle (SRP)

Cada classe possui apenas uma responsabilidade bem definida.

Exemplos:

- leitura da linha de comando;
- leitura dos capítulos;
- geração do PDF;
- geração do EPUB.

### Open/Closed Principle (OCP)

A arquitetura busca permitir novas funcionalidades através de extensão, reduzindo alterações no código existente.

### Liskov Substitution Principle (LSP)

As implementações respeitam seus contratos, permitindo substituição sem alterar o comportamento esperado da aplicação.

### Interface Segregation Principle (ISP)

Interfaces pequenas e específicas evitam dependências desnecessárias entre componentes.

### Dependency Inversion Principle (DIP)

As regras de negócio dependem de abstrações, reduzindo o acoplamento com bibliotecas externas.

---

# 🧩 Design Patterns

Ao longo da evolução do projeto serão utilizados diversos padrões de projeto, incluindo:

- Factory
- Strategy
- Chain of Responsibility
- Application Events
- Java Service Provider Interface (SPI)

Cada padrão será introduzido quando fizer sentido arquiteturalmente, evitando complexidade desnecessária.

---

# ⚙ Tecnologias

- Java 21
- Maven
- CommonMark
- OpenPDF / iText
- Epublib

---

# 📋 Pré-requisitos

Antes de executar o projeto, instale:

- Java JDK 21 ou superior
- Apache Maven 3.8+

---

# 🚀 Compilação

Na raiz do projeto execute:

```bash
mvn clean package
```

Após o `BUILD SUCCESS`, será gerado:

```text
target/
└── cotuba-cli-0.0.1-SNAPSHOT-distribution.zip
```

---

# 📦 Distribuição

Extraia o arquivo gerado.

A estrutura será semelhante a:

```text
cotuba-cli-0.0.1-SNAPSHOT-distribution/
├── cotuba.sh
├── cotuba.bat
└── cotuba-cli-0.0.1-SNAPSHOT.jar
```

Onde:

- `cotuba.sh` → Linux, macOS e Git Bash
- `cotuba.bat` → Windows

---

# 📖 Gerando um e-book

O projeto disponibiliza um diretório chamado `livro-exemplo`, contendo capítulos em Markdown para facilitar os testes.

## Gerar PDF

### Linux/macOS

```bash
./cotuba.sh -d ../livro-exemplo -f pdf
```

### Windows

```cmd
cotuba.bat -d ../livro-exemplo -f pdf
```

Resultado:

```text
book.pdf
```

---

## Gerar EPUB

### Linux/macOS

```bash
./cotuba.sh -d ../livro-exemplo -f epub
```

### Windows

```cmd
cotuba.bat -d ../livro-exemplo -f epub
```

Resultado:

```text
book.epub
```

---

# 📁 Estrutura do Projeto

```text
.
├── cotuba-cli
├── cotuba-core
├── livro-exemplo
├── pom.xml
└── README.md
```


# 🙏 Créditos

Este repositório é um **fork** do projeto desenvolvido por **Alexandre Aquiles** para acompanhar o livro **Desbravando SOLID**.

Todo o mérito pela concepção do projeto original pertence ao autor.

Projeto original:

- https://github.com/alexandreaquiles/desbravando-solid

Livro:

- https://www.casadocodigo.com.br/products/livro-desbravando-solid

---

# 📚 Referências

- Desbravando SOLID — Alexandre Aquiles
- Effective Java — Joshua Bloch
- Clean Code — Robert C. Martin
- Clean Architecture — Robert C. Martin
- Refactoring — Martin Fowler
- Design Patterns — Gang of Four

---

# 📄 Licença

Este repositório é um fork do projeto original e tem finalidade educacional, servindo como laboratório para estudos de arquitetura de software, desenvolvimento Java e aplicação dos princípios SOLID. Respeite a licença e os créditos do projeto original.