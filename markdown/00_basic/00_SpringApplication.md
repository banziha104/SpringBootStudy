# Application 객체 활용

- 기본 사용법 

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

- ## 배너 커스터마이징 
- > 시작시 배너를 커스터마이징 할 수 있음

```java
public static void main(String[] args) {
	SpringApplication app = new SpringApplication(MySpringConfiguration.class);
	app.setBannerMode(Banner.Mode.OFF);
	app.run(args);
}
```

