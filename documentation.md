# AnimeTracker

<!-- TOC -->
* [AnimeTracker](#animetracker)
  * [Tecnologias utilizadas](#tecnologias-utilizadas)
    * [Spring boot](#spring-boot)
    * [Lombok](#lombok)
    * [PostGreSQL](#postgresql)
    * [Thymeleaf](#thymeleaf)
    * [Spring data JPA](#spring-data-jpa)
  * [Codigo de la aplicacion](#codigo-de-la-aplicacion)
      * [Entidades](#entidades)
        * [Anime](#anime)
        * [Ending](#ending)
        * [Genre](#genre)
        * [Opening](#opening)
      * [Repositorios](#repositorios)
        * [Anime](#anime-1)
        * [Ending](#ending-1)
        * [Genre](#genre-1)
        * [Opening](#opening-1)
      * [Servicio](#servicio)
        * [Anime](#anime-2)
        * [Ending](#ending-2)
        * [Genre](#genre-2)
        * [Opening](#opening-2)
      * [Controlador](#controlador)
      * [Vista](#vista)
    * [Configuracion](#configuracion)
<!-- TOC -->

## Tecnologias utilizadas

### Spring boot

Spring Boot es un framework de desarrollo web basado en Java que simplifica el proceso de desarrollo de aplicaciones web. Spring Boot proporciona una serie de características que facilitan a los desarrolladores la creación de aplicaciones web escalables, seguras y eficientes.

Spring Boot se utiliza en el desarrollo web para las siguientes tareas:

* **Creación de aplicaciones web autocontenidas:** Spring Boot proporciona un mecanismo para crear aplicaciones web autocontenidas que pueden ejecutarse como un archivo .jar. Esto facilita el despliegue de aplicaciones web en entornos de producción.
* **Inyección de dependencias:** Spring Boot utiliza la inyección de dependencias para inyectar automáticamente las dependencias necesarias en las clases de la aplicación. Esto simplifica el desarrollo de aplicaciones web y reduce la posibilidad de errores.
* **Manejo de datos:** Spring Boot proporciona soporte para una amplia gama de fuentes de datos, incluidas bases de datos relacionales, NoSQL y servicios de datos en la nube. Esto facilita a los desarrolladores la conexión a sus datos y el acceso a ellos.
* **Seguridad:** Spring Boot proporciona una serie de características para ayudar a proteger las aplicaciones web de ataques. Estas características incluyen la autenticación, la autorización y la encriptación.
* **Escalabilidad:** Spring Boot está diseñado para ser escalable. Esto significa que las aplicaciones web desarrolladas con Spring Boot pueden soportar grandes cantidades de tráfico.

Spring Boot es una herramienta poderosa que puede ayudar a los desarrolladores a crear aplicaciones web más rápidamente y fácilmente.

Aquí hay algunos ejemplos específicos de cómo se puede utilizar Spring Boot en el desarrollo web:

* **Para crear una aplicación web simple con una página de inicio y una página de contacto, se puede utilizar Spring Boot para crear un proyecto Maven o Gradle y luego agregar las dependencias necesarias para las páginas web y el controlador web.**
* **Para crear una aplicación web con una base de datos relacional, se puede utilizar Spring Boot para agregar la dependencia de la base de datos y luego configurar la conexión a la base de datos en el archivo de configuración.**
* **Para crear una aplicación web con un servicio de datos en la nube, se puede utilizar Spring Boot para agregar la dependencia del servicio de datos y luego configurar la conexión al servicio de datos en el archivo de configuración.**

Spring Boot es una herramienta flexible que se puede utilizar para crear una amplia gama de aplicaciones web.

### Lombok

Lombok es una herramienta de código fuente que se utiliza para generar código Java automáticamente. Lombok proporciona una serie de anotaciones que se pueden utilizar para generar getters, setters, equals(), hashCode(), toString() y otros métodos comunes.

Lombok se utiliza en el desarrollo web para las siguientes tareas:

* **Reducir el código repetitivo:** Lombok puede generar getters, setters, equals(), hashCode(), toString() y otros métodos comunes automáticamente. Esto reduce la cantidad de código repetitivo que los desarrolladores deben escribir.
* **Mejorar la legibilidad del código:** Lombok puede generar código más conciso y fácil de leer. Esto puede ayudar a mejorar la calidad del código y facilitar su mantenimiento.
* **Aumentar la productividad:** Lombok puede ayudar a los desarrolladores a ser más productivos al reducir la cantidad de tiempo que pasan escribiendo código repetitivo.

Aquí hay algunos ejemplos específicos de cómo se puede utilizar Lombok en el desarrollo web:

* **Para crear una clase simple con un atributo, se puede utilizar Lombok para generar los getters y setters para el atributo.**
* **Para crear una clase con un constructor, se puede utilizar Lombok para generar el constructor para la clase.**
* **Para crear una clase con un método toString(), se puede utilizar Lombok para generar el método toString() para la clase.**

Lombok es una herramienta útil que puede ayudar a los desarrolladores a crear aplicaciones web más rápidamente y fácilmente.

En particular, Lombok puede ser muy útil en el desarrollo web para reducir la cantidad de código repetitivo que los desarrolladores deben escribir. Por ejemplo, Lombok puede generar getters y setters automáticamente para los atributos de una clase. Esto puede ahorrar a los desarrolladores mucho tiempo y esfuerzo.

Además, Lombok puede ayudar a mejorar la legibilidad del código. Por ejemplo, Lombok puede generar código más conciso y fácil de leer para los métodos equals(), hashCode() y toString(). Esto puede ayudar a mejorar la calidad del código y facilitar su mantenimiento.

En general, Lombok es una herramienta poderosa que puede ayudar a los desarrolladores a ser más productivos y crear aplicaciones web de mayor calidad.

### PostGreSQL

PostgreSQL es un sistema de gestión de bases de datos relacional (RDBMS) de código abierto y de alto rendimiento. Es una de las bases de datos más populares del mundo, y se utiliza en una amplia gama de aplicaciones, incluidas aplicaciones web.

PostgreSQL se utiliza en el desarrollo web para las siguientes tareas:

* **Almacenamiento de datos:** PostgreSQL se utiliza para almacenar los datos de las aplicaciones web. Los datos almacenados en PostgreSQL pueden incluir información sobre usuarios, productos, pedidos, etc.
* **Consulta de datos:** PostgreSQL se utiliza para consultar los datos almacenados en la base de datos. Las consultas pueden utilizarse para obtener información específica de los datos, como la lista de todos los usuarios registrados o el total de ventas de un producto.
* **Procesamiento de transacciones:** PostgreSQL es una base de datos ACID, lo que significa que garantiza la integridad de los datos en las transacciones. Esto es importante para aplicaciones web que requieren transacciones seguras, como las aplicaciones de comercio electrónico.

PostgreSQL ofrece una serie de ventajas que lo hacen una buena opción para el desarrollo web, incluyendo:

* **Escalabilidad:** PostgreSQL está diseñado para ser escalable. Esto significa que puede soportar grandes cantidades de datos y tráfico.
* **Seguridad:** PostgreSQL ofrece una serie de características de seguridad para ayudar a proteger los datos.
* **Flexibilidad:** PostgreSQL es un sistema de gestión de bases de datos muy flexible. Puede utilizarse para una amplia gama de aplicaciones web.

Aquí hay algunos ejemplos específicos de cómo se puede utilizar PostgreSQL en el desarrollo web:

* **Una aplicación web de comercio electrónico puede utilizar PostgreSQL para almacenar información sobre productos, pedidos y clientes.**
* **Una aplicación web de redes sociales puede utilizar PostgreSQL para almacenar información sobre usuarios, publicaciones y comentarios.**
* **Una aplicación web de gestión de proyectos puede utilizar PostgreSQL para almacenar información sobre proyectos, tareas y recursos.**

En general, PostgreSQL es una base de datos sólida y versátil que puede utilizarse para una amplia gama de aplicaciones web.

### Thymeleaf

Thymeleaf es un motor de plantillas HTML5 de código abierto que se utiliza para crear páginas web dinámicas. Thymeleaf es compatible con Java, Spring Boot y otros frameworks de desarrollo web.

Thymeleaf se utiliza en el desarrollo web para las siguientes tareas:

* **Generación de contenido dinámico:** Thymeleaf se utiliza para generar contenido dinámico en las páginas web. El contenido dinámico puede incluir información de la base de datos, datos del usuario o cualquier otra información que se desee mostrar en la página web.
* **Validación de datos:** Thymeleaf se puede utilizar para validar los datos que se introducen en las páginas web. Esto ayuda a garantizar que los datos introducidos son correctos y válidos.
* **Personalización de páginas web:** Thymeleaf se puede utilizar para personalizar las páginas web. Esto puede hacerse utilizando variables, expresiones y otras características de Thymeleaf.

Thymeleaf ofrece una serie de ventajas que lo hacen una buena opción para el desarrollo web, incluyendo:

* **Facilidad de uso:** Thymeleaf es fácil de aprender y utilizar. El código de Thymeleaf se asemeja al HTML estándar, lo que facilita la transición de los desarrolladores que están familiarizados con HTML.
* **Eficiencia:** Thymeleaf es un motor de plantillas muy eficiente. Puede generar páginas web rápidamente y sin consumir muchos recursos del servidor.
* **Compatibilidad:** Thymeleaf es compatible con una amplia gama de frameworks de desarrollo web. Esto lo convierte en una opción flexible para los desarrolladores.

Aquí hay algunos ejemplos específicos de cómo se puede utilizar Thymeleaf en el desarrollo web:

* **Una aplicación web de comercio electrónico puede utilizar Thymeleaf para mostrar una lista de productos. La lista de productos puede ser personalizada para mostrar diferentes informaciones, como el precio, la imagen o la descripción del producto.**
* **Una aplicación web de redes sociales puede utilizar Thymeleaf para mostrar la lista de publicaciones de un usuario. Las publicaciones pueden ser personalizadas para mostrar diferentes informaciones, como el texto, la imagen o la fecha de publicación.**
* **Una aplicación web de gestión de proyectos puede utilizar Thymeleaf para mostrar una lista de proyectos. La lista de proyectos puede ser personalizada para mostrar diferentes informaciones, como el título, la descripción o el estado del proyecto.**

En general, Thymeleaf es una herramienta potente y flexible que puede utilizarse para crear una amplia gama de páginas web dinámicas.

### Spring data JPA

Spring Data JPA es una biblioteca de Spring Framework que facilita el acceso a datos en aplicaciones Java. JPA es una API estándar de Java para el acceso a datos relacionales, y Spring Data JPA proporciona una capa de abstracción sobre JPA que facilita su uso.

Spring Data JPA se utiliza en el desarrollo web para las siguientes tareas:

* **Acceso a datos:** Spring Data JPA proporciona una variedad de métodos para acceder a los datos de la base de datos, como crear, actualizar, eliminar y consultar datos.
* **Inyección de dependencias:** Spring Data JPA se puede inyectar en las clases de la aplicación, lo que facilita la separación de la lógica de la aplicación de la lógica de acceso a datos.
* **Testabilidad:** Spring Data JPA es fácil de probar, lo que facilita la verificación del correcto funcionamiento de la aplicación.

Spring Data JPA proporciona una serie de ventajas que lo hacen una buena opción para el desarrollo web, incluyendo:

* **Facilidad de uso:** Spring Data JPA es fácil de usar, incluso para desarrolladores que no están familiarizados con JPA.
* **Eficiencia:** Spring Data JPA es eficiente, lo que permite a las aplicaciones web funcionar de forma rápida y sin consumir muchos recursos del servidor.
* **Flexibilidad:** Spring Data JPA es flexible, lo que permite a los desarrolladores adaptarlo a sus necesidades específicas.

Aquí hay algunos ejemplos específicos de cómo se puede utilizar Spring Data JPA en el desarrollo web:

* **Para crear una aplicación web con una base de datos relacional, se puede utilizar Spring Data JPA para acceder a los datos de la base de datos.**
* **Para crear una aplicación web con una lógica de negocio compleja, se puede utilizar Spring Data JPA para acceder a los datos de la base de datos.**
* **Para crear una aplicación web con una API REST, se puede utilizar Spring Data JPA para acceder a los datos de la base de datos.**

En general, Spring Data JPA es una herramienta potente y flexible que puede utilizarse para facilitar el acceso a datos en aplicaciones web.

## Codigo de la aplicacion

#### Entidades

Un paquete de clases model o entities en una aplicación web de Spring Boot sirve para representar los datos de la aplicación. Estas clases suelen corresponder a las tablas de la base de datos, y contienen los atributos que representan los campos de las tablas.

Las clases model o entities se utilizan en las aplicaciones web de Spring Boot para las siguientes tareas:

* **Almacenamiento de datos:** Las clases model o entities se utilizan para almacenar los datos en la base de datos. Esto se hace utilizando la API de JPA de Java.
* **Representación de datos:** Las clases model o entities se utilizan para representar los datos en las páginas web. Esto se hace utilizando el motor de plantillas de Spring Boot, como Thymeleaf.
* **Validación de datos:** Las clases model o entities se pueden utilizar para validar los datos antes de almacenarlos en la base de datos. Esto se hace utilizando los métodos de validación de Java.

Por ejemplo, si una aplicación web tiene una tabla de usuarios, la clase model o entity correspondiente podría tener los siguientes atributos:

```
private String username;
private String password;
private String email;
```

Esta clase podría utilizarse para almacenar los datos de un usuario en la base de datos, y para representar los datos de un usuario en las páginas web.

En general, los paquetes de clases model o entities son una parte importante de las aplicaciones web de Spring Boot. Estos paquetes sirven para representar los datos de la aplicación, y se utilizan en una variedad de tareas, como el almacenamiento de datos, la representación de datos y la validación de datos.

##### Anime

```java
@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Anime {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long idAnime;
private String name;
private String status;
private String image;
private String nameJapanese;

    @Column(length = 1500)
    private String synopsis;

    @OneToMany(mappedBy = "anime", fetch = FetchType.LAZY)
    private Set<Opening> openings = new HashSet<>();

    @OneToMany(mappedBy = "anime")
    private Set<Ending> endings = new HashSet<>();

    @OneToMany(mappedBy = "anime")
    private Set<Genre> genres = new HashSet<>();

    public Anime(String name, String status, String image, String nameJapanese, String synopsis) {
        this.name = name;
        this.status = status;
        this.image = image;
        this.nameJapanese = nameJapanese;
        this.synopsis = synopsis;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "idAnime=" + idAnime +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", image='" + image + '\'' +
                ", nameJapanese='" + nameJapanese + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", openings=" + openings +
                ", endings=" + endings +
                ", genres=" + genres +
                '}';
    }
}
```

##### Ending

```java
@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Ending {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEnding;
    private String name;

    @ManyToOne
    @JoinColumn(name = "idAnime")
    private Anime anime;

    @Override
    public String toString() {
        return "Ending{" +
                "idEnding=" + idEnding +
                ", name='" + name + '\'' +
                '}';
    }

    public Ending(String name, Anime anime) {
        this.name = name;
        this.anime = anime;
    }
}
```

##### Genre

```java
@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idGenre;
    private String name;

    @ManyToOne
    @JoinColumn(name = "idAnime")
    private Anime anime;

    public Genre(String name, Anime anime) {
        this.name = name;
        this.anime = anime;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "idGenre=" + idGenre +
                ", name='" + name + '\'' +
                '}';
    }
}
```

##### Opening

```java
@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Opening {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idOpening;
    private String name;

    @ManyToOne
    @JoinColumn(name = "idAnime")
    private Anime anime;

    public Opening(String name, Anime anime) {
        this.name = name;
        this.anime = anime;
    }
}
```

#### Repositorios

Un paquete de interfaces repository en una aplicación web de Spring Boot sirve para proporcionar una capa de abstracción entre la aplicación y la base de datos. Las interfaces repository definen los métodos que se utilizan para acceder a los datos de la base de datos, pero no proporcionan ninguna implementación específica.

Las interfaces repository se utilizan en las aplicaciones web de Spring Boot para las siguientes tareas:

* **Estandarización del acceso a datos:** Las interfaces repository estandarizan el acceso a datos, lo que facilita el mantenimiento de la aplicación.
* **Inyección de dependencias:** Las interfaces repository se pueden inyectar en las clases de la aplicación, lo que facilita la separación de la lógica de la aplicación de la lógica de acceso a datos.
* **Testabilidad:** Las interfaces repository son fáciles de probar, lo que facilita la verificación del correcto funcionamiento de la aplicación.

Por ejemplo, si una aplicación web tiene una tabla de usuarios, la interfaz repository correspondiente podría definir los siguientes métodos:

```
public User findByUsername(String username);
public List<User> findAll();
public void save(User user);
public void delete(User user);
```

Esta interfaz podría implementarse utilizando una variedad de tecnologías, como JPA, Hibernate o JDBC.

En general, los paquetes de interfaces repository son una parte importante de las aplicaciones web de Spring Boot. Estos paquetes sirven para proporcionar una capa de abstracción entre la aplicación y la base de datos, y se utilizan en una variedad de tareas, como la estandarización del acceso a datos, la inyección de dependencias y la testabilidad.

Aquí hay algunos ejemplos específicos de cómo se pueden utilizar las interfaces repository en las aplicaciones web de Spring Boot:

* **Para crear una aplicación web con una base de datos relacional, se puede utilizar una interfaz repository para proporcionar métodos para acceder a los datos de la base de datos.**
* **Para crear una aplicación web con una base de datos NoSQL, se puede utilizar una interfaz repository para proporcionar métodos para acceder a los datos de la base de datos.**
* **Para crear una aplicación web con un servicio de datos en la nube, se puede utilizar una interfaz repository para proporcionar métodos para acceder a los datos del servicio de datos.**

##### Anime

```java
public interface AnimeRepository extends JpaRepository<Anime, Long> {
}
```

##### Ending

```java
public interface EndingRepository extends JpaRepository<Ending, Long> {
}
```

##### Genre

```java
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
```

##### Opening

```java
public interface OpeningRepository extends JpaRepository<Opening, Long> {
}
```

#### Servicio

Un paquete de clases service en una aplicación web de Spring Boot sirve para proporcionar una capa de lógica de negocio entre la capa de presentación y la capa de acceso a datos. Las clases service implementan la lógica de negocio de la aplicación, como la creación, la actualización, la eliminación y la consulta de datos.

Las clases service se utilizan en las aplicaciones web de Spring Boot para las siguientes tareas:

* **Aislamiento de la lógica de negocio:** Las clases service aislan la lógica de negocio de la lógica de presentación y acceso a datos, lo que facilita el mantenimiento de la aplicación.
* **Inyección de dependencias:** Las clases service se pueden inyectar en las clases de la aplicación, lo que facilita la separación de la lógica de negocio de la lógica de presentación y acceso a datos.
* **Testabilidad:** Las clases service son fáciles de probar, lo que facilita la verificación del correcto funcionamiento de la aplicación.

Por ejemplo, si una aplicación web tiene una tabla de usuarios, la clase service correspondiente podría implementar los siguientes métodos:

```
public User createUser(User user);
public User updateUser(User user);
public void deleteUser(User user);
public User findUserByUsername(String username);
```

Esta clase podría utilizarse para implementar la lógica de negocio para crear, actualizar, eliminar y consultar usuarios.

En general, los paquetes de clases service son una parte importante de las aplicaciones web de Spring Boot. Estos paquetes sirven para proporcionar una capa de lógica de negocio entre la capa de presentación y la capa de acceso a datos, y se utilizan en una variedad de tareas, como el aislamiento de la lógica de negocio, la inyección de dependencias y la testabilidad.

Aquí hay algunos ejemplos específicos de cómo se pueden utilizar las clases service en las aplicaciones web de Spring Boot:

* **Para crear una aplicación web con una lógica de negocio compleja, se puede utilizar una clase service para implementar la lógica de negocio.**
* **Para crear una aplicación web con una lógica de negocio que dependa de datos de la base de datos, se puede utilizar una clase service para acceder a los datos de la base de datos.**
* **Para crear una aplicación web con una lógica de negocio que dependa de servicios externos, se puede utilizar una clase service para acceder a los servicios externos.**

##### Anime

```java
@Service
public class AnimeService {
    @Autowired
    private AnimeRepository repositorio;

    public List<Anime> getAll() {
        return repositorio.findAll();
    }

    public Anime add(Anime anime) {
        return repositorio.save(anime);
    }

    public void delete(Long id) {
        repositorio.deleteById(id);
    }

    public Anime getById(Long id) {
        List<Anime> animes = repositorio.findById(id).stream().toList();
        return animes.get(0);
    }
}
```

##### Ending

```java
@Service
public class EndingService {
    @Autowired
    private EndingRepository repositorio;

    public List<Ending> getAll() {
        return repositorio.findAll();
    }

    public Ending add(Ending ending) {
        return repositorio.save(ending);
    }

    public void delete(Long id) {
        repositorio.deleteById(id);
    }
}
```

##### Genre

```java
@Service
public class GenreService {
    @Autowired
    private GenreRepository repositorio;

    public List<Genre> getAll() {
        return repositorio.findAll();
    }

    public Genre add(Genre genre) {
        return repositorio.save(genre);
    }

    public void delete(Long id) {
        repositorio.deleteById(id);
    }

    public Genre getById(Long id) {
        List<Genre> genres = repositorio.findById(id).stream().toList();
        return genres.get(0);
    }
}

```

##### Opening

```java
@Service
public class OpeningService {
    @Autowired
    private OpeningRepository repositorio;

    public List<Opening> getAll() {
        return repositorio.findAll();
    }

    public Opening add(Opening opening) {
        return repositorio.save(opening);
    }

    public void delete(Long id) {
        repositorio.deleteById(id);
    }
}
```

#### Controlador

Un paquete de clases controller en una aplicación web de Spring Boot sirve para proporcionar una capa de comunicación entre la aplicación y el usuario. Las clases controller reciben las peticiones del usuario, las procesan y generan una respuesta.

Las clases controller se utilizan en las aplicaciones web de Spring Boot para las siguientes tareas:

* **Recibir peticiones del usuario:** Las clases controller reciben las peticiones del usuario a través de la API REST de la aplicación.
* **Procesar peticiones del usuario:** Las clases controller procesan las peticiones del usuario utilizando la lógica de negocio de la aplicación.
* **Generar respuestas:** Las clases controller generan respuestas al usuario utilizando el motor de plantillas de la aplicación.

Por ejemplo, si una aplicación web tiene una página web para crear usuarios, la clase controller correspondiente podría tener los siguientes métodos:

```
@PostMapping("/users")
public ResponseEntity<User> createUser(@RequestBody User user) {
    User createdUser = userService.createUser(user);
    return ResponseEntity.ok(createdUser);
}
```

Este método recibe una petición HTTP POST de la página web para crear un usuario. El método utiliza la clase service para crear el usuario y generar una respuesta al usuario.

En general, los paquetes de clases controller son una parte importante de las aplicaciones web de Spring Boot. Estos paquetes sirven para proporcionar una capa de comunicación entre la aplicación y el usuario, y se utilizan en una variedad de tareas, como la recepción de peticiones del usuario, el procesamiento de peticiones del usuario y la generación de respuestas.

Aquí hay algunos ejemplos específicos de cómo se pueden utilizar las clases controller en las aplicaciones web de Spring Boot:

* **Para crear una aplicación web con una API REST, se puede utilizar una clase controller para cada recurso de la API.**
* **Para crear una aplicación web con una interfaz de usuario web, se puede utilizar una clase controller para cada página web de la aplicación.**
* **Para crear una aplicación web con una interfaz de usuario móvil, se puede utilizar una clase controller para cada pantalla de la aplicación.**

```java
@Controller
@RequestMapping("api/v2/anime")
public class AnimeController {
    @Autowired
    private AnimeService animeService;

    @Autowired
    private OpeningService openingService;

    @Autowired
    private EndingService endingService;

    @Autowired
    private GenreService genreService;

    @RequestMapping({"", "/", "index"})
    public String inicio(Model model) {
        List<Anime> animes = animeService.getAll();
        model.addAttribute("animes", animes);
        model.addAttribute("genres", genreService.getAll());
        model.addAttribute("openings", openingService.getAll());
        model.addAttribute("endings", endingService.getAll());
        return "index";
    }
}
```

#### Vista

```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>AnimeTracker</title>
</head>
<body>
<header>
    <a th:href="@{api/v1/anime}">
        <h1>AnimeTracker</h1>
    </a>
</header>

<div>
    <nav>
        <a href="#">Home</a>
        <a href="#">Search</a>
        <a href="#">Setting</a>
    </nav>
</div>

<main>
    <div>
        <div>
            <h3>List of Animes</h3>

            <div th:if="${animes == null}">
                <p>Empty</p>
            </div>

            <div th:if="${!animes.isEmpty()}">
                <div th:each="currentAnime : ${animes}">
                    <p th:text="${currentAnime.name}"></p>
                    <p th:text="${currentAnime.nameJapanese}"></p>
                    <img th:src="${currentAnime.image}" th:alt="${currentAnime.name}">
                    <p th:text="${currentAnime.synopsis}"></p>

                    <div th:each="opening : ${openings}">
                        <p th:text="${opening.name}"></p>
                    </div>

                    <div th:each="ending : ${endings}">
                        <p th:text="${ending.name}"></p>
                    </div>

                    <div th:each="genre : ${genres}">
                        <p th:text="${genre.name}"></p>
                    </div>

                    <a href="#">Edit</a>
                    <a href="#">Delete</a>
                </div>

            </div>
        </div>
    </div>
</main>


</body>
</html>
```

### Configuracion

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.1.5</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.api</groupId>
    <artifactId>CRUD</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>CRUD</name>
    <description>CRUD</description>
    <properties>
        <java.version>17</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <image>
                        <builder>paketobuildpacks/builder-jammy-base:latest</builder>
                    </image>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
        </plugins>
    </build>

</project>
```
