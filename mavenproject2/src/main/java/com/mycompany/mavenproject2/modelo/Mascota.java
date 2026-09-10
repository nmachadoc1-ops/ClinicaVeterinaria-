/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.modelo;

/**
 *
 * @author Estudiante
 */
public class Mascota extends Animal{
    private String dueño;
    private String raza;

    public Mascota(String dueño, String raza, String nombre, String especie, int edad, double peso, String sexo) {
        super(nombre, especie, edad, peso, sexo);
        this.dueño = dueño;
        this.raza = raza;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
}
