# Spring Security Test – MVC Login with JPA/Hibernate

## Development

This project was developed with:
- IntelliJ IDEA 
- Java 21 
- Spring Boot 3.5.7
- Maven

## What I Learned in Branch `14spring-mvc-thymeleaf-security-hibernate`

This branch focused on securing a Spring Boot application using Spring Security by migrating from JDBC-based authentication to JPA/Hibernate with custom entities, DAOs, and services.

- **Projektinitialisierung**
    - Initialisiert mit Spring Web, Thymeleaf, Security und DevTools

- **Controller und Templates**
    - Erstellt `DemoController` und `home.html` für Basisrouting
    - Korrigiert Tippfehler in `home.html`
    - Erstellt `LoginController` und `plain-login.html` für benutzerdefinierte Login-Seite

- **Security-Konfiguration (In-Memory)**
    - Erstellt `DemoSecurityConfig` mit `InMemoryUserDetailsManager` und drei Benutzern (`alex`, `paul`, `max`)
    - Konfiguriert `SecurityFilterChain` mit benutzerdefinierter Login-Seite unter `/showMyLoginPage` und Login-Verarbeitung unter `/authenticateTheUser`

- **Login-Verhalten**
    - Anzeige von Fehlermeldungen bei Login-Fehlschlägen
    - Fehleranzeige in rot per CSS
    - Ersetzt `plain-login.html` durch `bootstrap-login.html`
    - Aktualisiert Controller-Mapping
    - Fügt Logout-Unterstützung hinzu und aktualisiert Templates

- **Benutzerinformationen in Views**
    - Anzeige von Benutzername und Rollen mit Spring Security Thymeleaf Extras

- **Rollenbasierter Zugriff**
    - Fügt `/leaders`-Route und View für MANAGER-Rolle hinzu
    - Beschränkt URL-Zugriff auf Rollen: EMPLOYEE, MANAGER, ADMIN
    - Fügt `/systems`-Route, Link in `home.html` und `systems.html`-View für ADMIN-Rolle hinzu
    - Fügt benutzerdefinierte Access-Denied-Seite und Controller-Mapping hinzu
    - Bedingte Anzeige von Inhalten mit `sec:authorize` in Thymeleaf

- **Datenbankintegration und JDBC-Authentifizierung**
    - Fügt SQL-Skripte hinzu für Benutzer, Rollen und bcrypt-Passwörter
    - Konfiguriert MySQL-Datenquelle in `application.properties`
    - Fügt JPA- und MySQL-Treiber-Abhängigkeiten hinzu
    - Entfernt `InMemoryUserDetailsManager` zugunsten datenbankgestützter Authentifizierung
    - Wechselt zu `JdbcUserDetailsManager` mit bcrypt
    - Konfiguriert benutzerdefinierte SQL-Abfragen:
        - `select user_id, pw, active from members where user_id=?`
        - `select user_id, role from roles where user_id=?`

- **Migration zu JPA/Hibernate**
    - Erstellt Entitäten `User` und `Role` mit JPA-Annotationen
    - Implementiert `UserDao` und `UserDaoImpl` zur Benutzersuche per Username
    - Implementiert `UserService` und `UserServiceImpl` mit `UserDetailsService`
    - Wandelt Rollen in `GrantedAuthority` mit `SimpleGrantedAuthority`
    - Konfiguriert `DaoAuthenticationProvider` mit benutzerdefiniertem `UserService` und `BCryptPasswordEncoder`
    - Registriert Beans für Authentifizierungsprovider und Passwortencoder in `DemoSecurityConfig`