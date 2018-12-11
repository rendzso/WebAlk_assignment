package config;

import hu.iit.me.controller.HRController;
import hu.iit.me.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan
public class HRContext {

    private final HRService hrService;

    @Autowired
    public HRContext(HRService hrService) {
        this.hrService = hrService;
    }

    @Bean
    public HRController hrController() {return new HRController(hrService);}


}
