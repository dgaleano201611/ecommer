package com.ecommerce.sportWear.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
}
