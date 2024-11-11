# Famulus application

### For starting api use te commands

<br>

Change .example.env name file .env and set enviroment variables

<br>

clone repository:
```
git clone git@github.com:oligregz/famulus.git
```

access repository:
```
cd famulus
```

intall dependecies:
```
mvn clean install
```

build container and image:
```
cd database-docker && docker-compose up -d
```

access the path below, change the file extension application.properties.txt by removing the '.txt' for application.properties and add your database password to the file
```
cd ../src/main/resources/
```

return general project directory and start application:
```
cd ../../..
```