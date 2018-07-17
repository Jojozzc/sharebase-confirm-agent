package com.kele.util;

import redis.clients.jedis.JedisPool;

import java.io.Serializable;

public class RedisUtil {
    private JedisPool jedisPool;

    public static RedisUtil getInstance() {
        return instance;
    }

    private static RedisUtil instance = new RedisUtil();
    private RedisUtil(){
        jedisPool = new JedisPool("localhost", 6379);
        System.out.println("redis pool ok");
    }
    public JedisPool getJedisPool(){
        return jedisPool;
    }

}
