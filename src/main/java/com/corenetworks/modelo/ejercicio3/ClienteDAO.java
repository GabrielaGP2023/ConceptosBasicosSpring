package com.corenetworks.modelo.ejercicio3;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Component
public class ClienteDAO {
	//1. Atributos
	@Autowired
	@Qualifier("ap")
	private IDAO conexion;
	
	//2. M�todos
	public String insertar(Cliente c) {
		return conexion.insertar(c);
	}
	

	
	

}
