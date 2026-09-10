/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.modelo;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Estudiante
 */
public class Propietario {
    //atributos
    private String namedueño;
    private String cedula;
    private String phone;
    private List<Mascota> listamascota;

    public Propietario(String namedueño, String cedula, String phone) {
        this.namedueño = namedueño;
        this.cedula = cedula;
        this.phone = phone;
        this.listamascota = new ArrayList<>();
    }

    public String getNamedueño() {
        return namedueño;
    }

    public void setNamedueño(String namedueño) {
        this.namedueño = namedueño;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
        
        public void agregarmascota(Mascota m){
            if (m!=null){
                this.listamascota.add(m);
            }
        }

    public List<Mascota> getListamascota() {
        return listamascota;
    }
}
