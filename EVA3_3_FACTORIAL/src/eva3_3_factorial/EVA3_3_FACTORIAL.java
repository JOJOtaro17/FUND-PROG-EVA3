/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_factorial;

/**
 *
 * @author Joshua
 */
public class EVA3_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //llada a funcion:
        System.out.println("el factorial de 5 = " + calcularfactorial(5));
        System.out.println("5 elevado a la potencia de 3 = " + calcularpotencia(2,5));
    }
    public static int calcularfactorial(int num){
        //factorial de 5: 1*2*3*4*5=120
        //usar ciclos
        //regresar el valor calculado
        
        int resu=1;
        for (int i = 1; i <= num; i++) {
            resu*=i; //resu=resu*1;
        }
        return resu;
    }
    //crear una duncion que calcule la potencia de un nùmero entero.
public static int calcularpotencia(int base, int exp){
  int resu=1;
    for (int i = 1; i <= exp; i++) {
        resu *= base;//resu=resu*base;
    }
        return resu;
 }
}

