# Arguments 로그 출력 

- 생성자를 통한 로그 출력 

```java

@Component
public class ArgsTest {
    public ArgsTest(ApplicationArguments arguments){
        System.out.println("foo: "+arguments.containsOption("foo"));
        System.out.println("bar: "+arguments.containsOption("bar"));
    }
}

```

- ApplicationRunner 사용

```java

@Component
public class ArgsTest implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments arguments) throws Exception {
        System.out.println("foo: "+arguments.containsOption("foo"));
        System.out.println("bar: "+arguments.containsOption("bar"));
    }
}

```

- CommandLineRunner 사용

```java

@Component
public class ArgsTest implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Arrays
                .stream(args)
                .filter(s -> s.equals("foo") && s.equals("bar"))
                .forEach(System.out::println);
                
    }

}

```