package lee.youngjoon;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

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
