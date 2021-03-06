package lee.youngjoon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/***
 * ApplicationListener : 리스너 객체
 * ApplicationStartingEvent : 리스너 종류
 */
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
