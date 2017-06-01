package com.joker.wechat.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.joker.wechat.dao.ProductDao;
import com.joker.wechat.model.entity.Product;
import com.joker.wechat.service.IProductService;

@Service("productService")
public class ProductService implements IProductService {
	
	@Resource
	private ProductDao productDao;

	@Override
	public List<Product> list(Integer type) {
		return this.productDao.list(type);
	}

}
