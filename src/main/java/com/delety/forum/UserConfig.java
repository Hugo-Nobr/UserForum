package com.delety.forum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.util.List;


@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository, PublicationRepository publicationRepository){
        return args ->{
            User hugo = new User(
                    1,
                    "Hugo",
                    "hugo.nobre012@gmail.com",
                    "teste123");

            Publication p1 = new Publication(
                    null,
                    hugo,
                    Instant.parse("2020-10-10T14:30:15Z")
            );

            userRepository.saveAll(List.of(hugo));
            publicationRepository.saveAll(List.of(p1));
        };
    }
}
