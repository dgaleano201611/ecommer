package com.ecommerce.sportWear.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Document
public class Producto {
	
	@Id
	private Long idProducto;
	private String nombre;
	private String descripcion;
	private String imagen;
	private Long precio;
	private Integer cantidad;
	private Integer codigo;
	
		
}
