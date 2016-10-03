package io.benwilcock.productcommand.configuration;

import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;

import javax.sql.DataSource;

/**
 * Created by benwilcock on 07/09/2016.
 *
 * You don't actually need this class!
 *
 * SpringBoot and the Spring Cloud Connectors can automatically create the necessary beans for you.
 * I've just included it here so that you can take control of the process, naming the beans etc.
 */
public class CloudConfiguration extends AbstractCloudConfig {

    //Connect to the only available database service
    @Bean
    public MongoDbFactory dataSource() {
        return connectionFactory().mongoDbFactory();
    }

    //Connect to the only available RabbitMQ service
    @Bean
    public ConnectionFactory rabbitFactory() {
        return connectionFactory().rabbitConnectionFactory();
    }

}