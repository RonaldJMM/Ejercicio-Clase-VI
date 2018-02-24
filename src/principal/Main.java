/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import ejercicio1.NotasAlumnos;
import ejercicio2.EstacionesDelAño;
import ejercicio3.CategoriaEdad;
import ejercicio4.ConversionDeTiempo;
import ejercicio5.SerieFibonacci;
import java.util.Scanner;

/**
 *
 * @author Ronald
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NotasAlumnos obj1 = new NotasAlumnos();
        EstacionesDelAño obj2 = new EstacionesDelAño();
        CategoriaEdad obj3 = new CategoriaEdad();
        ConversionDeTiempo obj4 = new ConversionDeTiempo();
        SerieFibonacci obj5 = new SerieFibonacci();
        
        Scanner lecturaVar = new Scanner(System.in);//funcion para escanear el dato del usuario
        byte opcionMenu;//variable para la opcion del menu
        do{//repeticion del menu de ejercicios
        System.out.println("Ejercicios Variables y Operadores.");
        System.out.println("1.Calculo Promedio de Notas de un Alumno.");
        System.out.println("2.Estaciones del Año.");
        System.out.println("3.Categoria segun la edad.");
        System.out.println("4.Conversion de Segundos - Tiempo.");
        System.out.println("5.Serie Fibonacci.");
        System.out.println("6.Finalizar.");
        System.out.println("Digite el numero de la opcion que desea: ");
        
        opcionMenu = lecturaVar.nextByte();//escaneo del dato del menu del usuario
        switch(opcionMenu){
            
            case 1:
                //metodo del ejercicio 1
                obj1.calculoPromedioNotas();
                break;
            
            case 2:
                //metodo del ejercicio 2
               
               break;
               
            case 3:
                //metodo del ejercicio 3
               
               break;
               
            case 4:
                //metodo del ejercicio 4
               
               break;
            case 5:
                //metodo del ejercicio 5
               
               break;
               
            case 6:
                //salida del menu.
                System.out.println("Ha Finalizado.");
                break;
            default:
                //opcion no valida del menu.
                System.out.println("La opcion no es valida.");
                break;
        }
        
        }while(opcionMenu!=6);//condicional de salida del menu.
    }
    
}
