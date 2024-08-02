package com.corenetworks.modelo.ejercicio2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class SeguroCoche {
	//1. Atributos
    @Autowired
	@Qualifier("tp")
	private ITaller taller;
	private String aseguradora;
	//2. M�todos
	public String reparar(CocheTaller c) {

		return taller.reparar(c);
	}

	
	//3. Constructores


	//4. Setters y Getters

	
	

}
