import java.util.Scanner;
public class Operador
{
 public static void main(String args[])
   {
      //Declaracion de variables
      int N;
     Scanner entrada=new Scanner(System.in);

      System.out.println("Ingrese un numero entero"); 
      N=entrada.nextInt();
      System.out.println("El numero ingresado es: " + N);

      for(int i = 1; i<=12; i++)
      {
        System.out.println(N + " * " + i + " = " + N*i);
      }
   }
}