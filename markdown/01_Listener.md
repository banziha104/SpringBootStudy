# 리스너 사용

1. 리스너 만들기

```java

/***
 * ApplicationListener : 리스너 객체
 * ApplicationStartingEvent : 리스너 종류
 */
public class SampleListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        System.out.println("=======================");
        System.out.println("Application is Starting");
        System.out.println("=======================");
    }
}

```

2. 리스너 적용하기 

```java
package lee.youngjoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
        SpringApplication app = new SpringApplication(Application.class);
        app.addListeners(new SampleListener()); // 리스너 적용
        app.run(args);

    }
}

```