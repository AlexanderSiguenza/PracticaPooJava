/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.practicapoo;

/**
 *
 * @author Alexander-Siguenza
 */
public class Doctor extends Empleado {
    
    private String especialidad;
    private String documentoDoctor;
    private double turnos;

    public Doctor() {
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDocumentoDoctor() {
        return documentoDoctor;
    }

    public void setDocumentoDoctor(String documentoDoctor) {
        this.documentoDoctor = documentoDoctor;
    }

    public double getTurnos() {
        return turnos;
    }

    public void setTurnos(double turnos) {
        this.turnos = turnos;
    }
    
    @Override
    public void ingresodatos() {
        super.ingresodatos(); //To change body of generated methods, choose Tools | Templates.
    }    
}
