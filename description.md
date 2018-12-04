#### Разработка полнофункционального Spring/JPA Enterprise приложения c авторизацией и правами доступа на основе ролей с использованием <a href="https://zeroturnaround.com/rebellabs/java-tools-and-technologies-landscape-2016/" target="_blank">наиболее популярных инструментов и технологий Java</a>: Maven, Spring MVC, Security, JPA(Hibernate), REST(Jackson), Bootstrap (css,js), datatables, jQuery + plugins, Java 8 Stream and Time API и сохранением в базах данных Postgresql и HSQLDB.

-   Используются самые востребованные на сегодняшний момент фреймворки: Maven, Spring Security 4
            вместе с Spring Security Test, наиболее удобный для работы с базой проект Spring Data Jpa, библиотека логирования logback, реализующая SLF4J, повсеместно используемый Bootstrap и jQuery.

### Архитектура проекта. Персистентность.
-  <a href="https://drive.google.com/file/d/0B9Ye2auQ_NsFSUNrdVc0bDZuX2s">Системы управления версиями</a>
-  <a href="http://www.youtube.com/watch?v=_PDIVhEs6TM">Java 8: Lambda</a>, Stream API
-  Обзор используемых в проекте технологий и инструментов.
-  <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFSlZMTXBJRXJpakU">Инструмент сборки Maven.</a>
-  WAR. Веб-контейнер Tomcat. Сервлеты.
-  Логирование.
-  Обзор стандартных библиотек. Apache Commons, Guava
-  Слои приложения. Создание каркаса приложения.
-  Обзор Spring Framework. Spring Context.
-  Тестирование через JUnit.
-  <a href="https://drive.google.com/file/d/0B9Ye2auQ_NsFai1veG9qaFZlZ2s/view">Spring Test</a>
-  Базы данных. PostgreSQL. Обзор NoSQL и Java persistence solution без ORM.
-  Настройка Database в IDEA.
-  Скрипты инициализации базы. Spring Jdbc Template.
-  <a href="https://drive.google.com/file/d/0B9Ye2auQ_NsFU0Z2R190eDllYmM/view">Spring: инициализация и популирование DB</a>
-  ORM. Hibernate. JPA.
- [Тестирование JPA сервиса через AssertJ](https://www.youtube.com/watch?v=BlyaXT6tOaw)
-  Поддержка HSQLDB
-  Транзакции
-  Профили Maven и Spring
-  <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFTWJOdHduOWtNcTA">Пул коннектов</a>
-  Spring Data JPA
-  Кэш Hibernate

### WEB
-  Spring кэш
-  Spring Web
-  JSP, JSTL, i18n
-  Tomcat maven plugin. JNDI
-  Spring Web MVC
-  Spring Internationalization
-  Тестирование Spring MVC
-  REST контроллеры
-  Тестирование REST контроллеров. Jackson.
-  jackson-datatype-hibernate. Тестирование через матчеры.
-  Тестирование через SoapUi. UTF-8
-  WebJars.
-  Bootstrap. jQuery datatables.
-  AJAX. jQuery. Notifications.
-  Spring Security
-  Spring Binding/Validation
-  Работа с datatables через Ajax.
-  Spring Security Test
- [Кастомизация JSON (@JsonView) и валидации (groups)](https://drive.google.com/open?id=0B9Ye2auQ_NsFRTFsTjVHR2dXczA)
-  Encoding password
-  <a href="https://drive.google.com/file/d/0B9Ye2auQ_NsFNDlPZGdUNThzNUU/view">CSRF (добавление в проект защиты от межсайтовой подделки запроса)</a>
-  form-login. Spring Security Taglib
-  Handler interceptor
-  Spring Exception Handling
-  Смена локали
-  Фильтрация JSON через @JsonView
-  Защита от XSS (Cross Site Scripting)
-  <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFZkpVM19QWFBOQ2c">Деплой в Heroku</a>
-  Локализация datatables, ошибок валидации
-  Обработка ошибок 404 (NotFound)
-  Доступ к AuthorizedUser
