# scala-web-sbt-spring-thyme-neo4j-simple

## Description
A thyme springboot scala sbt build,
that connects to neo4j database.

## Tech stack
- springboot
  - thymeleaf
- sbt
  - neo4j drivers
  - lombok
  - PostConstruct annotation
- bootstrap
- jquery
- dataTable

## Docker stack
- neo4j:latest
- hseeberger/scala-sbt:11.0.2-oraclelinux7_1.3.5_2.12.10

## To run
`sudo ./install.sh -u`
- [Available](http://localhost)
- [Neo4j webui](http://localhost)

## To stop (optional)
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credits
- [Baeldung Neo4j](https://www.baeldung.com/scala-neo4j)
- [Define edges](https://spring.io/guides/gs/accessing-data-neo4j/)
- [Neo4j extra Docker configs](https://paras301.medium.com/initialize-a-neo4j-docker-container-using-cypher-scripts-f4a5ded9ff52)
