package com.mia.chat.cache;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.spring.cache.HazelcastCacheManager;

@Configuration
@EnableCaching
@Component
public class HazelcastConfiguration {

	@Bean
    public HazelcastCacheManager hazelcastcacheManager() throws Exception {
        return new HazelcastCacheManager(hazelcastInstance());
    }

    @Bean
    public HazelcastInstance hazelcastInstance() throws Exception {
        return Hazelcast.newHazelcastInstance();
    }
}
