package com.mycompany.consultorio;

import java.util.Date;

public class Recepcionista extends Persona {

    private int idEmpleado;

    public Recepcionista() {
    }
    
    

    // Constructor con parametros
    public Recepcionista(int id, String nombre, String apellido, Date fechaNac, 
            String telefono, String email, 
            String direccion, String localidad, 
            String ciudad, int idEmpleado) {
        super(id, nombre, apellido, fechaNac, telefono, email, direccion, localidad, ciudad);
        this.idEmpleado = idEmpleado;
    }

    //Registrar un nuevo paciente
    public void registrarPaciente(Paciente paciente) {
        System.out.println("Paciente " + paciente.getNombre()+ " " + paciente.getApellido()
                + " registrado correctamente.");
        
    }

    // Gestionar una cita
    public void gestionarCita(Cita cita) {
        System.out.println("Gestionando la cita del paciente " + cita.getPaciente().getNombre()
                + " " + cita.getPaciente().getApellido() 
                + " con el doctor " + cita.getProfesional().getNombre()+ " " 
                + cita.getProfesional().getApellido() 
                + " programada para " + cita.getFecha());
        
    }

    // Cancelar una cita
    public void cancelarCita(Cita cita) {
        System.out.println("Cita cancelada para el paciente " + cita.getPaciente().getNombre() 
                + " "+ cita.getPaciente().getApellido() 
                + " con profesional " + cita.getProfesional().getNombre() +
                cita.getProfesional().getApellido());
        
    }

    // Método abstracto obtenerDatos() heredado de la clase Persona
    @Override
    public String obtenerDatos() {
        return "Recepcionista: " + getNombre() + " " 
                + getApellido() + ", ID Empleado: " 
                + idEmpleado + ", Telefono: " 
                + getTelefono() + ", Email: " 
                + getEmail();
    }

    // Getters y Setters para Empleado
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}


