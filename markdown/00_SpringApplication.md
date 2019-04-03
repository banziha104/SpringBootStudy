# 스프링 부트 활용

```java

@SpringBootApplication
public class Application {
    public static void main(String[] args){
        
        // Static Method를 이용하여 접근하는 코드
        SpringApplication.run(Application.class, args);
        
        // 인스턴스를 생성하여 접근하는 코드
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
    }
}


```