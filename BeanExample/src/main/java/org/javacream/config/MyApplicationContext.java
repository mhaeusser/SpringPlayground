package org.javacream.config;

import org.javacream.keygeneration.business.RandomKeyGeneratorImpl;
import org.javacream.main.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@ComponentScan("org.integrata")
@Configuration
@PropertySource("classpath:prod.properties")
public class MyApplicationContext {

    @Bean
    public static PropertySourcesPlaceholderConfigurer c() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean(name = "randomKeyGeneratorImpl")
    public RandomKeyGeneratorImpl getRandomKeyGeneratorImpl() {
        return new RandomKeyGeneratorImpl();
    }

    @Bean(name = "benutzer")
    public User getBenutzer() {
        return new User();
    }
}
/*
 * <bean id="mapBooksService" class="org.javacream.books.warehouse.business.MapBooksService"> <property
 * name="keyGenerator" ref="randomKeyGeneratorImpl" /> <property name="storeService"> <bean
 * class="org.javacream.store.test.StoreServiceDummy" /> </property> </bean>
 *
 * <bean id="randomKeyGeneratorImpl" class="org.javacream.keygeneration.business.RandomKeyGeneratorImpl"> <property
 * name="countryCode" value="-de" /> <property name="prefiX" value="TEST" /> </bean>
 */
