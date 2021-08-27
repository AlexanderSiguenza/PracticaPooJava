/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.practicapoo;

import java.util.Scanner;

/**
 *
 * @author Alexander-Siguenza
 */
public class Persona {
    
    private Scanner teclado;
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String dpi;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String direccion, String dpi) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.dpi = dpi;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    } 

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
    
    public void inicializar() {
        teclado = new Scanner(System.in);
        System.out.print("Ingrese nombre:");
        nombre = teclado.next();
        System.out.print("Ingrese apellido:");
        apellido = teclado.next();
        System.out.print("Ingrese edad:");
        edad = teclado.nextInt();
        System.out.print("Ingrese direccion:");
        direccion = teclado.next();
        System.out.print("Ingrese dpi:");
        dpi = teclado.next();
    }

    public void imprimir() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + edad);
    }

    public void esMayorEdad() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " no es mayor de edad.");
        }
    }

}
