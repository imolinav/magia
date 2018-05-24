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
public class Hufflepuff extends Alumno {
  private String planta;
    public Hufflepuff(String nombre, String apellidos, int edad, String planta){
        super(nombre,apellidos,edad);
        this.planta=planta;
    }
    
    
    public void setPlanta(String planta){
        this.planta=planta;
    }
    public String getPlanta(){
        return planta;
    }
    @Override
   public  String mostrarDeberes(){
       return "Nosotros somos los tontitos!";
   }
    @Override
    public  String mostrarCasa(){
        return "Hufflepuff";
    }
    
  @Override
    public String decirAsignatura(){
        return "Lenguaje de marcas y runas";
    }


}
