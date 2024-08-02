package com.corenetworks.modelo.ejercicio3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public  class Cliente {
	
	private String numNIF;
	private String nombre;
	

}
