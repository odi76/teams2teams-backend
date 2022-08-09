# Teams-2-Teams BE

TBD

## 1. Description

TBD

## 2. Getting Started

### 2.1 Dependencies

This is a Spring project which needs the following in order to install and run the application.

* Maven
* JDK 11
* PostgreSQL 14

### 2.2 Installing

####Create database and database user
database name: t2tdb
database user name: t2tdbuser
database user password: alma

The sql script to create:
```bash
DROP DATABASE  IF EXISTS t2tdb;
DROP USER IF EXISTS t2tdbuser;

CREATE DATABASE t2tdb;
CREATE USER t2tdbuser WITH ENCRYPTED PASSWORD 'alma';
GRANT ALL PRIVILEGES ON DATABASE t2tdb TO t2tdbuser;
```

You can change the default localhost database connection mode in this file: 
```bash
src/main/resources/application.properties
```

In order to install all Java packages that the application requiries due to operate a Spring application, execute the following command:

```bash
mvn install
```

### 2.3 Executing program

1) First, run the development server:

    ```bash
    ./mvnw spring-boot:run
    ```

2) Open TBD with your browser to see the result.

## 3. Authors

Laszlo Matusek-Faludi

## 4. Version History

* 1.0 (in progress)
  * Initial Release

## 5. License

This project is licensed under the MIT License - see the LICENSE.md file for details

## 6. Deploy

TBD

## 7. Acknowledgments

TBD
