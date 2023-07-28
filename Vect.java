import java.util.Scanner;
public class Vect
{
  public static void main(String args []) 
  {
    //Declaracion de variables 
    int i=0, j=0;
    Scanner entrada= new Scanner(System.in);
    int numeros[];
    numeros=new int[10];

    System.out.println("Ingrese los valores");

    for (i=0; i<numeros.length; i++)
    {
      System.out.print("Numero # " +i+ ":");
      numeros[i]=entrada.nextInt();
    }
    
    System.out.println("--Valores almacenados--");

    for (j=0; j<numeros.length; j++)
    {
      System.out.println("Numero # " +j+ ":" + numeros[j]);

    }

  }
}