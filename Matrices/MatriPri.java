import java.util.Scanner;
public class MatriPri
{
   public static void main(String[] args) 
   {
       Scanner entrada=new Scanner(System.in);
       double MatrizA[][]=new double [3][3];

       System.out.print("\n Ingreso de numeros");

       for(int fila=0; fila<3; fila++)
       {
           for(int col=0; col<3; col++)
           {
           System.out.print("\n Ingrese el valor " + fila + "," + col + ":");
           MatrizA[fila][col]=entrada.nextDouble();
          }
       }
        System.out.print("\n Elementos de la matriz ");
        for(int fila=0; fila<3; fila++)
       {
            System.out.print("\n");
            for(int col=0; col<3; col++)
            {
              System.out.println(+MatrizA[fila][col]+"\t");
            }  
       }
   }
}