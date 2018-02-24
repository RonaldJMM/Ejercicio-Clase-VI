/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Ronald
 */
public class ConversionDeTiempo {
        private long numeroDeSegundosDigitados;//segundos digitados por el usuario
        private long totalSemanas;//total de segundos en semanas
        private byte totalDias;//total de segundos en dias
        private byte totalHoras;//total de horas 
        private byte totalMinutos;//total de minutos
        private byte totalSegundos;//segundos restantes
        
        public void conversionDeSegundos(){
        
         System.out.println("");
         Scanner lecturaVar = new Scanner(System.in);//funcion de lectura o escaner para el usuario.
         
         System.out.println("Conversion de numero de Segundos a Semanas - Dias - Horas - Minutos.");
         System.out.println("Porfavor digite valores enteros.");
         System.out.println("Digite el numero de horas que desea convertir: ");
         numeroDeSegundosDigitados = lecturaVar.nextInt();//lectura de dato u horas.
         System.out.println("El total de segundos digitados es: "+numeroDeSegundosDigitados);
         totalSemanas=(long)(numeroDeSegundosDigitados/604800);
         numeroDeSegundosDigitados=(numeroDeSegundosDigitados-(totalSemanas*604800));
         totalDias=(byte)(numeroDeSegundosDigitados/86400);
         numeroDeSegundosDigitados=numeroDeSegundosDigitados-(totalDias*86400);
         totalHoras=(byte)(numeroDeSegundosDigitados/3600);
         numeroDeSegundosDigitados=numeroDeSegundosDigitados-(totalHoras*3600);
         totalMinutos=(byte)(numeroDeSegundosDigitados/60);
         numeroDeSegundosDigitados=numeroDeSegundosDigitados-(totalMinutos*60);
         totalSegundos=(byte)(numeroDeSegundosDigitados);
         System.out.println("");
         System.out.println("El total de semanas es: "+totalSemanas);
         System.out.println("El total de dias es: "+totalDias);
         System.out.println("El total de horas es: "+totalHoras);
         System.out.println("El total de minutos es: "+totalMinutos);
         System.out.println("El total de segundos es: "+totalSegundos);
         System.out.println("");
    }
}
