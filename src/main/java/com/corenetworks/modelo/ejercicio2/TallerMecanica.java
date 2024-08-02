package com.corenetworks.modelo.ejercicio2;

import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component("tm")
//@Primary
public class TallerMecanica implements ITaller {

	@Override
	public String reparar(CocheTaller c) {
		// TODO Auto-generated method stub
		return "El coche con la matricula " + c.getMatricula() + " se esta reparando en el sistema mec�nico";
	}


}
