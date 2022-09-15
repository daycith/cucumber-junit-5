package dg.cucumberjunit;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class SpringTestConfig {

    /*
    Actually the tests work with relative without creating this bean.
     */
//    @Bean
//    public TestRestTemplate restTemplate(){
//        return new TestRestTemplate();
//    }
}
