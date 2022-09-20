package com.delety.forum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){
        return args ->{
            User hugo = new User(
                    1,
                    "Hugo",
                    "hugo.nobre012@gmail.com",
                    "teste123");

            userRepository.saveAll(
                    List.of(hugo));
        };
    }
}
