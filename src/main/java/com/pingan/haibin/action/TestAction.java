package com.pingan.haibin.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class TestAction {
	

	  
    @RequestMapping("/hello")
    public String sayHello() {
        return "hello zhangsan V0.2 Vhaibin";
    	
    }
    
    
    @RequestMapping("/404.do")
    public Object error_404() {
        return "你要找的页面，被lison偷吃了！";
    }
    
	
    
}
