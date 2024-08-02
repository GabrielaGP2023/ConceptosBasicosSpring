package com.corenetworks;

import com.corenetworks.modelo.Saludo;
import com.corenetworks.modelo.ejercicio1.Conductor;
import com.corenetworks.modelo.ejercicio2.CocheTaller;
import com.corenetworks.modelo.ejercicio2.SeguroCoche;
import com.corenetworks.modelo.ejercicio2.TallerMecanica;
import com.corenetworks.modelo.ejercicio2.TallerPintura;
import com.corenetworks.modelo.ejercicio3.Cliente;
import com.corenetworks.modelo.ejercicio3.ClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConceptosbasicosApplication implements CommandLineRunner {
	@Autowired
	 private Saludo s2;

	@Autowired
	private Conductor c2;

	@Autowired
	private SeguroCoche s1;

	@Autowired
	private CocheTaller cTaller;
	@Autowired
	private Cliente c1;
	@Autowired
	private ClienteDAO cDao2;

	public static void main(String[] args) {

		SpringApplication.run(ConceptosbasicosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Saludo s2 = new Saludo("Buenos dias");
//		s2.setMensaje("Buenos días");
		System.out.println(s2.getMensaje());
//		IVehiculo c1 = new Coche(35);
//        Conductor c2 = new Conductor(c1);
//		((Coche) c2.getVehiculo()).setDeposito(35);
      	System.out.println(c2.conducir());
		  //Ejercicio 2


		System.out.println(s1.toString());
		System.out.println(s1.reparar(cTaller));

		System.out.println("---Ejercicio 3 ---");
		System.out.println(cDao2.insertar(c1));




	}


}
