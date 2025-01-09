package com.rish.configuration;

import com.rish.Dao.SongDao;
import com.rish.service.SongService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:application.properties")
public class MyConfiguration {

    @Bean
    public SongDao songDao() {
        return new SongDao();
    }

    @Bean
    public SongService songService() {
        return new SongService();
    }
    @Bean
    public DBConfiguration DbConfiguration() {
        return new DBConfiguration();
    }
}
