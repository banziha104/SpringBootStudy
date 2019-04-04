
# 웹 어플리케이션 타입 설정

- Servlet : 웹 MVC가 있는 경우, 서블릿으로 구동 (REACTIVE와 같이 있는 경우에도, 서블릿이 우선 순위가 높음으로 서블릿으로 구동)
- Reactive : 플럭스가 있는 경우, Reactive로 동작 
- None : 위의 경우가 둘다 아닌 경우

```java
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
        SpringApplication app = new SpringApplication(Application.class);
        app.setWebApplicationType(WebApplicationType.SERVLET); // 서블릿이 있는 경우 서블릿이 우선
        app.setWebApplicationType(WebApplicationType.REACTIVE); //
        app.addListeners(new SampleListener()); // 리스너 적용
        app.run(args);
    }
}
```