package com.example.lab6.BAI2;

import com.example.lab6.BAI1.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("singleton")
    //khởi tạo duy nhất một instance cho bean đó và nó được sử dụng trong tất cả các yêu cầu đến bean này.
    public Product firstProduct() {
        Product p = new Product();
        p.setId("P01");
        p.setName("Fridge");
        p.setDescription("Cool");
        return p;
    }

    @Bean
    @Scope("prototype")
    //trả về các instance khác nhau mỗi khi có một yêu mới sử dụng chúng đến IoC container
    public Product secondProduct() {
        return new Product("P02", "Air conditioner", "2nd generation");
    }

    @Bean
    public Product thirdProduct() {
        return new Product("P03", "Fan MU", "inside the cave");
    }
}
