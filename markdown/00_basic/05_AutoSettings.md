# 자동 세팅

- @EnableAutoConfiguration (@SpringBootApplication 안에 있음)
- 빈이 읽히는 순선
    1. ComponentScan
    2. @EnableAutoCongurations
- @ComponentScan : 아래 어노테이션이 달린 객체 Bean으로 변경시켜주는 일을함
    - @Component
    - @Configurations
    - @Repository
    - @Service
    - @Controller
    - @RestController
    
- @EnableAutoConfiguration : 하단의 spring.factories에 담겨있는 객체를 bean으로 만들어줌
    - spring.factories 
    - @Configurations
    - @ConditionalOnXxxYyyZzz

```java

//@SpringBootApplication 
@ComponentScan
@EnableAutoConfiguration 
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
        SpringApplication app = new SpringApplication(Application.class);
        app.setWebApplicationType(WebApplicationType.NONE);
//        app.setWebApplicationType(WebApplicationType.SERVLET); // 서블릿이 있는 경우 서블릿이 우선
//        app.setWebApplicationType(WebApplicationType.REACTIVE); //
        app.addListeners(new SampleListener()); // 리스너 적용
        app.run(args);
    }
}
```

- 세팅 만들기
    1. 세팅파일 만들기
    
    ```java
    @Configuration
    public class HolomanConfigurations {
        @Bean
        public Holoman holoman(){
            return new Holoman();
        }
    ```

    2.spring.factories에 등록
    ```java
    
    org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
      lee.youngjoon.HolomanConfigurations
    
    ```
    
