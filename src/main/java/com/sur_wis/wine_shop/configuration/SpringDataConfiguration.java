package com.sur_wis.wine_shop.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories( basePackages = "com.sur_wis.wine_shop.model.repository" )
@EntityScan( basePackages = "com.sur_wis.wine_shop.model.entity" )
public class SpringDataConfiguration {
//    @Bean
//    public DataSource getDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/wine_shop");
//        dataSource.setUsername("root");
//        dataSource.setPassword("HelloWorld100%");
//        return dataSource;
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        LocalContainerEntityManagerFactoryBean entityManager = new LocalContainerEntityManagerFactoryBean();
//        entityManager.setDataSource(getDataSource());
//        entityManager.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//        entityManager.setPackagesToScan("pl.samouczekprogramisty.pogodynka.datavault.model");
//
//        Properties jpaProperties = new Properties();
//        jpaProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
//        jpaProperties.setProperty("hibernate.show_sql", "true");
//        jpaProperties.setProperty("hibernate.format_sql", "true");
//        jpaProperties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
//        jpaProperties.setProperty("jadira.usertype.autoRegisterUserTypes", "true");
//
//        entityManager.setJpaProperties(jpaProperties);
//
//        return entityManager;
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(entityManagerFactory);
//
//        return transactionManager;
//    }
//
//    @Bean
//    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
//        return new PersistenceExceptionTranslationPostProcessor();
//    }
}

