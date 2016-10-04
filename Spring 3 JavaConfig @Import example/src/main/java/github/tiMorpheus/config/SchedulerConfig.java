package github.tiMorpheus.config;

import github.tiMorpheus.core.SchedulerBo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchedulerConfig {

    @Bean(name = "scheduler")
    public SchedulerBo schedulerBo(){
        return new SchedulerBo();
    }
}
