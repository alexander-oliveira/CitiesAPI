# Cities API


[toc]
Neste projeto, realizado em bootcamp da Digital Innovation One, a proposta é que seja implementado uma API Rest que possibilite consultar países, estados e cidades brasileiras além da possibilidade de calcular a distância entre duas referências.

## Requisitos

- Git
- Docker

## Instruções de uso

Os comandos a seguir deverão copiar o projeto no diretório atual, criando a pasta citiesapi, em seguida criará e inicializará o banco de dados além de compilar e executar a aplicação em seus respectivos containers.

```shell
git clone https://github.com/alexander-oliveira/CitiesAPI.git citiesapi && cd citiesapi && docker compose up -d
```

### Requisições

HTTP Porta: 8080

GET	/countries

GET	/countries/[id]

GET	/states

GET	/states/[id]

GET	/cities

GET	/cities/[id]

GET	/distances/by-point?from=[id]&to=[id]

GET	/distances/by-cube?from=[id]&to[id]

## Tecnologias

- Java 8
- Spring Boot 2.4.5
  - Spring Web
  - Spring Data JPA
  - Spring Test
  - Postgres Driver
- Hibernate
- [JsonTypes](https://github.com/vladmihalcea/hibernate-types)
- Gradle 6.8.3
- PostgreSQL 13
  - [Dados](https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL)
- Docker 20