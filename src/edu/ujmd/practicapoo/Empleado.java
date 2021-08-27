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
public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private String direccion;
    private String dpi;
    
    private String empresa;
    private String cargo;
    private String[] certificaciones;
    private double salario;
    private double horario;

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String pnombre) {
        this.nombre = pnombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String papellido) {
        this.apellido = papellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }   

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }  

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }   

    public void mostrardatos() {
        JOptionPane.showConfirmDialog(null, nombre + " " + apellido);
    }

    public void ingresodatos() {
        nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
        apellido = JOptionPane.showInputDialog("Ingrese el Apellido");
    }
}
