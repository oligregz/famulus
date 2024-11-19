# Famulus application

<br>

> **FOR STARTING API USE THE COMMANDS**


###### _**Change .example.env name file .env and set enviroment variables**_

clone repository:
```
git clone git@github.com:oligregz/famulus.git
```

access directory application:
```
cd famulus
```

install dependecies:
```
mvn clean install
```

build containers and images:
```
docker-compose up --build -d
```

remove containers and images:
```
docker-compose down && docker rmi famulus-api:latest postgres
```

<br>

> **TO BUILD AND DEVELOP THE APPLICATION**

__[1]__ If your changes do not impact the application (in the context of the container), use the command below to compile the changes made to the target directory

to compile changes made to the target directory:
```
mvn compile
```

__[2]__ then, using the commands above, revamp and build the containers and images again


<br></br>

> **LOGS**

**If you are in a production environment, change the suffixes 'dev' to 'prod'**

view development api container runtime logs:
```
docker logs -f famulus-api-dev
```

view development db container runtime logs:
```
docker logs -f famulus-db-dev
```

