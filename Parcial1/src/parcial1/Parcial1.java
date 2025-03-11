/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Parcial1;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;


public class Parcial1 {
    
    private String matricula;
    private String nombre;
    private Date fechaNacimiento;
    private Date fechaIngreso;
    private Date fechaBaja;
    private String alergias;
    private String personaAutorizadas;
    private  String  responsablePago;
    private String menusConsumidos;
    private int diasComidos;

    public Parcial1(String matricula, String nombre, Date fechaNacimiento, Date fechaIngreso,String alergias,String personaAutorizadas,String menusConsumidos) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.alergias =  alergias;
        this.personaAutorizadas =  personaAutorizadas;
        this.menusConsumidos = menusConsumidos;
    }
}
