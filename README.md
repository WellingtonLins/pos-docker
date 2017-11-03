# Docker-JavaWeb

Simples projeto JavaWeb usando o Docker   
Concebido para resolução de atividade da disciplina de POS   
Curso **Análise e Desenvolvimento de Sistemas**   
IFPB Campus Cajazerias   
Professor da disciplina Ricardo Job   

## Getting Started   

Antes de tudo obtenha o `Docker`    ![alt text](Whale.png "Docker")


[Docker Download](https://www.docker.com/community-edition)  
 
## Prerequisitos
* Java instalado
* Maven instalado
* Docker instalado
* IDE de sua preferência   

Mas como estamos usando o Docker para a implantação pode usar
apenas um Editor de texto como o [Sublime](https://www.sublimetext.com/3) ou [Notepad++](https://notepad-plus-plus.org/download/v7.5.1.html ) ...

## Criando o arquivo `Dockerfile`

```
FROM tomcat
COPY target/docker-javaweb.war ${CATALINA_HOME}/webapps   
```   
`FROM` :  diz qual a imagem que precisamos   
`COPY` :  diz o caminho de onde copiar os arquivos .war para a implantação   
`${CATALINA_HOME}/webapps` :  lugar  onde vamos armazenar os gloriosos arquivos   

Este arquivo `Dockerfile`, deve obrigatoriamente estar dentro do diretorio raiz do seu projeto.

## Criar uma imagem

`docker build -t dockerlegal .` 
*`-t`: qual a tag que vamos atribuir a essa imagem*  
*`.`: caminho relativo (ou absoluto) para o arquivo Dockerfile*  

Depois que você executar o comando acima , caso você não tenha a imagem    
do tomcat, o docker vai providenciar  para você automaticamente, claro    
isso acontece porque descrevemos isso  no Dockerfile do projeto em questão.
        
   
FROM  **tomcat**   
COPY target/docker-javaweb.war ${CATALINA_HOME}/webapps   
    
## Listar as imagens

`docker image ls`   
ou   
 `docker images`

## Executar o container

`docker run -p 8081:8080 -d --name application dockerlegal`  
*`-p`: o bind entre a porta do host local com a porta do container*  
*`-d`: o container seja executar em background* não obstruindo  o terminal  
*`--name`: o nome do container*  
  
Agora va ate o browser a abra o seu projeto: [http://localhost:8081/docker-javaweb](http://localhost:8081/docker-javaweb/ )   

Acima nos configuramos a porta do tomcat para 8081 lembra?   
     
No meu caso como ainda estou usando o Docker Toolbox no windows abro a aplicação em [http://192.168.99.100:8081/docker-javaweb/](http://192.168.99.100:8081/docker-javaweb/ )

  
## Implantação usando  arquivo .sh

Para agilizar o  processo de desenvolvimento vamos criar dois arquivos .sh: 
 
**run.sh**   

O arquivo **run.sh** deve conter o seguinte conteudo:

-------------------------------------------------------------    
mvn clean package   
docker build -t dockerlegal .   
docker run -p 8081:8080 -d --name application dockerlegal

-------------------------------------------------------------    
**nonrun.sh**  

O arquivo **nonrun.sh** deve conter o seguinte conteudo:
 
-------------------------------------------------------------
mvn clean   
docker stop application     
docker rm application     
docker rmi dockerlegal

-------------------------------------------------------------


Assim uma vez que você ja tenha as imagens e os containers criados você
não precsia digitar todas as vezes os comandos de criar a imagem
e o container apos cada atualização de seu projeto.   
Simplesmente abra digite no docker: 
  
### Para iniciar:  

**sh run.sh**     

 Vai fazer tudo de uma só vez :    

* O maven vai criar o arquivo .war do projeto   
* Vai criar a imagem da aplicação   
* Por ultimo criar e iniciar o container da aplicação  

### Para encerrar digite:  

**sh nonrun.sh**   

  Vai fazer tudo de uma só vez :  
 
* O maven vai limpar o projeto   
* Parar o container da aplicação   
* Remover a aplicação
* Por ultimo vai remover a imagem da aplicação do Docker   

## Listar os containers

`docker container ls`


## Listar os containers de ativos e inativos

`docker ps -a`


## Parar o container

`docker stop <container_id | container_name>`


## Documentação Docker
[Docker referências](https://docs.docker.com/reference/ )

## Construido com 

* [Java](http://www.dropwizard.io/1.0.2/docs/) - Lingugem de programação
* [Maven](https://maven.apache.org/) - Gerenciador de dependencias
* [Tomcat](https://tomcat.apache.org/) - Servidor Web usado para a implantação do projeto
* [Docker](https://www.docker.com) - Gerenciador de containers onde podemos usar o container do Tomcat... 
* [NetBeans](https://netbeans.org/downloads/) - Usado para escrever o codigo fonte do projeto

## Controle de versão

Nós usamos o [Git](https://git-scm.com/) . 

## Autor

* Wellington Lins


## Agradecimentos

* Ao professor Ricardo Job 
* A colega Michelle Oliveira

## Here I can listen you call my name: 

wellingtonlins2013@gmail.com

#### Tell me your problems and doubts...
