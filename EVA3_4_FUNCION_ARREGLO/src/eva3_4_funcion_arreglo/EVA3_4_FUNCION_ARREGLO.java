/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_funcion_arreglo;

/**
 *
 * @author Joshua
 */
public class EVA3_4_FUNCION_ARREGLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo= crearArreglo(10, 100);
        for(int valor:arreglo)
            System.out.print("["+valor+"]");
    }
    
    public static int[] crearArreglo(int tama, int rango){
        int[] arreglo = new int [tama];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]= (int)(Math.random()*rango);
        }
        return arreglo;
    }
}
