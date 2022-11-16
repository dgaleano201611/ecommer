package com.ecommerce.sportWear.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.sportWear.model.Producto;

@Repository
public interface ProductoRepository extends MongoRepository<Producto, Long> {
	
}
