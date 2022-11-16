package com.ecommerce.sportWear.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.sportWear.model.Producto;
import com.ecommerce.sportWear.service.ProductoService;

@RequestMapping("/api/productos")
@RestController
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping
	public ResponseEntity<?> consultarProductoTodos(){
		return ResponseEntity.ok(productoService.consultarProductosTodos());
			
	}
	
	@PostMapping
	public ResponseEntity<?> insertarProducto(@RequestBody Producto producto){
		return ResponseEntity.status(HttpStatus.CREATED).body(productoService.crearProducto(producto));
		
	}
}
