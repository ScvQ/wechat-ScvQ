package com.joker.wechat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("index")
	public void index(){
	}
	
	@RequestMapping("about_us")
	public void aboutUs(){
	}
	
	@RequestMapping("sort")
	public void sort(){
	}
	
	@RequestMapping("shopcart")
	public void shopcart(){
	}
	
	@RequestMapping("me")
	public void me(){
	}
	
	
}
