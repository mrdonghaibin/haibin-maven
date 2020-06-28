package com.pingan.haibin.action;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;






@RestController
public class Test2Action {
	
/*	  @Resource
	   private Jedis jedis;
	   
	    @RequestMapping("/jedis")
	    public String jedis() {
	    	String name = jedis.get("name");
	        return name;
	    }*/
	  
    @RequestMapping("/hello")
    public String sayHello() {
        return "hello Jenkins tttyU3383jfVersionH17";
    }

    @RequestMapping("/hello2")
    public String sayHello2() {
        return "hello Jenkins tttyU3383jfVerlsionH1h";
    }

    @RequestMapping("/404.do")
    public Object error_404() {
        System.out.println("djjjj55");
        return "你要找的页面，被lison偷吃了！";
    }
    
	
    
}
