package com.mycompany.consultorio;

import java.util.ArrayList;
import java.util.Date;

public class Profesional extends Persona {

    private String especialidad;
    private final ArrayList<Cita> citasProgramadas;//no va a tener herencia, por eso el final

    public Profesional(int id, String nombre, String apellido,
            Date fechaNac, String telefono, String email,
            String direccion, String localidad, String ciudad,
            String especialidad) {
        super(id, nombre, apellido, fechaNac, telefono, email, direccion,
                localidad, ciudad);
        this.especialidad = especialidad;
        this.citasProgramadas = new ArrayList<>();
    }

    public Cita agendarCita(Paciente paciente, Date fecha) {
        Cita nuevaCita = new Cita(this, paciente, fecha);
        citasProgramadas.add(nuevaCita);
        System.out.println("Cita agendada con el paciente " + paciente.getNombre()
                + paciente.getApellido() + " para el " + fecha);
        return nuevaCita;
    }

    public void cancelarCita(Cita cita) {
        if (citasProgramadas.contains(cita)) {
            citasProgramadas.remove(cita);
            System.out.println("Cita cancelada con el paciente "
                    + cita.getPaciente().getNombre());
        } else {
            System.out.println("Cita no encontrada.");
        }
    }

    // Consultar el historial de un paciente
    public HistorialMedico consultarHistorial(Paciente paciente) {
        return paciente.getHistorialMedico();
    }

    @Override
    public String obtenerDatos() {
        return "Profesional: " + getNombre() + " " + getApellido()
                + ", Especialidad: " + especialidad
                + ", Teléfono: " + getTelefono()
                + ", Email: " + getEmail();
    }

    //getters y setters para los atributs
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<Cita> getCitasProgramadas() {
        return citasProgramadas;
    }
}
