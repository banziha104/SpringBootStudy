# 의존성 관리

- 버전을 명시하지 않았을 때 (스프링 부트에서 관리하는 경우): 스프링 부트에서 버전을 지정 (`spring-boot-dependencies` 에 지정되어 있음  )
- 버전을 명시하지 않았을 때 (스프링 부트에서 관리하지 않는 경우): 버전을 명시해야함
- 버전을 명시하는 게 베스트

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>lee.youngjoon</groupId>
    <artifactId>mavenboot</artifactId>
    <version>1.0-SNAPSHOT</version>
    <!-- Inherit defaults from Spring Boot -->
    <!-- parent의 parent에 버전이 있음    -->
    
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.1.3.RELEASE</version>
    </parent>

    <!-- Add typical dependencies for a web application -->
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>

    <!-- Package as an executable jar -->
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

</project>
```