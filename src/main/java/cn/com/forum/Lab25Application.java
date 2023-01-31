package cn.com.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class Lab25Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab25Application.class, args);
    }

}
