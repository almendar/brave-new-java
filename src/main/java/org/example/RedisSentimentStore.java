package org.example;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.Map;

public final class RedisSentimentStore implements UnpackedEmbeddings, AutoCloseable {

    private JedisPool jedisPool;

    public RedisSentimentStore(String server, int port) {
        this.jedisPool = new JedisPool(server, port);
    }

    @Override
    public float[] lookUpWordSentiment(String word) {

//        JedisPool pool = new JedisPool("localhost", 6379);

        try (Jedis jedis = this.jedisPool.getResource()) {
            // Store & Retrieve a simple string
            jedis.set("foo", "bar");
            System.out.println(jedis.get("foo")); // prints bar

            // Store & Retrieve a HashMap
            Map<String, String> hash = new HashMap<>();
            hash.put("name", "John");
            hash.put("surname", "Smith");
            hash.put("company", "Redis");
            hash.put("age", "29");
            jedis.hset("user-session:123", hash);
            System.out.println(jedis.hgetAll("user-session:123"));
            return new float[0];
        }
    }

    @Override
    public void close() throws Exception {
        this.jedisPool.close();
    }
}
