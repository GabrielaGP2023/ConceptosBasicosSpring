package com.corenetworks.modelo.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Conductor {
    @Autowired
    private IVehiculo vehiculo;

    public String conducir(){

        return vehiculo.moverse();
    }


}
