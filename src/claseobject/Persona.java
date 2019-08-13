/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseobject;

/**
 *
 * @author john hernandez
 */
public class Persona {
    private String nombre;
    private double sueldo;
   

    Persona(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
        return "Persona {" + "Nombre = " + nombre + ", Sueldo = " + sueldo +'}';
    }
    
    @Override
    public boolean  equals(Object obj){
        if (obj == null) {
            return false;
            
        }
        if (obj instanceof  Persona) {
            Persona per = (Persona)obj;
            if (nombre.equals(per.nombre) && Double.valueOf(sueldo).equals(per.sueldo)) {
                return true;
                
            }else{
                return false;
            }
            
        }else{
            return false;
        }
    }
    
    @Override
    public int hashCode(){
        int hash = 7;
        hash = 31* hash + this.nombre.hashCode();
        hash = 31* hash + Double.valueOf(this.sueldo).hashCode();
        return hash;
    }
    
}
