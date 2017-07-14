package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.annotation.Annotation01;

/**
 * 控制
* @ClassName: UserController
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Mr.Dong
* @date 2017年7月14日 下午5:24:12
 */
@Controller
public class UserController {

	@Annotation01
	@RequestMapping("/yes")  
    @ResponseBody 
	public String  userAop(){
		System.out.println("用了切面的方法来了");
		return "userAop";
	}
	
	@RequestMapping("/no")  
    @ResponseBody 
	public String noUserAop(){
		System.out.println("没有用了切面的方法来了");
		return "noUserAop";
	}
}
