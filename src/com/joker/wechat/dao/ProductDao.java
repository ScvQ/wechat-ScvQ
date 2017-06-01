package com.joker.wechat.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.joker.wechat.model.entity.Product;

@Repository("productDao")
public interface ProductDao {
	
	List<Product> list(@Param("type")Integer type);

}
