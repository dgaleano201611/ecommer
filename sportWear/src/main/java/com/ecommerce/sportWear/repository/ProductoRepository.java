package com.ecommerce.sportWear.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ecommerce.sportWear.model.Producto;

public interface ProductoRepository extends MongoRepository<Producto, Long> {
	
}
