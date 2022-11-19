package com.ecommerce.sportWear.service;

import java.util.List;
import java.util.Optional;

import com.ecommerce.sportWear.model.Usuario;


public interface UsuarioService {
	
	public Usuario crearUsuario(Usuario usuario);
	public Optional<Usuario> consultarUsuarioPorId(Long idUsuario);
	public List<Usuario> mostrarTodosLosUsuarios();
	public Usuario editarUsuario(Usuario usuario);
	public void eliminarUsuario(Long idUsuario);

}
