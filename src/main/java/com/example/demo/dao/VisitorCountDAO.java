package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;

@Repository
public class VisitorCountDAO {

    @Value("${redis-host}")
    private String redisHost;

    private static final String KEY_NAME = "numberOfVisitors";
    private static final String INITIAL_VALUE = "0";

    public String getVisitCount() {
        Jedis client = getRedisClient();
        String value = client.get(KEY_NAME);
        if (value == null) {
            client.set(KEY_NAME, INITIAL_VALUE);
            return INITIAL_VALUE;
        }
        client.close();

        return value;
    }

    public void setVisitCount(String value) {
        Jedis client = getRedisClient();
        client.set(KEY_NAME, value);
        client.close();
    }

    public Jedis getRedisClient() {
        Jedis client = new Jedis(redisHost);
        return client;
    }
}
