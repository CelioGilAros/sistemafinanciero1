package com.ciclo3.proyecto5.modelo;

public class usuarios {
    String usuario;
    String password;

    public usuarios(String usuario, String password){
        this.usuario=usuario;
        this.password=password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
