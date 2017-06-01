package com.joker.wechat.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;









import com.joker.wechat.model.entity.Product;
import com.joker.wechat.service.IProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Resource
	private IProductService productService;
	
	@RequestMapping("list")
	public void list(HttpServletRequest request,Model model){
		
		String a = request.getParameter("type");
		
		Integer type = Integer.parseInt(a);
		List<Product> list = this.productService.list(type);
		model.addAttribute("list", list);
	}
	
	@RequestMapping("detail")
	public void detail(){
		
	}

}
