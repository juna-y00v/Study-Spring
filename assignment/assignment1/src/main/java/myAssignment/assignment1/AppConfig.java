package myAssignment.assignment1;


import jakarta.persistence.EntityManager;
import myAssignment.assignment1.repository.JpaMemberRepository;
import myAssignment.assignment1.repository.MemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

    private final DataSource dataSource;
    private final EntityManager em;

    public AppConfig(DataSource dataSource, EntityManager em) {
        this.dataSource = dataSource;
        this.em = em;
    }

    @Bean
    public MemberRepository memberRepository() {
        return new JpaMemberRepository(em);
    }
}
