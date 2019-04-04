package lee.youngjoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
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
