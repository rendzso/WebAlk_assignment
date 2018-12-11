package config;

import hu.iit.me.service.HRService;
import hu.iit.me.service.HRServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HRMethodContext {

    @Bean
    public HRService hrService() {return new HRServiceImpl();}

}
