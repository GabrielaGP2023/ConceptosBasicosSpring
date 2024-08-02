package com.corenetworks.modelo.ejercicio3;

import org.springframework.stereotype.Component;

@Component("ap")
public class AccesoProduccion implements IDAO {

	@Override
	public String insertar(Cliente c) {
		// TODO Auto-generated method stub
		return "Se ha insertado en la BBDD de produccion el cliente con nif " + c.getNumNIF();
	}

}
