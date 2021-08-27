/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.practicapoo;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexander-Siguenza
 */
public class Profesor extends Empleado {
 
    private String[] materias;
    private String[] grados;
    private String   documentoprofesor;

    public Profesor() {
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public String[] getGrados() {
        return grados;
    }

    public void setGrados(String[] grados) {
        this.grados = grados;
    }

    public String getDocumentoprofesor() {
        return documentoprofesor;
    }

    public void setDocumentoprofesor(String documentoprofesor) {
        this.documentoprofesor = documentoprofesor;
    }    

    public void mostrar2() {
        mostrardatos();//Metodo heredado de Empleado
        JOptionPane.showMessageDialog(null, documentoprofesor);
    }

    public void ingreso2() {
        ingresodatos();//Metodo heredado de Empleado
        String s = JOptionPane.showInputDialog("Ingrese salario");
        this.setSalario(Double.parseDouble(s));
    }
}
