# About 
This is a placeholder for full stack web app using [ AngularJs ](https://angularjs.org/) and Java REST API.
The front end was auto-generated using [ yeoman ](http://yeoman.io/) scaffolding tool.
The back end is part of [ this tutorial ](http://www.vogella.com/tutorials/REST/article.html) using data transfer objects. 

See Martin Fowler's definition for data transfer object [ here ](http://martinfowler.com/eaaCatalog/dataTransferObject.html)

# Requirements 

 * Java Jdk or Jre
 * Tomcat 
 * Gradle
 * MySQL
 * Grunt 
 * Bower 
 * NodeJs and npm

# Backend 

In order to run:

```
cd backend 
grunt war
sudo cp backend/build/libs/songrestapi.war /var/lib/tomcat/webapps/
```

check it at http://localhost:8080/songrestapi/ or http://localhost:8080/songrestapi/rest/album/

# MySQL Setup 

Install MySQL: (fedora)

```
dnf install mysql-community-server
```

Import database dump:

```
mysql -u root -p 
CREATE USER 'songuser'@'localhost' IDENTIFIED BY 'songpass';
GRANT ALL PRIVILEGES ON songdb.* TO 'songuser'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;
exit;

mysql -u root -p < songdb_schema.sql 
```

# Frontend

Install required npm and bower packages

```
cd frontend 
npm install
bower install
```

Launch app

```
grunt serve
```

# Run Karma Tests 
```
grunt test
```


# Next Steps 

 * Use connection pool [ C3P0 ](http://stackoverflow.com/questions/2835090/how-to-establish-a-connection-pool-in-jdbc)
 * Better REST example
 * Tests



