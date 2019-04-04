package lee.youngjoon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HolomanConfigurations {
    @Bean
    public Holoman holoman(){
        return new Holoman();
    }
}
