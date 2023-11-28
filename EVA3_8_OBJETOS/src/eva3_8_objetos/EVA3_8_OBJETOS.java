/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_objetos;

/**
 *
 * @author Joshua
 */
public class EVA3_8_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 =new Persona();
        //Scanner input=new Scanner(System.in);
        //int[] arreglo=new int[5];
        System.out.println(perso1);
        perso1.nombre="juan";
        perso1.apellido="perez";
        perso1.edad=50;
        imprimirpersonas(perso1);
        
        Persona persona2=new Persona();
        persona2.nombre="pedro";
        persona2.apellido="paramo";
        persona2.edad=70;
        imprimirpersonas(persona2);
    }
    public static void imprimirpersonas(Persona perso){
        System.out.println("direccion "+perso);
        System.out.println("direccion "+perso.nombre+" "+perso.apellido);
        System.out.println("edad: "+perso.edad);
    }
}
//son plantillas
//son tipos de datos
class Persona{
    String nombre;
    String apellido;
    int edad;
}
