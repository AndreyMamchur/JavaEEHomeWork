package homework3.config;

import homework3.dao.GoodsDaoImpl;
import homework3.service.GoodsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig {
    @Bean
    public GoodsDaoImpl getGoodsDaoIml(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return new GoodsDaoImpl(dataSource);
    }

    @Bean
    public GoodsServiceImpl getGoodsServiceImpl(){
        return new GoodsServiceImpl();
    }
}
