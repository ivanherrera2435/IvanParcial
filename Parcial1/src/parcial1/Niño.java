/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;

public class Niño {
    private String matricula;
    private String nombre;
    private List<PersonaAutorizada> personasAutorizadas;
    private ResponsablePago responsablePago;

    public Niño(String matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.personasAutorizadas = new ArrayList<>();
    }

    public void agregarPersonaAutorizada(PersonaAutorizada persona) {
        this.personasAutorizadas.add(persona);
    }

    public void setResponsablePago(ResponsablePago responsable) {
        this.responsablePago = responsable;
    }

    public void mostrarInformacionNiño() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Nombre: " + nombre);
        System.out.println("\nResponsable de Pago:");
        responsablePago.mostrarInformacion();
        System.out.println("\nPersonas Autorizadas a Recoger al Nino:");
        for (PersonaAutorizada persona : personasAutorizadas) {
            persona.mostrarInformacion();
        }
    }
}
