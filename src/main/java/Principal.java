import palabras.Palabras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase principal que es donde se empieza el programa.
 * @author BRAYAN, ISAAC
 */
public class Principal {
    
    public static void main (String... a){
        Principal princip = new Principal();
        
    }
    /**
     * Constructor de la clase donde se llama a la clase Palabras.
     */
    public Principal(){
        Palabras palabras = new Palabras();
        palabras.GuardarString();
    }
    
}
