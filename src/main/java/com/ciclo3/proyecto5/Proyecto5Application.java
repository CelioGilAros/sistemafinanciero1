package com.ciclo3.proyecto5;

import com.ciclo3.proyecto5.vista.viewusuarios;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Proyecto5Application {

    public static void main(String[] args) {

        SpringApplication.run(Proyecto5Application.class, args);
        viewusuarios per1=new viewusuarios();
        viewusuarios per2=new viewusuarios();
        per1.mostrarusuarios("123456", "Luisa");
        per2.mostrarusuarios("7894", "Juan");
    }
}
