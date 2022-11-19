package com.ecommerce.sportWear.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.sportWear.model.Usuario;
import com.ecommerce.sportWear.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuariorepository;
	
	@Override
	public Usuario crearUsuario(Usuario usuario) {
		return usuariorepository.insert(usuario);
	}

	@Override
	public Optional<Usuario> consultarUsuarioPorId(Long idUsuario) {
		return usuariorepository.findById(idUsuario);
	}

	@Override
	public List<Usuario> mostrarTodosLosUsuarios() {
		return usuariorepository.findAll();
	}

	@Override
	public Usuario editarUsuario(Usuario usuario) {
		return usuariorepository.save(usuario);
	}

	@Override
	public void eliminarUsuario(Long idUsuario) {
		usuariorepository.deleteById(idUsuario);
	}

}
