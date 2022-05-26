
Változás történet:
------------------
- 2022.05.26
  - A teams2teams-backend mulit modulos projekt lett:
    (1) business-logic: openapi generált kód üzleti megvalósítása
    (2) openapi-specification: openapi OAS yaml file és az ebőől generált kód
  - Az OAS-ban található api működőképes, a következő megkötésekkel
    - Nincsenek permanens regisztrált felhasználók
    - A login valaki/valami bejelentkezés párossal visszaad egy session-id-t. Minden más esetben hiba
    - A logout mindig 200 HTTP státuszt ad vissza. Független milyen session-id van megadva
  - A login api funkciók a 'loginapi' package-ba kerültek.
  - A teams2teams-backend alatti /home könyvtár a business-logic projektkönyvtár alá került
  - /home/attila alól kikerültek a PoC projektek (Github repoba átkerültek, email ment róla)
  - Minden egyéb funkció szintén megszüntetésre került, így a demo User forráskód is

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



