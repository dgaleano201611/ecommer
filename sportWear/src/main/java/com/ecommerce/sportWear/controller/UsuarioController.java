package com.ecommerce.sportWear.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.sportWear.model.Usuario;
import com.ecommerce.sportWear.service.UsuarioService;

@RequestMapping("/api/usuarios")
@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<?> consultarTodosLosUsuarios(){
		return ResponseEntity.ok(usuarioService.mostrarTodosLosUsuarios());
		
	}
	
	
	@PostMapping
	public ResponseEntity<?> ingresarUsuarioNuevo(@RequestBody Usuario usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.crearUsuario(usuario));
	}
	
	@GetMapping("/{id}") 
	public ResponseEntity<?> consultarUsuarioPorId(@PathVariable Long id){
		Optional<Usuario> respuesta = usuarioService.consultarUsuarioPorId(id);
		if (!respuesta.isPresent()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(respuesta.get());	
	}
 	
	@PutMapping("/{id}")
	public ResponseEntity<?> editarProductoPorId(@PathVariable Long id, @RequestBody Usuario usuario){
		Optional<Usuario> respuesta = usuarioService.consultarUsuarioPorId(id);
		if (!respuesta.isPresent()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(usuarioService.editarUsuario(usuario));
		
	}
}
