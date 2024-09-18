# spring-boot-server-client-tutorial
This project demonstrates how to establish a server-client connection using Spring Boot. It showcases a simple RESTful API where the server provides data to the client application.

## Features

- RESTful API on the server
- Client application to consume the API
- Basic communication between server and client

## Prerequisites

- Java 11 or higher
- Maven (for dependency management)


### Server Setup

1. **Create a Spring Boot Server**:
   - Add dependencies in `pom.xml` for web and REST.

   ```xml
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-web</artifactId>
   </dependency>

@RestController
@RequestMapping("/api")
public class ServerController {
    @GetMapping("/data")
    public ResponseEntity<String> getData() {
        return ResponseEntity.ok("Hello from the server!");
    }
}

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>


2. **Create a Service to call the server**:

@Service
public class ClientService {
    private final RestTemplate restTemplate;

    @Autowired
    public ClientService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public String fetchData() {
        String serverUrl = "http://localhost:8080/api/data";
        return restTemplate.getForObject(serverUrl, String.class);
    }
}
