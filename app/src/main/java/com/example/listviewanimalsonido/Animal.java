package com.example.listviewanimalsonido;

import java.io.Serializable;

public class Animal implements Serializable {

    String nombre;
    String descripcion;
    int foto;
    int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public Animal(String nombre, String descripcion, int foto, int codigo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
        this.codigo=codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }


}
