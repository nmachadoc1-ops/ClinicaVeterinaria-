/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.controlador;

import java.util.ArrayList;
import java.util.List;
import com.mycompany.mavenproject2.modelo.*;
import com.mycompany.mavenproject2.vista.VeterinariaVista;

public class ClinicaController {
    private List<Propietario> listaPropietarios;
    private List<Consulta> listaConsultas;
    private VeterinariaVista vista;

    public ClinicaController() {
        this.listaPropietarios = new ArrayList<>();
        this.listaConsultas = new ArrayList<>();
        this.vista = new VeterinariaVista();
    }

    public void iniciar() {
        cargarDatosPrueba();
        
        // Entrega las listas preparadas a la vista
        vista.mostrarPropietariosConMascotas(listaPropietarios);
        vista.mostrarConsultas(listaConsultas);
        vista.mostrarMedicamentosRecetados(listaConsultas);
    }

    private void cargarDatosPrueba() {
        // 1. Crear Propietarios (namedueño, cedula, phone)
        Propietario propietario1 = new Propietario("Carlos Pérez", "12345678", "555-0192");
        Propietario propietario2 = new Propietario("María Gómez", "87654321", "555-0183");

        // 2. Crear Mascotas (dueño, raza, nombre, especie, edad, peso, sexo)
        Mascota mascota1 = new Mascota(propietario1.getNamedueño(), "Labrador", "Max", "Perro", 4, 15.5, "Macho");
        Mascota mascota2 = new Mascota(propietario2.getNamedueño(), "Siamés", "Luna", "Gato", 2, 4.2, "Hembra");

        // 3. Relación de Agregación
        propietario1.agregarMascota(mascota1);
        propietario2.agregarMascota(mascota2);

        listaPropietarios.add(propietario1);
        listaPropietarios.add(propietario2);

        // 4. Crear Veterinarios (nombre, especialidad)
        Veterinario vet1 = new Veterinario("Laura Martínez", "Medicina General");
        Veterinario vet2 = new Veterinario("Andrés López", "Dermatología");

        // 5. Crear Consultas (fecha, motivo, mascota, veterinario)
        Consulta consulta1 = new Consulta("2026-03-10", "Chequeo general y vacuna", mascota1, vet1);
        Consulta consulta2 = new Consulta("2026-03-11", "Alergia en la piel", mascota2, vet2);

        // 6. Crear Medicamentos y aplicar la relación de Dependencia
        Medicamento med1 = new Medicamento("Desparasitante", "1 tableta cada 12 horas");
        Medicamento med2 = new Medicamento("Antihistamínico", "0.5ml cada 24 horas");

        vet1.recetar(consulta1, med1);
        vet2.recetar(consulta2, med2);

        listaConsultas.add(consulta1);
        listaConsultas.add(consulta2);
    }
}