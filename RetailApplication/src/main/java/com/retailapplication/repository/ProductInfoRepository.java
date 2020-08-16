package com.retailapplication.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.retailapplication.model.ProductInfo;


@Repository
public interface ProductInfoRepository extends MongoRepository<ProductInfo, Integer> {
	public ProductInfo findById(int id);
}
