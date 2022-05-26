
Változás történet:
------------------
- 2022.05.26
  - A teams2teams-backend mulit modulos projekt lett:
    (1) business-logic: openapi generált kód üzleti megvalósítása
    (2) openapi-specification: openapi OAS yaml file és az ebből generált kód
  - OAS file: teams2teams-openapi.yml
  - Kódgenerálás a openapi-generator-maven-plugin használatával történik
  - A generált api és a model forrásállományok az alábbi package-ekbe kerülnek
    - com.teams2teams.openapi.api
    - com.teams2teams.openapi.model

Használat
------------------
- Fordítás:
  - teams2teams-backend könyvtárból
    ./mvnw clean compile
- Install:
  - teams2teams-backend könyvtárból
    ./mvnw clean install
- Futtatás:
  - teams2teams-backend könyvtárból
    ./mvnw clean spring-boot:run



