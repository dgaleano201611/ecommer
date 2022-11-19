package com.ecommerce.sportWear.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.sportWear.model.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, Long> {

}
