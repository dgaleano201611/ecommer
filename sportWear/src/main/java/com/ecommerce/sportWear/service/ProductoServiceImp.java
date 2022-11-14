package com.ecommerce.sportWear.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.sportWear.model.Producto;
import com.ecommerce.sportWear.repository.ProductoRepository;

@Service
public class ProductoServiceImp implements ProductoService {

	@Autowired
	ProductoRepository repositorio;
		
	@Override
	public List<Producto> consultarProductosTodos() {
		return repositorio.findAll();
	}

	@Override
	public Optional<Producto> consultarProductoPorId(Integer idProducto) {
		return repositorio.findById(idProducto);
	}

	@Override
	public Producto crearProducto(Producto producto) {
		return repositorio.insert(producto);
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		return repositorio.save(producto);
	}

	@Override
	public void eliminarProducto(Integer idProducto) {
		repositorio.deleteById(idProducto);
	}

}
