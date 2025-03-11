/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        
        ResponsablePago responsable = new ResponsablePago("54664535", "Juan Perez", "Calle Laurel 4520", "3224567862", "10005748374");
        PersonaAutorizada persona1 = new PersonaAutorizada("20036785", "Juan Lopez", "Calle 18 #86", "3255250921", "Madre");
        PersonaAutorizada persona2 = new PersonaAutorizada("27274563", "Carlos Garcia", "Calle  789", "3234673833", "Tio");
        Niño nino1 = new Niño("45689", "Carlos");
        nino1.setResponsablePago(responsable);
        nino1.agregarPersonaAutorizada(persona1);
        nino1.agregarPersonaAutorizada(persona2);

        nino1.mostrarInformacionNiño();
    }
}
