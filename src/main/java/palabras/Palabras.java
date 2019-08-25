/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabras;
import java.util.Scanner;

/**
 * Clase que realiza operaciones con un String que recibe el usuario.
 * @author BRAYAN, ISAAC
 */
public class Palabras {
    
    /**
     * Constructor de la clase Palabras.
     */
    public Palabras(){
        
    }
    /**
     * Metodo que guarda String y envia a otro metodo el string
     */
    public void GuardarString(){        
        int i;
        String cadena, cadenaEsp;
        String x=" ";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una frase.");
        cadena = teclado.nextLine();
        cadenaEsp = cadena.replaceAll(" ", "");
        //cadenaEsp = cadenaEsp.replaceAll(Character.toString(cadenaEsp.charAt(1)),"");
        //System.out.println(cadenaEsp);
        LetrasNoRepetidas(cadenaEsp);
    }
    /**
     * Metodo que recibe un String y evalua que letras de ese String no estan repetidas
     */
    public void LetrasNoRepetidas(String caracteres){
        int i,j;
        int cont=0;
        byte saberPrimera=0;
        for(i=0; i<caracteres.length(); i++){
            System.out.println("Procesando la letra: "+caracteres.charAt(i));
            for(j=0; j<caracteres.length(); j++){
                if(caracteres.charAt(i) == caracteres.charAt(j)){
                    cont++;
                }
            }
            if(cont == 1 && saberPrimera == 0){
                System.out.println("LA LETRA "+caracteres.charAt(i)+" ES LA PRIMERA QUE NO SE REPITE"); 
                saberPrimera = 1;
            }else if (cont >= 2){
                System.out.println("la letra "+caracteres.charAt(i)+"  se repite "+cont+" veces.");
                //caracteres = caracteres.replaceAll(Character.toString(caracteres.charAt(i)),""); 
            }else if(cont == 1 && saberPrimera == 1){
                System.out.println("LA LETRA "+caracteres.charAt(i)+" ES LA SIGUIENTE QUE NO SE REPITE"); 
            }
            cont=0;
            
        }
    }
}
