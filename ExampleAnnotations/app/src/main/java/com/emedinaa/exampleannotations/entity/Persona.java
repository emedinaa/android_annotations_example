package com.emedinaa.exampleannotations.entity;

import com.emedinaa.exampleannotations.Persistencia;

/**
 * Created by emedinaa on 11/09/15.
 */
public class Persona {

    @Persistencia(campo = "nombre",tipo = "varchar")
    private String nombre;
    @Persistencia(campo = "edad", tipo = "decimal")
    private String edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
