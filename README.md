# spring-data-jpa-relationships

### Things to do list:

1. Clone this repository: `git clone https://github.com/hendisantika/spring-data-jpa-relationships.git`
2. Navigate to the folder: `cd spring-data-jpa-relationships`
3. Set your PostgreSQL credentials based on your own setting.
4. Run the application: `mvn clean spring-boot:run`

### Run by PostgreSQL Container Image

```shell
docker run -d --rm --name pg14 -e POSTGRES_USER=user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=books -p 5432:5432 postgres:14
```

### Go inside the postgres 14 docker container

```shell
docker exec -it pg14 psql -U user -W books

or 

psql -h localhost -p 5432 -U user -W my_db
```

[Article Source link](https://medium.com/huawei-developers/database-relationships-in-spring-data-jpa-8d7181f50f60)
