package config;

import hu.iit.me.dao.JobDAO;
import hu.iit.me.dao.JobDAOImpl;
import hu.iit.me.service.JobService;
import hu.iit.me.service.JobServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JobMethodContext {

    @Bean
    public JobService jobService() {return new JobServiceImpl();
    }

    @Bean
    public JobDAO jobDAO() {return new JobDAOImpl();
    }


}
