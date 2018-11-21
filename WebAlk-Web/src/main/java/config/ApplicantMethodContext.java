package config;

import hu.iit.me.dao.ApplicantDAO;
import hu.iit.me.dao.ApplicantDAOImpl;
import hu.iit.me.service.ApplicantService;
import hu.iit.me.service.ApplicantServiceImpl;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicantMethodContext {

    @Bean
    public ApplicantService applicantService() { return new ApplicantServiceImpl();
    }

    @Bean
    @Required
    public ApplicantDAO applicantDAO() {return new ApplicantDAOImpl();
    }

}
