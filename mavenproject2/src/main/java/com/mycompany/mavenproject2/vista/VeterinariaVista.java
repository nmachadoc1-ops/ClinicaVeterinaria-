/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2.vista;

import com.mycompany.mavenproject2.modelo.Consulta;
import com.mycompany.mavenproject2.modelo.Mascota;
import com.mycompany.mavenproject2.modelo.Medicamento;
import com.mycompany.mavenproject2.modelo.Propietario;

import java.util.List;

/**
 *
 * @author Estudiante
 */
public class VeterinariaVista{
  public void mostrarPropietariosConMascotas(List<Propietario> propietarios){
      System.out.println("================================================");
      System.out.println("          PROPIETARIOS Y SUS MASCOTAS            ");
      System.out.println("================================================");
      
      for(Propietario p : propietarios){
          System.out.println("Propietario: " + p.getNamedueño() + "| Tel:" + p.getPhone());
          System.out.println("Mascotas asignadas: ");
          if (p.getListaMascota().isEmpty()){
              System.out.println("-No tiene mascotas asignadas.");
          }else{
              for(Mascota m: p.getListaMascota()){
                  System.out.println(" * " + m.DescribirMascota());
              }
          }
         System.out.println("--------------------------------------------------");
          
      }
      
              
  }
   
  public void mostrarConsultas(List<Consulta> consultas) {
        System.out.println("================================================");
        System.out.println("               CONSULTAS REALIZADAS             ");
        System.out.println("================================================");
        for (Consulta c : consultas) {
            System.out.println("Fecha: " + c.getFecha());
            System.out.println("Atendió: Dr(a). " + c.getVeterinario().getNombre() + " (" + c.getVeterinario().getEspecialidad() + ")");
            System.out.println("Mascota: " + c.getMascota().getNombre());
            System.out.println("Motivo: " + c.getMotivo());
            System.out.println("--------------------------------------------------");
        }
    }
  
  public void mostrarMedicamentosRecetados(List<Consulta> consultas) {
        System.out.println("================================================");
        System.out.println("             MEDICAMENTOS RECETADOS             ");
        System.out.println("================================================");
        for (Consulta c : consultas) {
            System.out.println("Consulta de: " + c.getMascota().getNombre() + " | Atendió: Dr(a). " + c.getVeterinario().getNombre());
            List<Medicamento> meds = c.getMedicamentos();
            if (meds.isEmpty()) {
                System.out.println("  - No se recetaron medicamentos.");
            } else {
                for (Medicamento m : meds) {
                    System.out.println("  * Medicamento: " + m.getNombre() + " | Dosis: " + m.getDosis());
                }
            }
            System.out.println("--------------------------------------------------");
        }
    }
}
