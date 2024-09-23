package com.mycompany.consultorio;

import java.util.ArrayList;

public class HistorialMedico {

    private int id;
    private Paciente paciente;
    private String antecedentes;
    private ArrayList<String> diagnosticos;
    private ArrayList<String> tratamientos;

    HistorialMedico() {

    }

    // Constructor
    public HistorialMedico(int id, Paciente paciente, String antecedentes) {
        this.id = id;
        this.paciente = paciente;
        this.antecedentes = antecedentes;
        this.diagnosticos = new ArrayList<>();
        this.tratamientos = new ArrayList<>();
    }

    // Agregar un diagnóstico al historial
    public void agregarDiagnostico(String diagnostico) {
        diagnosticos.add(diagnostico);
        System.out.println("Diagnostico agregado: " + diagnostico);
    }

    // Agregar un tratamiento al historial
    public void agregarTratamiento(String tratamiento) {
        tratamientos.add(tratamiento);
        System.out.println("Tratamiento agregado: " + tratamiento);
    }

    // Obtener el historial médico completo del paciente en formato String
    public String obtenerHistorialCompleto() {
        StringBuilder historialCompleto = new StringBuilder();
        historialCompleto.append("Historial Medico del paciente: ").append(paciente.getNombre()).append(" ").append(paciente.getApellido()).append("\n");
        historialCompleto.append("Antecedentes: ").append(antecedentes);
        historialCompleto.append("Diagnosticos: ");

        for (String diagnostico : diagnosticos) {
            historialCompleto.append(diagnostico);
        }

        historialCompleto.append("Tratamientos: ");

        for (String tratamiento : tratamientos) {
            historialCompleto.append("- ").append(tratamiento);
        }

        return historialCompleto.toString();
    }

    // Getters y setters para los atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public ArrayList<String> getDiagnosticos() {
        return diagnosticos;
    }

    public ArrayList<String> getTratamientos() {
        return tratamientos;
    }

}
