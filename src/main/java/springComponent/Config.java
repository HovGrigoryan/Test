package springComponent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.File;

@Configuration
public class Config {

    @Bean
    public Logger fileLogger() {
        return new FileLogger(file());
    }

    @Bean
    public Logger consoleLogger() {
        return new ConsoleLogger();
    }

    @Bean
    public File file () {
        System.out.println("fffff");
        return new File("");
    }
}
