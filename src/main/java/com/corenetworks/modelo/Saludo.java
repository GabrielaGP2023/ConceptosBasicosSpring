package com.corenetworks.modelo;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component("s2")
public class Saludo {
    @Value("Buenos dias")
    private String mensaje;

}
