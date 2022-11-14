package com.ecommerce.sportWear.service;

import java.util.List;
import java.util.Optional;

import com.ecommerce.sportWear.model.Producto;

public interface ProductoService {
	
	public List<Producto> consultarProductosTodos();
	public Optional<Producto> consultarProductoPorId(Integer idProducto);
	public Producto crearProducto(Producto producto);
	public Producto actualizarProducto(Producto producto);
	public void eliminarProducto(Integer idProducto);
	
}
