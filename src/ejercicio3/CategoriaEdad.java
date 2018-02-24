/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Ronald
 */
public class CategoriaEdad {
       //variables 
        private  int edad;
        private  int opcion ;
    
            
    
             
         public void categoria(){
                
                
                
                
                Scanner entrada = new Scanner(System.in);
            
                do{
                
                System.out.println("Digite por favor la edad para determinar categoria");
                edad =entrada.nextInt();
                 //aqui se establecen los condicionales para determinar en que categoriaesta
                
                   if(edad>=0 && edad<=6){
                   
                   
                       System.out.println("La categoria es Pre infantil");
                   
                   
                   }
                   if(edad>=7&&edad<=17){
                   
                   
                       System.out.println("La categoria es infantil");
                   
                   
                   }
                if(edad>=18&&edad<=25){
                   
                   
                       System.out.println("La categoria es Juvenil");
                   
                   
                   }
                
                if(edad>=26&&edad<=45){
                   
                   
                       System.out.println("La categoria es Mayores");
                   
                   
                   }
                
                if(edad>=60){
                   
                   
                       System.out.println("La categoria es Veteranos");
                   
                   
                   }
                
                System.out.println("Desea ejecutar nuevamente el programa");
                System.out.println("1.si");
                System.out.println("2.no");
                opcion=entrada.nextInt();
                
                
            
                }while(opcion!=2);
            
                System.out.println("Gracias por usar este programa");
            }





    
}
