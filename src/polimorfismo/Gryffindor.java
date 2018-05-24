/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Toni
 */
public class Gryffindor extends Alumno {
    
    private String mascota;
    public Gryffindor(String nombre, String apellidos, int edad, String mascota){
        super(nombre,apellidos,edad);
        this.mascota=mascota;
    }
    
    
    public void setMascota(String mascota){
        this.mascota=mascota;
    }
    public String getMascota(){
        return mascota;
    }
    @Override
   public  String mostrarDeberes(){
      return "Somos los buenos";
   }
    @Override
    public  String mostrarCasa(){
        return "Gryffindor";
    } 
    
    
}
