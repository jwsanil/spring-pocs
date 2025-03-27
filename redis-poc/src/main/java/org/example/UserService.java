package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
public class UserService {

    @Autowired
    private RedisTemplate<String, User> redisTemplate;


    public User getUserById(String id) {
        User user = redisTemplate.opsForValue().get(id);
        if (user != null) {
            System.out.println("fetching from cache");
            return user;
        }

       user = new User();
        user.setId("1");
        user.setUsername("Anil");
        redisTemplate.opsForValue().set(id,user, Duration.ofMinutes(3));
        return user;
    }





}
