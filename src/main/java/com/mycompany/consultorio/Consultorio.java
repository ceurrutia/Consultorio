
package com.mycompany.consultorio;

import java.util.Date;

public class Consultorio {

    public static void main(String[] args) {
        // Crear un paciente, ojo con historial
        Paciente paciente = new Paciente(1, "Juan Carlos", "Gomez", new Date(), "1234", "carlos@gomez.com", 
                "Calle 12 123", "La Plata", "La Plata", new HistorialMedico());
        
        Paciente paciente2 = new Paciente(2, "Pedro", "Gomez", new Date(), "234", "pp@gomez.com", 
                "Calle 47 123", "Berisso", "La Plata", new HistorialMedico());

        // Crear un profesional
        Profesional profesional = new Profesional(2, "Ana", "Lopez Caso", new Date(), "987", "ana@ana.com", "Calle Preciados 456", "Centro", "Madrid", "Cardiología");

        // Crear una cita
        Cita cita = new Cita(profesional, paciente, new Date());

        // Crear una recepcionista
        Recepcionista recepcionista = new Recepcionista(3, "Laura", "Lopez", new Date(), "555", "laura@gmail.com", "Centro", "Almagro", "Buenos Aires", 1345);

        // Registrar el paciente
        recepcionista.registrarPaciente(paciente);
        recepcionista.registrarPaciente(paciente2);

        // Gestionar una cita
        recepcionista.gestionarCita(cita);

        // Cancelar la cita
        recepcionista.cancelarCita(cita);

        // Obtener los datos del recepcionista
        System.out.println(recepcionista.obtenerDatos());


        // Crear un historial médico para el paciente
        HistorialMedico historialMedico = new HistorialMedico(1, paciente, "Sin antecedentes");
        

        // Agregar diagnósticos y tratamientos
        historialMedico.agregarDiagnostico("Dolor abdominal");
        historialMedico.agregarDiagnostico("Diabetes tipo 2");
        historialMedico.agregarTratamiento("Paracetamol");
        historialMedico.agregarTratamiento("Dieta baja en sodio");

        // Obtener el historial
        System.out.println(historialMedico.obtenerHistorialCompleto());
    }
}
