/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class SerieFibonacci {
        private int num;
        private int serie1;
        private int serie2;
        private int i;
    public void impresionFibonacci(){
        
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.print("Digite el numero hasta donde quiera la serie: ");
            num = entrada.nextInt();
        }while(num<=1);
        System.out.println("Los " + num + "numeros de la serie son los siguientes:"); 

        serie1=1;
        serie2=1; 

        System.out.print(serie1 + " ");
        for(i=2;i<=num;i++){
             System.out.print(serie2 + " ");
             serie2 = serie1 + serie2;
             serie1 = serie2 - serie1;
        }
        System.out.println();
    }
    
    
}
