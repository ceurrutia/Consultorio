
package com.mycompany.consultorio;

import java.util.Date;

public class Cita {
    private Profesional profesional;
    private Paciente paciente;
    private Date fecha;

    public Cita(Profesional profesional, Paciente paciente, Date fecha) {
        this.profesional = profesional;
        this.paciente = paciente;
        this.fecha = fecha;
    }

    // Getters y Setters para los atributos
    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
