package com.rubypaper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class GetSetService  {

	  @Autowired
	  RedisTemplate<String, Object> redisTemplate;
	    
	  public void test() {
	      //hashmap같은 key value 구조
	      ValueOperations<String, Object> vop = redisTemplate.opsForValue();
	      vop.set("test1_3", "init GetSetService");
	      
	      String result = (String) vop.get("test1_3");
	      System.out.println(result);
	  }
	  
}
