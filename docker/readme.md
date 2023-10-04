## Dockers Configs:

Criar um container de Rede para os Micro-Serviços:
```
$ docker network create hr-net
```

Versão do PostgresSQL utilizada para este projeto:

```
$ docker pull postgres:12-alpine
```

Gerando os Banco de Dados HR-Worker container's a partir da imagem do Postgres 12 Alpine.

```
$ docker run -p 5432:5432 --name hr-worker-pg12 --network hr-net -e POSTGRES_PASSWORD=12345678 -e POSTGRES_DB=db_hr_worker postgres:12-alpine
```

Gerando o banco de Dados HR-User, a partir da imagem Postgres 12 Alpine
```
$ docker run -p 5433:5432 --name hr-user-pg12 --network hr-net -e POSTGRES_PASSWORD=12345678 -e POSTGRES_DB=db_hr_user postgres:12-alpine
```
