/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Ronald
 */
public class NotasAlumnos {
    //en este punto se asignan las variables
    private String nombreAlumno;
    private int numeroNotas;
    private float notasAlumno;
    private float totalPromedioNotas;
    private int desicion;
    private int i=0;
    
    //en esta funcion publica se efectua el primedio de las notas
    public void calculoPromedioNotas(){
      Scanner lecturaVar = new Scanner(System.in);
      System.out.println("Promedio de notas de un alumno.");
      System.out.println("Digite el nombre del Alumno: .");
       nombreAlumno = lecturaVar.nextLine();
       do{
           //operaciones necesarias para realizar promedio
           i++;
           numeroNotas=i;
           System.out.println("Digite la nota "+i+" : ");
           notasAlumno=notasAlumno+lecturaVar.nextFloat();
           System.out.println("Desea ingresar otra nota?");
           System.out.println("1.Si  2.No");
           System.out.println("Respuesta: ");
           desicion=lecturaVar.nextInt();
           //en este while se pregunta al usuario si desea ingresar mas notas
       }while(desicion!=2);
       //aqui muestra los resultados de las operaciones que se realizaron
       totalPromedioNotas=(float)(notasAlumno/numeroNotas);
      System.out.println("Promedio de notas del Alumno: "+nombreAlumno);
      System.out.println("Total Promedio: "+totalPromedioNotas);
    }
}
