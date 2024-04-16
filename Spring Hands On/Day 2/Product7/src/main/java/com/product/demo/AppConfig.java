package com.product.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.product.demo")
public class AppConfig {
	 
    @Bean(initMethod = "openFile", destroyMethod = "closeFile")
    public Cashier cashier() {
        Cashier cashier = new Cashier();
        cashier.setFileName("checkout");
        cashier.setPath("D:\\STS\\Product5\\sxcd");
        return cashier;
    }

    @Bean
    @Scope("prototype")
    public ShoppingCart shoppingCart() {
        return new ShoppingCart();
    }

    @Bean
    public Battery battery() {
        return new Battery("1234", "AA Battery", 20.0, true);
    }

    @Bean
    public Disc disc() {
        return new Disc("5678", "DVD-RW", 40.0, 700);
    }

}
