/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_paso_por_valor;

/**
 *
 * @author Joshua
 */
public class EVA3_6_PASO_POR_VALOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        System.out.println("el valor de x en el main es "+ x);
        sumarvalor(x);
        System.out.println("el valor de x e llamar a sumarvalor " + x);
    }
 public static void sumarvalor(int valor){
     System.out.println("el valpor recibido en sumarvalor es "+ valor);
     valor++;
     System.out.println("el valor modicifaco es " + valor);
 }   
}
