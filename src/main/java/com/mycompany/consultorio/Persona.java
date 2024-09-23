package com.mycompany.consultorio;

import java.util.Date;

public abstract class Persona {

    private int id;
    private String nombre, apellido;
    private Date fechaNac;
    private String telefono, email, direccion, localidad, ciudad;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, Date fechaNac, String telefono, String email, String direccion, String localidad, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.localidad = localidad;
        this.ciudad = ciudad;
    }

    //metodo abstract
    
    public abstract String obtenerDatos();
    
    
    //metodo actualizar datos
    
     public void actualizarDatos(String nombre, String apellido, 
             String telefono, String email, 
             String direccion, String localidad, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.localidad = localidad;
        this.ciudad = ciudad;
    }
     
     //getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
     
     

}
