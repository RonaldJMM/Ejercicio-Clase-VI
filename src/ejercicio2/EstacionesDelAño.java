/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Ronald
 */
public class EstacionesDelAño {
    
       //variables
        private int mes;
        private int opcion;
        
        /**
         * En esta funcion se determina mediante switch a que estacion pertenece
         * 
         * 
         */
       public void estaciones(){
                
                
                
                
                Scanner entrada = new Scanner(System.in);
            
                do{
                
                System.out.println("Digite por favor el numero del mes correspondiente para determinas estacion");
                mes =entrada.nextInt();
                
                // en esta parte el usuario digita un numero que corresponde al mes 
                switch(mes){
                
                    case 1 :
                        
                        System.out.println("La estacion del mes que digito es invierno");
                        
                        break;
                     case 2 :
                        
                        System.out.println("La estacion del mes que digito es invierno");
                        
                        break;   
                        
                      case 3 :
                        
                        System.out.println("La estacion del mes que digito es invierno");
                        
                        break;  
                        
                         case 4 :
                        
                        System.out.println("La estacion del mes que digito es verano");
                        
                        break;
                
                        case 5 :
                        
                        System.out.println("La estacion del mes que digito es verano");
                        
                        break;
                        
                         case 6 :
                        
                        System.out.println("La estacion del mes que digito es verano");
                        
                        break;
                        
                        
                         case 7 :
                        
                        System.out.println("La estacion del mes que digito es otoño");
                        
                        break;
                        
                         case 8 :
                        
                        System.out.println("La estacion del mes que digito es otoño");
                        
                        break;
                        
                         case 9:
                        
                        System.out.println("La estacion del mes que digito es otoño");
                        
                        break;
                        
                        
                         case 10 :
                        
                        System.out.println("La estacion del mes que digito es primavera");
                        
                        break;
                        
                         case 11 :
                        
                        System.out.println("La estacion del mes que digito es primavera");
                        
                        break;
                        
                         case 12 :
                        
                        System.out.println("La estacion del mes que digito es primavera");
                        
                        break;
                        
                
                }
                
                //dependiendo de la opcion actua el switch
                
                System.out.println("Desea ejecutar nuevamente el programa");
                System.out.println("1.si");
                System.out.println("2.no");
                opcion=entrada.nextInt();
                
                
            
                }while(opcion!=2);
            
                System.out.println("Gracias por usar este programa");
            }
        
    
    
    
    
}
