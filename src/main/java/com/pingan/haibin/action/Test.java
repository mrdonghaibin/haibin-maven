package com.pingan.haibin.action;

import java.util.Arrays;
import java.util.List;




public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String data = "59399.5";
		
		 //判断data是否为数值型
        boolean isNum = data.toString().matches("^(-?\\d+)(\\.\\d+)?$");
        //判断data是否为整数（小数部分是否为0）
        boolean isInteger=data.toString().matches("^[-\\+]?[\\d]*$");


        System.out.println("1166MastertttV201920 ty jdd isNum:"+isNum+",isInteger:"+isInteger);
        
        
        String [] str = {"beijing","tianjin","hsaibin"};
        List list = Arrays.asList(str);
        System.out.println(list);
        System.out.println("beijing:"+list.contains("beijing2"));
        if(list.contains("beijing")) {
        	
        }
	}

}
