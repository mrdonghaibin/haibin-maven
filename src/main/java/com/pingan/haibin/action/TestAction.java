package com.pingan.haibin.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class TestAction {
	

	  
    @RequestMapping("/hello")
    public String sayHello() {

        System.out.println("117771111");
        return "hello zhangsan V0.2 VMaster6 999 Merge haibin SSHcommit gitHub 549";


    }
    
    
    @RequestMapping("/404.do")
    public Object error_404() {
        return "你要找的页面，被lison偷吃了！";
    }
    
	
    
}
