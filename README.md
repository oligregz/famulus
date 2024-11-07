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

return general project test:
```
cd ..
```