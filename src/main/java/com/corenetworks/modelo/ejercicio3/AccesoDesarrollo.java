package com.corenetworks.modelo.ejercicio3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("ad")
public class AccesoDesarrollo implements IDAO {

	@Override
	public String insertar(Cliente c) {
		// TODO Auto-generated method stub
		return "Se ha insertado en la BBDD de desarrollo el cliente con nif " + c.getNumNIF();
	}

}
