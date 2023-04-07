package autowired.byname;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBook {
    @Bean
    public Book getbook(){

        return new Book(12,"geetanjali",1500);
    }
    @Bean
    public Category getC(){

        return new Category("novel");
    }
}
