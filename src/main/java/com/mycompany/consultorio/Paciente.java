package com.mycompany.consultorio;

import java.util.Date;

public class Paciente extends Persona {

    private HistorialMedico historialMedico;

    public Paciente(int id, String nombre, String apellido, Date fechaNac,
            String telefono, String email, String direccion,
            String localidad, String ciudad, HistorialMedico historialMedico) {
        super(id, nombre, apellido, fechaNac, telefono, email, direccion, localidad, ciudad);
        this.historialMedico = historialMedico;
    }

    public void solicitarCita(Profesional profesional, Date fecha) {
        // agregar la logica
        
        System.out.println("Cita solicitada con el Doctor: " + profesional.getNombre() 
                + profesional.getApellido() 
                + " en la fecha: " + fecha);
    }

    public HistorialMedico consultarHistorial() {
        return historialMedico;
    }

    @Override
    public String obtenerDatos() {
        return "Paciente: " + getNombre() + " " + getApellido() 
                + ", Teléfono: " + getTelefono() 
                + ", Email: " + getEmail();
    }

    // Getters y Setters para historialMedico
    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }
}
