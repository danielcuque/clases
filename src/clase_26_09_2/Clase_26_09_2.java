/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_26_09_2;

/**
 *
 * @author daniel
 */
public class Clase_26_09_2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        /*
            int variable2 = 3.3
            System.out.println(variable2);
        */
        
        
        /*Abreviatura de System.out.println  ->
         sout + tab
        */
        
        /*Numeros enteros -> Integer*/
        int numero1 = 12;
        
        /*System.out.print(numero1);*/
        
        
        /*Número decimal -> Float*/
        
        double numero2 = 3.3;
        /*System.out.print(numero2);*/
       
        
        /*Cadenas de text -> String*/
        
        String texto;
        texto = "Hola mundo";
        
        /*System.out.println(texto);*/
        
        /*Cadenas simples*/
        char variable2 = 'd';
        /*System.out.println(variable2);*/
        
        
        String nombre = "Daniel";
        String apellido = "Cuque";
        
        /*Concatenación de cadenas
        concatenación de strings
        */
        System.out.println(nombre + " "+ apellido);
        
        
        int precio = 33;
        int total = 45;
        double subtotal = 33.00;
        
        System.out.println(precio+total+subtotal);
        
        
        /* false = 0
           verdadero = 1
        */
        
        
        /*
            Las variables no pueden tener nombre de palabras reservadas
        */
        /*
           Datos condicionales -> boolean
        */
        
        boolean animal = false;
        System.out.println(animal);
        
        boolean activo = true;
        System.out.println(activo);
       
        
    }
    
}
