/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_funciones_2;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EVA3_2_FUNCIONES_2 {

    /**
     * @param args the command line arguments
     */
    int x=100;
    public static void main(String[] args) {
        // TODO code application logic here
       /* Scanner input= new Scanner(System.in);
        EVA3_2_FUNCIONES_2 objeto=new EVA3_2_FUNCIONES_2 ();
        System.out.println(objeto.x);*/
        //System.out.println(buscarMAX(100,200));
        //SE USA EL VALOR DIRECTAMENTE DE LA FUNCION
        int valor=buscarMAX(100,200);
        //GUARDAMOS EL VALOR DEVUELTO PARA SU POSTERIOR USO
        System.out.println(valor);
        //SE EJECUTA LA FUNCION, PERO IGNORAMOS EL RESULTADO
        buscarMAX(100,200);
    }
    public static int buscarMAX(int val1, int val2){
        int resu;
        if(val1>val2)
            resu=val1;
        else
            resu=val2;
        
        return resu;
        
        
    }
    
}
