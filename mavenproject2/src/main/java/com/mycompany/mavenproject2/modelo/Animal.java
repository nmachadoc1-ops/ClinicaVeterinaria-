/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.modelo;

/**
 *
 * @author Estudiante
 */
public class Animal {
    //atributos
   private String nombre;
   private String especie;
   private int edad;
   private double peso;
   private String sexo;

   
   //constructor vacio
    public Animal() {
    }

    //constructor con parametros
    public Animal(String nombre, String especie, int edad, double peso, String sexo) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
   
    
    public String describirmascota(String nombre, String especie, int edad){
        
         return "Nombre: " + nombre + ", Edad: " + edad + ", Especie: " + especie;
    }
   
   
}
