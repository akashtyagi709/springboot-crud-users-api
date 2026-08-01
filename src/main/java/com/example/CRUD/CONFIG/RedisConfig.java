package com.example.CRUD.CONFIG;

import com.example.CRUD.ENTITY.Employee;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.JacksonJsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;

import java.util.List;

@Configuration
@EnableCaching
public class RedisConfig {


    @Bean
    public RedisCacheManager cacheManager(RedisConnectionFactory connectionFactory) {

        JacksonJsonRedisSerializer<Employee> employeeSerializer =
                new JacksonJsonRedisSerializer<>(Employee.class);


        JacksonJsonRedisSerializer<List> listSerializer =
                new JacksonJsonRedisSerializer<>(List.class);


        RedisCacheConfiguration employeeCache =
                RedisCacheConfiguration.defaultCacheConfig()
                        .serializeValuesWith(
                                RedisSerializationContext.SerializationPair
                                        .fromSerializer(employeeSerializer)
                        );


        RedisCacheConfiguration employeesCache =
                RedisCacheConfiguration.defaultCacheConfig()
                        .serializeValuesWith(
                                RedisSerializationContext.SerializationPair
                                        .fromSerializer(listSerializer)
                        );


        return RedisCacheManager.builder(connectionFactory)
                .withCacheConfiguration("employee", employeeCache)
                .withCacheConfiguration("employees", employeesCache)
                .build();
    }
}