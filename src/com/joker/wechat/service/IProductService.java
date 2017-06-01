package com.joker.wechat.service;

import java.util.List;

import com.joker.wechat.model.entity.Product;

public interface IProductService {
	
	List<Product> list(Integer type);

}
