# 외부 설정

- properties : 스프링 부트가 실행할떄 자동으로 로딩하는 파일. 키밸류 형태로 저장

```java
public class SampleListener implements ApplicationListener<ApplicationStartingEvent> {
    @Value("${lee.name}") // application.properties 에서 설정된 키를 이용해 밸류를 주입함
    private String name;
    
    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        System.out.println("=======================");
        System.out.println(name);
        System.out.println("=======================");
    }
}
```