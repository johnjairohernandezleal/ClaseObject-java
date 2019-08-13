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
public class ClaseObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona per1 = new Persona("juan", 10000);
        Persona per2 = new Persona("juan", 10000);
        
        compararObjetos(per1, per2);
    }
    
    private static  void compararObjetos(Persona per1, Persona per2){
        /**
         * llamada metodo toString
         * por default se manda a llamar el metodo toString dentro de println
         */
        System.out.println("contenido objeto :" + per1);
        
        /**
         * revision por referencia
         */
        if (per1 == per2) {
            System.out.println("los onjetos tienen la misma direccion de memoria");
            
        }else{
            System.out.println("los objetos tienen distinta direccion de memoria");
        }
        
        /**
         * revision por el metodo equals
         */
        if (per1.equals(per2)) {
            System.out.println("los objetos tiene el mismo contenido, son iguales");
            
        }else{
            System.out.println("los objetos no tienen el mismo contenido, no son iguales");
        }
        /**
         * revisamos el metodo hashCode
         */
        if (per1.hashCode() == per2.hashCode()) {
            System.out.println("los objetos tienen el mismo codigo hash");
            
        }else{
            System.out.println("los objetos No tiene  el mismo condigo hash");
        }
    }
    
}
