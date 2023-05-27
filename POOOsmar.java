/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.osmar;

import java.util.Scanner;


public class POOOsmar {
  @SuppressWarnings("UnusedAssignment")
  public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       Calculadora calculadora = new Calculadora("JP");
       CalculadoraEspecial calculadoraEspecial = new CalculadoraEspecial();
    
       boolean salir = false;
       int opcion, opcioncalculadora, opcionE, num1, num2; 
      
       do{
           System.out.println("");
           System.out.println("");
           System.out.println("Bienvenidos, Gracias por preferirnos.");
           System.out.println("Por favor, seleccione que tipo de calculadora usara");
           System.out.println("=======================");
          
        System.out.println("==========");
        System.out.println("=        =");
        System.out.println("=        =");
        System.out.println("=        =");
        System.out.println("=        =");
        System.out.println("=        =");
        System.out.println("==========");
           System.out.println("1. Calculadora Simple");
           System.out.println("=======================");
           
        System.out.println("==========");
           System.out.println ("=        =");
           System.out.println ("=        =");
           System.out.println ("=        =");
           System.out.println ("=        =");
          System.out.println ("=        =");
        System.out.println   ("==========");
           
           System.out.println("2. Calculadora Especial");
           
        System.out.println("==========");
        System.out.println("=         ");
        System.out.println("=        ");
        System.out.println("=     ====");
        System.out.println("=        =");
        System.out.println("=        =");
        System.out.println("==========");
           System.out.println("3. Salir");
           System.out.println("=======================");
           opcioncalculadora = sn.nextInt();
           
           switch(opcioncalculadora){
               case 1: {
                   System.out.println("");
                   System.out.println("=======================");
                   
                   System.out.println("1. Sumar");
                   System.out.println("2. Restar");
                   System.out.println("3. Multiplicar");
                   System.out.println("4. Dividir");
                   System.out.println("5. Raiz Cuadrada");
                   System.out.println("6. Verificar numero Primo");
                   System.out.println("7. Salir");
                   System.out.println("Selecciona una opcion");
                   System.out.println("=======================");
                   opcion = sn.nextInt();
                   switch(opcion){
                       case 1:  
                           System.out.println("Ingrese el primer numero: ");
                            num1 = sn.nextInt();
                            System.out.println("Ingrese el segundo numero: ");
                            num2 = sn.nextInt();
                            System.out.println("El resultado de la suma es = " + calculadora.sumar(num1, num2));
                            break;
                       case 2:
                            System.out.println("Ingrese el primer numero: ");
                            num1 = sn.nextInt();
                            System.out.println("Ingrese el segundo numero: ");
                            num2 = sn.nextInt();
                            System.out.println("El resultado de la resta es = " + calculadora.restar(num1, num2));
                            break;
                       case 3:
                            System.out.println("Ingrese el primer numero: ");
                            num1 = sn.nextInt();
                            System.out.println("Ingrese el segundo numero: ");
                            num2 = sn.nextInt();
                            System.out.println("El resultado de la multiplicacion es = " + calculadora.multiplicar(num1, num2));
                            break;
                       case 4:
                            System.out.println("Ingrese el primer numero: ");
                            num1 = sn.nextInt();
                            System.out.println("Ingrese el segundo numero: ");
                            num2 = sn.nextInt();
                            System.out.println("El resultado de la división es = " + calculadora.dividir(num1, num2));
                            break;
                       case 5:
                            System.out.println("Ingrese el numero: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado de la raíz cuadrada es = " + calculadora.raizCuadrada(num1));
                            break;
                       case 6:
                            System.out.println("Ingrese el numero: ");
                            num1 = sn.nextInt();
                            System.out.println("Es primo? = " + calculadora.esPrimo(num1));
                            break;
                       case 7:
                            salir=true;
                       default:
                            System.out.println("Solo números entre 1 y 7");
                   }  
               }
               break;
                 case 2: {
                    System.out.println("");
                    System.out.println("=======================");
                    System.out.println("1. Generar numero aleatorio");
                    System.out.println("2. Calcular potencia");
                    System.out.println("3. Calcular logaritmo");
                    System.out.println("4. Calcular seno");
                    System.out.println("5. Calcular coseno");
                    System.out.println("6. Calcular tangente");
                    System.out.println("7. Calcular raiz cubica");
                    System.out.println("8. Salir");
                    System.out.println("Selecciona una opcion");
                    System.out.println("=======================");
                    opcionE = sn.nextInt();
                    switch (opcionE) {
                        case 1 -> {
                            System.out.println("Ingrese el limite superior: ");
                            num1 = sn.nextInt();
                            System.out.println("Numero aleatorio generado = " + calculadoraEspecial.generarNumeroAleatorio(num1));
                   }
                        case 2 -> {
                            System.out.println("Ingrese la base: ");
                            num1 = sn.nextInt();
                            System.out.println("Ingrese el exponente: ");
                            num2 = sn.nextInt();
                            System.out.println("El resultado de la potencia es = " + calculadoraEspecial.calcularPotencia(num1, num2));
                   }
                        case 3 -> {
                            System.out.println("Ingrese el numero: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado del logaritmo es = " + calculadoraEspecial.calcularLogaritmo(num1));
                   }
                        case 4 -> {
                            System.out.println("Ingrese el angulo en radianes: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado del seno es = " + calculadoraEspecial.calcularSeno(num1));
                   }
                        case 5 -> {
                            System.out.println("Ingrese el angulo en radianes: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado del coseno es = " + calculadoraEspecial.calcularCoseno(num1));
                   }
                        case 6 -> {
                            System.out.println("Ingrese el angulo en radianes: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado de la tangente es = " + calculadoraEspecial.calcularTangente(num1));
                   }
                        case 7 -> {
                            System.out.println("Ingrese el numero: ");
                            num1 = sn.nextInt();
                            System.out.println("El resultado de la raiz cubica es = " + calculadoraEspecial.calcularRaizCubica(num1));
                   }
                         case 8 -> salir = true;
                        default -> System.out.println("Solo numeros entre 1 y 8");
                    }
                 }
    
               case 3:
                   salir=true;                      
               default:
                   System.out.println("Solo numeros entre 1 y 3");
 
           }
           
          
       }
        while(!salir);  
       System.out.println("Hasta luego!");
        
    }
    
}
