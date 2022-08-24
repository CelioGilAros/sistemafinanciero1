package com.ciclo3.proyecto5.controlador;

import com.ciclo3.proyecto5.modelo.usuarios;
import com.ciclo3.proyecto5.vista.viewusuarios;

public class usuariosController {
    private viewusuarios vista;
    private usuarios modelo;

    // constructor para iniclaizar el modelo ym la vista

    public usuariosController(usuarios modelo, viewusuarios vista){
        this.modelo=modelo;
        this.vista=vista;
    }
    public viewusuarios getVista() {
        return vista;
    }

    public void setVista(viewusuarios vista) {
        this.vista = vista;
    }

    public usuarios getModelo() {
        return modelo;
    }

    public void setModelo(usuarios modelo) {
        this.modelo = modelo;
    }
}
