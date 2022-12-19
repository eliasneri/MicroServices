# MicroServices
Neste curso foi utilizado uma versão mais antiga do SPRING, por se tratar de curso antigo, era a versão mais recente e LTS na época.

O Escopo do projeto consiste em dois microserviços, sendo um especifico de "Serviços" e outro MicroService de Dados, utilizando como princípios as API's e suas camadas: 
* Entidades (Entities)
* Controlodades (Resources / Controller)
* Serviços (Services)
* Repositórios (Repositories)

A primeira será apenas para chamadas de serviços (requisições). Não será uma API persistente, ou seja não fará nenhum tipo de alteração em um banco de dados.

A segunda API, é implementada utilizando o Hibernate e JPA, este microservice, terá como funcionalidade principal o armazenamento de informações no banco de dados.

### Tecnologias utilizadas:
* Spring Boot: 2.3.4 Release
* Java versão 17 (Dristibuition Zulu - LTS)
* Maven, como gerenciador de Dependências
* Banco de Dados H2
* Rest Template
* Ribbon load balancing 
* Feign
* Eureka
* (Hystrix) --Circuit Breaker - Resilience 4J 
* Gateway Zuul
* JWT Token
* Docker
* IDE IntelliJ
* IDE STS (Spring Tool Suite)
* GitHub

### Notas Importantes sobre dependências:
Para que o projeto seja executada como proposto, foi utilizada as tecnologias citadas acima, mas é importante resaltar, que data da composição deste documento, 10/12/2022 algumas dependências foram substituídas. 

* Hystrix.............> Resliience4J
* Ribbon..............> Spring Cloud Load Balancer
* Zuul 1...............> Spring Cloud Gateway
* Archaius 1........> Spring Cloud Config

